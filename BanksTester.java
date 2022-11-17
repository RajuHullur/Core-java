class BanksTester{
	
	public static void main(String at[])
	{
		//passing the values through arguments i.e
		Banks.addBanksNames(" HDFCbank ");
		Banks.addBanksNames("IDBI ");
		Banks.addBanksNames("ICI");
		Banks.addBanksNames("BOB");
		Banks.addBanksNames(" KYC");
		//Banks.addBanksNames(" ");
		Banks.getBanksNames(); //calling READ Operations from file 1
	}
}