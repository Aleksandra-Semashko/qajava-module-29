import org.example.Person;
import org.testng.IResultMap;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.assertTrue;

public class PersonTest {

    @DataProvider(name="age")
    int[] age ={-1,0,10,12,13,15,19,20,45};

    @Test (dataProvider = "age")
    public void testIsTeenager(int age) {
        boolean result = Person.isTeenager(age);
        assertTrue( age>=13&&<=19);
    }
}
