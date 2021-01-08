package internet.bot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Owner
 */
public class InternetBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //for the web driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\GitHub\\Internet-Bot\\Internet Bot\\src\\chromedriver_win32\\chromedriver 87.0.4280.88.exe");
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
    }
}

/*Sources
Example Google Search code:                                     https://stackoverflow.com/questions/4640972/how-to-have-java-application-interact-with-a-website
Chrome WebDriver:                                               https://chromedriver.chromium.org/downloads
Selenium Library:                                               https://www.selenium.dev/downloads/
Eclipse Library Implementation Tutorial:                        https://www.guru99.com/installing-selenium-webdriver.html
Finally getting the Selenium library implemented:               https://stackoverflow.com/questions/65620920/how-to-install-selenium-selenium-java-3-141-59-library-on-eclipse-or-netbeans

*/