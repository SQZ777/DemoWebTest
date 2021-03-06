import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe"); // 設定chromedriver位置
		WebDriver chromeDriver = new ChromeDriver(); // 建立一個WebDriver物件
		chromeDriver.manage().window().maximize(); // 開啟的視窗要放大 才比較好讓我們觀看執行的過程
		chromeDriver.get("https://www.google.com/"); // 開啟google首頁
		chromeDriver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("1+1");// 針對這個xpath輸入1+1
		chromeDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).submit();
		// //針對這個xpath進行Submit動作
		chromeDriver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/div/div/h3/a")).click();
		// //針對這個xpath做點選動作
		Thread.sleep(3000); // 避免一完成就直接關閉 所以讓他暫時停止3秒
		chromeDriver.quit(); // 關閉視窗
	}

	/// 使用cssSelector的方式
	public void cssSelectorMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe"); // 設定chromedriver位置
		WebDriver chromeDriver = new ChromeDriver(); // 建立一個WebDriver物件
		chromeDriver.manage().window().maximize(); // 開啟的視窗要放大 才比較好讓我們觀看執行的過程
		chromeDriver.get("https://www.google.com/"); // 開啟google首頁
		chromeDriver.findElement(By.cssSelector("#lst-ib")).sendKeys("1+1");
		chromeDriver
				.findElement(
						By.cssSelector("#tsf > div.tsf-p > div.jsb > center > input[type=\"submit\"]:nth-child(1)"))
				.submit();
		chromeDriver
				.findElement(By.cssSelector("#rso > div:nth-child(2) > div > div:nth-child(1) > div > div > h3 > a"))
				.click();
		Thread.sleep(3000);
		chromeDriver.quit();
	}

	/// 使用ID的方式
	public void FindByIDMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe"); // 設定chromedriver位置
		WebDriver chromeDriver = new ChromeDriver(); // 建立一個WebDriver物件
		chromeDriver.manage().window().maximize(); // 開啟的視窗要放大 才比較好讓我們觀看執行的過程
		chromeDriver.get("https://www.google.com/"); // 開啟google首頁
		chromeDriver.findElement(By.id("lst-ib")).sendKeys("1+1");
		chromeDriver.findElement(By.id("tsf")).submit();
		chromeDriver
				.findElement(By.cssSelector("#rso > div:nth-child(2) > div > div:nth-child(1) > div > div > h3 > a"))
				.click();
		Thread.sleep(3000);
		chromeDriver.quit();
	}

	/// 使用Name的方式
	public void FindByNameMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe"); // 設定chromedriver位置
		WebDriver chromeDriver = new ChromeDriver(); // 建立一個WebDriver物件
		chromeDriver.manage().window().maximize(); // 開啟的視窗要放大 才比較好讓我們觀看執行的過程
		chromeDriver.get("https://www.google.com/"); // 開啟google首頁
		chromeDriver.findElement(By.name("q")).sendKeys("1+1");
		chromeDriver.findElement(By.name("btnK")).submit();
		chromeDriver
				.findElement(By.cssSelector("#rso > div:nth-child(2) > div > div:nth-child(1) > div > div > h3 > a"))
				.click();
		Thread.sleep(3000);
		chromeDriver.quit();
	}

}