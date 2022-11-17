class Factorial{
   public static void main(String []args){
   int num=10;
   long factorial=10;
   for(int i=1; i<=num;i++)
   {
   //factorial=factorial*i;
   factorial*=i;
   }
   System.out.println("factorial of %d =%d", num,factorial);
}
}