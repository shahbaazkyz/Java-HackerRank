import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 1 ; input.hasNext(); i++ )
        {
            System.out.println(i + " " + input.nextLine());
        }
    }
}
