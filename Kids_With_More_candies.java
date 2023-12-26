import java.util.Scanner; //Day3
import java.util.List;
import java.util.ArrayList;
class Kids_With_More_candies{
	public static void  main(String args[]){
		Scanner input = new Scanner(System.in);
		Kids_With_More_candies  candies_obj = new Kids_With_More_candies();
		System.out.println("Enter the size of array :  ");
		int size = input.nextInt();
		int [] cadies_Arr = new int [size];
		System.out.println("Enter the elements in the array ");
		for(int i=0;i<size;i++){
			cadies_Arr[i] = input.nextInt();
		}
		System.out.println("Enter the number of extra candies : ");
		int extra_candies = input .nextInt();
		List <Boolean> result = candies_obj.max_candies_list(cadies_Arr,extra_candies);
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}
	}
	
	private List <Boolean> max_candies_list(int [] cadies_Arr,int extra_candies){
		int max =-1;
		for(int i:cadies_Arr){
			if(i>max){
				max=i;
			}
		}
		List<Boolean> ans = new ArrayList();
		for(int i:cadies_Arr){
			if(i+extra_candies>=max){
				ans.add(true);
			}
			else{
				ans.add(false);
			}
		}
		return ans;
	}

}