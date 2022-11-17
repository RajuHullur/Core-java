class AirportsInIndia{
	
	  //  static String AirportsInIndiaName[]={Kempegowda,null,null,null,null};

      static String AirportsInIndiaNames[]={null,null,null,null,null};
	
	  static int index;
	//saveAirports, storeAirportsNames
	//airportsName="Kempegowda"
      public static boolean addAirportsNames(String AirportsName){
	System.out.println("inside addAirportsName");
		//airportsName[0]="Kempegowda",
		//addAirportsName[1]="Hubbli",
		//addAirportsName[2]="Mubai",
		//addAirportsName[3]="Kolkatha",
		//addAirportsName[4]="Pune",
	    airportsNames[index]= airportsName;
		System.out.println("end of  addAirportsName");
        return true;
	}
    //read operation
    public static void getAirportsName(){
    for(int index=0; index < airportsNames.length; index++){
		String ref = airportsNames[index];
	System.out.println("Airport name is"+ref);
	}
	}
}
