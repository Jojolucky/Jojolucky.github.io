package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class bubbleSort {
	public static void main(String[] args) {
		// 冒泡排序的时间复杂度： O(n^2)
		int arr[] = {3,9,-1,10,2};
		Date date = new Date();
		SimpleDateFormat sDateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
		String d = sDateFormat.format(date);
		System.out.println("排序前" + Arrays.toString(arr));
		System.out.println("排序时间为" + d);
		
		bubbleSort(arr);
		System.out.println("排序后" + Arrays.toString(arr));
		}
		
//		
//		for(int i = 0; i < arr.length-2; i++) {
//			if(arr[i] > arr[i+1]) {
//				temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//			
//		}
//		System.out.println("第二次排序：" + Arrays.toString(arr));	
//		
//		for(int i = 0; i < arr.length-3; i++) {
//			if(arr[i] > arr[i+1]) {
//				temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//			
//		}
//		System.out.println("第三次排序：" + Arrays.toString(arr));	
//		
//		for(int i = 0; i < arr.length-4; i++) {
//			if(arr[i] > arr[i+1]) {
//				temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//			
//		}
//		System.out.println("第四次排序：" + Arrays.toString(arr));	
		
	
	
	
	// 将冒泡排序封装成一个方法
	public static void bubbleSort(int[] arr) {
		int temp = 0;
		boolean flag = false;
		// 第一次排序，把最大的数放在了最后
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length -1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					flag = true;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		System.out.println("第" + (i+1) + "次排序：" + Arrays.toString(arr));	
			
		if(!flag) {
			break;
		}else {
			flag = false;
		}
		
		}
	}

}
