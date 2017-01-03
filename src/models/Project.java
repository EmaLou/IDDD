package models;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<ProfessionalService> staff;

    public Project(){
        this.staff = new ArrayList<ProfessionalService>();
    }

    public List<ProfessionalService> getStaff() {
        return staff;
    }

    public void addStaff(ProfessionalService ps) {
        this.staff.add(ps);
    }
}
