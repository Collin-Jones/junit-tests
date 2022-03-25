import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {

    Student collin = new Student();
    Student wesley = new Student();
    Cohort Elixir = new Cohort();

    @Before
    public void setUp() {
        collin.addGrades(70);
        collin.addGrades(84);
        wesley.addGrades(89);
        wesley.addGrades(90);
        Elixir.addStudent(wesley);
        Elixir.addStudent(collin);
    }

    @Test
    public void testingAddStudent() {
        assertTrue(Elixir.getStudents().size() > 0);
    }

    @Test
    public void testingCohortAverage() {
        assertEquals(83.25, Elixir.getCohortAverage(), 0);
    }

}
