public class EMail
{
   private String myUserName;
   private String myHostName;
   private String myExtension;

   public EMail (String address)
   {
      myUserName = address.substring(0, address.indexOf('@'));
      myHostName = address.substring(address.indexOf('@') + 1, address.indexOf('.'));
      myExtension = address.substring(address.indexOf('.') + 1, address.length());
   }

   public String getUserName()
   {
      return myUserName;
   }

   public String getHostName()
   {
      return myHostName;
   }

   public String getExtension()
   {
      return myExtension;
   }

   public String toString()
   {
      return "Email: " + myUserName + '@' + myHostName + '.' + myExtension;
   }

   public static void main(String[] args)
   {
      EMail email = new EMail("Bob123@gmail.com");
      System.out.println(email);
      System.out.println("Username: "+email.getUserName());
      System.out.println("Host Name: "+email.getHostName());
      System.out.println("Extension: "+email.getExtension());
   }
}