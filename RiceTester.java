class RiceTester{

    public static void main(String args[]){
	
	Rice rc = new Rice();
	rc.name = "Brown rice";
	rc.price = "50 per kg";
	rc.companyName = "Chicken rice lady";
    rc.brand = "Golden grain";
    rc.toGetRecipe();
    System.out.println(rc.name + " "+ rc.price + " "+ rc.companyName + " "+ rc.brand);	
	
	Rice rc1 = new Rice();
	rc1.name = "Basmati rice";
	rc1.price = "200 per kg";
	rc1.companyName = "The Rice Basket";
    rc1.brand = "Just made";
    rc1.toGetRecipe();
    System.out.println(rc1.name + " "+ rc1.price + " "+ rc1.companyName + " "+ rc1.brand);	
	
	Rice rc2 = new Rice();
	rc2.name = "Jasmine rice";
	rc2.price = "60 per kg";
	rc2.companyName = "Rico";
    rc2.brand = "Cookit Kwik";
    rc2.toGetRecipe();
    System.out.println(rc2.name + " "+ rc2.price + " "+ rc2.companyName + " "+ rc2.brand);	
	
	
	
	
	
	
	
	}




}