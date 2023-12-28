import java.util.Scanner;
class Can_Place_flower{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		Can_Place_flower flowerObj = new Can_Place_flower();
		System.out.println("Enter the size of array : ");
		int size = input.nextInt();
		int flower_Arr [] = new int [size];
		System.out.println("Enter the flower array ");
		for(int i=0;i<size;i++){
			flower_Arr[i] = input.nextInt();
		}
		System.out.println("Enter the number of flower availble : ");
		int avail_flower = input.nextInt();
		boolean result = flowerObj.planting(flower_Arr,avail_flower);
		System.out.println("flower can be  planted in given space  Status :  "+result);
	}
	private  boolean planting(int [] flower_Arr,int avail_flower){
		for(int i=1;i<flower_Arr.length-2;i++){
			if(flower_Arr[i]==1){
				flower_Arr[i-1]=1;
				flower_Arr[i+1]=1;
			}
		}
		
		if(flower_Arr[0] ==1){
			flower_Arr[1]=1;
		}
		
		if(flower_Arr[flower_Arr.length-1]==1){
			flower_Arr[flower_Arr.length-2]=1;
		}
		int counter =0;
		System.out.println("flower array :");
		for(int arr:flower_Arr){
			System.out.println(arr);
			if(arr==0){
				counter++;
			}
		}
		if(counter >= avail_flower){
			return true;
		}
		return false;
	}
}



/*
optimization
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;

        while (i < flowerbed.length)
        {
            if (flowerbed[i] == 1) i += 2;
            else if ((i + 1) > (flowerbed.length -1) || flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                    n--;
                    i += 2;
                }
            else i += 3;
        }


        return (n <= 0);
    }
}
*/