package guvi.assignment;

public class NumberPattern {

    public static void main(String[] args) {
        int k = 5;

      
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (j < k - i) {
                    System.out.print(k);
                } else {
                    System.out.print(k - (j - (k - i - 1)));
                }
            }
            System.out.println();
        }
    }
}
