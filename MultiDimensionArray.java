class MultiDimensionArray{
	public static void main(String args[]){
		int arr[][] = {{4,6,2},{9,0,3},{5,6,3}};

		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
		}
	}
}