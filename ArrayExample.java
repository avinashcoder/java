class ArrayExample{
	public static void main(String args[]){
		int arr[] = {8,6,4,9,8,7,6,7};

		arr[5] = 100;

		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}
}