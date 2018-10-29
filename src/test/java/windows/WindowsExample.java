package windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import practica_maven.NewTest;

public class WindowsExample {

	public WebDriver driver;

	public static final String URL_SAHI = "http://sahitest.com/demo/";

	By lnkWindowTest = By.linkText("Window Open Test");

	public void goToNewWindow() throws InterruptedException {
		NewTest ne = new NewTest();
		ne.abrirNavegador();
		ne.driver.get(URL_SAHI);

		// identifico la  primera  ventana
		String WindowParent = ne.driver.getWindowHandle();
		System.out.println("esta es  la  ventana inicial: " + WindowParent +" "+ ne.driver.getCurrentUrl());

		ne.driver.findElement(lnkWindowTest).click();

		// obtengo  todas  las  ventanas
		Set<String> allWindows = ne.driver.getWindowHandles();
		
		// identifico la segunda  ventana
		String secondWindows = (String) allWindows.toArray()[1];
		
		System.out.println("segunda ventana: " + secondWindows +" "+ ne.driver.getCurrentUrl());
		// vamos  a la segunda ventana
		ne.driver.switchTo().window(secondWindows);
		
		ne.driver.close();
		
		// volvemos a  la primera  ventana
		ne.driver.switchTo().window(WindowParent);
		ne.driver.findElement(lnkWindowTest).click();
	
		Thread.sleep(5000);
		driver.quit();
		
		
	}

	/*
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WindowsExample win =  new WindowsExample();
		
		win.goToNewWindow();

	}
*/
}
