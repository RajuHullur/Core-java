\class TeaStallTester{
	public static void main(String pk[]){
		//TeaStall.teaStallId=58743;
		//TeaStall.name="Royal TeaStall point";
		//TeaStall.address="Rajajinagar";
		//TeaStall.contactNo=8197906086L;
		
		TeaStall.setTeaStallId(5678);
		TeaStall.setContactNo(8197906086L);
		TeaStall.setTeaStallName("Royal TeaStall Point");
		TeaStall.setAddress("Near rajajinagar College @Bangalore");
		
		System.out.println(TeaStall.getTeaStallId()+ " \n" + TeaStall.getContactNo()+ " \n" + TeaStall.getTeaStallName()+ " \n" + TeaStall.getAddress());
	} 

}