package sec006_method;

public class P001_MethodDemoOne {
    public static void main(String[] args) {
        prints();
        printsUpgrade(2, 1500,60,40);
    }

    public static void prints(){
        System.out.println("第1件武器");
        System.out.println("价格2000");
        System.out.println("伤害100");
        System.out.println("攻击距离30");
    }

    public static void printsUpgrade(int count, int price, int damage, int distance){
        System.out.println("第"+ count+"件武器");
        System.out.println("价格"+ price);
        System.out.println("伤害" + damage);
        System.out.println("攻击距离" + distance);
    }
}
