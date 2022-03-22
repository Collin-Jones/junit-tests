import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void testingId(){
        Student collin = new Student();
        collin.setId(2);

        assertEquals(2, collin.getId());
    }
    @Test
    public void testingName(){
        Student collin = new Student();
        collin.setName("my name");

        assertEquals("my name", collin.getName());
    }

    @Test
    public void testingCon(){
        Student collin = new Student(2, "collin");
        assertEquals(2, collin.getId());
        assertEquals("collin", collin.getName());
    }

    @Test
    public void testingGrades(){
        Student collin = new Student();
        //.size is looking at the size of the grades array list
        assertEquals(0, collin.getGrades().size());
    }
}
