package ua.intita.qa.university;

public class ParttimeStudent extends Student{
    int group;

    public ParttimeStudent(String name, int group) {
        super.name = name;
        this.group = group;
    }

    @Override
    public void apply() {
        System.out.println("Parttime student applied");
    }
}
