package practiceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUserInvalid {
    public static void main(String[] args) throws InterruptedException {
        // Déclaration des varriables
        String Email = "admin124@gmail.com";
        String Password = "1236789";
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
        // Verifier
        WebElement loginText = driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
        if(loginText.isDisplayed()){
            System.out.println(("le titre 'Login to your account' est visible "));
        }
        else{
            System.out.println(("le titre 'Login to your account' n''est visible "));
        }
        // Localisation des champs
        WebElement loginEmail = driver.findElement(By.cssSelector("[data-qa='login-email']"));
        WebElement loginPassword = driver.findElement(By.cssSelector("[data-qa='login-password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("[data-qa='login-button']"));
        loginEmail.sendKeys(Email);
        loginPassword.sendKeys(Password);
        loginButton.click();
        WebElement incorectText = driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']"));
        if(incorectText.isDisplayed()){
            System.out.println("le message 'Your email or password is incorrect!' est visible");
        }
        else{
            System.out.println("le message 'Your email or password is incorrect!' n'est pas visible");
        }
        driver.quit();
    }
}
