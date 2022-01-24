#include "postfixCalculator.h"
#include <iostream>
#include "List.h"
#include "ListItr.h"
#include "ListNode.h"

postfixCalculator::postfixCalculator(){

}

postfixCalculator::~postfixCalculator(){

}

int postfixCalculator:: getValue(){
  return calcList.top();
}

void postfixCalculator::pushCalc(int x){
  calcList.push(x);
}

bool postfixCalculator::isOperator(string s){
  if(s == "+" || s=="-" || s=="/" || s == "*" || s == "~")
    return true;
  else
    return false;
}

void postfixCalculator::evaluate(string s){
  if(s == "-"){
    int f = calcList.top();
    calcList.pop();
    int s = calcList.top();
    calcList.pop();
    calcList.push(s-f);
  } else if (s == "+"){
      int f = calcList.top();
      calcList.pop();
      int s = calcList.top();
      calcList.pop();
      calcList.push(f+s);
  } else if (s == "*") {
    int f = calcList.top();
    calcList.pop();
    int s = calcList.top();
    calcList.pop();
    calcList.push(f*s);
  } else if (s == "/") {  
    int f = calcList.top();
    calcList.pop();
    int s = calcList.top();
    calcList.pop();
    if(f != 0)
      calcList.push(s/f);
    else {
      calcList.push(s);
      calcList.push(f);
    }
  } else if (s == "~") {
    int f = calcList.top();
    calcList.pop();
    f *= -1;
    calcList.push(f);
  }
}






