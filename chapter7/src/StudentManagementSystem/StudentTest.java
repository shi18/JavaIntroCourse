package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The type Student test.
 */
public class StudentTest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-----欢迎来到登录界面");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.忘记密码");
            System.out.println("请输入您的操作代码：");
            String operatioinFlag = sc.next();
            switch (operatioinFlag) {
                case "1" -> {
                    System.out.println("欢迎登录，请依次输入用户名和密码：");
                    System.out.println("请输入用户名：");
                    String inputUsername = sc.next();
                    System.out.println("请输入密码：");
                    String inputPassword = sc.next();
                    boolean loginFlag = checkLoginUsernamePassword(inputUsername, inputPassword, userList);
                    if (loginFlag) {
                        enterManagementSystem();
                    }
                }
                case "2" -> {
                    boolean usernameWhileFlag = true;
                    boolean passwordWhileFlag = true;
                    boolean phoneNumWhileFlag = true;
                    boolean secQuestWhileFlag = true;
                    boolean breakSwitchTwoFlag = false;
                    String inputUsername = null;
                    String firstInputPass = null;
                    String inputPhoneNum = null;
                    String[][] secQuest = {{"你的小名是什么？", "你的籍贯所在城市是什么？"}, {null, null}};
                    System.out.println("欢迎来到注册界面，请依次输入如下信息：");
                    while (usernameWhileFlag) {
                        System.out.println("请输入用户名（用户名长度需要5-12个自负）：");
                        inputUsername = sc.next();
                        boolean validUsernameFlag = checkUsernameLegality(inputUsername);
                        boolean uniqueUsernameFlag = checkUsernameUniqueness(userList, inputUsername);

                        if (!validUsernameFlag) {
                            System.out.println("请输入符合规则的用户名");
                        }
                        if (!uniqueUsernameFlag) {
                            System.out.println("用户名已经存在，请重新输入用户名。");
                        }
                        if (validUsernameFlag && uniqueUsernameFlag) {
                            usernameWhileFlag = false;
                        }
                    }
                    while (passwordWhileFlag) {
                        System.out.println("username is valid");
                        System.out.println("请输入密码：");
                        firstInputPass = sc.next();
                        boolean firstInputPassFlag = checkPassLegality(firstInputPass);
                        if (!firstInputPassFlag) {
                            continue;
                        }
                        System.out.println("请再次输入密码：");
                        String secondInputPass = sc.next();
                        boolean passMatchFlag = checkDoubleInputPassMatch(firstInputPass, secondInputPass);
                        if (!passMatchFlag) {
                            continue;
                        }
                        passwordWhileFlag = false;
                    }
                    while (phoneNumWhileFlag) {
                        System.out.println("请输入手机号码");
                        inputPhoneNum = sc.next();
                        int validPhoneNumFlag = checkPhoneNumValid(inputPhoneNum, userList);
                        if (validPhoneNumFlag == 0) {
                            continue;
                        }
                        if (validPhoneNumFlag == 1) {
                            System.out.println("请选择是否继续注册环节，1：继续，2：退出");
                            String tmpFlag = sc.next();
                            if (tmpFlag.equals("1")) {
                                continue;
                            } else if (tmpFlag.equals("2")) {
                                breakSwitchTwoFlag = true;
                                break;
                            } else {
                                System.out.println("请输入有效操作代码！！！");
                            }
                        }
                        phoneNumWhileFlag = false;
                    }
                    if (breakSwitchTwoFlag) {
                        break;
                    }
                    while (secQuestWhileFlag) {
                        System.out.println("请依次输入如下问题的答案");
                        System.out.println("你的小名是什么？");
                        String firstAns = sc.next();
                        System.out.println("你的籍贯所在的城市是什么？");
                        String secAns = sc.next();
                        boolean secAnsFlag = checkSecQuestAns(firstAns, secAns);
                        if (!secAnsFlag) {
                            continue;
                        }
                        secQuest[1][0] = firstAns;
                        secQuest[1][1] = secAns;
                        secQuestWhileFlag = false;
                    }
                    User userObj = new User(inputUsername, firstInputPass, secQuest, inputPhoneNum);
                    userList.add(userObj);
                    System.out.println("恭喜你注册账号成功，将在3秒后返回主页面。");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "3" -> {
                    System.out.println("为了找回密码请输入如下信息：");
                    System.out.println("请输入您的手机号");
                    String inputPhoneNum = sc.next();
                    System.out.println("请回答下面两个问题：");
                    System.out.println("你的小名是什么？");
                    String firstAns = sc.next();
                    System.out.println("你的籍贯所在城市是什么？");
                    String secAns = sc.next();
                    boolean passSecQuestCheckFlag = checkSecQuestAndPhoneNum(inputPhoneNum, firstAns, secAns, userList);
                    if (!passSecQuestCheckFlag) {
                        System.out.println("验证失败");
                        break;
                    }
                    System.out.println("请输入新密码");
                    String newPass = sc.next();
                    System.out.println("请再次输入新密码：");
                    String secNewPass = sc.next();
                    boolean passMatchFlag = checkDoubleInputPassMatch(newPass, secNewPass);
                    if (passMatchFlag) {
                        resetPass(inputPhoneNum, userList, newPass);
                    }
                }
                default -> System.out.println("请输入有效的操作代码！");
            }
        }

    }

    /**
     * Enter management system.
     */
    public static void enterManagementSystem() {
        ArrayList<Student> stuList = new ArrayList<>();
        while (true) {
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请输入要进行的操作：");
            Scanner sc = new Scanner(System.in);
            String operationFlag = sc.next();

            switch (operationFlag) {
                case "1" -> {
                    System.out.println("请输入要添加的学生信息");
                    addStu(stuList);
                }
                case "2" -> removeStu(stuList);
                case "3" -> {
                    System.out.println("修改学生");
                    System.out.println("请输入学生id：");
                    String inputId = sc.next();
                    updateStu(stuList, inputId);
                }
                case "4" -> {
                    System.out.println("查询学生");
                    System.out.println("请输入学生id：");
                    String inputId = sc.next();
                    show(stuList, inputId);
                }
                case "5" -> {
                    System.out.println("退出学生管理系统");
                    System.exit(0);
                }
                default -> System.out.println("无效的操作代码!");
            }
        }
    }

    /**
     * add student information if satisfied the requirement.
     * if added success, print the information of all student in the ArrayList<Student>
     *
     * @param stuList a ArrrayList<Student>
     */
    public static void addStu(ArrayList<Student> stuList) {

        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String inputId = sc.next();
        if (checkIdExisted(inputId, stuList)) {
            System.out.println("该id已经存在，如果您想对该id操作，请使用修改操作。否则请重新输入id");
        } else {
            if (checkIdValid(inputId)) {
                //运行到此处，说明id不存在，则可以设置id，并进行下一步
                stu.setId(inputId);
                //获取学生姓名
                System.out.println("请输入学生姓名：");
                String inputName = sc.next();
                //将输入的学生姓名字符串两端可能出现的空格删除 -> String.strip()
                stu.setName(inputName.strip());
                //获取学生年龄
                System.out.println("请输入学生年龄");
                // 此处输入的年龄为字符串类型，如果需要进行年龄范围判断，需要进行类型转换
                String inputAge = sc.next();
                //try catch 语句，捕获异常，第五章节的内容
                try {
                    //将输入的字符串转化为一个整数，如果输入的字符串不全是数字，那么就会触发异常
                    //代码将跳转到83行执行
                    int num = Integer.parseInt(inputAge);
                    // 判断年龄范围是否合法
                    if (num > 10 && num < 60) {
                        stu.setAge(num);
                        //获取学生的籍贯城市
                        System.out.println("请输入学生籍贯城市：");
                        String inputAddress = sc.next();
                        stu.setCity(inputAddress.strip());
                        // 将初始化完成的学生对象添加到数组链表中。
                        stuList.add(stu);
                        System.out.println("添加成功");
                        //打印当前的数组链表中存放的学生信息。
                        System.out.println("当前已存储" + stuList.size() + "个学生信息，信息如下：");
                        printStuInfo(stuList);
                    } else {
                        //年龄不在合理范围，需要重新输入
                        System.out.println("请输入有效的年龄范围，年龄需要大于15岁且小于60岁");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("请输入正确的年龄格式");
                }
            } else {
                System.out.println("请输入有效的id，id的第一位数不能为0，且只能有4位数字。");
            }

        }

    }

    /**
     * Check id existed or not.
     *
     * @param id      an id of String type
     * @param stuList a ArrrayList<Student>
     * @return a boolean value, true -> id existed, false -> id not exist
     */
    public static boolean checkIdExisted(String id, ArrayList<Student> stuList) {
        //调用getIndex()方法，返回整数
        // -1 代表不存在
        //其他表示所在的位置的索引值
        int index = getIndex(id, stuList);
        return index != -1;
    }

    /**
     * Check the student id is valid or not, if valid return true.
     *
     * @param id the student id
     * @return boolean value, true means id valid.
     */
    public static boolean checkIdValid(String id) {
        String inputId = id;
        if (inputId.length() != 4) {
            return false;
        }
        for (int j = 0; j < inputId.length(); j++) {
            if (j == 0) {
                if (inputId.charAt(j) <= '0' || inputId.charAt(j) > '9') {
                    return false;
                }
            } else {
                if (inputId.charAt(j) < '0' || inputId.charAt(j) > '9') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Gets index by student's id.
     *
     * @param id      an id of String type
     * @param stuList a ArrrayList<Student>
     * @return an integer, -1 means not found, other represent the corresponding index of the student id
     */
    public static int getIndex(String id, ArrayList<Student> stuList) {
        int index = -1;
        for (int i = 0; i < stuList.size(); i++) {
            Student stuObj = stuList.get(i);
            String sId = stuObj.getId();
            if (id.equals(sId)) {
                index = i;
            }
        }
        return index;
    }

    /**
     * for loop ArrayList<Student>
     * Print student info.
     *
     * @param stuList an ArrayList<Student>
     */
    public static void printStuInfo(ArrayList<Student> stuList) {

        for (Student stu : stuList) {
            System.out.printf("id: %s    name: %s    age: %d    city: %s", stu.getId(), stu.getName(), stu.getAge(), stu.getCity());
            System.out.println();
        }
        if (stuList.isEmpty()) {
            System.out.println("当前存储的学生信息数量为0。");
        }
    }

    /**
     * Remove student object from ArrayList if id existed.
     *
     * @param stuList a ArrrayList<Student>
     */
    public static void removeStu(ArrayList<Student> stuList) {

        if (stuList.isEmpty()) {
            System.out.println("当前数组链表中保存的学生信息为0条，没有可以用来删除的记录");
        } else {
            System.out.println("删除学生");
            System.out.println("请输入要删除的学生id：");
            Scanner sc = new Scanner(System.in);
            String inputId = sc.next();
            int index = getIndex(inputId, stuList);
            if (index != -1) {
                stuList.remove(index);
                System.out.println("成功删除！");
                printStuInfo(stuList);
            } else {
                System.out.println("学生id不存在，请重新输入。");
            }
        }
    }

    /**
     * Update student information by valid id
     *
     * @param stuList an ArrayList<Student>
     * @param inputId the input student id
     */
    public static void updateStu(ArrayList<Student> stuList, String inputId) {
        if (checkIdExisted(inputId, stuList)) {
            Student stu = stuList.get(getIndex(inputId, stuList));
            System.out.println("请输入新的学生姓名：");
            Scanner sc = new Scanner(System.in);
            String inputName = sc.next();

            System.out.println("请输入新的学生年龄：");
            String inputAge = sc.next();
            try {
                //将输入的字符串转化为一个整数，如果输入的字符串不全是数字，那么就会触发异常
                //代码将跳转到241行执行
                int num = Integer.parseInt(inputAge);
                // 判断年龄范围是否合法
                if (num > 10 && num < 60) {
                    stu.setAge(num);
                    //获取学生的籍贯城市
                    System.out.println("请输入新的学生籍贯城市：");
                    String inputAddress = sc.next();
                    stu.setCity(inputAddress.strip());
                    stu.setName(inputName.strip());
                    // 将初始化完成的学生对象添加到数组链表中。
                    System.out.println("修改成功");
                    //打印当前的数组链表中存放的学生信息。
                    System.out.println("当前已存储" + stuList.size() + "个学生信息，信息如下：");
                    printStuInfo(stuList);
                } else {
                    //年龄不在合理范围，需要重新输入
                    System.out.println("请输入有效的年龄范围，年龄需要大于15岁且小于60岁");
                }
            } catch (NumberFormatException e) {
                System.out.println("请输入正确的年龄格式");
            }
        } else {
            System.out.println("请输入有效的id进行查询。");
        }
    }

    /**
     * Show student information by id
     *
     * @param stuList an ArrayList<Student>
     * @param inputId the input student id
     */
    public static void show(ArrayList<Student> stuList, String inputId) {
        if (checkIdExisted(inputId, stuList)) {
            Student stu = stuList.get(getIndex(inputId, stuList));
            System.out.printf("id: %s    name: %s    age: %d    city: %s", stu.getId(), stu.getName(), stu.getAge(), stu.getCity());
            System.out.println();
        } else {
            System.out.println("请输入有效的id进行查询。");
        }
    }

    /**
     * Check username legality.
     * username string length should be less than or equal to 12 and greater than or equal to 5
     * char of username should only include uppercase or lowercase alphabet
     *
     * @param inputUsername the input username with String type
     * @return the boolean, if format is correct return true
     */
    public static boolean checkUsernameLegality(String inputUsername) {
        if (inputUsername.length() > 12 || inputUsername.length() < 5) {
            return false;
        } else {
            // username check
            for (int i = 0; i < inputUsername.length(); i++) {
                if ((inputUsername.charAt(i) <= 'z' && inputUsername.charAt(i) >= 'a')
                        || (inputUsername.charAt(i) <= 'Z' && inputUsername.charAt(i) >= 'A'
                        || (inputUsername.charAt(i) <= '9' && inputUsername.charAt(i) >= '0'))) {
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * Check username uniqueness boolean.
     *
     * @param userList      ArrayList<User>
     * @param inputUsername the input username
     * @return the boolean
     */
    public static boolean checkUsernameUniqueness(ArrayList<User> userList, String inputUsername) {
        if (userList.isEmpty()) {
            return true;
        }
        for (User u : userList) {
            if (u.getUsername().equals(inputUsername)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check pass legality of password.
     *
     * @param firstInputPass the first input pass
     * @return the boolean
     */
    public static boolean checkPassLegality(String firstInputPass) {
        if (firstInputPass.length() < 8) {
            System.out.println("密码最少要8位！");
            return false;
        }
        int upperCaseCount = 0, lowerCaseCount = 0, numCount = 0, speicalCharCount = 0;
        for (int i = 0; i < firstInputPass.length(); i++) {
            if (firstInputPass.charAt(i) >= 'a' && firstInputPass.charAt(i) <= 'z') {
                lowerCaseCount++;
            }
            if (firstInputPass.charAt(i) >= 'A' && firstInputPass.charAt(i) <= 'Z') {
                upperCaseCount++;
            }
            if (firstInputPass.charAt(i) >= '0' && firstInputPass.charAt(i) <= '9') {
                numCount++;
            }
            if (firstInputPass.charAt(i) == '!'
                    || firstInputPass.charAt(i) == '@'
                    || firstInputPass.charAt(i) == '#'
                    || firstInputPass.charAt(i) == '$') {
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
        }
        if (speicalCharCount == 0) {
            System.out.println("请在密码中包含如下特殊字符 !、@、#、$");
            return false;
        }
        return true;
    }

    /**
     * Check whether the first input password match the second input password.
     *
     * @param firstInputPass  the first input pass
     * @param secondInputPass the second input pass
     * @return the boolean
     */
    public static boolean checkDoubleInputPassMatch(String firstInputPass, String secondInputPass) {
        if (firstInputPass.equals(secondInputPass)) {
            return true;
        } else {
            System.out.println("两次输入的密码不匹配，请重新输入！！！");
            return false;
        }
    }

    /**
     * Check input phone number is valid or not.
     *
     * @param inputPhoneNum the input phone num
     * @param userList      the user list
     * @return the int
     */
    public static int checkPhoneNumValid(String inputPhoneNum, ArrayList<User> userList) {
        if (inputPhoneNum.length() != 11) {
            System.out.println("手机号码长度不对！！！请重新输入");
            return 0;
        }
        if (inputPhoneNum.charAt(0) != '1') {
            System.out.println("手机号码应该为1开头，请重新输入！！！");
            return 0;
        }
        for (int i = 0; i < inputPhoneNum.length(); i++) {
            if (inputPhoneNum.charAt(i) > '9' || inputPhoneNum.charAt(i) < '0') {
                return 0;
            }
        }
        for (User user : userList) {
            if (inputPhoneNum.equals(user.getPhoneNumber())) {
                System.out.println("该手机号码已经注册，请使用其他手机号码！！！");
                return 1;
            }
        }
        return 2;
    }

    /**
     * Check secure questions' answer is valid or not.
     *
     * @param firstAns the first ans
     * @param secAns   the sec ans
     * @return the boolean
     */
    public static boolean checkSecQuestAns(String firstAns, String secAns) {
        if (firstAns == null || firstAns.isEmpty()) {
            System.out.println("请输入第一个问题的有效答案！！！");
            return false;
        }
        if (secAns == null || secAns.isEmpty()) {
            System.out.println("请输入第二个问题的有效答案！！！");
            return false;
        }
        return true;
    }

    /**
     * Check login username and password match or not.
     *
     * @param inputUsername the input username
     * @param inputPass     the input pass
     * @param userList      the user list
     * @return the boolean
     */
    public static boolean checkLoginUsernamePassword(String inputUsername, String inputPass, ArrayList<User> userList) {
        for (User user : userList) {
            if (user.getUsername().equals(inputUsername) && user.getPassword().equals(inputPass)) {
                return true;
            }
        }
        System.out.println("账号和密码不匹配！！！请重新输入账号密码！！！");
        return false;

    }

    /**
     * Check secure question and phone number match saved information or not
     * if match, then go to reset password session.
     *
     * @param inputPhoneNum the input phone num
     * @param firstAns      the first ans
     * @param secAns        the sec ans
     * @param userList      the user list
     * @return the boolean
     */
    public static boolean checkSecQuestAndPhoneNum(String inputPhoneNum, String firstAns, String secAns, ArrayList<User> userList) {
        for (User user : userList) {
            if (user.getPhoneNumber().equals(inputPhoneNum)
                    && user.getSecureQuestion()[1][0].equals(firstAns)
                    && user.getSecureQuestion()[1][1].equals(secAns)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Reset password.
     *
     * @param inputPhoneNum the input phone num
     * @param userList      the user list
     * @param newPass       the new pass
     */
    public static void resetPass(String inputPhoneNum, ArrayList<User> userList, String newPass) {
        for (User user : userList) {
            if (user.getPhoneNumber().equals(inputPhoneNum)) {
                user.setPassword(newPass);
                System.out.println("已经成功修改密码！");
            }
        }
    }

}
