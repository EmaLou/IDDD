import models.Assignment;
import models.ProfessionalService;
import models.Project;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class AssignmentTest {
    @Test
    public void shouldAssignYaxuanToResi() {
        ProfessionalService  yaxuan= new ProfessionalService();
        Project resi = new Project();

        Assignment assignment = new Assignment();
        assignment.assign(yaxuan, resi);

        assertThat(resi.getStaff().contains(yaxuan), is(true));
    }
}
