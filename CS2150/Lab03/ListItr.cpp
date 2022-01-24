//Lucas Banerji



#include "ListItr.h"
#include "List.h"

using namespace std;

ListItr::ListItr() {
  current = NULL;
}

ListItr::ListItr(ListNode* theNode){
  current = theNode;
}

bool ListItr::isPastEnd() const{
  if(current != NULL && current->next  == NULL )
    return true;
  else
    return false;
}

bool ListItr::isPastBeginning() const{
  if(current != NULL && current->previous == NULL)
    return true;
  else
    return false;
}

void ListItr::moveForward(){
  if(current != NULL && current->next != NULL)
    current = current->next;
}

void ListItr::moveBackward(){
  if(current != NULL && current->previous != NULL)
  current = current->previous;
}

int ListItr::retrieve() const {
  int ret = 0;
  if(current != NULL)
    ret = current->value;
  return ret;
}

