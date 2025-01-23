package practiceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Declaration des varriales
        String userName = "Ameniadmin";
        String Email = "formationtestQA@gmail.com";
        String firstNameValue = "KHLIFI";
        String lastNameValue = "Ameni";
        String passwordValue = "987654321";
        String companyValue = "Horus";
        String adressValue = "Tunis";
        String adress2Value = "Bardo";
        String stateValue = "aaaa";
        String cityValue ="Bardo";
        String zipCodeValue = "2000";
        String phoneNumberValue = "23569874";
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
        nameInput.sendKeys(userName);
        emailInput.sendKeys(Email);
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
        password.sendKeys(passwordValue);
        selectDays.selectByValue("12");
        selectMonths.selectByValue("1");
        selectYears.selectByValue("2020");
        // Localiser l'élément checkbox
        WebElement checkbox1 = driver.findElement(By.id("newsletter"));

        // Vérifier si la case est déjà cochée
        if (!checkbox1.isSelected()) {
            // Cocher la case si elle n'est pas cochée
            checkbox1.click();
        }
        // Localiser l'élément checkbox
        WebElement checkbox2 = driver.findElement(By.id("optin"));

        // Vérifier si la case est déjà cochée
        if (!checkbox2.isSelected()) {
            // Cocher la case si elle n'est pas cochée
            checkbox2.click();
        }
        //Localisation des elements
        WebElement firstName = driver.findElement(By.cssSelector("[data-qa='first_name']"));
        WebElement lastName = driver.findElement(By.cssSelector("[data-qa='last_name']"));
        WebElement Company = driver.findElement(By.cssSelector("[data-qa='company']"));
        WebElement Address = driver.findElement(By.cssSelector("[data-qa='address']"));
        WebElement Address2 = driver.findElement(By.cssSelector("[data-qa='address2']"));
        WebElement Country = driver.findElement(By.cssSelector("[data-qa='country']"));
        Select countryName = new Select(Country);
        WebElement State = driver.findElement(By.cssSelector("[data-qa='state']"));
        WebElement City = driver.findElement(By.cssSelector("[data-qa='city']"));
        WebElement zipCode = driver.findElement(By.cssSelector("[data-qa='zipcode']"));
        WebElement  phoneNumber = driver.findElement(By.cssSelector("[data-qa='mobile_number']"));
        firstName.sendKeys(firstNameValue);
        lastName.sendKeys(lastNameValue);
        Company.sendKeys(companyValue);
        Address.sendKeys(adressValue);
        Address2.sendKeys(adress2Value);
        countryName.selectByValue("Canada");
        State.sendKeys(stateValue);
        City.sendKeys(cityValue);
        zipCode.sendKeys(zipCodeValue);
        phoneNumber.sendKeys(phoneNumberValue);
        WebElement createAccount = driver.findElement(By.cssSelector("[data-qa='create-account']"));
        createAccount.click();
        // Localiser l'élément contenant le texte "Account Created!"
        WebElement createAccountText = driver.findElement(By.xpath("//b[normalize-space()='Account Created!']"));

        // Vérifier si le texte est visible
        if (createAccountText.isDisplayed()) {
            System.out.println("Le texte 'Account Created!' est visible sur la page.");
        } else {
            System.out.println("Le texte 'Account Created!' n'est pas visible sur la page.");
        }
        WebElement continueButton = driver.findElement(By.cssSelector("[data-qa='continue-button']"));
        continueButton.click();

        WebElement loggedIn = driver.findElement(By.xpath("//li[10]//a[1]"));
        if (loggedIn.isDisplayed()) {
            System.out.println("Le texte 'Logged in as ' est visible.");
        } else {
            System.out.println("Le texte 'Logged in as ' n'est pas visible.");
        }
        // Logged
        WebElement loggedLink = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
        loggedLink.click();
        driver.close();
    }
}
