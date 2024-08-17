package loop;

public class DoWhileDemo {
    public static void main(String[] args) {
        //在编写游戏逻辑时，通常希望游戏循环至少运行一次，
        //以初始化游戏状态或显示初始界面
        boolean gameRunning = true;
        do {
            // 游戏逻辑
            // ...
            // 根据游戏状态决定是否继续
            gameRunning = checkGameStatus();
        } while (gameRunning);
    }
    public static boolean checkGameStatus(){
        return true;
    }
}

