#ifndef HEAP_NODE_H
#define HEAP_NODE_H

#include <string>

using namespace std;

class heapNode {
      
public:
  
  heapNode(string c,int f);
  ~heapNode();
  
  int getFreq();
  string getChar();
  string getCode();
  bool operator<(heapNode& n);
   
 
  string val;
  int freq;
  heapNode *left;
  heapNode *right;
  string code;

private:
};


#endif
