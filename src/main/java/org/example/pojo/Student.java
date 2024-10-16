package org.example.pojo;

public class Student {
    private int id;
    private String name;

    // Default constructor
    public Student() {}

    // Parameterized constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Init method
    public void init() {
        System.out.println("Student bean is going through initialization.");
    }

    // Destroy method
    public void destroy() {
        System.out.println("Student bean will be destroyed.");
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
