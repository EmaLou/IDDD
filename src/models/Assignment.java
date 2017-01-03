package models;

public class Assignment {
    public int assign(ProfessionalService ps, Project project) {
        project.addStaff(ps);
        return 0;
    }
}
