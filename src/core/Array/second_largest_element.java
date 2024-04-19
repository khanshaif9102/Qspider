package core.Array;

public class second_largest_element {
	public static void main(String[] args) {
		int[] a= {10,25,55,5,8,10};
		int l=a[0],sl=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>l) {
				sl=l;
				l=a[i];
			}
		}
		System.out.println("largest element:"+l);
		System.out.println("second largest element:"+sl);
	}
}
