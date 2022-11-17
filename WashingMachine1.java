class  WashingMachine1{
  static String brand;
  static String colour;
  static double price;
  static boolean isConnected;
   public static boolean onOrOff(){
     System.out.println("inside onOrOff");
   if(isConnected == false){
        isConnected = true;
   System.out.println("WashingMachine is turn On");
   }
    if(isConnected == true){
         isConnected = false;
   System.out.println("WashingMachine is  Off");
   }
   System.out.println("end of onOrOff");
   return isConnected;			
   }
}