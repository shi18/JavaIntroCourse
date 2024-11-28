package StudentManagementSystem;

import java.util.ArrayList;

public class RegisterAccount {
    private RegisterAccount() {

    }

    public static boolean isUsernameValid(String inputUsername, ArrayList<User> userList) {
        int len = inputUsername.length();
        if (len > 12 || len < 5) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            char c = inputUsername.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z' || (c >= '0' && c <= '9')))) {
                System.out.println("输入的用户名无效，请按照要求输入用户名！！！");
                System.out.println();
                return false;
            }
        }
        return isUsernameUnique(inputUsername, userList);
    }

    public static boolean isUsernameUnique(String inputUsername, ArrayList<User> userList) {
        if (userList.isEmpty()) {
            return true;
        }
        for (User u : userList) {
            if (u.getUsername().equals(inputUsername)) {
                System.out.println("用户名已经存在，请使用其他用户名！！！");
                return false;
            }
        }
        System.out.println("用户名有效，请继续设置密码！");
        return true;
    }

    public static boolean isFirstPasswordValid(String firstInputPassword) {
        if (firstInputPassword.length() < 8) {
            System.out.println("密码最少要8位！");
            return false;
        }
        int upperCaseCount = 0, lowerCaseCount = 0, numCount = 0, speicalCharCount = 0;
        for (int i = 0; i < firstInputPassword.length(); i++) {
            char c = firstInputPassword.charAt(i);
            if (c >= 'a' && c <= 'z') {
                lowerCaseCount++;
            }
            if (c >= 'A' && c <= 'Z') {
                upperCaseCount++;
            }
            if (c >= '0' && c <= '9') {
                numCount++;
            }
            if (c == '!' || c == '@' || c == '#' || c == '$') {
                speicalCharCount++;
            }
        }
        if (upperCaseCount == 0) {
            System.out.println("请在密码中包含大写字母！");
            return false;
        }
        if (lowerCaseCount == 0) {
            System.out.println("请在密码中包含小写字母！");
            return false;
        }
        if (numCount == 0) {
            System.out.println("请在密码中包含数字！");
            return false;
        }
        if (speicalCharCount == 0) {
            System.out.println("请在密码中包含如下特殊字符 !、@、#、$");
            return false;
        }
        return true;
    }

    public static boolean isTwoPasswordMatch(String firstInputPwd, String secInputPwd) {
        if (firstInputPwd.equals(secInputPwd)) {
            System.out.println("密码设置成功，请继续！");
            return true;
        } else {
            System.out.println("两次输入的密码不匹配，请重新输入！！！");
            return false;
        }
    }

    public static boolean isPhoneNumValid(String inputPhoneNum, ArrayList<User> userList) {
        int len = inputPhoneNum.length();
        if (len != 11) {
            System.out.println("手机号码长度不对！！！请重新输入！！！");
            return false;
        }
        if (inputPhoneNum.charAt(0) != '1') {
            System.out.println("手机号码应该为1开头，请重新输入！！！");
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (inputPhoneNum.charAt(i) > '9' || inputPhoneNum.charAt(i) < '0') {
                System.out.println("手机号码包含0-9之外的字符，请重新输入！！！");
                return false;
            }
        }

        return isPhoneNumExisted(inputPhoneNum, userList);
    }

    public static boolean isPhoneNumExisted(String inputPhoneNum, ArrayList<User> userList) {
        for (User user : userList) {
            if (inputPhoneNum.equals(user.getPhoneNumber())) {
                System.out.println("该手机号码已经注册，请使用其他手机号码！！！");
                return false;
            }
        }
        return true;
    }
}
