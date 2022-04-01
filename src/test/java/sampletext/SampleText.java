package sampletext;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd =new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		 File src =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	        
	        
	        FileHandler.copy(src,new File("C:\\Users\\prasa\\eclipse-workspace\\gitText\\screenshot\\image.png"));
	        
		

	}

}
