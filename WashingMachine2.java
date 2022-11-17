class  WashingMachine2{
  static String brand;
  static String colour;
  static double price;
  static boolean isConnected;
  static int minSpeed;
  static int maxSpeed;
  static int currentSpeed=10;
   public static boolean onOrOff(){
   //  System.out.println("inside onOrOff");
   if(isConnected == false){
        isConnected = true;
   System.out.println("WashingMachine is On");
   }
    else if(isConnected == true){
         isConnected = false;
   System.out.println("WashingMachine is  Off");
   }
   
   //System.out.println("End of onOrOff");
   return isConnected;
   }
	public static void increaseSpeed(){
    // System.out.println("inside increaseSpeed()");
	//false=true
    if(isConnected == true)
	{
       if(currentSpeed<maxSpeed)
	   {
		   currentSpeed = currentSpeed + 1;
   System.out.println("The currentSpeed is:"+currentSpeed);
   }
  else{ 
   System.out.println("Max Speed reached...\n");
   }
	}
	else{
   System.out.println("Turn on WashingMachine2...\n");
	}
   }
 }

