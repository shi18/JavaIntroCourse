package sec003_operators;

public class ExerciseOne {
    public static void main(String[] args) {
        //将一个三位数，拆分为个位，十位，百位，然后分别在控制台上显示
        int num = 321;
        int unit = num % 10;
        int ten = num / 10 % 10;
        int hundred = num / 100 % 10;
        System.out.println("个位是： " + unit);
        System.out.println("十位是： " + ten);
        System.out.println("百位是： " + hundred);
    }
}
