import java.util.*;

public class else_if {
    public static void main(String args[]) {
        int a = 13;

        if (a>=18) {
            System.out.println("Adult.");
            
        } else if (a>=13 && a<=17){
            System.out.println("teenager");
            
        }else{
            System.out.println("child.");
        }      
    }
}
