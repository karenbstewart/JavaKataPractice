import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear1;

    @Before
    public void before(){
        bear1 = new Bear ("Baloo", 25, 95.62);
    }

    @Test
    public void hasName(){
        assertEquals("Baloo", bear1.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(25, bear1.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(95.62, bear1.getWeight(), 0.0);
    }

    @Test
    public void readyToHibernateIfGreaterThan80(){
        assertEquals(true, bear1.readyToHibernate());
    }
    @Test
    public void readyToHibernateIflessThan80(){
        Bear thinBear = new Bear("Baloo", 25, 65.44);
        assertEquals(false, thinBear.readyToHibernate());
    }

}
