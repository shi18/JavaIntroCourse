package StudentManagementSystem;

import java.util.ArrayList;

public class Login {
    private Login() {

    }

    public static boolean isMatch(User inputUser, ArrayList<User> userList) {
        String inputUname = inputUser.getUsername();
        String inputPwd = inputUser.getPassword();
        for (User user : userList) {
            String uname = user.getUsername();
            String pwd = user.getPassword();
            if (inputUname.equals(uname) && inputPwd.equals(pwd)) {
                return true;
            }
        }
        System.out.println("账号和密码不匹配！！！请重新输入账号密码！！！");
        System.out.println();
        return false;
    }
}
