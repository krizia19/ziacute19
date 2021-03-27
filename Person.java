public class Person 
{
    private String rname;
    private String oname;
    private String address;
    private String model;
    private int phoneNum;
    private int numD;
    private int rent;
    private int OT;
    private int OTAmount;
    private int tax;
    private int TRent;
    private int TRentTax;


    //Art Leo Balen “Method 1”
    public void getRName(String rname)
    {
        this.rname = rname;
    }
    
    public String showName()
    {
        return rname;
    }
    
    //Art Leo Balen “Method 2”
    public void getOName(String oname)
    {
        this.oname = oname;
    }
  
    public String showOName()
    {
        return oname;
        
    }
    // Patricia Bugarin “Method 3”
     public void getAdress(String address)
    {
        this.address = address;
    }
    
    public String showAddress()
    {
        return address;
    }
    
    // Patricia Bugarin “Method 4”
    public void getModel(String model)
    {
        this.model = model;
    }
    
    public String showWork()
    {
        return model;
    }
   // Jhames Dela Cruz “Method 5”
    public void getPhoneNum(int phoneNum)
    {
        this.phoneNum = phoneNum;
    }
    
    public int showPhoneNum()
    {
        return phoneNum;
    }
    
    // Jhames Dela Cruz “Method 6”
    public void getNumofD(int numD)
    {
        this.numD = numD;
    }
    
    public int showNumofD()
    {
        return numD;
    }

 

    // Karla Datu “Method 7”
    public void getRent(int rent)
    {
        this.rent = rent;
    }
    
    public int showrent()
    {
        return rent;
    }
    
    // Aevan Baricuatro “Method 8”
    public void getOT(int OT)
    {
        this.OT = OT;
    }
    
    public int showOT()
    {
        return OT;
    }
    // Alden De Jesus “Method 9”
    public void getOTAmount(int OTAmount)
    {
        this.OTAmount = OTAmount;
    }
    
    public int showOTAmount()
    {
        return OTAmount;
    }
  
    //Mark Leonen “Method 10”
    public void getTax(int tax)
    {
        this.tax = tax;
    }
    
    public int showTax()
    {
        return tax;
    }
    // Mark Leonen “Method 11”
    public int TRent()
    {
       int TotalRent = (rent* 10)+OTAmount;
       return TotalRent;
    }

   // Agero Lance “Method 12”
    public int TRentTax()
    {
       int RentTax = (rent*10 + OTAmount) -tax;
       return RentTax;
       
    }
    public void result ()
   {
       System.out.println("The Total Rent is: " + TRent()); 
       System.out.println("The Total Rent with Tax : " + TRentTax());

	}
}
