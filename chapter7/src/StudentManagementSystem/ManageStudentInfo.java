package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class ManageStudentInfo {
    private ManageStudentInfo() {
    }

    public static boolean isInputStuIdExisted(String inputStuId, ArrayList<Student> stuList) {
        int stuIdIndex = getStuIdIndex(inputStuId, stuList);
        return stuIdIndex != -1;
    }

    public static int getStuIdIndex(String inputStuId, ArrayList<Student> stuList) {
        for (int i = 0; i < stuList.size(); i++) {
            Student stuObj = stuList.get(i);
            String stuId = stuObj.getId();
            if (inputStuId.equals(stuId)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isInputStuIdValid(String inputStuId) {
        int len = inputStuId.length();
        if (len != 4) {
            System.out.println("学号长度应该为4！！！");
            return false;
        }
        char firstCharOfId = inputStuId.charAt(0);

        if (firstCharOfId <= '0' || firstCharOfId > '9') {
            System.out.println("学号首位不能为0！！！");
            return false;
        }
        for (int i = 1; i < inputStuId.length(); i++) {
            char c = inputStuId.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("学号只能包含数字！！！");
                return false;
            }
        }
        return true;
    }

    public static boolean isInputStuNameValid(String inputStuName) {
        int len = inputStuName.length();
        if (len < 4 || len > 20) {
            System.out.println("姓名字符串长度应该在4-20之间！！！");
            return false;
        }
        for (int i = 0; i < len; i++) {
            char c = inputStuName.charAt(i);
            if (c < 'a' || c > 'z') {
                System.out.println("姓名只能包含英文字母！！！");
                return false;
            }
        }
        return true;
    }

    public static boolean isInputStuAgeValid(int inputStuAge) {
        if (inputStuAge >= 60 || inputStuAge <= 10) {
            System.out.println("年龄范围需要在（10，60）之间");
            return false;
        }
        return true;
    }

    public static boolean isInputStuCityValid(String inputStuProvince) {
        final ArrayList<String> cityList = new ArrayList<>(Arrays.asList("北京", "天津", "河北", "山西", "内蒙古", "辽宁", "吉林", "黑龙江",
                "上海", "江苏", "浙江", "安徽", "福建", "江西", "山东", "河南", "湖北",
                "湖南", "广东", "广西", "海南", "重庆", "四川", "贵州", "云南", "西藏",
                "陕西", "甘肃", "青海", "宁夏", "新疆", "香港", "澳门", "台湾"));
        if (!cityList.contains(inputStuProvince)) {
            System.out.println("请输入有效的城市名称！！！");
            return false;
        }
        return true;
    }

    public static void printAllStuInfo(ArrayList<Student> stuList) {

        for (Student stu : stuList) {
            System.out.printf("id: %s    name: %s    age: %d    city: %s", stu.getId(), stu.getName(), stu.getAge(), stu.getCity());
            System.out.println();
        }
        if (stuList.isEmpty()) {
            System.out.println("当前存储的学生信息数量为0。");
        }
    }


}
