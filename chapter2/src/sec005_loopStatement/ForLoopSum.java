package sec005_loopStatement;
// 此节练习在于运用for循环中添加不同的限制条件，以达到程序的预期结果。
public class ForLoopSum {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum = sum + i;
            // sum += i;
        }
        System.out.println("1 ~ 100 的和为：" + sum);

        int sum2 = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 1){
                System.out.println(i + " 是奇数");
                 sum2 += i;
            }
        }
        System.out.println("1 ~ 100中奇数的和为：" + sum2);

        int sum3 = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 & i % 5 == 0){
                System.out.println(i + " 是3 和 5 的倍数");
                sum3 += i;
            }
        }
        System.out.println("1 ~ 100中奇数的和为：" + sum3);
    }
}
