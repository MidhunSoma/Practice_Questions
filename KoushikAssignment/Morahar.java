public class Morahar {

    public static void main(String[] args) {
        int a = 11; // Change to a bigger number for better output

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= a; j++) {
                if(j == 1 || (i + j) == 12 || ((i == j) && (j > a / 2))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
