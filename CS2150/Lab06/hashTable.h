#ifndef HASHTABLE_H
#define HASHTABLE_H

#include <iostream>
#include <string>
#include <list>
#include <vector>

using namespace std;

class hashTable{
 public:
  hashTable(int size);


  void insert(string s);
  bool contains(string s);

  vector<list<string>> table;

 private:
    unsigned int strHash(string s);
};


#endif
