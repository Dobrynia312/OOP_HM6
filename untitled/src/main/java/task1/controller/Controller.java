package task1.controller;

import task1.model.data.UserService;
import task1.model.users.LearnGroup;
import task1.model.users.Student;
import task1.model.users.Teacher;
import task1.model.users.User;
import task1.view.GroupView;
import task1.view.View;

import java.util.ArrayList;
import java.util.List;

public class Controller implements CreateGroup{


    public static void Start() {
        UserService uS = new UserService();
        List<User> students = new ArrayList<>();
        List<User> teachers = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        list.add(3);

        list2.add(5);
        list2.add(4);

        students.add(uS.create(new Student(), 5));
        students.add(uS.create(new Student(), 5));
        students.add(uS.create(new Student(), 3));
        students.add(uS.create(new Student(), 3));


        teachers.add(uS.create(new Teacher(), list));
        teachers.add(uS.create(new Teacher(), list2));

        List<User> users2 = uS.read(students);
        List<User> users3 = uS.read(teachers);
        System.out.println(View.studentView(users2));
        System.out.println("---");
        System.out.println(View.studentView(users3));
        System.out.println("---");

        LearnGroup newGroup1 = CreateGroup.groupCreator(students, teachers, 5);
        LearnGroup newGroup2 = CreateGroup.groupCreator(students, teachers, 3);

        System.out.println(GroupView.groupView(newGroup1));
        System.out.println("---");
        System.out.println(GroupView.groupView(newGroup2));
    }
}
