package guru.qa.drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {

    public static URL getBrowserstackUrl() {
        try {
            return new URL("http://hub.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities caps) {

        // Set your access credentials
        caps.setCapability("browserstack.user", "vqc_0bH8Qp");
        caps.setCapability("browserstack.key", "Xq4qfDh9Sr6JNBya6gJz");

        // Set URL of the application under test
//        caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
        caps.setCapability("app", "bs://adbf6d0e7a9fd129edfa2cd59c0a73bcc037c530");

        // Specify device and os_version for testing
//        caps.setCapability("device", "Google Pixel 3");
//        caps.setCapability("os_version", "9.0");
        caps.setCapability("device", "Samsung Galaxy S22 Plus");
        caps.setCapability("os_version", "12.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "first_test");


        return new AndroidDriver(getBrowserstackUrl(), caps);
    }
}
