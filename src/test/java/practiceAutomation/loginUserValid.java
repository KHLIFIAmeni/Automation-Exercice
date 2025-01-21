package practiceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginUserValid {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
        // Obtenir le titre de la page
        String actualTitle = driver.getTitle();

        // Titre attendu
        String expectedTitle = "Automation Exercise";

        // Vérifier si le titre correspond
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("La page d'accueil est visible avec succès. Titre vérifié : " + actualTitle);
        } else {
            System.out.println("Erreur : Le titre de la page est différent.");
            System.out.println("Titre actuel : " + actualTitle);
            System.out.println("Titre attendu : " + expectedTitle);
        }
        // Localiser le bouton "Signup / Login"
        WebElement buttonLogin = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        // Cliquer sur le bouton
        buttonLogin.click();
    }
}
