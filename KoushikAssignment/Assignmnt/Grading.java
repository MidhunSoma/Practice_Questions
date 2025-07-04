package Assignmnt;
import java.util.*;
public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of Students: ");
		int students=sc.nextInt();
		int a=0,b=0,c=0,d=0,f=0;
		int i=0,max=0,min=101;
		while(i<students) {
			System.out.println("Enter Score of Student "+(i+1)+" : ");
			int score=sc.nextInt();
			
			if(score>0 && score<100) {
				if(score<min) {
					min=score;
				}
				if(score>max) {
					max=score;
				}
				if(score>90 && score<100) {
					System.out.println("Grade : A");
					a++;
				}
				else if(score>80 && score<89) {
					System.out.println("Grade : B");
					b++;
				}
				else if(score>70 && score<79) {
					System.out.println("Grade : C");
					c++;
				}
				else if(score>60 && score<69) {
					System.out.println("Grade : D");
					d++;
				}
				else {
					System.out.println("Grade : F");
					f++;
				}
			}
			else {
				System.out.println("Re-Enter student "+(i+1)+" marks");
				continue;
			}
			i++;		
			
		}
		System.out.println("Total Students: "+students);
		System.out.println(a+" Students got A grade");
		System.out.println(b+" Students got B grade");
		System.out.println(c+" Students got C grade");
		System.out.println(d+" Students got D grade");
		System.out.println(f+" Students got F grade");
		System.out.println("Highest Score: "+max);
		System.out.println("Lowest Score: "+min);

	}

}
