import Core.WebDriverManager;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import Calculator.CalculatorPage;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Calculator {

    @Test
    public void addition_9999And9999_19998() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("9999+9999=");
        String expectedResult = "19998";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void addition_0p5And0p5_1() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("0.5+0.5=");
        String expectedResult = "1";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void addition_0p05And0p05_01() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("0.05+0.05=");
        String expectedResult = "0.1";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void subtraction_9999Minus9999_0() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("9999-9999=");
        String expectedResult = "0";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void subtraction_0Minus9999_n9999() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("0-9999=");
        String expectedResult = "-9999";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void subtraction_3000Minus1500_n1500() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("-3000+1500=");
        String expectedResult = "-1500";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void subtraction_12p5Minus12p5_n25() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("-12.5-12.5=");
        String expectedResult = "-25";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void Multiplication_99999By0_0() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("9999x0=");
        String expectedResult = "0";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void Multiplication_2147483648By1_2147483648() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("2147483648x1=");
        String expectedResult = "2147483648";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void Multiplication_2147483648By2_4p2949673e9() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("2147483648x2=");
        String expectedResult = "4294967296";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void Multiplication_2147483648By999999999_2147483645852516352() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("2147483648x999999999=");
        String expectedResult = "2147483645852516352";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void Multiplication_0p000000000000001By999999999_0p000000999999999() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("0.000000000000001x999999999=");
        String expectedResult = "0.000000999999999";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void Division_55Between55_1() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("55/55=");
        String expectedResult = "1";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void Division_999Between0_Error() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("999/0=");
        String expectedResult = "Infinity";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void Division_0p1Between555_1p8018018018018018018018018018018en4() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("0.1/555=");
        String expectedResult = "1.8018018018018018018018018018018e-4";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void Division_0Between9999_0() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("0/9999=");
        String expectedResult = "0";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void AdditionAndSubtraction_2plus2minus2_2() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("2+2-2=");
        String expectedResult = "2";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void SubtractionAndMultiplication_2minus2By99_n196() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("2-2x99=");
        String expectedResult = "-196";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void SubtractionAndMultiplicationAndDivision_2minus2By80Between2_n78() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("2-2x80/2=");
        String expectedResult = "-78";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
    @Test
    public void SubtractionAndMultiplicationAndDivision_2minus2By0Between2_2() {
        CalculatorPage calculatorPage = new CalculatorPage();
        String actualResult = calculatorPage.run("2-2x0/2=");
        String expectedResult = "2";
        assertEquals(expectedResult, actualResult);
        WebDriverManager.getInstance().quitDriver();
    }
}
