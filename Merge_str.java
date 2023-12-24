import java.util.Scanner;  // Day 1
public class Merge_str{
	public static void main(String args[]){
		Merge_str mergestr = new Merge_str();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ist string : ");
		String fistString = input.next();
		System.out.print("Enter 2nd string : "); 
		String secondString = input.next();
		String outputStr =  mergestr.mergeTwostr(fistString, secondString);
		System.out.println("merged sring will be "+outputStr);
	}	

	public String mergeTwostr(String first, String second ){
		String result="";
		int size1 = first.length();
		int size2 = second.length();
		int i=0;
		while(i<size1 || i< size2){
			if(i<size1){
				result+=first.charAt(i);
			}
			if(i<size2){
				result+=second.charAt(i);
			}
			i++;
		}
		return result;
	}
}