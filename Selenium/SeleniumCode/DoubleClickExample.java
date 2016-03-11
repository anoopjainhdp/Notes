/**
 * 
 */
package com.anoop.selenium.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 * @author ajain
 *
 */
public class DoubleClickExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		// Open the Double Click Demo page
		driver.get("https://css-tricks.com/examples/CSSDoubleClick/");
		
		// Wait for 5 seconds before dragging window
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Find element to be double clicked
		WebElement dblClickElement = driver.findElement(By.cssSelector("div.test3 a"));

		// Create the action builder
		Actions builder = new Actions(driver);
		// Drag and Drop element
		builder.doubleClick(dblClickElement);

		// Create the action
		Action action = builder.build();
		// Perform the action
		action.perform();

		// Wait for 10 seconds before closing window
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
	}

}
