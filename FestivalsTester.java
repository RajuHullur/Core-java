class FestivalsTester{

      public static void main(String args[]){
	  
	  Festivals fest = new Festivals();
	  fest.name = "Dasshera";
	  fest.special = "Ayudh pooja";
	  fest.month = "October";
	  fest.food = "Holige";
	  fest.toGetCelebrate();
	  System.out.println(fest.name + " "+ fest.special + " "+ fest.month + " "+ fest.food);
	  
	  Festivals fest1 = new Festivals();
	  fest.name = "Deepavali";
	  fest.special = "Lakshmi pooja";
	  fest.month = "November";
	  fest.food = "Paayasa";
	  fest.toGetCelebrate();
	  System.out.println(fest.name + " "+ fest.special + " "+ fest.month + " "+ fest.food);
	  
	  
	  
	  
	  }




}