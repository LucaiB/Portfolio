#include <iostream>
#include <fstream>
#include <string>
#include <unordered_set>
#include "timer.cpp"
#include "getWordInGrid.cpp"
#include "primenumber.cpp"
#include "hashTable.h"

using namespace std;

int main(int argc, char *argv[]){
  
  if(argc != 3){
      cout << "This program requires 2 parameters" ;
      exit(-1);
  }
  
  string words = argv[1];
  string puzzle = argv[2];
  int tempSize = getNextPrime(42069);
 
  unordered_set <string> HashWords;
  hashTable allWords(tempSize);
  
  fstream newfile;
  newfile.open(words,ios::in);
   if (newfile.is_open()){ //checking whether the file is open
      string token;
      while(getline(newfile, token)){ //read data from file object into a string
	if(token.length() > 2){
	  //  HashWords.insert(token);
	  allWords.insert(token);
	}
      }
      newfile.close(); //close the file object.
   }
 
   
  int rows, cols;
  bool define = readInGrid (puzzle, rows, cols);

   if(define == false){
     cout << "File could not be read" ;
    exit(-1);
    }

   
   timer speed;
  
   string compass [8] = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
  int count = 0;
  speed.start();
  for(int r = 0; r < rows; r++) {
    for(int c = 0; c < cols; c++) {
      for(int d = 0; d < 8; d++) {
	for(int l = 3; l < 23; l++) {
	    string str = getWordInGrid(r,c,d,l,rows,cols);
	    /*
	    if(HashWords.count(str) >= 1) {
	          count++;
	      if(d == 1 || d == 3 || d==5 || d==7)
		cout << compass[d] <<"("<<r<<", "<<c<<"):       "<<str<<endl;
	      else
		cout << compass[d] << " "<<"("<<r<<", "<<c<<"):       "<<str<<endl;
	    }
	    if(str == getWordInGrid(r,c,d,l+1,rows,cols)){
	       break;
	    }
	    */

	    if(allWords.contains(str)) {
	          count++;
	      if(d == 1 || d == 3 || d==5 || d==7)
		cout << compass[d] <<"("<<r<<", "<<c<<"):       "<<str<<endl;
	      else
		cout << compass[d] << " "<<"("<<r<<", "<<c<<"):       "<<str<<endl;
	    }
	    if(str == getWordInGrid(r,c,d,l+1,rows,cols)){
	       break;
	    }
	    
	}
      }
    }
  }
  speed.stop();
  cout << count << " words found" << endl;
  //  cout <<(int)(speed.getTime()*1000)<< endl;
  return 0;
}







