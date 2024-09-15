import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
       
        //input and printing it
        String input = sc.next();
        System.out.println(input);

        //input of whole line and printing it
        String name = sc.nextLine();
        System.out.println(name);
 
        //imput of integer and printing it
        int num = sc.nextInt();
        System.out.println(num);

        //input of float and printing it
        float price = sc.nextFloat();
        System.out.println(price);

    }
}
