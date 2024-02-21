import org.testng.annotations.AfterMethod; // загружается аннотация @AfterMethod
import org.testng.annotations.BeforeMethod; // загружается аннотация @BeforeMethod
import org.testng.annotations.Test; // загружается аннотация @AfterMethod

public class PersonTest {

    @BeforeMethod
    void beforeClass() {
        System.out.println("Перед каждым набором теста напечатать текущее время");
    }

    @AfterMethod
    void afterClass() {
        System.out.println("После каждого набора теста напечатать текущее время");
    }

    @Test
    public void TestMethod(String[] args) {
    }
}
