package flights;

public class Passenger {
    private String firtName;
    private String lastName;
    private int age;
    private String sex;

    public Passenger(String firtName, String lastName, int age, String sex) {
        this.firtName = firtName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return firtName + " " + lastName + " (" + age + ") /" + sex + "/";
    }

    public String getFirtName() {
        return firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
