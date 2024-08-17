package loop;

public class ForLoopWebReconnect {
    public static void main(String[] args) {
        //游戏中，网络终端重新连接，超过一定次数之后，告知用户连接失败
        //用户登录，密码和用户输入次数失败一定次数之后，告诉用户一定时间之内不能再次登录
        int count = 1;

        if ( count <= 5){
            for(int i = 1; i>5; i++){
                System.out.println("验证连接或密码");
            }
        }else{
            System.out.println("连接或验证失败");
        }


    }
}
