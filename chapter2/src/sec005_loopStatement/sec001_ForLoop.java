package sec005_loopStatement;

public class sec001_ForLoop {
    public static void main(String[] args) {
        //print number 1 ~ 5
        for(int i = 1; i < 6; i++){
            System.out.println("i 的值为：" + i);
        }
        System.out.println("---------");
        //print number 1 ~ 5
        for(int i = 1; i <= 5; i++){
            System.out.println("i 的值为：" + i);
        }
        System.out.println("---------");
        //print number 1 ~ 5
        for(int i = -4; i <= 0; i++){
            System.out.println("i 的值为：" + (i + 5));
        }
        System.out.println("---------");
        //print number 5 ~ 1
        for(int i = 5; i > 0; i--){
            System.out.println("i的值为：" + i);
        }
        System.out.println("---------");
        //print number 5 ~ 1
        for(int i = 5; i != 0; i--){
            System.out.println("i的值为：" + i);
        }
        System.out.println("---------");
    }
}
