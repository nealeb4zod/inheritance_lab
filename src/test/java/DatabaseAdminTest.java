import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;



import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Bob", "HJ776655F", 40000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("HJ776655F", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000.00, databaseAdmin.getSalary(),1);
    }


    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(4000.00);
        assertEquals(44000.00, databaseAdmin.getSalary(), 1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400.00, databaseAdmin.payBonus(),1 );
    }

}
