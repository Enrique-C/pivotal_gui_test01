package Calculator;


import Core.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.Dictionary;
import java.util.Hashtable;

public class CalculatorPage {
    private WebDriver driver;
    final String BASE_URI = "https://www.calculadora.org/";
    private Dictionary<String, String> buttonsDictionary = new Hashtable<String, String>();

    public CalculatorPage(){
        driver = WebDriverManager.getInstance().getWebDriver();
        loadButtonsDict();
    }
    public String run(String operation){
        driver.get(BASE_URI);
        driver.manage().window().setSize(new Dimension(818, 727));
        pressButton(operation);
        return readTextBoxResult();
    }

    private void loadButtonsDict(){
        buttonsDictionary.put("0", "/html/body/center/div/div[2]/span[13]");
        buttonsDictionary.put("1", "/html/body/center/div/div[2]/span[9]");
        buttonsDictionary.put("2", "/html/body/center/div/div[2]/span[10]");
        buttonsDictionary.put("3", "/html/body/center/div/div[2]/span[11]");
        buttonsDictionary.put("4", "/html/body/center/div/div[2]/span[5]");
        buttonsDictionary.put("5", "/html/body/center/div/div[2]/span[6]");
        buttonsDictionary.put("6", "/html/body/center/div/div[2]/span[7]");
        buttonsDictionary.put("7", "/html/body/center/div/div[2]/span[1]");
        buttonsDictionary.put("8", "/html/body/center/div/div[2]/span[2]");
        buttonsDictionary.put("9", "/html/body/center/div/div[2]/span[3]");
        buttonsDictionary.put(".", "/html/body/center/div/div[2]/span[14]");
        buttonsDictionary.put("=", "/html/body/center/div/div[2]/span[15]");
        buttonsDictionary.put("x", "/html/body/center/div/div[2]/span[16]");
        buttonsDictionary.put("/", "/html/body/center/div/div[2]/span[12]");
        buttonsDictionary.put("-", "/html/body/center/div/div[2]/span[8]");
        buttonsDictionary.put("+", "/html/body/center/div/div[2]/span[4]");
        buttonsDictionary.put("c", "/html/body/center/div/div[1]/span");
    }

    private void pressButton(String operation){
        char[] stringToCharArray = operation.toCharArray();
        for (char value : stringToCharArray) {
            String xpath = buttonsDictionary.get(String.valueOf(value));
            driver.findElement(By.xpath(xpath)).click();
        }
    }

    private String readTextBoxResult(){
        return driver.findElement(By.cssSelector(".screen")).getText();
    }
}
