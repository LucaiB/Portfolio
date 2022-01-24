//Lucas Banerji


#include "List.h"
#include "ListItr.h"
#include "ListNode.h"
#include <string>
#include <iostream>


using namespace std;


List::List(){
    head=new ListNode();
    tail=new ListNode();
    head->next=tail;
    tail->previous=head;
    count=0;
}

List::List(const List& source){
    head=new ListNode();
    tail=new ListNode();
    head->next=tail;
    tail->previous=head;
    count=0;

    // Make a deep copy of the list
    ListItr iter(source.head->next);
    while (!iter.isPastEnd()) {
        insertAtTail(iter.retrieve());
        iter.moveForward();
    }
}

List::~List(){
  ListNode* temp = NULL;
  while(head->next != NULL){
    temp = head;
    head = head->next;
    temp->previous = NULL;
    temp->next = NULL;
    delete temp;
  }
  head->previous = NULL;
  tail->previous = NULL;
  delete head;
}

List& List::operator=(const List& source){
 if (this == &source) {
        // The two are the same list; no need to do anything
        return *this;
    } else {
        // Clear out anything this list contained
        // before copying over the items from the other list
        makeEmpty();

        // Make a deep copy of the list
        ListItr iter(source.head->next);
        while (!iter.isPastEnd()) {
            insertAtTail(iter.retrieve());
            iter.moveForward();
        }
    }
    return *this;
}

bool List:: isEmpty() const{
  if(count == 0)
    return true;
  else
    return false;
}

void List::makeEmpty(){
  ListNode* temp = NULL;
  while(head->next != tail){
    temp = head;
    head = head->next;
    temp->previous = NULL;
    temp->next = NULL;
    delete temp;
  }
  head->next = tail;
  head->previous = NULL;
  tail->previous = head;
  count = 0;
}

ListItr List::first(){
  return ListItr(head->next);
}

ListItr List::last(){
  return ListItr(tail->previous);
}

void List::insertAfter(int x, ListItr position){
  ListNode* insert = new ListNode();
  insert->value = x;
  insert->next = position.current->next;
  insert->previous = position.current;
  position.current->next->previous = insert;
  position.current->next = insert;
  count++;
}

    // Inserts x before current iterator position
void List::insertBefore(int x, ListItr position){   //todo
  ListNode * insert = new ListNode();
  insert->value = x;
  insert->next = position.current;
  insert->previous = position.current->previous;
  position.current->previous->next = insert;
  position.current->previous = insert;
  count++;
}

void List:: push(int x){
  ListNode* insert = new ListNode();
  insert->value = x;
  insert->next = head->next;
  insert->previous = head;
  head->next->previous = insert;
  head->next = insert;
  count++;
}

void List:: pop(){
   ListNode* temp = head->next;
   head->next = temp->next;
   temp->next->previous = head;
   temp->next = NULL;
   temp->previous = NULL;
   delete temp;
   count--;
}

int List:: top() {
  return head->next->value;
}

bool List::empty(){
  if(count == 0)
    return true;
  else
    return false;
}


    // Inserts x at tail of list
void List::insertAtTail(int x){
  ListNode* insert = new ListNode();
  insert->value = x;
  insert->next = tail;
  insert->previous = tail->previous;
  tail->previous->next = insert;
  tail->previous = insert;
  count++;
}

   
ListItr List::find(int x){ //todo
  ListNode* temp = head;
  while(temp != tail){
    if(temp->value == x){
      return ListItr(temp);
    } else
      temp = temp->next;      
  }
  return ListItr(tail);
}

    // Removes the first occurrence of x       //todo
void List::remove(int x){
  ListNode* temp = head->next;
    while(temp != tail){
      if(temp->value == x){
	temp->previous->next = temp->next;
	temp->next->previous = temp->previous;
	temp->previous = NULL;
	temp->next = NULL;
	delete temp;
	count--;
	return;
      } else {
	temp = temp->next;
      }
  }
      cout <<"The value does not exist in the dll" << endl;
}

    // Returns the number of elements in the list
int List::size() const{
  return count;
}

void printList(List& source, bool forward){
  if(forward){
    ListItr itr = source.first();
    while(!itr.isPastEnd()){
      cout <<itr.retrieve() << " ";
      itr.moveForward();
    }
    cout << endl;
  } else{
    ListItr itr = source.last();
    while(!itr.isPastBeginning()){
      cout <<itr.retrieve()<< " ";
      itr.moveBackward();
    }
    cout << endl;
  }
}
