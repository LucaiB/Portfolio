#include <iostream>
#include <vector>
#include <map>
#include "huffmanTree.h"
#include "heapNode.h"
#include "heap.h"

huffmanTree::huffmanTree(){
  root = NULL; 
}

huffmanTree::~huffmanTree(){
  free(root);
}

heap huffmanTree::makeTree(heap h){
  while(!(h.size() < 2)){
    heapNode* one = h.deleteMin();  //min freq make into node 1
    heapNode* two = h.deleteMin();  //node two with second lowest freq

    heapNode* temp = new heapNode ('_', one->getFreq() + two->getFreq()); //combine into one tree with added frequencies
    temp -> left = one;   //set children
    temp -> right = two;
    h.insert(temp);
  }
  return h;
}

void huffmanTree::toString(heapNode* n, string str){
  if (isspace(n->val))
    cout << "space" << " " << str << endl; 
  else if (n->left == NULL && n->right == NULL)
    cout << n->val << " " << str << endl;
  
  if (n->left)
    toString(n->left, str+"0");  //left add 0
  
  if (n->right) 
    toString(n->right, str+"1");  //right add 1
}

void huffmanTree::encode(heapNode* n, string str){
  if (n->left==NULL && n->right==NULL){ //if reach a leaf then finish code
    n->code = str;
    
    int index = (int)n->getChar();
    if(index > 31 && index < 128)
      vter[index] = str;
  }

  if (n->left)
    encode(n->left, str+"0");  //left add 0

  if (n->right)
    encode(n->right, str+"1");   //right add 1
}

