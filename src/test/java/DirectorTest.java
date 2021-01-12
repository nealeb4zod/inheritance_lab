import org.junit.Before;
import org.junit.Test;
import staff.management.Director;


import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director  = new Director("Bob", "HJ776655F", 40000.00, 500000.00);  }

    @Test
    public void canGetName(){
        assertEquals("Bob", director.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("HJ776655F", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000.00, director.getSalary(),1);
    }

    @Test
    public void canGetBudget(){
        assertEquals(500000.00, director.getBudget(),1);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(4000.00);
        assertEquals(44000.00, director.getSalary(), 1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(800.00, director.payBonus(),1 );
    }
}
