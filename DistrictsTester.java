class DistrictsTester{

      public static void main(String args[]){
	  
	  Districts dist = new Districts();
	  dist.name = "Bagalkot";
	  dist.area = "6593 km^2";
	  dist.population = "1 million";
	  dist.noOfTaluks = 7;
	  dist.toGetInfo();
	  System.out.println(dist.name + " "+ dist.area + " "+ dist.population + " "+ dist.noOfTaluks);
	  
	  Districts dist1 = new Districts();
	  dist1.name = "Vijayapur";
	  dist1.area = "1829 km^2";
	  dist1.population = "2 million";
	  dist1.noOfTaluks = 5;
	  dist1.toGetInfo();
	  System.out.println(dist1.name + " "+ dist1.area + " "+ dist1.population + " "+ dist1.noOfTaluks);
	  
	  Districts dist2 = new Districts();
	  dist2.name = "Banglore";
	  dist2.area = "2196 square km";
	  dist2.population = "12.34 million";
	  dist2.noOfTaluks = 5;
	  dist2.toGetInfo();
	  System.out.println(dist2.name + " "+ dist2.area + " "+ dist2.population + " "+ dist2.noOfTaluks);
	  
	  
	  
	  
	  }



}