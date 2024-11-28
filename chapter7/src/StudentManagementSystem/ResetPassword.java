package StudentManagementSystem;

import java.util.ArrayList;

public class ResetPassword {
    private ResetPassword() {

    }

    public static int getIndexOfUserWithValidPhoneNum(String inputPhoneNum, ArrayList<User> userList) {
        for (int i = 0; i < userList.size(); i++) {
            String phoneNum = userList.get(i).getPhoneNumber();
            if (inputPhoneNum.equals(phoneNum)) {
                return i;
            }
        }
        System.out.println("请输入有效的手机号码！");
        return -1;
    }

    public static boolean isValidAnswer(int indexOfUserWithValidPhoneNum, String secureQuestionAns[], ArrayList<User> userList) {
        String inputAnsOne = secureQuestionAns[0];
        String inputAnsTwo = secureQuestionAns[1];
        String correctAnsOne = userList.get(indexOfUserWithValidPhoneNum).getSecureQuestion()[1][0];
        String correctAnsTwo = userList.get(indexOfUserWithValidPhoneNum).getSecureQuestion()[1][1];

        if (inputAnsOne.equals(correctAnsOne) && inputAnsTwo.equals(correctAnsTwo)) {
            return true;
        }

        System.out.println("密保问题答案不匹配，请重新尝试！！！");
        return false;
    }

    public static void resetPwd(int indexOfUserWithValidPhoneNum, String newPwd, ArrayList<User> userList) {
        userList.get(indexOfUserWithValidPhoneNum).setPassword(newPwd);
    }
}
