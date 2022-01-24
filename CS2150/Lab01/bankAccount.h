//Lucas Banerji (lcb5tz)
//bankAccount.h
//February 18th

#ifndef BANKACCOUNT_H
#define BANKACCOUNT_H

//using namespace std;

class bankAccount {
 public:

  bankAccount();
  bankAccount(double amount);
  ~bankAccount();

  double withdraw(double amount);
  double deposit(double amount);
  double getBalance();

 private:
  double balance;
};

#endif
