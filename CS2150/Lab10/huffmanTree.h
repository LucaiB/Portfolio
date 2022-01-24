#ifndef HUFFMANTREE_H
#define HUFFMANTREE_H

#include "heapNode.h"
#include "heap.h"

using namespace std;

class huffmanTree {
public:

  huffmanTree();
  ~huffmanTree();

  heap makeTree(heap h);
  void encode(heapNode* root, string str);
  void toString(heapNode* root, string str);
  heapNode* root;
  vector <string> vter = vector <string> (128);
 

private:
  
	 
};

#endif
