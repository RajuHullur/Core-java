class Swiggy{
	//Pizza,Burgar,Sandwitch,mosaranna,frechfries,Pastries
  public static double takeorder(String item, double price){
  if(item=="Pizza")
  {
  System.out.println("tank u for your ordaring"+item);
  return 88.00;
  }	
  if(item=="Burgar")
  {
  System.out.println("tank u for your ordaring"+item);
  return 66.00;
  }
  if(item=="Sandwitch")
  {
  System.out.println("tank u for your ordaring"+item);
  return 50.00;
  }
  if(item=="mosaranna")
  {
   System.out.println("tank u for your ordaring"+item);
   return 45.00;
  }
    if(item=="frechfries")
	{
	System.out.println("tank u for your ordaring"+item);
   return 30.00;
	}
	return 00.00;
 }
  
 
}