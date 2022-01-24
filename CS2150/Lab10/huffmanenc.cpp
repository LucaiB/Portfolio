#include <iostream>
#include <fstream>
#include <cstdlib>
#include <stdio.h>
#include <stdlib.h>
#include "heap.h"
#include "heapNode.h"
#include "huffmanTree.h"

using namespace std;

int main (int argc, char **argv) {

  int asc;
  char ch;
  int symbols = 0;
  int unique = 0;

 if (argc != 2) {
    cout << "Must supply the input file as the only parameter" << endl;
    exit(1);
  }

  // attempt to open the supplied file
    ifstream file(argv[1]);
    // if the file wasn't found, output an error message and exit
    if (!file.is_open()) {
        cout << "Unable to open '" << argv[1] << "' for reading" << endl;
        exit(2);
    }

  //initialize frequencies to zero for all ascii values
  int freqList[128];
  for(int i = 0; i < 128; i++) {
    freqList[i] = 0;
  } 


   while (file.get(ch)) {
      
    asc = (int) ch; //create ascii values to test freq and symbol count
    if(asc < 128 && asc > 31) {
      freqList[asc]++;
      symbols++;
    }
  }
    
   heap myHeap;
   for(int i = 1;i < 128; i++){   //build heap of nodes 
     if(freqList[i] > 0) {
       unique++;                   //count unique symbols
       heapNode* temp = new heapNode((char)i, freqList[i]);
       myHeap.insert(temp);
     }
   }

   huffmanTree myTree; //make tree
   myHeap = myTree.makeTree(myHeap);  //build tree
   myTree.toString(myHeap.findMin(), ""); //print
     
cout << "----------------------------------------" << endl;

 myTree.encode(myHeap.findMin(),"");
 
 file.clear(); // Clears the _state_ of the file, not its contents!
 file.seekg(0);
    
 int cbits = 0; //compressed bits count

 
 while(file.get(ch)) {
   cout << myTree.vter[(int) ch] << " ";
   int index = (int) ch;
   if(index > 31 && index < 128)
     cbits += myTree.vter[ch].size();  //add up cbits
 } 
   
 cout << endl;


cout << "----------------------------------------" << endl;
 
 int bits = symbols*8;
 double cost = (double) cbits/symbols;
 double ratio =(double) bits/cbits;
 //calculate everything and display
 
 cout<<"There are a total of " << symbols << " symbols that are encoded." << endl;
 cout<<"There are " << unique << " distinct symbols used." << endl;
 cout<<"There were " << bits << " bits in the original file." << endl;
 cout<<"There were " << cbits << " bits in the compressed file." << endl;
 cout<<"This gives a compression ratio of "<< ratio <<"." << endl;
 cout<<"The cost of the Huffman Tree is "<< cost <<" bits per character." << endl;

 file.close();
 return 0;
}
