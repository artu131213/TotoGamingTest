package am.itu.qa.toto.sites;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.toto.base.TotoBaseTest;
import am.itu.qa.toto.home.TotoHomePage;

public class TotoSitesTest extends TotoBaseTest {

	@Test(priority = 90)

	public void aboutAsTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.aboutAsPageDisplayed());

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on About As button link");
		home.navigateToAboutAs();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.About As page is presented");
	}

	@Test(priority = 91)

	public void contactsTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.contactsPageDisplayed());

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Contact As button link");
		home.navigateToContactAs();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.Contact As page is presented");
	}

	@Test(priority = 92)

	public void faqTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.faqPageDisplayed());

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Faq button link");
		home.navigateToFaq();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.Faq page is presented");
	}
	
	@Test(priority = 93)

	public void vacanciesTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.vacanciesPageDisplayed());

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Vacancies button link");
		home.navigateToVacancies();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.Vacancies page is presented");
	}
	
	@Test(priority = 94)

	public void betshopsTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.betshopsPageDisplayed());

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Betshops button link");
		home.navigateToBetshops();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.Betshops page is presented");
	}
	
	@Test(priority = 95)

	public void generalTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.generalPageDisplayed());

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on General Terms and Conditions button link");
		home.navigateToGeneral();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.General Terms and Conditions page is presented");
	}
	
	@Test(priority = 96)

	public void regulationsTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.regulationsPageDisplayed());


		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Live Sport Regulations button link");
		home.navigateToRegulations();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.Live Sport Regulations page is presented");
	}
	
	@Test(priority = 97)

	public void regulationsCasinoTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.casinoPageDisplayed());

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Live Casino Regulations button link");
		home.navigateToRegulationsCasino();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.Live Casino Regulations page is presented");
	}
	
	@Test(priority = 98)

	public void privacyTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.privacyPageDisplayed());

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Privacy Policy Regulations button link");
		home.navigateToPrivacy();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.Privacy Policy page is presented");
	}
	
	@Test(priority = 99)

	public void responsibleTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.responsiblePageDisplayed());

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Responsible Gaming Regulations button link");
		home.navigateToResponsible();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.Responsible Gaming page is presented");
	}
	
	@Test(priority = 100)

	public void sportTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.sportPageDisplayed());

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on TotoSport button link");
		home.navigateToSport();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.TotoSport Gaming page is presented");
	}
	
	@Test(priority = 101)

	public void blotTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on TotoBlot button link");
		home.navigateToBlot();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.TotoBlot Gaming page is presented");
	}
	
	@Test(priority = 102)

	public void pokerTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.pokerPageDisplayed());
		
		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on TotoPoker button link");
		home.navigateToPoker();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.TotoPoker Gaming page is presented");
	}
	
	@Test(priority = 103)

	public void loriTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.loriPageDisplayed());

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Lori button link");
		home.navigateToLori();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.Lori Gaming page is presented");
	}
	
	@Test(priority = 104)

	public void pyunikTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(home.pyunikPageDisplayed());

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Pyunik button link");
		home.navigateToPyunik();
		Thread.sleep(3000);

		System.out.println("Expected results:");
		System.out.println("After step 1.Pyunik Gaming page is presented");
	}
	
}

