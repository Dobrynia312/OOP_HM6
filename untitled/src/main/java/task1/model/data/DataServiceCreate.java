package task1.model.data;

import task1.model.users.Student;
import task1.model.users.Teacher;
import task1.model.users.User;

import java.util.List;

public interface DataServiceCreate {
    User create(Student student, int group);

    User create(Teacher teacher, List<Integer> gr);
}
