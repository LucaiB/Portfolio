//*********************************************************************************************************************************
//Name:   Lucas Banerji
// Period:      5                                           
// Date: 3/26
// What I learned: I learned how to reverse a map that contained a collection as a value
// How I feel about this lab: This lab was quick but very informative. It took me a while to understand how to reverse since the value was a set rather than a string
// What I wonder: I wonder how reverse would be done if say that map contained a linkedlist for both parameters.
//***********************************************************************************************************************************

import java.io.*;
import java.util.*;
public class LucasBanerjipd5Dictionary
{
   public static void main(String[] args) throws Exception
   {
      try
      {
         System.setOut(new PrintStream(new FileOutputStream("dictionaryOutput.txt")));
      }
      catch(Exception e)
      {
      }
      Map<String, Set<String>> eng2spn = new TreeMap<String, Set<String>>();
      Scanner infile = new Scanner(new File("C:\\Users\\lucas\\OneDrive\\Quarter3CSB\\spanglish.txt"));
      while(infile.hasNext())
      {
         add(eng2spn, infile.next(), infile.next());
      }
      infile.close();
      System.out.println("ENGLISH TO SPANISH");
      display(eng2spn);
      
      Map<String, Set<String>> spn2eng = reverse(eng2spn);
      System.out.println("SPANISH TO ENGLISH");
      display(spn2eng);
   }
   
   // Note: must explain how your method works
   // Postcondition: display the contents of  a dictionary
   public static void display(Map<String, Set<String>> m)
   {  
      for (Map.Entry<String, Set<String>> entry : m.entrySet())
      {
         System.out.println(entry.getKey() + entry.getValue());         //iterate through and print
      }
   }
   // Note: must explain how your method works
   // postcondition: insert a new pair to the English to Spanish Dictionary
   public static void add(Map<String, Set<String>> engToSpnDictionary, String word, String translation)
   {
      if(engToSpnDictionary.containsKey(word))
      {
         engToSpnDictionary.get(word).add(translation);              //if word is already in map, simply add translation to set
      }
      else
      {
         Set<String> set = new TreeSet<>();                          //else make a new set and enter new key
         set.add(translation);
         engToSpnDictionary.put(word, set);
      }
   }
   // Note: must explain how your method works
   // postcondition: returns a Spanish to English dictionary
   public static Map<String, Set<String>> reverse(Map<String, Set<String>> engToSpnDictionary)
   {
      Map<String, Set<String>> revDict = new HashMap<>();
      
      for (String str : engToSpnDictionary.keySet())                                    //goes through map and gets key and key value
      {                                                                                   
         for(String string : engToSpnDictionary.get(str))
         {
            if(!revDict.containsKey(string))                                  //if reverse dictionary doesnt contain "new key" => make one
               revDict.put(string, new TreeSet<String>());
         
            revDict.get(string).add(str);                                     //else add to set
         }
      }
      return revDict;
   }
}
      /********************
	INPUT:
   	holiday
		fiesta
		holiday
		vacaciones
		party
		fiesta
		celebration
		fiesta
     <etc.>
  *********************************** 
	OUTPUT:
		ENGLISH TO SPANISH
			banana [banana]
			celebration [fiesta]
			computer [computadora, ordenador]
			double [doblar, doble, duplicar]
			father [padre]
			feast [fiesta]
			good [bueno]
			hand [mano]
			hello [hola]
			holiday [fiesta, vacaciones]
			party [fiesta]
			plaza [plaza]
			priest [padre]
			program [programa, programar]
			sleep [dormir]
			son [hijo]
			sun [sol]
			vacation [vacaciones]

		SPANISH TO ENGLISH
			banana [banana]
			bueno [good]
			computadora [computer]
			doblar [double]
			doble [double]
			dormir [sleep]
			duplicar [double]
			fiesta [celebration, feast, holiday, party]
			hijo [son]
			hola [hello]
			mano [hand]
			ordenador [computer]
			padre [father, priest]
			plaza [plaza]
			programa [program]
			programar [program]
			sol [sun]
			vacaciones [holiday, vacation]
         
         
         
         My Output
         
ENGLISH TO SPANISH
banana[banana]
celebration[fiesta]
computer[computadora, ordenador]
double[doblar, doble, duplicar]
father[padre]
feast[fiesta]
good[bueno]
hand[mano]
hello[hola]
holiday[fiesta, vacaciones]
party[fiesta]
plaza[plaza]
priest[padre]
program[programa, programar]
sleep[dormir]
son[hijo]
sun[sol]
vacation[vacaciones]
                                 //inserted space for clarity
SPANISH TO ENGLISH
banana[banana]
doble[double]
ordenador[computer]
mano[hand]
doblar[double]
duplicar[double]
bueno[good]
programa[program]
computadora[computer]
hola[hello]
plaza[plaza]
padre[father, priest]
sol[sun]
programar[program]
hijo[son]
vacaciones[holiday, vacation]
dormir[sleep]
fiesta[celebration, feast, holiday, party]

**********************/