/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internet.bot;
package selenium-java-3.141.59.*;

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
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\GitHub\\Internet-Bot\\Internet Bot\\src\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
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
Example Google Search code:                             https://stackoverflow.com/questions/4640972/how-to-have-java-application-interact-with-a-website
Bodged SUPPORTS_FINDING_BY_CSS constant:                https://api.flutter.dev/flutter/webdriver.sync_io/Capabilities/supportsFindingByCss-constant.html

*/