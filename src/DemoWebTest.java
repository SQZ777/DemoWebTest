import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe"); //�]�wchromedriver��m
		WebDriver chromeDriver = new ChromeDriver();      //�إߤ@��WebDriver����
		chromeDriver.manage().window().maximize();        //�}�Ҫ������n��j �~����n���ڭ��[�ݰ��檺�L�{
		chromeDriver.get("https://www.google.com/");      //�}��google����
		chromeDriver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("1+1");                     //�w��o��xpath��J1+1
		chromeDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).submit(); //�w��o��xpath�i��Submit�ʧ@
		chromeDriver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/div/div/h3/a")).click(); //�w��o��xpath���I��ʧ@
		Thread.sleep(3000);  //�קK�@�����N�������� �ҥH���L�Ȯɰ���3��
		chromeDriver.quit(); //��������
	}