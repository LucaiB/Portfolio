// Code written by Aaron Bloomfield, 2014
// Released under a CC BY-SA license
// This code is part of the https://github.com/aaronbloomfield/pdr repository

#ifndef HEAP_H
#define HEAP_H

#include <vector>
#include "heapNode.h"

using namespace std;

class heap {
public:
  heap();
  ~heap();
  
  void insert(heapNode* n);
  heapNode* findMin() const;
  heapNode* deleteMin();
  
  unsigned int size();
  bool isEmpty();
  
  vector<heapNode*> getVector();

private:
  vector<heapNode*> heapV;
  unsigned int heap_size;

  void percolateUp(int hole);
  void percolateDown(int hole);
};

#endif
