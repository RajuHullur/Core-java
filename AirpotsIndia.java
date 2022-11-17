d class AirpotsIndia{
	//Creating a array with default VALUE
	static String AirpotsIndiaNames[]={null,null,null,null,null};
	static int index ;
	
	//saveAirpotsIndia, storeAirpotsIndiaName , createAirpotsIndia and creating  method
	public static boolean addAirpotsIndiaNames(String airpotsName)
	{
		System.out.println(" Inside the addAirpotsIndiaNames() method ");
		
		
			AirpotsIndiaNames[index] = airpotsName; // code optimization line from 11 to 12
		    index++;

		System.out.println(" End of the addAirpotsIndiaNames() method ");
		
		return false;
	}
	//READ Operations
	public static void getAirpotsIndiaNames()
	{
		for (int index = 0; index<AirpotsIndiaNames.length; index++)
		{
			String ref = AirpotsIndiaNames[index];
			System.out.println(" Airpots India Names are : "+ref);
		}
	}
}