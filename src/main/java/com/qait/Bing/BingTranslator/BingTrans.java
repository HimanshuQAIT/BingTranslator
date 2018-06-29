package com.qait.Bing.BingTranslator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BingTrans {
	WebDriver wd;

	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\himanshusharma\\Documents\\Chrome\\chromedriver.exe");
		wd = new ChromeDriver();

	}

	public void testOpenBingTranslator() {
		wd.get("https://www.bing.com/translator");
	}

	public void chooseInputLanguage() {
		Select inputLanguage = new Select(wd.findElement(By.xpath("//*[@id=\"t_sl\"]")));
		inputLanguage.selectByVisibleText("English");
	}

	public void chooseOutputLanguage() {
		Select inputLanguage = new Select(wd.findElement(By.xpath("//*[@id=\"t_tl\"]")));
		inputLanguage.selectByVisibleText("Hindi");
	}

	public void enterTextToTranslate() {
		wd.findElement(By.id("t_sv")).sendKeys("hello how are you?");
	}

	public void getTranslatedText() {
		WebElement text = wd.findElement(By.xpath("//*[@id=\"t_tv\"]"));
		// System.out.println(text.getText());
	}

	public void checkMenuItemTranslator() {
		wd.findElement(By.xpath("/html/body/ul/li[1]/a")).click();
		wd.navigate().back();
	}

	public void checkMenuItemConversation() {
		wd.findElement(By.xpath("/html/body/ul/li[3]/a")).click();
		wd.navigate().back();
	}

	public void checkMenuItemApps() {
		wd.findElement(By.xpath("/html/body/ul/li[4]/a")).click();
		wd.navigate().back();
	}

	public void checkMenuItemForBusiness() {
		wd.findElement(By.xpath("/html/body/ul/li[5]/a")).click();
		wd.navigate().back();
	}

	public void checkMenuItemHelp() {
		wd.findElement(By.xpath("/html/body/ul/li[6]/a")).click();
		wd.navigate().back();
	}

}
