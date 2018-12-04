package xiey94.com.xybase.bean;

import java.io.Serializable;

public class UserBean implements Serializable {

    private String userName;
    private String password;
    private String age;
    private String sex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
