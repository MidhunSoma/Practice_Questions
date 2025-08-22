package Examm;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,1,2,4,5,3,5,4,3,5,6,7,4,3,8,9,6,7,8,6};
		boolean[] visit=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(visit[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					visit[j]=true;
					count++;
				}
			}
			System.out.println(a[i]+" Occured "+count+ " times");
		}

	}

}
