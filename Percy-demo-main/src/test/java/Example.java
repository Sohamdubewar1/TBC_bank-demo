import org.testng.annotations.Test;

public class Example extends SeleniumTest {
    @Test
    public void test1() {
        driver.get("https://www.tbcbank.ge/web/ka");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        percy.snapshot("Java example");
    }
}
