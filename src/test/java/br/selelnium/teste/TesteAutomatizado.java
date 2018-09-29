package br.selelnium.teste;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomatizado {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/fibbauru/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
/*
		driver.get("http://www.google.com.br");
		
		WebElement campoDeTexto = driver.findElement(By.name("q"));
		campoDeTexto.sendKeys("javali");
		campoDeTexto.submit();
		driver.close();
*/	
/*		
		// Criar um usuario na lista
		driver.get("http://192.168.4.103:8080/correntista/lista");
			
		WebElement campoTexto = driver.findElement(By.linkText("Add Correntista"));
				campoTexto.click();				
				
		WebElement campoInput = driver.findElement(By.name("nome"));
			campoInput.sendKeys("Sandro Rocha");
			
			campoInput = driver.findElement(By.name("email"));
			campoInput.sendKeys("sandro@gmail.com");
			
			campoInput.submit();
*/			
			
			Boolean conteudo = driver.getPageSource().contains("Sandro Rocha");
			
			assertTrue(conteudo);
			driver.close();
			
	}

}
