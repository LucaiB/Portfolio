#include <iostream>
#include "timer.h"

extern "C" int threexplusone(int x);

int main() {

  int x;
  cout << "Enter a number: ";
  cin >> x;
  int n;
  cout << "Enter iterations of subroutine: ";
  cin >> n;
  
  int steps = threexplusone(x);
  cout << "Steps: " << steps << endl;

  //testing time
  
  timer speed;
  speed.start();
  
  for(int r = 0; r < n; r++)
    threexplusone(x);

  speed.stop();

  return 0;
}
