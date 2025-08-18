package Arrays;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int oc=0;
		int ec=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				ec+=1;
			}else
				oc+=1;
		}
		System.out.println("Even count: "+ec+" Odd count:"+oc);
		

	}

}
