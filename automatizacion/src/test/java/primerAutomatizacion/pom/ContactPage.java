package primerAutomatizacion.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage extends Base{

	By contactoBtn = By.xpath("//a[@href='https://www.consultoriaglobal.com.ar/cgweb/?page_id=370']");
	By contactoPage = By.xpath("//*[@id=\"content\"]/header/div/div/h1");
	
	By nombre = By.name("your-name");
	By email = By.name("your-email");
	By asunto = By.name("your-subject");
	By contactoBtnSend = By.xpath("//*[@id=\"wpcf7-f1297-p370-o1\"]/form/p[7]/input");
	
	By errorMail = By.tagName("span");
	
	public ContactPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void accederPagina() throws InterruptedException {
		click(contactoBtn);
		System.out.println("Se interactua con boton 'Contactenos'");
		
		Thread.sleep(2500);
	}
	public void completarPagina() {
		
		if(isDisplayed(contactoPage)) {
			type("ejemplo-nombre",nombre);
			System.out.println("Se completa el campo nombre");
			
			type("ejemplo-email",email);
			System.out.println("Se completa el campo email");
			
			type("ejemplo-asunto",asunto);
			System.out.println("Se completa el campo asunto");
			
			click(contactoBtnSend);
			System.out.println("Se interactua con el boton 'Enviar'");
		}
		else {
			System.out.println("No se encontro la pagina");
		}
	}
	public WebElement mensajeInvalido() {
		List<WebElement> spans = findElements(errorMail);
		if(spans.get(1).isDisplayed()) {
			System.out.println("'La direccion e-mail parece invalida.'");
		}
		return spans.get(1);
	}
}
