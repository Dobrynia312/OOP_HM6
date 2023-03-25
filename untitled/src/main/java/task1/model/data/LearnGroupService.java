package task1.model.data;

import task1.model.users.LearnGroup;
import task1.model.users.Student;
import task1.model.users.Teacher;

import java.util.List;

public class LearnGroupService {
    public static LearnGroup groupCreate(Teacher teacher, List<Student> group) {
        return new LearnGroup(teacher, group);
    }
}
