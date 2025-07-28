package Arrays;
import java.util.*;
public class ArrayEx {
	public static void main(String[] args) {
		int a[]= {1,2,3,0,4,9,8,7,0,1,2,3};
		int b[]=new int[a.length];
		//int d[]=new int[c.length];
			int count=0;
			int zc=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]!=0) {
				boolean Dup=false;
				for(int j=0;j<b.length;j++) {
					if(b[j]==a[i]) {
						Dup=true;
						break;
					}
				}
				if(!Dup) {
					b[count++]=a[i];
				}
			}else {
				zc++;
				continue;
			}
			}
			for(int k=0;k<zc;k++) {
				b[count++]=0;
			}
			int c[]=Arrays.copyOf(b, count);
			int d[]=new int[c.length];
			int ei=1,oi=0;
			for(int i=0;i<c.length-zc;i++) {
				if(c[i]%2==0) {
					if(ei<c.length-zc) {
						d[ei]=c[i];
						ei+=2;
					}
				}
				else {
					if(oi<c.length-zc) {
						d[oi]=c[i];
						oi+=2;
					}
				}
			}
			
			//System.out.println(Arrays.toString(c));
			System.out.println(Arrays.toString(d));
	}
}

