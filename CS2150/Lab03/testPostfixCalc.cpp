#include "postfixCalculator.h"
#include <iostream>

using namespace std;

int main(){
  postfixCalculator test;
  string token;
  while (cin >> token) {
    if(test.isOperator(token))
      test.evaluate(token);
    else
      test.pushCalc((stoi(token)));     
}
  cout << test.getValue() << endl;
  return 0;
}
