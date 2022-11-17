class Furniture{
	
	static String furnitureName;
	static String color;
	static int price;
	
	//setter and getter
	
	static void setFurnitureName(String name){
		furnitureName=name;
	}
	static String getFurnitureName(){
		return furnitureName;
	}
	static void setFurnitureColor(String clr){
		color= clr;
	}
	static String getFurnitureColor(){
		return color;
	}
	static void setFurniturePrice(int prce){
		price = prce;
	}
	static int getFurniturePrice(){
		return price;
	}
}