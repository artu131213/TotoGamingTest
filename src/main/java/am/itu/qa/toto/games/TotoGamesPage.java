package am.itu.qa.toto.games;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.toto.base.TotoBasePage;

public class TotoGamesPage extends TotoBasePage {

	public TotoGamesPage(WebDriver driver) {
		super(driver);
		
	}

	public static final String CASINOO_XPATH = "//a[@href='https://playin.totogaming.am/en/ggpoker' and @itemprop='url']";
	public static final String BELOTE_XPATH = "//a[@href='https://playin.totogaming.am/Belote' and @itemprop='url']";
	public static final String BACKGAMMON_XPATH = "//a[@href='https://playin.totogaming.am/en/SkillGames?url=Backgammon' and @itemprop='url']";
	public static final String DOMINO_XPATH = "//a[@href='https://playin.totogaming.am/en/SkillGames?url=DominoesFives' and @itemprop='url']";
	public static final String KENO_XPATH = "//a[@href='https://playin.totogaming.am/en/betongames' and @itemprop='url']";
	public static final String CRASH_XPATH = "//a[@href='https://playin.totogaming.am/Betongames?url=Crash' and @itemprop='url']";
	public static final String HILO_XPATH = "//a[@href='https://playin.totogaming.am/en/Hilo' and @itemprop='url']";
	public static final String STATISTICS_XPATH = "//a[@href='https://stats.totogaming.am/?lg=en' and @itemprop='url']";
	public static final String RESULTS_XPATH = "//a[@href='https://playin.totogaming.am/en/fastgames/index?l=en&d=d' and @itemprop='url']";
	public static final String CALENDAR_XPATH = "//a[@href='https://sport.totogaming.am/SportsBook/Calendar' and @itemprop='url']";
	
	@FindBy(xpath = CASINOO_XPATH)
	WebElement pokerBtn;
	
	@FindBy(xpath = BELOTE_XPATH)
	WebElement beloteBtn;
	
	@FindBy(xpath = BACKGAMMON_XPATH)
	WebElement backgammonBtn;
	
	@FindBy(xpath = DOMINO_XPATH)
	WebElement dominoBtn;
	
	@FindBy(xpath = KENO_XPATH)
	WebElement kenoBtn;
	
	@FindBy(xpath = CRASH_XPATH)
	WebElement crashBtn;
	
	@FindBy(xpath = HILO_XPATH)
	WebElement hiloBtn;
	
	@FindBy(xpath = STATISTICS_XPATH)
	WebElement statisticsBtn;
	
	@FindBy(xpath = RESULTS_XPATH)
	WebElement resultsBtn;
	
	@FindBy(xpath = CALENDAR_XPATH)
	WebElement calendarBtn;
	
	public void clickToPoker() {
		pokerBtn.click();
	}
	
	public void clickToBelote() {
		beloteBtn.click();
	}
	
	public void clickToBackgammon() {
		backgammonBtn.click();
	}
	
	public void clickToDomino() {
		dominoBtn.click();
	}
	
	public void clickToKeno() {
		kenoBtn.click();
	}
	
	public void clickToCrash() {
		crashBtn.click();
	}
	
	public void clickToHiLo() {
		hiloBtn.click();
	}
	
	public void clickToStatistics() {
		statisticsBtn.click();
	}
	
	public void clickToResults() {
		resultsBtn.click();
	}
	
	public void clickToCalendar() {
		calendarBtn.click();
	}
	
	public boolean pokerPageDisplayed() {
		return pokerBtn.isDisplayed();
	}
	
	public boolean belotePageDisplayed() {
		return beloteBtn.isDisplayed();
	}
	
	public boolean backgammonPageDisplayed() {
		return backgammonBtn.isDisplayed();
	}
	
	public boolean dominoPageDisplayed() {
		return dominoBtn.isDisplayed();
	}
	
	public boolean kenoPageDisplayed() {
		return kenoBtn.isDisplayed();
	}
	
	public boolean crashPageDisplayed() {
		return crashBtn.isDisplayed();
	}
	
	public boolean hiloPageDisplayed() {
		return hiloBtn.isDisplayed();
	}
	
	public boolean resultsPageDisplayed() {
		return resultsBtn.isDisplayed();
	}
	
	public boolean calendarPageDisplayed() {
		return calendarBtn.isDisplayed();
	}
	
	public boolean statisticsPageDisplayed() {
		return statisticsBtn.isDisplayed();
	}
	
}

