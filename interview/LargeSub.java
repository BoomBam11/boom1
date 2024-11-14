package practice2;

public class LargeSub {
	public static void main(String[] args) {
		int a[][]= {{1,20,3},{40,5,6,},{7,8,90}};
		
		for (int i = 0; i < a.length; i++) {
//			int largest=0;
			int largest=a[i][0];//i = {1,20,3} 0=1/20/3
//			int largest=Integer.MIN_VALUE;
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]>largest)//1>0;20>1;3>20
					
				{
					largest=a[i][j];//1,20
				}
			}
			System.out.print(largest+" ");
		}
	}
}
