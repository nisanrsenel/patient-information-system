/**
 *
 * @author Nisanur 
 */
 public class Patient {

    static void setName(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    String name;
    String surname;
    int age;
    String gender;
    double first;
    double second;
    double third;
    double fourth;

    public Patient(String name, String surname, int age, String gender, double first, double second, double third, double fourth) {
        this.name = name;
        this.surname = surname; 
        this.age = age;
        this.gender = gender;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public String getName() {
        return name;
    }

    public void seName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double getThird() {
        return third;
    }

    public void setThird(double third) {
        this.third = third;
    }

    public double getFourth() {
        return fourth;
    }

    public void setFourth(double fourth) {
        this.fourth = fourth;
    }
    
    
}
