class Palindrome{
  public static void main(String[]args){
   String a,b;
   StringBuffer sb;
   System.out.print("Enter the String to check if it is a palindrome:")
   a=sc.nextLine();
   sb=new StringBuffer(a);
   b=sb.reverse().toString();
   if(a.equals(b))
   {
   System.out.print("Entered String is palindrome.");
   }
   else
   {
   System.out.print("Entered String is not a palindrome.");
   }
   }
      
  }
