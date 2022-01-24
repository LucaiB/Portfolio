/**
Due: 9/30
Date Submitted: 9/30
What I learned: I lerned how to use a singly linked list to represent a polynomial     
How I feel about this lab:This lab was extremely hard for me, especially the multiply method    
What I wonder:  How to make this program more efficient    
Credits (person/websites): I worked together with Akshath and Shonjoy 
Students I helped: Akshath and Shonjoy and Alex Lanier (All mutual help)
**/

import java.lang.Math;
import java.util.ArrayList;

public class pd5LucasBanerjiSinglyLinkedPolynomial implements Polynomial
{      
   private class ListNode<Term>
   {  
      private Term value;
      private ListNode<Term> next;
   
      public ListNode(Term t, ListNode<Term> n)
      {
         value = t;
         next = n;
      }
      
      public Term getValue()
      {
         return value;
      }
      
      public ListNode<Term> getNext()
      {
         return next;
      }
      
      public void setValue(Term newTerm)
      {
         value = newTerm;
      }
      
      public void setNext(ListNode<Term> n)
      {
         next = n;
      }
   }  //end of ListNode<Term>  
   
   private static class Term
   {
      private double exponent;
      private double coeff;
      
      public Term(double c, double e)
      {
         exponent = e;
         coeff = c;
      }
   
      public double getExponent()
      {
         return exponent;
      }
     
      public double getCoeff()
      {
         return coeff;
      }
     
      public void setExponent(double x)
      {
         exponent = x;
      }
     
      public void setCoeff(double x)
      {
         coeff = x;
      }
   
      public boolean equals(Term other)
      {
         return this.coeff == other.getCoeff() && this.exponent == other.getExponent();
      }
   
      public String toString()
      {
         return coeff + "x^" + exponent;
      }
   }  // Term 

   
   private ListNode<Term> head;
   
   public pd5LucasBanerjiSinglyLinkedPolynomial(double[] terms)
   {
      {
         if(terms == null)
            head = null;
         else {
            head = new ListNode<>(new Term(terms[0], terms[1]), null);
            ListNode<Term> temp = head;
            for (int i = 2; i < terms.length - 1; i = i + 2) {
               temp.setNext(new ListNode<>(new Term(terms[i], terms[i + 1]), null));
               temp = temp.getNext();
            }
         }
      }
   }
   
   public pd5LucasBanerjiSinglyLinkedPolynomial(ListNode<Term> x)
   {
      head = new ListNode<Term>(new Term (x.getValue().getCoeff(),x.getValue().getExponent()), null);
      x=x.getNext();
      for(ListNode<Term> temp=head;x!=null;x=x.getNext(),temp=temp.getNext()){
         Term t = new Term(x.getValue().getCoeff(),x.getValue().getExponent());
         temp.setNext(new ListNode<Term>(t,null));
      }
   }
   
   public pd5LucasBanerjiSinglyLinkedPolynomial()
   {
      head = null;
   }    //default
   
   //copy constructor
   public pd5LucasBanerjiSinglyLinkedPolynomial(Polynomial p)
   {     
      {
         pd5LucasBanerjiSinglyLinkedPolynomial pPoly = (pd5LucasBanerjiSinglyLinkedPolynomial)(p);
         ListNode <Term> pTerms = pPoly.getHead();
      
         head = new ListNode <Term> (new Term(pTerms.getValue().getCoeff(), pTerms.getValue().getExponent()), null);
         ListNode <Term> temp = head;
      
         for(pTerms = pTerms.getNext(); pTerms != null; temp = temp.getNext(), pTerms = pTerms.getNext()){
            temp.setNext(new ListNode <Term> (new Term(pTerms.getValue().getCoeff(), pTerms.getValue().getExponent()), null));
         }
      }    
   }
   
   public ListNode<Term> getHead()
   {
      return head;
   }
   
   public void setHead(ListNode <Term> node)
   {
      head = node;
   }
   
   /**
   pre-condition: this is not null
   post-condition: returns a double that is the answer if parameter x is plugged in as x
                   in the polynomial
   **/
   public double evaluate(double x)
   {    
      {
         double total = 0.0;
         ListNode<Term> temp = head;
         while(temp.getNext() != null)
         {
            total += (temp.getValue().coeff *(Math.pow(x, temp.getValue().exponent)));
            temp = temp.getNext();
         }
         return total;
      }   
   }
   
   /**
   pre-condition: this and other are not null
   post-condition: returns a pd5LucasBanerjiSinglyLinkedPolynomial that is the sum of this and other and
                   is in highest to lowest exponent order
   **/   
   public Polynomial plus(Polynomial other)
   {
      {
         pd5LucasBanerjiSinglyLinkedPolynomial endPoly = new pd5LucasBanerjiSinglyLinkedPolynomial(this);
         ListNode<Term> finalList = endPoly.getHead();
         pd5LucasBanerjiSinglyLinkedPolynomial poly = (pd5LucasBanerjiSinglyLinkedPolynomial)(other);
         ListNode <Term> otherTerms = poly.getHead();
         ListNode <Term> temp;
      
         if(finalList.getValue().getExponent() < otherTerms.getValue().getExponent())
         {
            temp = otherTerms;
            otherTerms = finalList;
            finalList = temp;
         }else if(finalList.getValue().getExponent() == otherTerms.getValue().getExponent())
         {
            finalList.getValue().setCoeff(finalList.getValue().getCoeff() + otherTerms.getValue().getCoeff());
            otherTerms = otherTerms.getNext();
            temp = finalList;
         }else{
            temp = finalList;
         }
      
         for (;temp.getNext() != null; temp = temp.getNext())
         {
            if(otherTerms == null) 
               return endPoly;
         
            if(temp.getNext().getValue().getExponent() == otherTerms.getValue().getExponent())
            {
               temp.getNext().getValue().setCoeff(temp.getNext().getValue().getCoeff() + otherTerms.getValue().getCoeff());
               otherTerms = otherTerms.getNext();
            }else if(temp.getNext().getValue().getExponent() < otherTerms.getValue().getExponent())
            {
               temp.setNext(new ListNode <Term> (otherTerms.getValue(), temp.getNext()));
               otherTerms = otherTerms.getNext();
            }
         }
         for(;otherTerms != null; otherTerms = otherTerms.getNext())
            temp.setNext(new ListNode <Term> (otherTerms.getValue(), null));
      
         return endPoly; 
      }
   }
   
   /**
   pre-condition: this and other are not null
   post-condition: returns a pd5LucasBanerjiSinglyLinkedPolynomial that is the difference of this and other and is
                   in highest to lowest exponent order
   **/   
   public Polynomial minus(Polynomial other)
   {
      pd5LucasBanerjiSinglyLinkedPolynomial copy = new pd5LucasBanerjiSinglyLinkedPolynomial(other);//creates a copy of other and turns them all negative
      ListNode<Term>temp=copy.getHead();
      while (temp!=null){
         temp.getValue().setCoeff(-temp.getValue().getCoeff());
         temp=temp.getNext();
      }
      return(plus(copy)); 
   }
   
   /**
   pre-condition: this is not null
   post-condition: returns a pd5LucasBanerjiSinglyLinkedPolynomial that is the derivative of this and is
                   in highest to lowest exponent order
   **/
   public Polynomial derivative()
   {
      pd5LucasBanerjiSinglyLinkedPolynomial copy = new pd5LucasBanerjiSinglyLinkedPolynomial(head);
      ListNode<Term>temp = copy.getHead();
      Term term;
       
      for(temp=copy.getHead();temp!=null;temp=temp.getNext()){
         term = new Term(temp.getValue().getExponent()*temp.getValue().getCoeff(),temp.getValue().getExponent()-1);
          
         temp.setValue(term);
      }
      return copy;   
   }
   
  /* 
   public void mulInsert(int coef, int exp){
    //Node temp = new Node(coef, exp, null);
    //insert temp to 1st if empty
        
      if (head == null)
         head = new ListNode(new Term(coef,exp),null);
      else {
      
         ListNode<Term> p = null;
         ListNode<Term> q = head;
        //insert in front if exponent is higher
         if (exp > q.getValue().getExponent()){
            ListNode temp = new ListNode(new Term(coef,exp),null);
            temp.setNext(head);
            head = temp;
         } else 
         {//insert at middle or end
            while (q != null && q.getValue().getExponent() >= exp){
               if (q.getValue().getExponent() == exp)
               {
                  q.getValue().setCoeff(q.getValue().getCoeff() + coef);
                  q=q.getNext();
                  continue;
               }
               p = q;
               q = q.getNext();
            }
         
            ListNode temp = new ListNode<Term>(new Term(coef,exp),null);
            p.setNext(temp);
            temp.setNext(q);
         
         }
      }
   
   }

   /**
   pre-condition: this and other are not null
   post-condition: return a new pd5LucasBanerjiSinglyLinkedPolynomial in highest to lowest degree order
                   that is the product of this and other
   **/  
   /*
    
   public Polynomial multiply(Polynomial other)
   {
      Polynomial tempPoly = new pd5LucasBanerjiSinglyLinkedPolynomial();
   
      ListNode<Term> n1 = this.head;
   
   
      while (n1 != null )
      {
         ListNode<Term> n2 = other.getValue().getHead();
         while(n2 != null){
            tempPoly.mulInsert((n1.getValue().getCoeff()*n2.getValue().getCoeff()),(n1.getValue().getExponent() + n2.getValue().getExponent()));
            n2 = n2.getNext();
         }
         n1= n1.getNext();
      }
      return tempPoly;
   }
   */
   
   
   public Polynomial multiply(Polynomial other)
   {
      pd5LucasBanerjiSinglyLinkedPolynomial otherPoly = (pd5LucasBanerjiSinglyLinkedPolynomial)(other);
      Polynomial endPoly = null;
      Polynomial newPoly;
      Term temp;
      for(ListNode <Term> outerTemp = head; outerTemp != null; outerTemp = outerTemp.getNext()){
         for(ListNode <Term> innerTemp = otherPoly.getHead(); innerTemp != null; innerTemp = innerTemp.getNext()){
            temp = new Term(outerTemp.getValue().getCoeff() * innerTemp.getValue().getCoeff(), outerTemp.getValue().getExponent() + innerTemp.getValue().getExponent());
            if(endPoly == null)
               endPoly = new pd5LucasBanerjiSinglyLinkedPolynomial(new ListNode <Term> (temp, null));
            else{
               newPoly = new pd5LucasBanerjiSinglyLinkedPolynomial(new ListNode <Term> (temp, null));
               endPoly = endPoly.plus((Polynomial)(newPoly));
            }
         }
      }
      return endPoly;
   }


   /**
   pre-condition: head and node aren't null
   post-condition: node is removed from the list passed
   **/
   public void remove(ListNode<Term> head, ListNode<Term> node)
   {
      ListNode<Term> temp;
      for(temp = head ;temp.getNext() !=null; temp = temp.getNext())
      {
         if(temp.getNext() == node)
         {
            temp.setNext(temp.getNext().getNext());
         }
      }
   }
   
   /**
   pre-condition: head is not null
   post-condition: return head of the reversed list
   **/   
   public ListNode<Term> reverse(ListNode<Term> head)
   {
      ListNode<Term> prev = null;
      ListNode<Term> current = head;
      ListNode<Term> next;
      while (current!= null){
         next = current.getNext();
         current.setNext(prev);
         prev = current;
         current = next;
      }
      ListNode<Term> headNew = prev;
      return headNew;   
   } 
   //pre: none
   //post: returns whether the objects are equal to eachother
   @Override public boolean equals(Object other)
   {
      ListNode <Term> oTemp = ((pd5LucasBanerjiSinglyLinkedPolynomial)other).getHead();
      ListNode <Term> temp = head;
      while (temp != null && oTemp != null)
      {
         if ((temp.getValue().equals( oTemp.getValue())) == false)
         {
            return false;
         }
         temp = temp.getNext();
         oTemp = oTemp.getNext();
      }
      if (temp == null && oTemp == null)
      {
         return true;
      }
      return false;
   
   }
   //pre: none
   //post: returns the polynomial as a string
   public String toString()
   {
      {
         String polynomial = "";
         boolean isFirst = true;
         for(ListNode<Term> x = head; x != null; x = x.next)
         {
            double coeff = x.getValue().getCoeff();
            double exponent = x.getValue().getExponent();
            if(isFirst)
            {
               polynomial += coeff + "x^" + exponent + " ";
               isFirst = false;
            }
            else
            {
               if(exponent == 0)
               {
                  if(coeff < 0)
                  {
                     polynomial += " - " + (coeff*-1);
                  }
                  else
                  {
                     polynomial  += " + " + coeff ;
                  }
                  break;
               }
               if(coeff < 0)
               {
                  polynomial += " - " + (coeff*-1) + "x^" + exponent + " ";
               }
               else
               {
                  polynomial  += " + " + coeff + "x^" + exponent + " ";
               }
            }
              
         }
         return polynomial;
      }
   }
   public static void main(String[] args)  
   {
      double[] arr = {4,3,3,2,1,0};
      Polynomial p1 = new pd5LucasBanerjiSinglyLinkedPolynomial(arr);  // 4x^3 + 3x^2 + 1
      System.out.println("p1(x) =     " + p1);
   
      double[] arr2 = {-5,1,-2,0};
      Polynomial p2 = new pd5LucasBanerjiSinglyLinkedPolynomial(arr2);   // - 5x – 2
      System.out.println("p2(x) =     " + p2);                 // p2(x) = - 5x^1 – 2
      System.out.println("p1 and p2 are the same: " + p1.equals(p2));
      
      double[] arr3 = {-4,1};
      Polynomial p3   = new pd5LucasBanerjiSinglyLinkedPolynomial(arr3);  // coeff, exp = -4x
      System.out.println("p3(x) =     " + p3);
   
      Polynomial p    = p1.plus(p2).plus(p2);   // 4x^3 + 3x^2 - 10x – 3
      System.out.println("p(x)  =     " + p);       // p(x) = 4x^3 + 3x^2 - 10x^1 – 3
   
      Polynomial p4   = p.minus(p3);   // 4x^3 + 3x^2 - 6x^1 – 3   <====
      System.out.println("p4(x) =     " + p4);
   
      Polynomial p5   = p4.derivative();   // 12x^2 + 6x^1 - 6   <====
      System.out.println("p5(x) =     " + p5);
            
      Polynomial clone = new pd5LucasBanerjiSinglyLinkedPolynomial(p5);
      System.out.println("clone(x) =     " + clone);
      System.out.println("p5 and clone are the same: " + p5.equals(clone));
      
      Polynomial clone2 = p5;
      System.out.println("clone2(x) =    " + clone2);
      System.out.println("p5 and clone 2 are the same: " + p5.equals(clone2));
      
      Polynomial product = p1.multiply (p2);
      System.out.println("product of p1(x) and p2(x) is     " + product);
      
      System.out.println ("p5(0) = " + p5.evaluate(0));
      System.out.println ("p5(1) = " + p5.evaluate(1));
   }
}  //end of pd5LucasBanerjiSinglyLinkedPolynomial
