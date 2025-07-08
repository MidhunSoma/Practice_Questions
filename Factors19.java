
public class Factors19 {

	public static void main(String[] args) {
		int counts=0;
		for(int i=1000;i<=2000;i++) {
			if(i%19!=0) {
				continue;
			}
			System.out.println(i);
			counts+=1;
			if(counts==10) {
				break;
			}
		}
		System.out.println("Total Factors are: "+counts);
	}

}
