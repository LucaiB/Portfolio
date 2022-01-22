/**************************************************************************************
Name: Lucas Banerji
Period: 2
Lab 13: Drug Potency
Due: 10/19/17
Purpose: To calculate how many months a drug can stay in storage.
I furthered my understanding of while loops while also practicing short hand 
notationssuch as x++ and y *= z. I also did a version of this lab using a for loop
just so that I could practice using both loops.
**************************************************************************************/
public class DrugPotency
{
   public static void main(String[] args)
   {
      int month = 0;
      double effectiveness = 100.0;
      while (effectiveness >= 50)
      {
         System.out.print("Month: " + month + "    ");
         System.out.println("Effectiveness: " + effectiveness);
         month++;
         effectiveness *= 0.96;
      }      
      System.out.println("The drug can stay in storage until month: " + month);
   }
}
/*  Output
  ----jGRASP exec: java DrugPotency
 Month: 0    Effectiveness: 100.0
 Month: 1    Effectiveness: 96.0
 Month: 2    Effectiveness: 92.16
 Month: 3    Effectiveness: 88.47359999999999
 Month: 4    Effectiveness: 84.93465599999999
 Month: 5    Effectiveness: 81.53726975999999
 Month: 6    Effectiveness: 78.27577896959998
 Month: 7    Effectiveness: 75.14474781081599
 Month: 8    Effectiveness: 72.13895789838334
 Month: 9    Effectiveness: 69.253399582448
 Month: 10    Effectiveness: 66.48326359915008
 Month: 11    Effectiveness: 63.82393305518407
 Month: 12    Effectiveness: 61.27097573297671
 Month: 13    Effectiveness: 58.82013670365764
 Month: 14    Effectiveness: 56.46733123551133
 Month: 15    Effectiveness: 54.20863798609088
 Month: 16    Effectiveness: 52.04029246664724
 The drug can stay in storage until month: 17
 
  ----jGRASP: operation complete.
  */