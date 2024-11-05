package Drivers;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Driver {

    public WebDriver Webdriver() {
        // Caminho para o WebDriver do Chrome (ou outro navegador)


       // System.setProperty("webdriver.chrome.driver", "/users/victoroliveira/drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/home/runner/work/Martins_Teste_Base2/Martins_Teste_Base2/src/test/java/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://mantis-prova.base2.com.br");
        return driver;
    }
}

//
//package Drivers;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class Driver {
//    public static WebDriver Webdriver() {
//        // Configura o WebDriver Manager para baixar o ChromeDriver automaticamente
//        WebDriverManager.chromedriver().setup();
//
//        // Define opções do Chrome em modo headless
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless"); // Executa em modo headless
//        options.addArguments("--no-sandbox"); // Necessário em alguns ambientes CI
//        options.addArguments("--disable-dev-shm-usage"); // Evita problemas de memória compartilhada
//        options.addArguments("--disable-gpu"); // Desativa uso da GPU
//        options.addArguments("--window-size=1920,1080"); // Define o tamanho da janela
//
//        // Inicializa o ChromeDriver com as opções configuradas
//        return new ChromeDriver(options);
//    }
//
//
//}
