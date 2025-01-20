import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
   public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       //Open a web page
       driver.get("https://google.com");
       driver.navigate().to("https://selenium.dev");
       String currentUrl = driver.getCurrentUrl();
       System.out.println(currentUrl);
       String Title = driver.getTitle();
       System.out.println(Title);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.navigate().forward();
       Thread.sleep(2000);
       driver.navigate().refresh();
       Thread.sleep(2000);
       String originalWindow = driver.getWindowHandle();
       System.out.println(originalWindow);
       driver.switchTo().window(originalWindow);
       driver.switchTo().newWindow(WindowType.WINDOW);
       driver.switchTo().newWindow(WindowType.TAB);

       //driver.close();
   }
}
