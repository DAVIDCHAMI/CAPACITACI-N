package alertas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import practica_maven.NewTest;
import windows.WindowsExample;

public class AlertExamples {

	public WebDriver driver;

	// Elementos de  la  page sahidemo
	By linkAlertText = By.linkText("Alert Test");
	By bntClickAlerText = By.name("b1");
	
	
	
	
	By linkAlertText_2 = By.linkText("Confirm Page");
	By bntCliccAlerText_2 = By.name("b1"); 
	
	By linkPromptPage = By.linkText("Prompt Page");
	By bntClickAlerTextProm = By.name("b1");
	

	public void alertAccep() throws InterruptedException {

		NewTest ne = new NewTest();
		ne.abrirNavegador();
		driver = ne.getDriver();
		ne.driver.get(WindowsExample.URL_SAHI);
		driver.findElement(linkAlertText).click();
		driver.findElement(bntClickAlerText).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.quit();

	}
	
	/**
	 * @autor user 
	 * Método que da  clic en  la opción cancelar de  una alerta 
	 * @throws InterruptedException
	 */

	public void getalertText() throws InterruptedException {

		NewTest ne = new NewTest();
		ne.abrirNavegador();
		driver = ne.getDriver();
		ne.driver.get(WindowsExample.URL_SAHI);
		driver.findElement(linkAlertText).click();
		driver.findElement(bntClickAlerText).click();
		Thread.sleep(3000);
		String alerTexConten = driver.switchTo().alert().getText();
		System.out.println("Este es  el  testo de  la  alerta" + alerTexConten);
		driver.switchTo().alert().accept();
		driver.quit();

	}
	
	
	/*
	 * metodo para seleccionar cancelar en  la ventana de alerta
	 */
	public void alertDissmis_1() throws InterruptedException {

		NewTest ne = new NewTest();
		ne.abrirNavegador();
		driver = ne.getDriver();
		ne.driver.get(WindowsExample.URL_SAHI);
		driver.findElement(linkAlertText_2).click();
		driver.findElement(bntCliccAlerText_2).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		driver.quit();

	}
	
	public void alertDissmis() throws InterruptedException {

		NewTest ne = new NewTest();
		ne.abrirNavegador();
		driver = ne.getDriver();
		ne.driver.get(WindowsExample.URL_SAHI);
		driver.findElement(linkAlertText_2).click();
		driver.findElement(bntCliccAlerText_2).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		driver.quit();

	}
	
	public void sendAlertText() throws InterruptedException {

		NewTest ne = new NewTest();
		ne.abrirNavegador();
		driver = ne.getDriver();
		ne.driver.get(WindowsExample.URL_SAHI);
		driver.findElement(linkPromptPage).click();
		driver.findElement(bntClickAlerTextProm).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("MAQUINA");
		// si  no esta el boton de aceptar
		
		driver.switchTo().alert().accept();
		driver.quit();

	}
	
/*
	public static void main(String[] args) throws InterruptedException {

		AlertExamples aler = new AlertExamples();
		// aler.alertAccep();
		//aler.getalertText();
		//aler.alertDissmis_1();
		//aler.sendAlertText();
	}
*/
}
