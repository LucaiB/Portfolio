#include <iostream>
#include <cstdlib>

using namespace std;

extern "C" int product (int, int);
extern "C" int power (int, int);

int main() {

  int x;
  cout << "Enter integer 1: ";
  cin >> x;

  int y;
  cout << "Enter integer 2: ";
  cin >> y;

  int prodZ = product(x, y);
  int powZ = power(x, y);

  cout << "Product: " << prodZ << endl;
  cout << "Power: " << powZ << endl;

  return 0;
}
