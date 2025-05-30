package io.cucumber.skeleton.utils;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
    private static HelperClass helperClass;
    private static WebDriver driver;
    public final static int TIMEOUT = 30;

    private HelperClass() {
        String browser = System.getProperty("browser", "chrome").toLowerCase();

        if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");
            driver = new EdgeDriver(options);
        } else {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = getChromeOptions();
            driver = new ChromeDriver(options);
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    }

    private static ChromeOptions getChromeOptions() {
        Map<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.password_manager_leak_detection", false);
        chromePrefs.put("credentials_enable_service", false);
        chromePrefs.put("profile.password_manager_enabled", false);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        return options;
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
        if (helperClass == null) {
            helperClass = new HelperClass();
        }
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        helperClass = null;
    }

    public static WebDriverWait webDriverWaiting() {
        return new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public static boolean isElementVisible(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
