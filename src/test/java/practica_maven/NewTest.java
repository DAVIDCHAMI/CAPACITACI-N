package practica_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewTest {

	public  WebDriver driver;
	





	public WebDriver getDriver() {
		return driver;
	}

	//objetos del  login
	By lnkLogin= By.linkText("Sign in");
	By txtEmail = By.id("email");
	By txtPassword =By.id("passwd");
	By btnSingIn = By.id("SubmitLogin");
	By lntOut = By.xpath("//a[@title='Log me out']");
	


	public void abrirNavegador() {

		// definir propiedad que contiene el drivers
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeOptions chromeoptions = new ChromeOptions();
		// preferencias del navegador
		chromeoptions.addArguments("start-maximized");

		// driver = new FirefoxDriver;
		// driver = new InternetExploreDriver;

		driver = new ChromeDriver(chromeoptions);

	}
	
	public  void hacerLogin() {
		// abrir  pagina.
		driver.get("http://automationpractice.com/index.php");
		
		
	// accedemos  a los elementos.
	//driver.findElement(lnkDress).click();
	driver.findElement(lnkLogin).click();
	// se  limpian los  campos antes de  mandarles datos.
	driver.findElement(txtEmail).clear();
	driver.findElement(txtEmail).sendKeys("chamirojo.35@hotmail.com");
	driver.findElement(txtPassword).clear();
	driver.findElement(txtPassword).sendKeys("Matrix");
	driver.findElement(btnSingIn).click();
	//driver.findElement(lntOut).click();
	//driver.quit();
	
 //System.out.println("me  voy ");
		
	}
	


	

/*
	public static void main(String[] args) throws InterruptedException {
		
       
		NewTest newtest = new NewTest();
		principal p = new principal();
		newtest.abrirNavegador();
		//newtest.hacerLogin();
		newtest.comprar();
		
		

	}
	
*/
}
