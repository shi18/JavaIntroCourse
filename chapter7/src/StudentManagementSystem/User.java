package StudentManagementSystem;

public class User {
    private String username;
    private String password;
    // 2行3列的数组存放问题和答案。
    // 行表示问题，列表示答案。
    // 一共有三个问题。
    private String[][] secureQuestion;
    private String phoneNumber;

    public User() {
    }

    public User(String username, String password, String[][] secureQuestion, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.secureQuestion = secureQuestion;
        this.phoneNumber = phoneNumber;
    }

    public String[][] getSecureQuestion() {
        return secureQuestion;
    }

    public void setSecureQuestion(String[][] secureQuestion) {
        this.secureQuestion = secureQuestion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", secureQuestion = " + secureQuestion + ", phoneNumber = " + phoneNumber + "}";
    }
}
