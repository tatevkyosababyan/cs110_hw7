package utils;

public class ArrayUtils {

	public static void reverse(int[] arr) {
		for(int i=0; i<=(arr.length - 1)/2; i++) {
			arr[i] = arr[i] + arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[i] - arr[arr.length-1-i];
			arr[i] = arr[i] - arr[arr.length-1-i];
		}
	}

	public static String stringifyArray(int[] arr){
		String narek = "";
		for(int i=0; i<arr.length-1; i++) {
			narek = narek + arr[i] + ", ";
		}
		return narek + arr[arr.length-1];
	}

}