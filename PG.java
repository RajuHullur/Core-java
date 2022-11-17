class PG{
	static String pgName;
	static String pgTypes;
	static int priceOfMonth;
	
	// setter and getter
	static void setPGName(String name){
		pgName=name;
	}
	static String getPGName(){
		return pgName;
	}
	static void setPGTypes(String type){
		pgTypes=type;
	}
	static String getPGTypes(){
		return pgTypes;
	}
	static void setPGPriceOfMonth(int price){
		priceOfMonth=price;
	}
	static int getPGPriceOfMonth(){
		return priceOfMonth;
	}
}