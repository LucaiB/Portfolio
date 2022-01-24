


#ifndef POSTFIXCALCULATOR_H
#define POSTFIXCALCULATOR_H

#include <iostream>
#include "List.h"
#include "ListItr.h"
#include "ListNode.h"

using namespace std;

class postfixCalculator {
 public:
  postfixCalculator();
  ~postfixCalculator();
  void pushCalc(int value);
  int getValue();
  bool isOperator(string s);
  void evaluate(string s);

private:
  List calcList; 
};



#endif
