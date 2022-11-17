class AC{
 static String brand;
 static String colour;
 static String remoteControl;
 static String compressor;
 static double price;
 static boolean isConnected;
 public static boolean onOrOff(){
 System.out.println("inside onOrOff");
   if(isConnected ==false){
       isConnected = true;
 System.out.println("AC is turn On");
}
	   if(isConnected==true){
	       isConnected = false;
  System.out.println("AC is trun Off");
   }
  System.out.println("end of onOrOff");
  return isConnected;
}
}