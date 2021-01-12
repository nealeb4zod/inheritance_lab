import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob", "HJ776655F", 40000.00, "Engineering");
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("HJ776655F", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000.00, manager.getSalary(),1);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Engineering", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(4000.00);
        assertEquals(44000.00, manager.getSalary(), 1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400.00, manager.payBonus(),1 );
    }

}
