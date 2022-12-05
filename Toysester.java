class ToysTester{
	
	public static void main(String pk[]){
		Toys.setToysName("Panda");
		Toys.setToysColor("White");
		Toys.setToysPrice(290);
		
		System.out.println(Toys.getToysName() + "\n"+ Toys.getToysColor() +"\n" + Toys.getToysPrice());
	}
}