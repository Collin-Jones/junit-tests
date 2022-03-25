import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    Student collin = new Student();

    @Before
    public void theStudent() {
        collin.setName("my name");
        collin.setId(2);
        collin.addGrades(75);
        collin.addGrades(65);
        collin.addGrades(84);
        collin.addGrades(90);
    }


    @Test
    public void testingId() {
        assertEquals(2, collin.getId());
    }

    @Test
    public void testingName() {
        assertEquals("my name", collin.getName());
    }

    @Test
    public void testingCon() {
        assertEquals(2, collin.getId());
        assertEquals("my name", collin.getName());
    }

    @Test
    public void testingGrades() {
        //.size is looking at the size of the grades array list
        assertEquals(4, collin.getGrades().size());
    }

    @Test
    public void testingAverage() {
        assertEquals(78.5, collin.getGradeAverage(), 0);
    }
}
