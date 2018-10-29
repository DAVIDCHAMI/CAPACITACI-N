package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

	public WebDriver driver;

	@Parameters({"browser"})
	@BeforeTest
	public void abrirNavegador(String browser) {

		if ("chrome".equals(browser)) {

			// definir propiedad que contiene el drivers
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			ChromeOptions chromeoptions = new ChromeOptions();
			// preferencias del navegador
			chromeoptions.addArguments("start-maximized");
			// driver = new FirefoxDriver;
			// driver = new InternetExploreDriver;
			driver = new ChromeDriver(chromeoptions);

			// para que se ejecuten las pruebas sin abrir el navegador ("--headless")
			// ("disable-")

			/*
			 * // Preferencias del navegador
			 * chromeOptions.addArguments("--headless","start-maximized", "--incognito",
			 * "disable-infobars");
			 */

		} else {

			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			// preferencias del navegador
			//firefox.addArguments("start-maximized");
			// driver = new FirefoxDriver;
			// driver = new InternetExploreDriver;
			
			System.out.println("El  parametro no esta configurado");

		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@AfterTest
	public void cerrarNavegador() {
		if (driver != null) {
			driver.quit();
			System.out.println("Se cierra el  navegador");
		} else {
			System.out.println("No  hay driver con sesión activa");
		}
	}

}
