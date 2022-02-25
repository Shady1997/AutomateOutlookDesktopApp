package testOutlook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;
import java.net.URL;
import io.appium.java_client.windows.WindowsDriver;

public class CalculatorTest {

	public static WindowsDriver<WebElement> CalculatorSession = null;
	public WebElement CalculatorResult = null;
	public static DesiredCapabilities capabilities;

	public static void main(String[] args) {
		setup();
	}

	public static void setup() {
		try {
			capabilities = new DesiredCapabilities();
			capabilities.setCapability("app", "C:\\Program Files (x86)\\Microsoft Office\\Office16\\OUTLOOK.EXE");
			capabilities.setCapability("platformName", "Windows");
			capabilities.setCapability("platformVersion", "1.0");

			CalculatorSession = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), capabilities);
			CalculatorSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}
}
