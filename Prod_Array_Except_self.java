import java.util.Scanner;
import java.util.Arrays;
class Prod_Array_Except_self extends Solution {
	public static void main(String args[]){
		Prod_Array_Except_self obj = new Prod_Array_Except_self();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = input.nextInt();
		int [] num_Arr = new int [size];
		System.out.println("Enter element of array : ");
		for(int i=0;i<size;i++){
			num_Arr[i] = input.nextInt();
		}
		int [] result = obj.productExceptSelf(num_Arr);
		System.out.println("Prod_Array_Except_self will be :  ");  
		for(int i : result){
			System.out.println(i);
		}
		input.close();
	}
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod =1,num_zero=0 ,index_of_zero =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0){
                prod=prod*nums[i];
            }
            else{
                index_of_zero=i;
                num_zero++;
            }
        }
        
        if(num_zero==0){
            for(int i=0;i<nums.length;i++){
                int temp = prod/nums[i];
                nums[i]=temp;
            }
        }
        else if(num_zero==1){
            Arrays.fill(nums,0);
            nums[index_of_zero]=prod;
        }
        else{
            Arrays.fill(nums,0);
        }
        return nums;
    }
}



/*
 optimize
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;int zero = 0;
        for(int i: nums )
        {
          if(i!=0)
            pro*=i;
          else
          zero++; 
        }
        if(zero>1)
        {
          Arrays.fill(nums,0);
          return nums;
        }
        else if(zero==1)
          for(int i = 0;i<nums.length;i++)
          {
            if(nums[i]!=0){
              nums[i]=0;}
            else
              nums[i]=pro;
          }
        else
          for(int i = 0;i<nums.length;i++)
            nums[i]=pro/nums[i];
        return nums;
    }
}






*/