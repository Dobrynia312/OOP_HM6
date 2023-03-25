package task1.model.users;

import java.util.Date;
import java.util.List;


public abstract class User {
    Date dateBirth;
    String FIO;
    int ID;
    List<Integer> something;

    public User(Date dateBirth, String FIO, int ID) {
        this.dateBirth = dateBirth;
        this.FIO = FIO;
        this.ID = ID;
    }

    public User() {
    }

    public User(Date dateBirth, String FIO, int ID, List<Integer> something) {
        this.dateBirth = dateBirth;
        this.FIO = FIO;
        this.ID = ID;
        this.something = something;
    }
}
