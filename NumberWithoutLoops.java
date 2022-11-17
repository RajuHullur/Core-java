class  NumberWithoutLoops{
	
	  static int count=1;
	   public static void printNumbers(int n){
		   
		System.out.print(count); 
		if(count==n+1)
	      return;
       printNumbers(n);
    }
      public static void main(String [] s){
	  int num;
	  Number nm =new Number(System.in);
	 System.out.print("Enter any number:");
     num=in.nextInt();
     printNumbers(n);
  }
}