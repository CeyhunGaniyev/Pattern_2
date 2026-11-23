package Lab5;

import java.util.Objects;

public class Customer {

    private int age;
    private double salary;
    private String userId;
    private int exparience;

    public Customer(int age, double salary, String userId, int exparience) {
        this.age = age;
        this.salary = salary;
        this.userId = userId;
        this.exparience = exparience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getExparience() {
        return exparience;
    }

    public void setExparience(int exparience) {
        this.exparience = exparience;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Double.compare(salary, customer.salary) == 0 && exparience == customer.exparience && Objects.equals(userId, customer.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, salary, userId, exparience);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                ", salary=" + salary +
                ", userId='" + userId + '\'' +
                ", exparience=" + exparience +
                '}';
    }
}
