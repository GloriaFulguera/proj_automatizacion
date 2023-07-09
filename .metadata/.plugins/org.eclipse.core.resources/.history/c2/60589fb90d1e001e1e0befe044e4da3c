package primerAutomatizacion.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ContactPage_Test {

	private WebDriver driver;
	ContactPage contactPage;
	
	
	@Before
	public void setUp() throws Exception {
		contactPage = new ContactPage(driver);
		driver = contactPage.chromeConnection();
		contactPage.visit("https://www.consultoriaglobal.com.ar/cgweb/");
		System.out.println("Se accede a la pagina de Consultoria Global");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		System.out.println("Se cierra el navegador");
	}

	@Test
	public void test() throws InterruptedException {
		contactPage.accederPagina();
		contactPage.completarPagina();
		Thread.sleep(2000);
		
		//assertTrue(!contactPage.mensajeInvalido().isDisplayed());
		assertTrue(contactPage.mensajeInvalido().isDisplayed());
	}

}
