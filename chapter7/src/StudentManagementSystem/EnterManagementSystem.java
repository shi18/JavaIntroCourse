package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class EnterManagementSystem {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String[][] qa = {{"你的小名是什么？", "你的籍贯所在的城市是什么？"}, {"user", "chongqing"}};
        User u = new User("userTest", "userTest123@", qa, "12345678900");
        ArrayList<User> userList = new ArrayList<>();
        userList.add(u);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----欢迎来到登录界面");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.忘记密码");
            System.out.println("4.退出系统");
            System.out.println("请输入您的操作代码：");
            String operatioinFlag = sc.next();
            switch (operatioinFlag) {
                case "1" -> loginAccount(userList, sc);
                case "2" -> registerAccount(userList, sc);
                case "3" -> recallPassword(userList, sc);
                case "4" -> {
                    System.out.println("退出系统");
                    System.exit(0);
                }
                default -> System.out.println("请输入有效的操作代码！");
            }
        }

    }

    private static void recallPassword(ArrayList<User> userList, Scanner sc) {
        while (true) {
            System.out.println("为了找回密码请输入如下信息：");
            System.out.println("请输入您的手机号");
            String inputPhoneNum = sc.next();
            int indexOfUserWithValidPhoneNum = ResetPassword.getIndexOfUserWithValidPhoneNum(inputPhoneNum, userList);
            if (indexOfUserWithValidPhoneNum == -1) {
                System.out.println("手机号码不存在，请重新输入！！！");
                continue;
            }
            System.out.println("请回答下面两个问题：");
            System.out.println("你的小名是什么？");
            String firstAns = sc.next();
            System.out.println("你的籍贯所在城市是什么？");
            String secAns = sc.next();
            String inputAns[] = {firstAns, secAns};
            if (!ResetPassword.isValidAnswer(indexOfUserWithValidPhoneNum, inputAns, userList)) {
                System.out.println("密保问题验证失败！！！");
                return;
            }
            System.out.println("请输入新密码");
            String newPass = sc.next();
            System.out.println("请再次输入新密码：");
            String secNewPass = sc.next();
            boolean passMatchFlag = RegisterAccount.isTwoPasswordMatch(newPass, secNewPass);
            if (passMatchFlag) {
                ResetPassword.resetPwd(indexOfUserWithValidPhoneNum, newPass, userList);
            }
            break;
        }
    }

    private static void registerAccount(ArrayList<User> userList, Scanner sc) {
        String inputUsername;
        String firstInputPwd;
        String inputPhoneNum = null;
        String[][] secQuest = {{"你的小名是什么？", "你的籍贯所在城市是什么？"}, {null, null}};
        System.out.println("欢迎来到注册界面，请依次输入如下信息：");
        while (true) {
            System.out.println("请输入用户名（用户名长度需要5-12个字符，且只能包含字母）：");
            inputUsername = sc.next();
            boolean isUsernameValid = RegisterAccount.isUsernameValid(inputUsername, userList);
            if (isUsernameValid) {
                break;
            }
        }

        while (true) {
            System.out.println("请输入密码：");
            firstInputPwd = sc.next();
            boolean isFirstPasswordValid = RegisterAccount.isFirstPasswordValid(firstInputPwd);
            if (!isFirstPasswordValid) {
                continue;
            }
            System.out.println("请再次输入密码：");
            String secInputPwd = sc.next();
            boolean passMatchFlag = RegisterAccount.isTwoPasswordMatch(firstInputPwd, secInputPwd);
            if (!passMatchFlag) {
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("请输入手机号码：");
            inputPhoneNum = sc.next();
            boolean isPhoneNumValid = RegisterAccount.isPhoneNumValid(inputPhoneNum, userList);
            if (!isPhoneNumValid) {
                continue;
            }
            break;
        }

        System.out.println("请依次输入如下密保问题的答案：");
        System.out.println("你的小名是什么？");
        String firstAns = sc.next();
        System.out.println("你的籍贯所在的城市是什么？");
        String secAns = sc.next();
        secQuest[1][0] = firstAns;
        secQuest[1][1] = secAns;

        User userObj = new User(inputUsername, firstInputPwd, secQuest, inputPhoneNum);
        userList.add(userObj);
        System.out.println("恭喜你注册账号成功。");

    }

    private static void loginAccount(ArrayList<User> userList, Scanner sc) {
        System.out.println("欢迎登录，请依次输入用户名和密码：");
        System.out.println("请输入用户名：");
        String inputUsername = sc.next();
        System.out.println("请输入密码：");
        String inputPassword = sc.next();
        User inputUser = new User(inputUsername, inputPassword, null, null);

        if (Login.isMatch(inputUser, userList)) {
            System.out.println("登录成功！！！");
            enterManagementSystem();
        }
    }

    public static void enterManagementSystem() {
        ArrayList<Student> stuList = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入要进行的操作：");
            Scanner sc = new Scanner(System.in);
            String operationFlag = sc.next();

            switch (operationFlag) {
                case "1" -> addStu(stuList, sc);
                case "2" -> removeStu(stuList, sc);
                case "3" -> updateStu(stuList, sc);
                case "4" -> show(stuList, sc);
                case "5" -> {
                    System.out.println("退出学生管理系统");
                    flag = false;
                }
                default -> System.out.println("无效的操作代码!");
            }
        }
    }

    public static void addStu(ArrayList<Student> stuList, Scanner sc) {
        while (true) {
            System.out.println("请添加学生信息！");
            Student stu = new Student();
            System.out.println("请输入学生id");
            String inputStuId = sc.next();
            if (ManageStudentInfo.isInputStuIdExisted(inputStuId, stuList)) {
                System.out.println("学生的学号已经存在，请输入有效学号");
                continue;
            }
            if (!ManageStudentInfo.isInputStuIdValid(inputStuId)) {
                continue;
            }

            System.out.println("请输入学生姓名：");
            String inputStuName = sc.next();
            if (!ManageStudentInfo.isInputStuNameValid(inputStuName)) {
                continue;
            }

            System.out.println("请输入学生年龄");
            int inputStuAge = sc.nextInt();
            if (!ManageStudentInfo.isInputStuAgeValid(inputStuAge)) {
                continue;
            }

            System.out.println("请输入学生籍贯省份：");
            String inputStuProvince = sc.next();
            if (!ManageStudentInfo.isInputStuCityValid(inputStuProvince)) {
                continue;
            }

            stu.setId(inputStuId);
            stu.setName(inputStuName.strip());
            stu.setAge(inputStuAge);
            stu.setCity(inputStuProvince);
            stuList.add(stu);

            System.out.println("添加成功");
            System.out.println("当前已存储" + stuList.size() + "个学生信息，信息如下：");
            ManageStudentInfo.printAllStuInfo(stuList);
            break;
        }
    }

    public static void removeStu(ArrayList<Student> stuList, Scanner sc) {
        if (stuList.isEmpty()) {
            System.out.println("当前数组链表中保存的学生信息为0条，没有可以用来删除的记录");
            return;
        }
        System.out.println("删除学生");
        System.out.println("请输入要删除的学生id：");
        String inputStuId = sc.next();

        int index = ManageStudentInfo.getStuIdIndex(inputStuId, stuList);

        if (index == -1) {
            System.out.println("学生id不存在，请重新输入。");
            return;
        }
        stuList.remove(index);
        System.out.println("成功删除！现存学生信息如下：");
        ManageStudentInfo.printAllStuInfo(stuList);
    }

    public static void updateStu(ArrayList<Student> stuList, Scanner sc) {
        while (true) {
            System.out.println("修改学生信息");

            System.out.println("请输入学生学号：");
            String inputStuId = sc.next();
            if (!ManageStudentInfo.isInputStuIdExisted(inputStuId, stuList)) {
                System.out.println("请输入有效的学号进行查询。");
                continue;
            }

            Student stu = stuList.get(ManageStudentInfo.getStuIdIndex(inputStuId, stuList));
            System.out.println("请输入新的学生姓名：");
            String inputStuName = sc.next();
            if (!ManageStudentInfo.isInputStuNameValid(inputStuName)) {
                continue;
            }

            System.out.println("请输入学生年龄");
            int inputStuAge = sc.nextInt();
            if (!ManageStudentInfo.isInputStuAgeValid(inputStuAge)) {
                continue;
            }

            System.out.println("请输入学生籍贯省份：");
            String inputStuProvince = sc.next();
            if (!ManageStudentInfo.isInputStuCityValid(inputStuProvince)) {
                continue;
            }

            stu.setId(inputStuId);
            stu.setName(inputStuName.strip());
            stu.setAge(inputStuAge);
            stu.setCity(inputStuProvince);


            System.out.println("修改成功");
            //打印当前的数组链表中存放的学生信息。
            System.out.println("当前已存储" + stuList.size() + "个学生信息，信息如下：");
            ManageStudentInfo.printAllStuInfo(stuList);
            break;
        }
    }

    public static void show(ArrayList<Student> stuList, Scanner sc) {
        while (true) {
            System.out.println("查询学生");
            System.out.println("请输入学生学号：");
            String inputStuId = sc.next();
            if (!ManageStudentInfo.isInputStuIdExisted(inputStuId, stuList)) {
                System.out.println("请输入有效的学号进行查询。");
                continue;
            }
            Student stu = stuList.get(ManageStudentInfo.getStuIdIndex(inputStuId, stuList));
            System.out.printf("id: %s    name: %s    age: %d    city: %s", stu.getId(), stu.getName(), stu.getAge(), stu.getCity());
            System.out.println();
            break;
        }
    }

}
