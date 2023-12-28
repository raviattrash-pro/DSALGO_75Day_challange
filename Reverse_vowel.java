import java.util.Scanner;

class Reverse_vowel{
	public static void main(String args[]){
		Reverse_vowel rev_vowel = new Reverse_vowel();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String :  ");
		String name = input.next();
		String result = rev_vowel.rev_str(name.toLowerCase());
		System.out.println("reversed vowel will be  : "+result);
		input.close();
	}
	
	private String rev_str(String name){
		int array_index =0;
		int j=0;
		
		for(int i=0;i<name.length();i++){
			char temp_char = name.charAt(i);
			if(temp_char =='a' ||temp_char =='e'||temp_char =='i'||temp_char =='o'||temp_char =='u'){
				array_index++;
			}
		}
		
		char [] temp_vowel = new char[array_index];
		
		for(int i=0;i<name.length();i++){
			char temp_char = name.charAt(i);
			if(temp_char =='a' ||temp_char =='e'||temp_char =='i'||temp_char =='o'||temp_char =='u'){
				temp_vowel[j] = temp_char;
				j++;
			}
		}
		
		StringBuilder change_char = new StringBuilder(name);
		int size = array_index;
		for(int i=0;i<name.length();i++){
			char temp_char = name.charAt(i);
			if(temp_char =='a' ||temp_char =='e'||temp_char =='i'||temp_char =='o'||temp_char =='u'){
				char temp_arr_char = temp_vowel[size-1];
				change_char.setCharAt(i,temp_arr_char);
				size--;
			}
		}
		return change_char.toString();
	}
	
}


/*
need some cornercases rectify
optimization
class Solution {
    public String reverseVowels(String s) {
        boolean[] vowels = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels[c] = true;
        }
        char[] cs = s.toCharArray();
        int i = 0, j = cs.length - 1;
        while (i < j) {
            while (i < j && !vowels[cs[i]]) {
                ++i;
            }
            while (i < j && !vowels[cs[j]]) {
                --j;
            }
            if (i < j) {
                char t = cs[i];
                cs[i] = cs[j];
                cs[j] = t;
                ++i;
                --j;
            }
        }
        return String.valueOf(cs);
    }
}
*/