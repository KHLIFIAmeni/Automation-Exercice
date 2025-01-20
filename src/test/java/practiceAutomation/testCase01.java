package practiceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testCase01 {
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
        // Localiser l'élément contenant le texte "New User Signup!"
        WebElement signupText = driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']"));

        // Vérifier si le texte est visible
        if (signupText.isDisplayed()) {
            System.out.println("Le texte 'New User Signup!' est visible sur la page.");
        } else {
            System.out.println("Le texte 'New User Signup!' n'est pas visible sur la page.");
        }
        // Localiser nameInput et emailInput avec l'attribut data-qa
        WebElement nameInput = driver.findElement(By.cssSelector("[data-qa='signup-name']"));
        WebElement emailInput = driver.findElement(By.cssSelector("[data-qa='signup-email']"));
        // Saisir name et email
        nameInput.sendKeys("Ameni");
        emailInput.sendKeys("formationtest4888@gmail.com");
        // localiser le bouton Signup
        WebElement signupButton  = driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        signupButton.click();
        // Localiser l'élément contenant le texte "Enter Account Information!"
        WebElement accountInformation = driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']"));

        // Vérifier si le texte est visible
        if (accountInformation.isDisplayed()) {
            System.out.println("Le texte 'Enter Account Information!' est visible sur la page.");
        } else {
            System.out.println("Le texte 'Enter Account Information!' n'est pas visible sur la page.");
        }
        // Localiser le bouton radio
        WebElement radioButton = driver.findElement(By.id("id_gender2"));

        // Vérifier si le bouton radio est déjà sélectionné
        if (!radioButton.isSelected()) {
            // Cocher le bouton radio s'il n'est pas déjà sélectionné
            radioButton.click();
        }
        WebElement password  = driver.findElement(By.cssSelector("[data-qa='password']"));
        WebElement days = driver.findElement(By.id("days"));
        Select selectDays = new Select(days);
        WebElement months = driver.findElement(By.id("months"));
        Select selectMonths = new Select(months);
        WebElement years = driver.findElement(By.id("years"));
        Select selectYears = new Select(years);
        password.sendKeys("123456789");
        selectDays.selectByValue("12");
        selectMonths.selectByValue("1");
        selectYears.selectByValue("2020");
        // Localiser l'élément checkbox
        WebElement checkbox = driver.findElement(By.id("newsletter"));

        // Vérifier si la case est déjà cochée
        if (!checkbox.isSelected()) {
            // Cocher la case si elle n'est pas cochée
            checkbox.click();
        }

    }
}
