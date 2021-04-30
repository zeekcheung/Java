import java.util.Arrays;

public class SortAlgorithms {    

	public static void main(String[] args) {
		int A[] = {2, 4, 7, 6, 8, 5, 9};
		int B[] = {6, 4, 8, 9, 5, 4, 7};
		int C[] = {5, 4, 7, 9, 6, 3, 1};
		int D[] = {4, 5, 3, 7 ,5, 9, 1};
		int E[] = {5, 7, 6, 4, 3, 1, 2};
		
		//验证冒泡排序
		System.out.print("冒泡排序：排序前" + Arrays.toString(A));
	    bubbleSort(A);
	    System.out.println("排序后：" + Arrays.toString(A));
		
		//验证快速排序
	    System.out.print("快速排序：排序前" + Arrays.toString(B));
		quickSort(B,0,B.length - 1);
		System.out.println("排序后：" + Arrays.toString(B));
		
		//验证插入排序
		System.out.print("插入排序：排序前"+ Arrays.toString(C));
		insertSort(C);
		System.out.println("排序后：" + Arrays.toString(C));
		
		//验证希尔排序
		System.out.print("希尔排序：排序前"+ Arrays.toString(D));
		shellSort(D);
		System.out.println("排序后：" + Arrays.toString(D));
		
		//验证选择排序
		System.out.print("选择排序：排序前"+ Arrays.toString(E));
		selectionSort(E);
		System.out.println("排序后：" + Arrays.toString(E));
		
	}
	
	//冒泡排序
	public static void bubbleSort(int arr[]) {
		for (int i = 1; i <= arr.length; i++) {    //控制排序循环执行次数		
			for (int j = 0; j <= arr.length - 1 - i; j++){    //控制每轮循环的排序次数
				if (arr[j] >= arr[j+1]) {
					int temp;
					
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}		
		}
    }
	
	//快速排序
	public static void quickSort(int arr[],int low,int high){
		int p,i,j,temp;
	
		if (low >= high) {
			return;
		}
		
		p = arr[low];
		i = low;
		j = high;
		
		while (i < j) {
			while (arr[j] >= p && i < j) {
				j--;
			}
		
		    while (arr[i] <= p && i < j) {
			    i++;
		    }
		
		    temp = arr[j];
		    arr[j] = arr[i];
		    arr[i] = temp;
	    }
		
	    arr[low] = arr[i];
	    arr[i] = p;
	    
	    //递归
	    quickSort(arr,low,j-1);
	    quickSort(arr,j+1,high);
    }
    
	//插入排序
	public static void insertSort(int arr[]) {
		for (int i = 1; i <= arr.length - 1; i++) {
			int temp = arr[i], t = i - 1;
			
			while (t >= 0 && arr[t] > temp) {
				arr[t + 1] = arr[t];
				t--;
			}
			
			arr[t + 1] = temp;
		}	
	}
	
	//希尔排序
	public static void shellSort(int arr[]) {
		int n = arr.length;
		for (int increment = n/2; increment > 0; increment/=2) {    //希尔增量序列
			//插入排序
			for (int i = 1; i <= arr.length - 1; i++) {
				int temp = arr[i], t = i - 1;
				
				while (t >= 0 && arr[t] > temp) {
					arr[t + 1] = arr[t];
					t--;
				}
				
				arr[t + 1] = temp;
			}				
		}
	}

	//选择排序
	public static void selectionSort(int arr[]) {
		int pos, temp;
		
		for (int i = 0; i < arr.length - 1; i++) {	
			pos = 0;
			
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] > arr[pos]) {
					pos = j;
				}
			}	
			
		    temp = arr[arr.length - 1 - i];
		    arr[arr.length - 1 - i] = arr[pos];
		    arr[pos] = temp;
		}
	}
}