import java.util.Scanner;
public class StaticIntitializerBlock {


    static Scanner input = new Scanner (System.in);
    static int B = input.nextInt();
    static int H = input. nextInt();
    static boolean flag;

    static {
        try {
           if (B > 0 && H > 0 ){
               flag = true;
           }
           else {
               throw new Exception("Breadth and height must be positive");
           }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
