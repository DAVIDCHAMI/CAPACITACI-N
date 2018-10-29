package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import common.BaseTest;

public class MyTest extends BaseTest {

	By linkTestCorreo = By.linkText("Link Test");
	By BlintTestIncorrecto = By.linkText("Link Tes");

	@Test
	public void ingresarSahi() throws InterruptedException {

		try {

			driver.get("http://sahitest.com/demo/");
			driver.findElement(BlintTestIncorrecto).click();

		} catch (NoSuchElementException e) {

			System.out.println("Ingrese al catch de  la excepción ");
			driver.findElement(linkTestCorreo).click();
			Thread.sleep(5000);
			// TODO: handle exception
		} catch (Exception e) {
			System.out.println("Ingrese al catch de  la excepción  Exceptión");
			// TODO: handle exception
		}

	}
//@Test
	public void ingresarSahiThrows() throws NoSuchElementException, InterruptedException {

		try {

			driver.get("http://sahitest.com/demo/");
			driver.findElement(BlintTestIncorrecto).click();

		} catch (NoSuchElementException e) {

			System.out.println("Ingrese al catch de  la excepción ");
			driver.findElement(linkTestCorreo).click();
			Thread.sleep(5000);

			throw new NoSuchElementException("No estaba disponible el elemento BlintTestIncorrecto");
			// TODO: handle exception
		} catch (Exception e) {
			System.out.println("Ingrese al catch de  la excepción  Exceptión");
			// TODO: handle exception
		}

	}
/*
	public static void main(String[] args) throws InterruptedException {

		MyTest my = new MyTest();
		my.abrirNavegador();
		// my.ingresarSahi();
		my.ingresarSahiThrows();
		my.cerrarNavegador();
	}
*/
}
