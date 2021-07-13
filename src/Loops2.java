import java.util.Scanner;
public class Loops2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.print(answer(a,b,j) + " ");
            }
            System.out.println("");
        }
        in.close();
    }

    public static int answer(int a, int b, int n) {
        int result = a;
        for (int z = 0; z <= n; z++) {
            result = result + ((int) Math.pow(2, z) * b);
        }
        return result;
    }
}

