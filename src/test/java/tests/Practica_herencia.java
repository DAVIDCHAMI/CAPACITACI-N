package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import common.BaseTest;

public class Practica_herencia extends BaseTest {

	By linkFrameTest = By.linkText("Frames Test");
	By linkConfirPage = By.linkText("Confirm Page");
	By txtName = By.name("t1");

	public void frame() throws NoSuchElementException {

		try {
			driver.get("http://sahitest.com/demo/");
			driver.findElement(linkFrameTest).click();

			driver.findElement(linkConfirPage).click();

		} catch (NoSuchElementException e) {

			System.out.println("se  activa excepción");
			driver.switchTo().frame(0);
			driver.findElement(linkConfirPage).click();
			// TODO: handle exception
			String pp = driver.findElement(txtName).getText();
			if (pp.equals("canceled")) {
				System.out.println("mensaje correcto");
			} else {
				throw new NoSuchElementException("No dice Cancelar");
			}

		}

	}
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practica_herencia pr = new Practica_herencia();
		pr.abrirNavegador();
		pr.frame();

	}
*/
}
