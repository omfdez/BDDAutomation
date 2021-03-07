/* OFG, test automation basico con Edge, a ver que sale*/
import java.util.Date;
import java.sql.Timestamp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.lang.Thread.sleep;

public class TestSelenium {
    public static void main(String[] args){
        //FirefoxDriver driver=new FirefoxDriver();
        System.out.println("Abrimos navegador....");
        Date date= new Date();
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);
        System.out.println("Start Time Stamp: " + ts);
        System.setProperty("webdriver.edge.driver", "C:\\DataNoOneDrive\\BDDAutomation\\Drivers\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        //abrimos el Marca
        driver.get("http://www.marca.com/");
        //buscamos noticias del Atleti
        //WebElement element = driver.findElement(By.name("q"));
        //element.sendKeys("Atleti!\n"); // send also a "\n"
        //element.submit();
        // wait until the google page shows the result
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
        //Cerramos navegador
        driver.quit();
        System.out.println("Hemos cerrado el navegador....");
        System.out.println("End Time Stamp: " + ts);
        /*
        System.out.println("NO cerramos el navegador....");
        System.out.println("End Time Stamp: " + ts);*/
    }
}