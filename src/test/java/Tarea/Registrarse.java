package Tarea;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Registrarse {

	public WebDriver driver;

	// Registrar
	By 	btnRes= By.id("");
	By txtEmailR = By.id("email_create");
	By btnRegistar = By.id("SubmitCreate");
	By rbnGenero = By.id("id_gender1");
	By txtPNombre = By.id("customer_firstname");
	By txtUNombre = By.id("customer_lastname");
	By txtPassworR = By.xpath("//input[@ id='passwd']");
	By txtPrimerN = By.id("firstname");
	By txtSegundoN = By.id("lastname");
	By txtDireccion = By.id("address1");
	By txtCiudad = By.id("city");
	// select
	By txtEstado = By.id("id_state");
	By txtCodigoP = By.id("postcode");
	By txtTelefono = By.id("phone_mobile");
	By txtBntRegis = By.id("submitAccount");

	// objetos del login
	By lnkLogin = By.linkText("Sign in");
	By txtEmail = By.id("email");
	By txtPassword = By.id("passwd");
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

	public void hacerLogin() {
		// abrir pagina.
		driver.get("http://automationpractice.com/index.php");

		// accedemos a los elementos.
		driver.findElement(lnkLogin).click();
		// se limpian los campos antes de mandarles datos.
		driver.findElement(txtEmail).clear();
		driver.findElement(txtEmail).sendKeys("chamirojo.101@hotmail.com");
		driver.findElement(txtPassword).clear();
		driver.findElement(txtPassword).sendKeys("Matrix");
		driver.findElement(btnSingIn).click();
		driver.findElement(lntOut).click();
		driver.quit();

		System.out.println("loguin realizado ");

	}

	public void registrar() throws InterruptedException {
		// abrir pagina.
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(lnkLogin).click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(txtEmailR).sendKeys("chamirojo.101@hotmail.com");
		driver.findElement(btnRegistar).click();
		 Thread.sleep(3000);
		 
		// accedemos a los elementos.
		driver.findElement(rbnGenero).isSelected();
		driver.findElement(txtPNombre).sendKeys("CHAMI");
		driver.findElement(txtUNombre).sendKeys("MAQUINA");
		driver.findElement(txtPassworR).sendKeys("Matrix");
		driver.findElement(txtPrimerN).sendKeys("CHAMI");
		driver.findElement(txtSegundoN).sendKeys("MAQUINA");
		driver.findElement(txtDireccion).sendKeys("OLX");
		driver.findElement(txtCiudad).sendKeys("San diego");
		//seleccionamos d e la  clase select
		 Thread.sleep(3000);
		Select opt = new Select(driver.findElement(txtEstado));
		opt.selectByValue("5");
		
		driver.findElement(txtCodigoP).sendKeys("22434");
		driver.findElement(txtTelefono).sendKeys("3245364123");
		driver.findElement(txtBntRegis).click();
		System.out.println("registro realizado");
		driver.findElement(lntOut).click();

	}

	public static void main(String[] args) throws InterruptedException {

		Registrarse res = new Registrarse();

		res.abrirNavegador();
		res.registrar();
		res.hacerLogin();

	}

}
