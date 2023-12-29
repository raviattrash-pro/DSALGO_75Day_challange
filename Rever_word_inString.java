import java.util.Scanner;
class Rever_word_inString {
	public static void main(String args[]){
		Rever_word_inString rev_Str = new Rever_word_inString();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String :  ");
		String name = input.nextLine();
		String result = rev_Str.reverseWords(name.toLowerCase());
		System.out.println("reversed word in the String will be  : "+result);
		input.close();
	}

    public String reverseWords(String s) {
        char[] chars =  s.toCharArray();
        char[] reverse = new char[chars.length];
        int i = reverse.length - 1, j, k, r=0;
        while(i >= 0 && chars[i] == ' ') {
            i--;
        }

        while(i >= 0) {
            j = i;
            while(i >= 0 && chars[i] != ' ') {
                i--;
            }
            if(r > 0) {
                reverse[r++] = ' ';
            }
            for(k=i+1; k<=j; k++) {
                reverse[r++] = chars[k];
            }
            while(i >= 0 && chars[i] == ' ') {
                i--;
            }
        }

        return new String(reverse, 0, r);
    }
}