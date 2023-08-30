package baseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Baseclass {
	protected static Properties prop;
    protected static WebDriver driver;
    protected static ChromeOptions ops;
	public Baseclass() {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
					+ "//src/main/java/configLayer/File.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	
	public static void initilization()
	{

		ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
	    driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

}
