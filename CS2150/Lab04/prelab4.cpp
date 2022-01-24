//Lucas Banerji (lcb5tz)

#include <iostream>
#include <string>
#include <climits>
#include <cmath>

using namespace std;

void sizeOfTest();
void outputBinary(unsigned int x);
void overflow();

int main() {
  
  int x;
  cin >> x;
  
  sizeOfTest();
  overflow();
  outputBinary(x);

  
  return 0;
}

void sizeOfTest(){
  int y = 2;
  unsigned int z = 2;
  float a = 2;
  double b = 2;
  char c = '2';
  bool d = true;
  int* e = NULL;
  char* f = NULL;
  double* g = NULL;

  cout << "Size of int: " <<  sizeof(y) << endl;
  cout << "Size of unsigned int: " <<  sizeof(z) << endl;
  cout << "Size of float: " <<  sizeof(a) << endl;
  cout << "Size of double: " <<  sizeof(b) << endl;
  cout << "Size of char: " <<  sizeof(c) << endl;
  cout << "Size of bool: " <<  sizeof(d) << endl;
  cout << "Size of int*: " <<  sizeof(e) << endl;
  cout << "Size of char*: " <<  sizeof(f) << endl;
  cout << "Size of double*: " <<  sizeof(g) << endl;
}

void outputBinary(unsigned int x){
  string itob = "";
  
  for(int i = 31; i > -1; i--)
  {
    if((int)(x/pow(2,i)) == 0){
      itob += "0";
    }
    else{
     itob += "1";
     x -= pow(2,i);
    }
    if(i%4 == 0)
     itob += " ";
  }
  cout << itob << endl;
}

void overflow(){
  unsigned int max = UINT_MAX;
  cout << max << " + 1 = " << max + 1 <<  endl;
}
