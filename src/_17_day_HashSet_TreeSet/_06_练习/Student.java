package _17_day_HashSet_TreeSet._06_练习;

public class Student {
    private String name;
    private int chinese;
    private int math;
    private int english;
    private int sum;

    public Student() {}

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.sum = this.chinese + this.math + this.english;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", sum=" + sum +
                '}';
    }
}
