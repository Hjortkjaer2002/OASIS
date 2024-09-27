package com.oasis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver manually
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");  // Ensure this path is correct

        // Set up ChromeOptions for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Run in headless mode
        options.addArguments("--disable-gpu");  // Applicable for Windows

        WebDriver driver = null;

        try {
            // Initialize WebDriver with headless Chrome
            driver = new ChromeDriver(options);

            // Navigate to a specific URL
            String url = "https://www.fanword.com/";
            driver.get(url);

            // Print the page title to verify navigation
            System.out.println("Page title is: " + driver.getTitle());
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
}