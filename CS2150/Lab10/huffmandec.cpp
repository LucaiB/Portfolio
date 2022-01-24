#include <iostream>
#include <fstream>
#include <sstream>
#include <cstdlib>
#include "heapNode.h"

using namespace std;

heapNode* root = new heapNode("_",0); // build root dud

void buildTree(string prefix, string ch){
  heapNode* placeH = root; //placeholder node
  for(int i = 0; i < prefix.length()-1; i++){

    if(prefix[i] == '1'){  //right
      
      if(placeH->right == NULL) 
	placeH->right = new heapNode("_",0); // if the next spot is NULL but prefix isnt done then make node a dud

      placeH = placeH->right; //move placeholder right
    
      }
      
    
    if(prefix[i] == '0'){  //left

       if(placeH->left == NULL)
	 placeH->left = new heapNode("_",0);  //if null make dud

       placeH = placeH->left;  //move left
    }
  }
  //at this point you know that you will be at a leaf and that you need to make the actual node with data depending on 1 or 0
  if(prefix[prefix.length()-1] == '1')
    placeH->right = new heapNode(string(ch),0);
  else if(prefix[prefix.length()-1] == '0')
    placeH->left = new heapNode(string(ch),0);
}

void decHuff(string allbits){
  
  heapNode* find = root;
  
  for(int i = 0; i <= allbits.length(); i++){

    if(find->right == NULL){ //if leaf
      cout << find->val; //print
      find=root;  //reset to root and continue
    }
    if(allbits[i] =='1') //move right
      find = find->right;
    else if(allbits[i] == '0') //move left
      find  = find->left;
  }
  cout << endl;
}

// main(): we want to use parameters
int main (int argc, char** argv) {
    // verify the correct number of parameters
    if (argc != 2) {
        cout << "Must supply the input file name as the only parameter" << endl;
        exit(1);
    }

    ifstream file(argv[1], ifstream::binary);
    // report any problems opening the file and then exit
    if (!file.is_open()) {
        cout << "Unable to open file '" << argv[1] << "'." << endl;
        exit(2);
    }

    // read in the first section of the file: the prefix codes
    while (true) {
        string character, prefix;
        // read in the first token on the line
        file >> character;

        // did we hit the separator?
        if (character[0] == '-' && character.length() > 1) {
            break;
        }

        // check for space
        if (character == "space") {
            character = " ";
        }
        // read in the prefix code
        file >> prefix;
        // do something with the prefix code
	buildTree(prefix, character); //build huffman tree
	//   cout << "character '" << character << "' has prefix code '" << prefix << "'" << endl;
    }
    /*
    cout << root->left->val << endl;
    cout << root->right->right->val << endl;
    cout << root->right->left->right->val << endl;
    cout << root->right->left->left->val << endl;
    */
   

    // read in the second section of the file: the encoded message
    stringstream sstm;
    while (true) {
        string bits;
        // read in the next set of 1's and 0's
        file >> bits;
        // check for the separator
        if (bits[0] == '-') {
            break;
        }
        // add it to the stringstream
        sstm << bits;
    }

    string allbits = sstm.str();
    // at this point, all the bits are in the 'allbits' string
    decHuff(allbits); //print code
    //   cout << "All the bits: " << allbits << endl;
    // close the file before exiting
    file.close();
  
  return 0;
}
