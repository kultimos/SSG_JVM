import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int apply = sc.nextInt();
        sc.nextLine();
        int array[] = new int[100];
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String a = line.split(" ")[0];
            String b = line.split(" ")[1];
            int A = Integer.parseInt(a);
            int B = Integer.parseInt(b);
            for(int i=0;i<B;i++) {
                array[A+i] = 1;
            }
        }
        for(int u: array) {
            System.out.println(u);
        }

    }
}
