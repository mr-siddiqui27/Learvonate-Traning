package Lecture_11;

public class Encapsulation {
    public static void main(String[] args) {
        Student st = new Student("Mojammil Husain", 22, "B Tech", "CS-3G");
        System.out.println(st.getName());
        st.setMarks(90);
    }
}

class Student {
    private String name;
    private int rollNo;
    private String course;
    private String section;
    private int marks;

    public Student(String name, int rollNo, String course, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.section = section;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getCourse() {
        return course;
    }

    public String getSection() {
        return section;
    }

    public int getMarks() {
        return marks;
    }
}
