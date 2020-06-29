package am.itu.qa.toto.games;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.toto.base.TotoBaseTest;
import am.itu.qa.toto.games.TotoGamesPage;
import am.itu.qa.toto.home.TotoHomePage;

public class TotoGamesTest extends TotoBaseTest {
	
	@Test(priority = 110)

	public void pokerTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoGamesPage menu = home.navigateToTotoo();
		Thread.sleep(5000);
		
		Assert.assertTrue(menu.pokerPageDisplayed());

		System.out.println("2.In TotoGaming HOME page click on Poker page button");
		menu.clickToPoker();

		System.out.println("Expected results:");
		System.out.println("After step 2Poker page is presented");
	}
	
	@Test(priority = 111)

	public void beloteTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoGamesPage menu = home.navigateToTotoo();
		Thread.sleep(5000);
		
		Assert.assertTrue(menu.belotePageDisplayed());

		System.out.println("2.In TotoGaming HOME page click on Belote page button");
		menu.clickToBelote();

		System.out.println("Expected results:");
		System.out.println("After step 2.Belote page is presented");
	}
	
	@Test(priority = 112)

	public void backgammonTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoGamesPage menu = home.navigateToTotoo();
		Thread.sleep(5000);
		
		Assert.assertTrue(menu.backgammonPageDisplayed());

		System.out.println("2.In TotoGaming HOME page click on Backgammon page button");
		menu.clickToBackgammon();

		System.out.println("Expected results:");
		System.out.println("After step 2.Backgammon page is presented");
	}
	
	@Test(priority = 113)

	public void dominoTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoGamesPage menu = home.navigateToTotoo();
		Thread.sleep(5000);
		
		Assert.assertTrue(menu.dominoPageDisplayed());

		System.out.println("2.In TotoGaming HOME page click on Domino page button");
		menu.clickToDomino();

		System.out.println("Expected results:");
		System.out.println("After step 2.Domino page is presented");
	}
	
	@Test(priority = 114)

	public void kenoTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoGamesPage menu = home.navigateToTotoo();
		Thread.sleep(5000);
		
		Assert.assertTrue(menu.kenoPageDisplayed());

		System.out.println("2.In TotoGaming HOME page click on Keno page button");
		menu.clickToKeno();

		System.out.println("Expected results:");
		System.out.println("After step 2.Keno page is presented");
	}
	
	@Test(priority = 115)

	public void crashTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoGamesPage menu = home.navigateToTotoo();
		Thread.sleep(5000);
		
		Assert.assertTrue(menu.crashPageDisplayed());

		System.out.println("2.In TotoGaming HOME page click on Crash page button");
		menu.clickToCrash();

		System.out.println("Expected results:");
		System.out.println("After step 2.Crash page is presented");
	}
	
	@Test(priority = 116)

	public void hiloTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoGamesPage menu = home.navigateToTotoo();
		Thread.sleep(5000);
		
		Assert.assertTrue(menu.hiloPageDisplayed());

		System.out.println("2.In TotoGaming HOME page click on Hi Lo page button");
		menu.clickToHiLo();

		System.out.println("Expected results:");
		System.out.println("After step 2.Ho Lo page is presented");
	}
	
	@Test(priority = 118)

	public void resultsTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoGamesPage menu = home.navigateToTotoo();
		Thread.sleep(5000);
		
		Assert.assertTrue(menu.resultsPageDisplayed());

		System.out.println("2.In TotoGaming HOME page click on Results page button");
		menu.clickToResults();

		System.out.println("Expected results:");
		System.out.println("After step 2.Results page is presented");
	}
	
	@Test(priority = 119)

	public void calendarTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoGamesPage menu = home.navigateToTotoo();
		Thread.sleep(5000);
		
		Assert.assertTrue(menu.calendarPageDisplayed());

		System.out.println("2.In TotoGaming HOME page click on Live Calendar page button");
		menu.clickToCalendar();

		System.out.println("Expected results:");
		System.out.println("After step 2.Live Calendar page is presented");
	}
	
	@Test(priority = 120)

	public void statisticsTest() throws InterruptedException {

		System.out.println("Precondition");
		System.out.println("TotoGaming.am home page is opened in chrome driver -- TotoBaseTest");

		TotoHomePage home = new TotoHomePage(this.driver);
		Thread.sleep(3000);

		System.out.println("Steps");

		System.out.println("1.In TotoGaming HOME page click on Toto home page button");
		TotoGamesPage menu = home.navigateToTotoo();
		Thread.sleep(5000);
		
		Assert.assertTrue(menu.statisticsPageDisplayed());

		System.out.println("2.In TotoGaming HOME page click on Statistics page button");
		menu.clickToStatistics();

		System.out.println("Expected results:");
		System.out.println("After step 2.Statistics page is presented");
	}
	
}

