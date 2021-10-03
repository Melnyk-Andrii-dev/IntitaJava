package ua.intita.qa.university;

public abstract class Student implements Entrant {
    String name;

    @Override
    public void apply() {
        System.out.println("Applied for Student");
    }
}
