package Arrays;
import java.util.Arrays;
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			c[j+a.length]=b[j];
		}
		System.out.println(Arrays.toString(c));
		

	}

}
