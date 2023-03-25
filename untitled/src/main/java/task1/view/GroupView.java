package task1.view;

import task1.model.users.LearnGroup;
/*Принцип единичной ответственности*/

public class GroupView {
    public static String groupView(LearnGroup group) {
        return group.toString();
    }
}
