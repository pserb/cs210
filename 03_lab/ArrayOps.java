public class ArrayOps{

    //Add together every element in the array 
    public static int sum(int[] arr){
	int sum = 0;
	for(int i = 0; i < arr.length; i++){
	    sum += arr[i];
	}
	return sum;
    }
    //Get the average of the values in the array
    public static double average(int[] arr){
        int sum = sum(arr);
        return (double)sum / arr.length;
    }
    //Naive while loop to iterate over the array to find the given value
    public static boolean find(int[] arr, int val){
        int i = 0;
		boolean found = false;
		while(!found && i < arr.length) {
			if(arr[i] == val) {
				found = true;
				// return found;
			}
	    	i++;
		}
		return found;
    }
}
