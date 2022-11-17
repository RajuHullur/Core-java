class ShowRoom{
   static void getBike(String[] bikes){
  System.out.println("inside the showroom");
  System.out.println("number of bikes in showroom "+ bikes.length);
    System.out.println("lists of bikes");
   for(int w=0; w<bikes.length; w++){
   System.out.println(bikes[w]);
  }
  System.out.println("end of the showroom");

  }
  static void getCar(String[] cars){
  System.out.println("inside the showroom"); 
  System.out.println("number of cars in showroom "+ cars.length);
  System.out.println("lists of cars");
  for(int r=0; r<cars.length; r++){
  System.out.println(cars[r]);
    }
   System.out.println("end of the showroom");

}

}