// Code written by Aaron Bloomfield, 2014
// Released under a CC BY-SA license
// This code is part of the https://github.com/aaronbloomfield/pdr repository

#include <iostream>
#include "heap.h"
#include <vector>
using namespace std;

// default constructor
heap::heap() : heap_size(0) {
  heapV.push_back(0);
}

// the destructor doesn't need to do much
heap::~heap() {
}

void heap::insert(heapNode* n) {
  heapV.push_back(n);  //insert into vector
  percolateUp(++heap_size);

}

void heap::percolateUp(int hole) {
  int z = heapV[hole]->getFreq();
  heapNode* temp = heapV[hole];
  while(hole >= 2 && z < heapV[hole/2]->getFreq()){
    heapV[hole] = heapV[hole/2];
    hole /= 2;
  }
  heapV[hole] = temp;	 
}

heapNode* heap::deleteMin() {
    // make sure the heap is not empty
   if (heap_size == 0) {
     throw "deleteMin() called on empty heap";
   }
    
   // save the value to be returned
   heapNode* ret = heapV[1];
   // move the last inserted position into the root
   heapV[1] = heapV[heap_size--];
   // make sure the vector knows that there is one less element
   heapV.pop_back();
   // percolate the root down to the proper position
   if (!isEmpty()) {
     percolateDown(1);
   }

   return ret;
}

void heap::percolateDown(int hole) {
  
    // get the value to percolate down
    heapNode* n = heapV[hole];
    // while there is a left child...
    while (hole*2 <= heap_size) {
        int child = hole*2; // the left child
        // is there a right child?  if so, is it lesser?
	if((*(heapV[child+1])) < (*(heapV[child])) && (child != heap_size)) {
            child++;
        }
        // if the child is greater than the node...
        if ((*heapV[child]) < (*n)) {
            heapV[hole] = heapV[child]; // move child up
            hole = child;             // move hole down
        } else {
            break;
        }
    }
    // correct position found!  insert at that spot
    heapV[hole] = n;
  
}

heapNode* heap::findMin() const {
  
    if (heap_size == 0) {
        throw "findMin() called on empty heap";
    }
  
    return heapV[1];
}

unsigned int heap::size() {
    return heap_size;
}

vector<heapNode*> heap::getVector(){
  return heapV;
}

bool heap::isEmpty() {
  return heap_size == 0;
}
