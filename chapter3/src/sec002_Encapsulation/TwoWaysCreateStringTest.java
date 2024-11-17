package sec002_Encapsulation;

public class TwoWaysCreateStringTest {
    public static void main(String[] args) {
        String strOne = "this is a string";
        String strTwo = "this is a string";

        String strThree = new String("this is string object ");
        String strFour = new String("this is a string object ");

        System.out.println(strOne == strTwo);
        System.out.println("strOne: " + strOne);
        System.out.println("strTwo: " + strTwo);

        System.out.println(strThree == strFour);
        System.out.println("strThree: " + strThree);
        System.out.println("strFour: " + strFour);

        System.out.println(Integer.toHexString(System.identityHashCode(strThree)));
        System.out.println(Integer.toHexString(System.identityHashCode(strFour)));

    }
}
