package twodarray;

public class PrintTwoDArray {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{2,3,5,7},{10,20,30}};
				
		for (int i = 0; i < a.length; i++) {//to select outer arrays elements                                                                                          
			for (int j = 0; j < a[i].length; j++) {//to select inner array elements
				System.out.println(a[i][j]);
			}
		}
	}

}
