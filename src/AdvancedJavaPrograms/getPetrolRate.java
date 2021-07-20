package AdvancedJavaPrograms;

interface PetrolRate 
{ 
  static double baseRate = 37.5;
  double petrolRate(); 
 } 

class central implements PetrolRate 
{ 
  public double petrolRate() 
  { 
    double pRate = (PetrolRate.baseRate + (PetrolRate.baseRate * 1.25));
    return pRate;
  } 
}

class Telangana implements PetrolRate 
{ 
  public double petrolRate() 
  { 
	PetrolRate central = new central();
	double pRate = (central.petrolRate() + (central.petrolRate() * 0.24));
    return pRate;
  } 
}

class Andra implements PetrolRate 
{ 
  public double petrolRate() 
  { 
	PetrolRate central = new central();
	double pRate = (central.petrolRate() + (central.petrolRate() * 0.22));
    return pRate;
  } 
}

class Pondy implements PetrolRate 
{ 
  public double petrolRate() 
  { 
	PetrolRate central = new central();
	double pRate = (central.petrolRate() + (central.petrolRate() * 0.16));
    return pRate;
  } 
}

public class getPetrolRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   PetrolRate central = new central();	
  	   System.out.println("Petrol Rate from Central Govt : " + central.petrolRate());
  	   PetrolRate ts = new Telangana();
  	   System.out.println("Petrol Rate from Telangana : " + ts.petrolRate());
  	   PetrolRate ap = new Andra();
	   System.out.println("Petrol Rate from AndhraPradesh : " + ap.petrolRate());
	   PetrolRate pd = new Pondy();
	   System.out.println("Petrol Rate from Ponducherry : " + pd.petrolRate());
	   
	}

}
