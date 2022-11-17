class Banks{
	//Creating a array with default VALUE
	static String bankNames[]={null,null,null,null,null};
	static int index ;
	
	//saveBanks, storeBanksNames , createBanks and creating  method
	public static boolean addBankNames(String bankName)
	{
		System.out.println(" Inside the addBankNames() method ");
		
		
			BankNames[index] = bankName; // code optimization line from 11 to 12
		    index++;

		System.out.println(" End of the addBankNames() method ");
		
		return false;
	}
	//READ Operations
	public static void getBankNames()
	{
		for (int index = 0; index<BankNames.length; index++)
		{
			String ref = BankNames[index];
			System.out.println(" Banks in India are : "+ref);
		}
	}
}