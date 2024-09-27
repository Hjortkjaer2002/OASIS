package com.oasis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import java.util.Scanner;

public class StudentAthleteSearch {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/brock/Code/chromedriver");

         // Create ChromeOptions instance
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        // options.addArguments("--headless"); // Uncomment this line to run in headless mode
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the student's name
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        // Get the school name
        System.out.print("Enter the school name: ");
        String school = scanner.nextLine();

        // Get the sport
        System.out.print("Enter the sport: ");
        String sport = scanner.nextLine();

        // Construct the search query
        String query = name + " " + school + " " + sport;

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver(options);

        // Open Google and perform the search
        driver.get("https://www.thebrockellis.com");
        driver.findElement(By.name("q")).sendKeys(query);
        driver.findElement(By.name("q")).submit();

        // Close the scanner
        scanner.close();
    }
}