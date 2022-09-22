import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestesSiteSenai {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador(){
		//Insere a propriedade driver no executável
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testeNavegador() throws InterruptedException {
		//abre o site do senai
		driver.get("https://informatica.sp.senai.br/");
		
		//seleciona o campo de busca e pesquisa por excel
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("excel");
		
		//Seleciona a lupa de busca e clica
		//driver.findElement(By.id("Busca1_btnBusca")).click();
		
		//Dá o efeito de apertar Enter no campo de busca
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.RETURN);
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("nome-curso")).click();
	}
}
