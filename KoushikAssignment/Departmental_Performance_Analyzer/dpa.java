
package Departmental_Performance_Analyzer;
import java.util.*;

public class dpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of Departments: ");
        int d = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter no.of subjects: ");
        int sub = sc.nextInt();
        sc.nextLine();

        String[][] names = new String[d][];
        float[][][] marks = new float[d][][];
        float passMark = 35.0f;

        for (int i = 0; i < d; i++) {
            System.out.println("Department " + (i + 1));
            System.out.println("Enter no.of students in department- " + (i + 1) + ": ");
            int s = sc.nextInt();
            sc.nextLine();

            names[i] = new String[s];
            marks[i] = new float[s][sub];

            for (int j = 0; j < s; j++) {
                System.out.println("Name of Student " + (j + 1) + ": ");
                names[i][j] = sc.nextLine();
                for (int k = 0; k < sub; k++) {
                    System.out.println("Enter Subject-" + (k + 1) + " marks: ");
                    marks[i][j][k] = sc.nextFloat();
                    sc.nextLine();
                }
            }
        }


        System.out.println("\nStudent-wise: Name, Total, Average, Grade, Status");
        for (int i = 0; i < d; i++) {
            System.out.println("\nDepartment " + (i + 1) + ":");
            for (int j = 0; j < names[i].length; j++) {
                float total = 0;
                boolean pass = true;
                for (int k = 0; k < sub; k++) {
                    total += marks[i][j][k];
                    if (marks[i][j][k] < passMark) 
                    	pass = false;
                }
                float avg = total / sub;
                String grade;
                if (avg >= 90)
                	grade = "A+";
                else if (avg >= 80) 
                	grade = "A";
                else if (avg >= 70) 
                	grade = "B";
                else if (avg >= 60)
                	grade = "C";
                else if (avg >= 50) 
                	grade = "D";
                else if (avg >= 35) 
                	grade = "E";
                else 
                	grade = "F";
                String status = pass ? "Pass" : "Fail";
                System.out.printf( names[i][j], total, avg, grade, status);
            }
        }

        System.out.println("\nDepartment-wise:");
        for (int i = 0; i < d; i++) {
            float deptTotal = 0;
            int passCount = 0;
            float maxTotal = -1;
            String topper = "";
            for (int j = 0; j < names[i].length; j++) {
                float total = 0;
                boolean pass = true;
                for (int k = 0; k < sub; k++) {
                    total += marks[i][j][k];
                    if (marks[i][j][k] < passMark) 
                    	pass = false;
                }
                deptTotal += total;
                if (pass)
                	passCount++;
                if (total > maxTotal) {
                    maxTotal = total;
                    topper = names[i][j];
                }
            }
            float avgDeptScore = deptTotal / (names[i].length * sub);
            float passPercent = (names[i].length == 0) ? 0 : (passCount * 100.0f / names[i].length);
            System.out.println("Department :"+ i + 1);
            System.out.println("Avg department score: "+ avgDeptScore);
            System.out.println("Pass percentage: "+ passPercent);
            System.out.println("Topper: "+ topper);
        }
    }
}
