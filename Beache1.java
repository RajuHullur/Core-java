class Beache1 
{
	static String beachname[]= {null,null,null,null,null};
	static int i;

	public static void getbeachname() 
	{
		for(int i=0;i<beachname.length;i++) `
		{
			String ref =beachname[i];
			System.out.println("beachname is " +ref);
		}

	}
	public static boolean setbeachname(String name) 
	{
		if(i<beachname.length ) 
		{
			beachname[i++]=name;
		}
		else
		{
			System.out.println("check youer array[] its invalid" );
		}
		System.out.println("beachname end" );
		return false;
	}

}