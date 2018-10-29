package practica_2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import alertas.AlertExamples;
import practica_maven.NewTest;
import windows.WindowsExample;

public class Practica {

	public WebDriver driver;

	// elementos de la page
	By linkAlertText = By.linkText("Alert Test");
	By bntClickAlerText = By.name("b1");
	
	
	By linkWindows = By.linkText("Window Open Test");
	
	By linkAlertText_2 = By.linkText("Confirm Page");
	By bntCliccAlerText_2 = By.name("b1"); 

	@Test
	public void ventana() throws InterruptedException {
		
		AlertExamples aler = new AlertExamples();

		NewTest ne = new NewTest();
		ne.abrirNavegador();
		driver = ne.getDriver();
		driver.get(WindowsExample.URL_SAHI);

		driver.findElement(linkWindows).click();
		// ventana actual
		String WindowParent = ne.driver.getWindowHandle();

		// obtengo la s ventanas
		Set<String> allWindows = ne.driver.getWindowHandles();

		// identifico la segunda ventana
		String secondWindows = (String) allWindows.toArray()[1];

		// vamos a la segunda ventana
		driver.switchTo().window(secondWindows);

		driver.switchTo().frame(0);

		driver.findElement(linkAlertText_2).click();
		driver.findElement(bntCliccAlerText_2).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//aler.alertDissmis();

		driver.close();

		// volvemos a la primera ventana
		driver.switchTo().window(WindowParent);

		//aler.getalertText();
		driver.findElement(linkAlertText).click();
		driver.findElement(bntClickAlerText).click();
		Thread.sleep(3000);
		String alerTexConten = driver.switchTo().alert().getText();
		System.out.println("Este es  el  testo de  la  alerta" + alerTexConten);
		driver.switchTo().alert().accept();
		driver.quit();

	}
	
	/*
	public static void main(String[] args) throws InterruptedException {
		
		Practica pra = new Practica();
		pra.ventana();
		
	}
*/
}
