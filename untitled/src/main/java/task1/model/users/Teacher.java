package task1.model.users;

import java.util.Date;
import java.util.List;

public class Teacher extends User {
    int exp;
    List<Integer> groups;

    public Teacher(Date dateBirth, String FIO, int ID, List<Integer> gr) {
        super(dateBirth, FIO, ID);
        this.groups = gr;
    }

    public Teacher() {
        super();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "exp=" + exp +
                ", groups=" + groups +
                ", dateBirth=" + dateBirth +
                ", FIO='" + FIO + '\'' +
                ", ID=" + ID +
                "}\n";
    }

    public List<Integer> getGroups() {
        return groups;
    }
}
