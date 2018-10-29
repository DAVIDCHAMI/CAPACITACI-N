package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import practica_maven.NewTest;
import windows.WindowsExample;

public class Frames {

	public WebDriver driver;

	By lnkFrame = By.linkText("Frames Test");

	By lnkFra = By.linkText("Select Test");

	public void goToframe() throws InterruptedException {

		NewTest ne = new NewTest();
		ne.abrirNavegador();
		ne.driver.get(WindowsExample.URL_SAHI);
		ne.driver.findElement(lnkFrame).click();
		Thread.sleep(5000);

		ne.driver.switchTo().frame(0);
		ne.driver.findElement(lnkFra).click();
		Thread.sleep(5000);
		
		ne.driver.close();

	}
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Frames fa = new Frames();

		fa.goToframe();

	}

}
