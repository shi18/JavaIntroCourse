package sec001_classAndObject;

public class PhoneTest {
    public static void main(String[] args) {
        Phone xiaomi = new Phone("小米14", 4999);
        xiaomi.printPhoneInfo();

        Phone huawei = new Phone("华为mate60",6999);
        huawei.printPhoneInfo();

        Phone iPhone = new Phone("苹果16 plus", 7999);
        iPhone.printPhoneInfo();
    }
}
