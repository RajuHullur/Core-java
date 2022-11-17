class TajHotelTester{

      public static void main(String args[]){
	  
	  TajHotel hotel =  new TajHotel();
	  hotel.item = "Masala Dosa";
	  hotel.price = 100.00;
	  hotel.location = "Rajajinagar";
	  hotel.type = "2 star";
	  hotel.toGetFood();
	  System.out.println(hotel.item + " "+ hotel.price + " "+ hotel.location + " "+ hotel.type);
	  
	  TajHotel hotel1 = new TajHotel();
	  hotel1.item = "Panneer Masala";
	  hotel1.price = 300.00;
	  hotel1.location = "Vijaynagar";
	  hotel1.type = "3 star";
	  hotel1.toGetFood();
	  System.out.println(hotel1.item + " "+ hotel1.price + " "+ hotel1.location + " "+ hotel1.type);
	  
	  TajHotel hotel2 = new TajHotel();
	  hotel2.item = "Ghee Rice";
	  hotel2.price = 200.00;
	  hotel2.location = "Shivajinagar";
	  hotel2.type = "5 star";
	  hotel2.toGetFood();
	  System.out.println(hotel2.item + " "+ hotel2.price + " "+ hotel2.location + " "+ hotel2.type);
	  
	  
	  
	  
	  
	  }




}