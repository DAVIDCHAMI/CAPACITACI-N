package practica_esperas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import practica_maven.NewTest;

public class principal extends NewTest {

	NewTest p = new NewTest();

	// identificar los elementos65ref

	By lnkDress = By.cssSelector("div>ul>li>a[title='Dresses']");
	By lnkCasual = By.linkText("Casual Dresses");
	By lnkCarro = By.xpath("//a[@ title = 'Add to cart']");
	By lnkConfirmar = By.cssSelector("a[class='btn btn-default button button-medium']");
	By lnkImag = By.xpath("//a[@ title ='Printed Dress']");

	public void comprar() throws InterruptedException {
		p.abrirNavegador();
		p.hacerLogin();

		p.driver.get("http://automationpractice.com/index.php");

		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(p.driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(p.driver.findElement(lnkDress)));

		p.driver.findElement(lnkDress).click();
		p.driver.findElement(lnkCasual).click();
		Actions action = new Actions(p.driver);
		action.moveToElement(p.driver.findElement(lnkImag)).build().perform();
		p.driver.findElement(lnkCarro).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(lnkConfirmar));
		// MetodosComunes.hacerHighlight(driver,driver.findElement(btnProceedToCheckout));

		p.driver.findElement(lnkConfirmar).click();

		System.out.println("entre");

	}

	public static void main(String[] args) throws InterruptedException {

		principal z = new principal();

		

		z.comprar();
	

	}

}
