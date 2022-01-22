public class EmployeeNames
{
   public static String [] convertName (String[] lastNames)
   {
      String[] formatNames = new String[lastNames.length];
      for (int k = 0; k < lastNames.length; k++)
      {
         if(lastNames[k] == null)
            break;
         else
         {
            formatNames[k] = Character.toUpperCase(lastNames[k].charAt
                                          (lastNames[k].length()-1))
                 + ". " + 
                 Character.toUpperCase(lastNames[k].charAt
                                          (lastNames[k].length()-2))
                 + ". " + lastNames[k];
         }
      }
      return formatNames;
   }
}