import java.util.Scanner; //DAY 2
class Gcd_String{
	public static void main(String args[]){
		Gcd_String gcd_str = new Gcd_String();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st string : ");
		String fistString = input.next();
		System.out.print("Enter 2nd string : "); 
		String secondString = input.next();
		//inputs 
		
		String result = gcd_str.str_gcd(fistString,secondString);//gcd of string
		System.out.println("result will be :  "+result);	
	}	
	public String str_gcd(String fistString,String secondString){
		if (!(fistString + secondString).equals(secondString + fistString)){
			return "";
		}
        int gcd = gcd(fistString.length(), secondString.length());
        return fistString.substring(0, gcd);
	}
	
	private int gcd(int a,int b){
		return b == 0 ? a : gcd(b, a % b);
	}
}