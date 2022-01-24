#include "heapNode.h"
using namespace std;

heapNode::heapNode(string c, int f){
  val = c;
  freq = f;
  code = "";
  left = NULL;
  right = NULL;

}

heapNode::~heapNode(){
  free(left);  //delete left and right
  free(right);
}

int heapNode:: getFreq(){
  return freq;
}

string heapNode::getChar() {
  return val;
}

string heapNode::getCode() {
  return code;
}


bool heapNode::operator<(heapNode& n)  {
  return(n.getFreq() > this->getFreq());  //used to test frequencies
}
