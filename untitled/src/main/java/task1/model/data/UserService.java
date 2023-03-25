package task1.model.data;

import task1.model.users.Student;
import task1.model.users.Teacher;
import task1.model.users.User;

import java.util.Date;
import java.util.List;

public class UserService implements DataServiceCreate, DataServiceRead {
    static int count = 1;

    @Override
    public User create(Student student, int group) {
        return new Student(new Date(), "stud_fio", 14, group);
    }

    @Override
    public User create(Teacher teacher, List<Integer> gr) {
        count++;
        return new Teacher(new Date(), "teach_fio", 24 + count, gr);
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }
}
