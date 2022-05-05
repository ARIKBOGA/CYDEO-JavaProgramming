package day45_Abstraction.practiceTasks.browserTask;

import java.util.ArrayList;
import java.util.List;

public class DriverObjects {
    public static void main(String[] args) {
        RemoteWebDriver d1 = new ChromeDriver();
        RemoteWebDriver d2 = new FireFoxDriver();
        RemoteWebDriver d3 = new SafariDriver();
        RemoteWebDriver d4 = new EdgeDriver();
        RemoteWebDriver d5 = new OperaDriver();

        List<RemoteWebDriver> driverList = new ArrayList<>(List.of(d1, d2, d3, d4, d5));

        // Method ordered
        driverList.forEach(driver -> driver.get("URL"));
        driverList.forEach(driver -> driver.findElement("id=\"uniqElement\""));
        driverList.forEach(driver -> driver.findElements("class=\"researchable\""));
        driverList.forEach(driver -> driver.executeScript("index.js"));
        driverList.forEach(RemoteWebDriver::takeScreenShot);
        driverList.forEach(RemoteWebDriver::getTitle);
        driverList.forEach(RemoteWebDriver::close);
        driverList.forEach(RemoteWebDriver::quit);

        // WebDriver ordered
        driverList.forEach(driver -> {
            driver.get("URL");
            driver.findElement("id=\"uniqElement\"");
            driver.findElements("class=\"researchable\"");
            driver.executeScript("index.js");
            driver.takeScreenShot();
            driver.getTitle();
            driver.close();
            driver.quit();
            System.out.println();
        });

    }
}