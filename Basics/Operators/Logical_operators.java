public class Logical_operators {
    public static void main (String args[] )
    {
     boolean a=(5>4);//true
     boolean b=(9>3);//true
     boolean c=(100<88);//false
    
     //And Logic
     System.out.println(a&&b);//true and true
     System.out.println(a&&c);//true and false    
    
     // OR Logic   
     System.out.println(a||b);//true or true
     System.out.println(a||c);//true or false

     // NOT Logic
     System.out.println(!a);// not true
     System.out.println(!c);// not false
    }
}
