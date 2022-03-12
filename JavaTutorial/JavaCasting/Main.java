/**
 * Widening Casting(Automatically): Converting a smaller type into a larger type size
 * Narrowing Casting(Manually): Converting a large type size into a smaller type size
 */

//Widening casting
/*public class Main {
    public static void main(String[] args){
        int myInt =9;
        double myDouble = myInt;

        System.out.println(myInt); // Output = 9
        System.out.println(myDouble); // Output = 9.0
    }
}*/

//Narrowing casting
public class Main{
    public static void main(String[] args){
        double myDouble = 9.78d;
        int myInt = (int) myDouble;

        System.out.println(myDouble); // 9.78
        System.out.println(myInt); //9
    }
}
