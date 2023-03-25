package task1.model.users;

import java.util.List;

public class LearnGroup {
    Teacher teacher;
    List<Student> group;

    public LearnGroup(Teacher teacher, List<Student> group) {
        this.teacher = teacher;
        this.group = group;
    }

    @Override
    public String toString() {
        return "LearnGroup{" +
                "teacher=" + teacher.toString() +
                ", group=" + group.toString() +
                '}';
    }
}
