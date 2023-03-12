package lab1;

public class Exercise1 {
	public static void main(String args[]){
	     int miles = 26; 
	     int yards = 385;
	     double kilometers;

	    //mile--> km
	    //miles *1.609
	     
	    //yards--> miles-->km
	    //yards/1760 = miles
	    //(yards/1760)*1.609 = km

	    kilometers = (miles*1.609)+((yards/1760)*1.609);

	     System.out.println("Total kilometers = "+kilometers);
	      
	    }
}
