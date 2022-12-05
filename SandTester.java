class SandTester{
	public static void main(String pk[]){
		
		Sand.setSandTypes("4 Types");
		Sand.setSandColor("River Sand");
		Sand.setSandArea("564777km^2");
		
		System.out.println(Sand.getSandType()+"\n"+ Sand.getSandColor() + "\n" + Sand.getSandArea() );
	}
}