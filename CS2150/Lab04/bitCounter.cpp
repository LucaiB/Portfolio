#include <iostream>
#include <string>

using namespace std;

int ones(int b);
string convertBase(string toConvert, int startBase, int endBase);
string toEndBase(int baseTen, int endBase);

int main(int argc, char **argv){

  if(argc != 5){
    cout << "You need to enter 4 command-line parameters!" << endl;
    exit(-1);
  }
  
  int num = atoi(argv[1]);
  string convert = convertBase(argv[2],atoi(argv[3]),atoi(argv[4]));

  cout << argv[1] << " has " << ones(num) << " bit(s)" << endl;
  cout << argv[2] << " (base " << argv[3] << ") = " << convert << " (base "
       << argv[4] << ")" << endl;

  return 0;
}

int ones(int b){
  if (b < 2) 
    return b;
  else
    return ones(b/2) + ones(b%2); 
}

string convertBase(string toConvert, int startBase, int endBase){
  int baseTen = 0;
  int digit = 1;
  string finalNum;
  bool isNegative = (toConvert[0] == '-');
  int start = toConvert.length() - 1;      //starting from back of string
  int end = 0;
  if(isNegative)
    end = 1; //if it is negative we don't want to loop to the negative symbol
  else
    end = 0;
  if(startBase != 10){
    for(int i = start; i >= end; i--){
      char c = toConvert[i];

      if(c >= '0' && c <='9')
	c -= '0';
      else
	c = c- 'A' + 10;

      baseTen += c*digit;
      digit *= startBase;
    }           
  } else
    baseTen = stoi(toConvert);

  // at this point baseTen is the correct value

  string next;
    
  while (baseTen > 0){
    
    int rem = baseTen % endBase;
    if(rem > 9)
      next = rem + '7';
    else
      next = rem + '0';
    
    finalNum = finalNum + next;
    baseTen /= endBase;
  }
	     
    

  if(isNegative)
    finalNum += '-';

  //we now need to reverse the string
  int size = finalNum.length();
  for(int i = 0; i < size/2; ++i){
    swap(finalNum[i], finalNum[size - i - 1]);
  }
  
  return finalNum;
}

