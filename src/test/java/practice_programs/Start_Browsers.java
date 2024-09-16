package practice_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Start_Browsers 
{
    static WebDriver driver;
	public static void main(String[] args) 
	
	{
		
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
		driver=new EdgeDriver();
		WebDriverManager.edgedriver().setup();	
	}
	

}
