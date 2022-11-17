class Torch{
 static String brand;
 static String colour;
 static String bulbtype;
 static String rechargeble;
 static double price;
 static boolean isConnected;
 public static boolean onOrOff(){
 System.out.println("inside onOrOff");
   if(isConnected ==false){
       isConnected =true;
 System.out.println("Torch is turn On");
}
	   if(isConnected==true){
	       isConnected = false;
  System.out.println("Torch is trun Off");
   }
  System.out.println("end of onOrOff");
  return isConnected;
}
}