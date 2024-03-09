package factory;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CucumberBaseClass {
 
	public static WebDriver driver;
    public static Properties p;
    public static Logger logger;
    public static WebDriver initializeBrowser() throws IOException  {
    	switch(getProperties().getProperty("browser").toLowerCase()){
    	case "chrome":
    		driver = new ChromeDriver();
    		break;
    	case "firefox":
    		driver = new FirefoxDriver();
    		break;
    	default:
    		driver = new EdgeDriver();
    	}
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
		return driver;
//    	if(getProperties().getProperty("execution_env").equalsIgnoreCase("remote"))
//    	{
//    		DesiredCapabilities cap = new DesiredCapabilities();
// 
//			if (getProperties().getProperty("os").equalsIgnoreCase("windows")) {
//				cap.setPlatform(Platform.WIN11);
//			}
// 
//			else if (getProperties().getProperty("os").equalsIgnoreCase("mac")) {
//				cap.setPlatform(Platform.MAC);
//			}
// 
//			else {
//				System.out.println("No matching OS");
//			}
//			switch (getProperties().getProperty("browser").toLowerCase()) {
// 
//			case "chrome": 
//				cap.setBrowserName("chrome");
//				break;
// 
//		    case "edge":
//		    	cap.setBrowserName("MicrosoftEdge");
//		    	break;
// 
//		    default:
//		    	System.out.println("No matching browser");
//		    }
// 
//			driver = new RemoteWebDriver(new URL("http://localhost:4444"),cap);
//		}
 
//    	else if(getProperties().getProperty("execution_env").equalsIgnoreCase("local"))
//    	{
//    		switch(getProperties().getProperty("browser").toLowerCase()) {
// 
//			case "chrome":
//				driver=new ChromeDriver();
//				break;
//			case "edge":
//				driver=new EdgeDriver();
//				break;
// 
//		    default:
//		    	System.out.println("No matching browser");
//		    	driver=null;
//		    }
// 
//		}
// 
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//    	return driver;
// 
}
    public static WebDriver getDriver() {
 
		return driver;
	}
    public static Properties getProperties() throws IOException {		
 
    	FileReader file = new FileReader(".//src//test//resources//config.properties");
    	p = new Properties();
    	p.load(file);
    	return p;
    }
    public static Logger getLogger() {
    	logger = LogManager.getLogger(); //Log4j
    	return logger;
    }
}