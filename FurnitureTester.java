class FurnitureTester{
	public static void main(String pk[]){
		
		Furniture.setFurnitureName("Raju");
		Furniture.setFurnitureColor("Yellow");
		Furniture.setFurniturePrice(20000);
		
		
		System.out.println(Furniture.getFurnitureName()+ "\n" + Furniture.getFurnitureColor()+ "\n" + Furniture.getFurniturePrice() );
	}
}