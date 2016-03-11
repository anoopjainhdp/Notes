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
public class DragNDropExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		// Open the HTML5 Demo page
		driver.get("http://jqueryui.com/droppable");
		
		// Wait for 5 seconds before dragging window
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Select the frame wondow
		driver.switchTo().frame(0);
		//Find element to be dropped and dragged
		WebElement dragElement = driver.findElement(By.id("draggable"));
		WebElement dropElement = driver.findElement(By.id("droppable"));

		// Create the action builder
		Actions builder = new Actions(driver);
		// Drag and Drop element
		builder.dragAndDrop(dragElement, dropElement);

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


