package task1.controller;

import task1.model.data.LearnGroupService;
import task1.model.users.LearnGroup;
import task1.model.users.Student;
import task1.model.users.Teacher;
import task1.model.users.User;

import java.util.ArrayList;
import java.util.List;

public interface CreateGroup {
     static LearnGroup groupCreator(List<User> students, List<User> teachers, int groupsID) {
        LearnGroup group;
        List<Student> gr = new ArrayList<>();
        Teacher t = null;
        for (User st : students
        ) {
            if (((Student) st).getGroupID() == groupsID) {
                gr.add((Student) st);
            }
        }
        for (User teacher : teachers
        ) {
            if (((Teacher) teacher).getGroups().contains(groupsID)) {
                t = (Teacher) teacher;
            }
        }
        group = LearnGroupService.groupCreate(t, gr);
        return group;
    }
}
