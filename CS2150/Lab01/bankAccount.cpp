//Lucas Banerji (lcb5tz)
//bankAccount.cpp 2/18

#include "bankAccount.h"

//using namespace std;

bankAccount::bankAccount() {//set the bankAccount balance to $0.00
  balance = 0.00;
}

bankAccount::bankAccount(double amount) {// set the balance to amount
  balance = amount;
}

bankAccount::~bankAccount(){}  //destructor

double bankAccount::withdraw(double amount) { //withdraws amount from balance
  balance -= amount;
   return balance;
}

double bankAccount::deposit(double amount) { //deposits amount to balance
  balance += amount;
  return balance;
}

double bankAccount::getBalance() {  //return balance
  return balance;
}

