package seleniumDriver.main;

import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

public class SeleniumDriverMain {

    private static final String ROOT_DIR = Paths.get("").toAbsolutePath().toString();

    public static void main(String[] args) {
        setSystemProperty();
        // webdriverを初期化
        EdgeDriver driver = new EdgeDriver();
        try {
            // 対象URLをブラウザに表示
            driver.get("https://www.google.co.jp/");
            // 検索欄のweb要素を取得する
            WebElement ele = driver.findElement(By.id("APjFqb"));
            // 検索欄に「selenium」を入力
            ele.sendKeys("selenium");
            Thread.sleep(5000);
            // 検索ボタンを押す
            driver.findElement(By.name("btnK")).click();
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // ブラウザを閉じ、seleniumを終了させる。
            driver.quit();
        }
    }

    private static void setSystemProperty() {
        // システムプロパティにedgeDriverのバスを登録します。
        System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY,
                ROOT_DIR  + "\\etc\\msedgedriver.exe");
    }

}
