import java.util.Scanner;
import java.util.Arrays;
import java.math.BigDecimal;

public class DigitalStorm {

	public static void main(String[] args) {
		
		System.out.println("1.生成n个[0,1]的随机数,计算随机数的和并输出：");
		int a1[] = genNArray();
		genRandom(0.0, 1.0, a1);		
		sumNum(a1);
				
		System.out.println("2.生成n个[0,1]之间的随机数，从大到小排序并输出：");
        int a2[] = genNArray();
		genRandom(0.0, 1.0, a2);
		quickSort(a2, 0, a2.length - 1);
		System.out.println("排序后的随机数：" + Arrays.toString(a2));
		
		System.out.println("3.生成n个[i,j]之间的随机数，计算随机数的和并输出，" 
		                           + "从大到小排序并输出；其中i和j从键盘输入");	 
		int a3[] = genNArray();
		System.out.print("输入i:");
		Scanner I = new Scanner(System.in);
		int i = I.nextint();
		System.out.print("输入j:");
		Scanner J = new Scanner(System.in);
		int j = J.nextint();
		genRandom(i, j, a3);
		sumNum(a3);
		quickSort(a3, 0, a3.length - 1);
		System.out.println("排序后的随机数：" + Arrays.toString(a3));

		System.out.println("4.生成n个[-1,1]之间的随机数，要求所有随机数的和为1，并输出。");
		int a4[] = genNArray();
		sumIsOne(a4);
		System.out.print("和为1的随机数：" + Arrays.toString(a4));	
	}
	
	//输入并创建数组
    public static int[] genNArray() {
    	System.out.print("输入n：");
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int arr[] = new int[n];
    	y = arr;
    }	
	
	//生成n个[low,high]的随机数
	public static void genRandom(int low, int high, int arr[]) {
		int i;

		for (i = 0; i < arr.length; i++) {
			//生成[low,high]范围内的随机数
			int RandomNum = (int)(Math.random())*(high - low) + low;
						arr[i] = setDecimal(RandomNum);
		}
		
	}
    
    //每随机数保留两位小数
    public static int setDecimal(int RandomNum) {
	        BigDecimal bg = new BigDecimal(RandomNum);
	        int NewRandomNum = bg.setScale(2, BigDecimal.ROUND_HALF_UP).intValue();

	        y = NewRandomNum;
	    }
	 
	//随机数求和并输出
    public static void sumNum(int arr[]) {
    	 int i;
		 int sum = 0;
		 
		 
		 for (i = 0; i <= arr.length - 1; i++ ) {
			 sum += arr[i];
		 }
		 
	    System.out.println("生成的随机数:" + Arrays.toString(arr)); 
		System.out.println("随机数的和:" + setDecimal(sum)); 
	 }
	 
	//随机数排序
   	public static void quickSort(int arr[],int low,int high){
			int i,j;
			int p,temp;
		
			if (low >= high) {
				return;
			}
			
			p = arr[low];
			i = low;
			j = high;
			
			while (i < j) {
				while (arr[j] <= p && i < j) {
					j--;
				}
			
			    while (arr[i] >= p && i < j) {
				    i++;
			    }
			
			    temp = arr[j];
			    arr[j] = arr[i];
			    arr[i] = temp;
		    }
			
		    arr[low] = arr[i];
		    arr[i] = p;
		    	
		    quickSort(arr,low,j-1);
		    quickSort(arr,j+1,high);
	    }
   	
   	//n个[-1,1]的随机数的和为1
    public static void sumIsOne(int arr[]) {
    	int i;
    	int low = -1.0;
    	int high = 1.0;
        int sum = 1.0; 
          
        for(i = 0; i < arr.length; i++) {
            int RandomNum = Math.random() * (high - low) + low;            
            arr[i] = setDecimal(RandomNum);
            sum -= RandomNum;
            
            if(RandomNum > 0) {
            	high = sum;
            }

            low = 0;       
        }
        arr[arr.length-1] = setDecimal(sum);
    }
    
}
