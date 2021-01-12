import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer  = new Developer("Bob", "HJ776655F", 40000.00);  }

    @Test
    public void canGetName(){
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void canSetName() {
        assertEquals("Tom", developer.setName("Tom"));
    }

    @Test
    public void cannotSetNullName() {
        assertEquals("Bob", developer.setName(null));
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("HJ776655F", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000.00, developer.getSalary(),1);
    }


    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(4000.00);
        assertEquals(44000.00, developer.getSalary(), 1);
    }

    @Test
    public void noNegativePayRise(){
        developer.raiseSalary(-4000.00);
        assertEquals(40000.00, developer.getSalary(), 1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400.00, developer.payBonus(),1 );
    }

}
