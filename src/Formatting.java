import java.util.Scanner;

public class Formatting {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("===========================");
    for (int i = 0 ; i<3; i++){
        String name = input.next();
        input.nextLine();
        int index = input.nextInt();
        System.out.printf("%-15s%03d%n",name , index);

    }
        System.out.println("===========================");

    }
}
