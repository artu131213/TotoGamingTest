package am.itu.qa.toto.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.itu.qa.toto.base.TotoBasePage;
import am.itu.qa.toto.chat.TotoPokerPage;
import am.itu.qa.toto.deposit.TotoDepositPage;
import am.itu.qa.toto.digitain.TotoDigitainPage;
import am.itu.qa.toto.federbet.TotoFederBetPage;
import am.itu.qa.toto.games.TotoGamesPage;
import am.itu.qa.toto.idq.TotoIdqPage;
import am.itu.qa.toto.language.TotoLanguagePage;
import am.itu.qa.toto.login.TotoLoginPage;
import am.itu.qa.toto.menu.TotoMenuPage;
import am.itu.qa.toto.mobile.TotoMobilePage;
import am.itu.qa.toto.register.TotoRegisterPage;

public class TotoHomePage extends TotoBasePage {

	public TotoHomePage(WebDriver driver) {
		super(driver);

	}

	public static final String MY_MENU_XPATH = "//a[contains(text(),'Esports')]";

	@FindBy(xpath = MY_MENU_XPATH)
	WebElement myPage;

	public TotoMenuPage navigateToMenu() {
		myPage.click();
		return new TotoMenuPage(this.driver);

	}

	public static final String REGISTER_BTN_XPATH = "//a[@class='registerDialog tl_register_button primBtn transBg']";

	@FindBy(xpath = REGISTER_BTN_XPATH)
	WebElement my1Page;

	public TotoRegisterPage navigateToHome() {
		my1Page.click();
		return new TotoRegisterPage(this.driver);

	}

	public static final String LANGUAGE_XPATH = "//div[contains(@class, 'tl_header_top_row')]//a[contains(@class, 'flex dropdown-menu')]";

	@FindBy(xpath = LANGUAGE_XPATH)
	WebElement my2Page;

	public TotoLanguagePage navigateToLanguage() {
		my2Page.click();
		return new TotoLanguagePage(this.driver);

	}

	public static final String LOGIN_XPATH = "//div[contains(@id, 'header_fix')]//a[contains(@class, 'loginDialog tl_login_button ternBtn transBg')]";

	@FindBy(xpath = LOGIN_XPATH)
	WebElement my3Page;

	public TotoLoginPage navigateToLogin() {
		my3Page.click();
		return new TotoLoginPage(this.driver);

	}

	public static final String CASINO_XPATH = "//a[contains(text(),'Casino')]";

	@FindBy(xpath = CASINO_XPATH)
	WebElement my5Page;

	public TotoDepositPage navigateToCasino() {
		my5Page.click();
		return new TotoDepositPage(this.driver);
	}
	
	public boolean depositPageDisplayed() {
		return my5Page.isDisplayed();
	}
	

	public static final String TOTO_XPATH = "//a[@href='https://totogaming.am']";

	@FindBy(xpath = TOTO_XPATH)
	WebElement my7Page;

	public TotoPokerPage navigateToToto() {
		my7Page.click();
		return new TotoPokerPage(this.driver);
	}
	
	public static final String TOTOO_XPATH = "//a[@href='https://totogaming.am']";

	@FindBy(xpath = TOTOO_XPATH)
	WebElement totoPage;

	public TotoGamesPage navigateToTotoo() {
		totoPage.click();
		return new TotoGamesPage(this.driver);
	}
	
public static final String MOBILE_XPATH = "//a[@class='toMobile']";
	
	@FindBy(xpath = MOBILE_XPATH)
	WebElement my9Page;
	
	public TotoMobilePage navigateToMobile() {
		my9Page.click();
		return new TotoMobilePage(this.driver);
	}
	
	public boolean mobilePageDisplayed() {
		return my9Page.isDisplayed();
	}
	
public static final String DIGITAIN_XPATH = "//a[@class='fic-digitain']";
	
	@FindBy(xpath = DIGITAIN_XPATH)
	WebElement my10Page;
	
	public TotoDigitainPage navigateToDigitain() {
		my10Page.click();
		return new TotoDigitainPage(this.driver);
	}
	
	public boolean digitainPageDisplayed() {
		return my10Page.isDisplayed();
	}
	
	
	
public static final String FEDERBET_XPATH = "//div[@class='federbet_box']";
	
	@FindBy(xpath = FEDERBET_XPATH)
	WebElement federPage;
	
	public TotoFederBetPage navigateToFederBet() {
		federPage.click();
		return new TotoFederBetPage(this.driver);
	}
	
	public boolean federBetPageDisplayed() {
		return federPage.isDisplayed();
	}
	
public static final String IDQ_XPATH = "//div[@class='rng_box']";
public static final String ARCA_XPATH = "//a[@class='new_pay arca']";
public static final String IDRAM_XPATH = "//a[@class='new_pay idram']";
public static final String MOBIDRAM_XPATH = "//a[@class='new_pay mobidram']";
public static final String TELCELL_XPATH = "//a[@class='new_pay telcell']";
public static final String EASYPAY_XPATH = "//a[@class='new_pay easypay']";
	
	@FindBy(xpath = IDQ_XPATH)
	WebElement idqPage;
	
	@FindBy(xpath = ARCA_XPATH)
	WebElement arcaPage;
	
	@FindBy(xpath = IDRAM_XPATH)
	WebElement idramPage;
	
	@FindBy(xpath = MOBIDRAM_XPATH)
	WebElement mobidramPage;
	
	@FindBy(xpath = TELCELL_XPATH)
	WebElement telcellPage;
	
	@FindBy(xpath = EASYPAY_XPATH)
	WebElement 	easypayPage;
	
	
	public TotoIdqPage navigateToIdq() {
		idqPage.click();
		return new TotoIdqPage(this.driver);
	}
	
	public TotoIdqPage navigateToArca() {
		arcaPage.click();
		return new TotoIdqPage(this.driver);
	}
	
	public TotoIdqPage navigateToIdram() {
		idramPage.click();
		return new TotoIdqPage(this.driver);
	}
	
	public TotoIdqPage navigateToMobidram() {
		mobidramPage.click();
		return new TotoIdqPage(this.driver);
	}
	
	public TotoIdqPage navigateToTelcell() {
		telcellPage.click();
		return new TotoIdqPage(this.driver);
	}
	
	public TotoIdqPage navigateToEasypay() {
		easypayPage.click();
		return new TotoIdqPage(this.driver);
	}
	
	public boolean idqPageDisplayed() {
		return idqPage.isDisplayed();
	}
	
	public boolean arcaPageDisplayed() {
		return arcaPage.isDisplayed();
	}
	
	public boolean idramPageDisplayed() {
		return idramPage.isDisplayed();
	}
	
	public boolean mobidramPageDisplayed() {
		return mobidramPage.isDisplayed();
	}
	
	public boolean telcellPageDisplayed() {
		return telcellPage.isDisplayed();
	}
	
	public boolean easypayPageDisplayed() {
		return easypayPage.isDisplayed();
	}
	
	public static final String ABOUTAS_XPATH = "//a[@href='https://rules.totogaming.am/?l=en&m=1']";
	public static final String CONTACTAS_XPATH = "//a[@href='https://rules.totogaming.am/?l=en&m=43']";
	public static final String FAQ_XPATH = "//a[@href='https://rules.totogaming.am/?l=en&m=11898']";
	public static final String VACANCIES_XPATH ="//a[@href='https://rules.totogaming.am/?l=en&m=80&s=203']";
	public static final String BETSHOPS_XPATH = "//a[@href='https://rules.totogaming.am/?l=en&m=13&s=25']";
	public static final String GENERAL_XPATH = "//a[@href='https://rules.totogaming.am/?l=en&m=4077&s=6719']";
	public static final String REGULATIONS_XPATH = "//a[@href='https://rules.totogaming.am/?l=en&m=4&s=4']";
	public static final String REGULATIONSCASINO_XPATH = "//a[@href='https://rules.totogaming.am/?l=en&m=4&s=694']";
	public static final String PRIVACY_XPATH = "//a[@href='https://rules.totogaming.am/?l=en&m=28&s=6629']";
	public static final String RESPONSIBLE_XPATH = "//a[@href='https://rules.totogaming.am/?l=en&m=727']";
	public static final String SPORT_XPATH = "//a[@href='https://www.totogaming.am/promotion/sport-app/en/index.html']";
	public static final String BLOT_XPATH = "//a[@href='https://www.totogaming.am/promotion/Belote-App/en/index.html']";
	public static final String POKER_XPATH = "//a[@href='https://www.totogaming.am/promotion/poker-download/en/index.html']";
	public static final String LORI_XPATH = "//a[@href='https://www.totogaming.am/promotion/pyunik-lori/en/index.html' and @class='footer_partners_logo lori_footer_icon']";
	public static final String PYUNIK_XPATH = "//a[@href='https://www.totogaming.am/promotion/pyunik-lori/en/index.html' and @class='footer_partners_logo lori_footer_icon']";
	
	@FindBy(xpath = ABOUTAS_XPATH)
	WebElement aboutAsPage;
	
	@FindBy(xpath = CONTACTAS_XPATH)
	WebElement contactAsPage;
	
	@FindBy(xpath = FAQ_XPATH)
	WebElement faqPage;
	
	@FindBy(xpath = VACANCIES_XPATH)
	WebElement vacanciesPage;
	
	@FindBy(xpath = BETSHOPS_XPATH)
	WebElement betshopsPage;
	
	@FindBy(xpath = GENERAL_XPATH)
	WebElement generalPage;
	
	@FindBy(xpath = REGULATIONS_XPATH)
	WebElement regulationsPage;
	
	@FindBy(xpath = REGULATIONSCASINO_XPATH)
	WebElement regulationsCasinoPage;
	
	@FindBy(xpath = PRIVACY_XPATH)
	WebElement privacyPage;
	
	@FindBy(xpath = RESPONSIBLE_XPATH)
	WebElement responsiblePage;
	
	@FindBy(xpath = SPORT_XPATH)
	WebElement sportPage;
	
	@FindBy(xpath = BLOT_XPATH)
	WebElement blotPage;
	
	@FindBy(xpath = POKER_XPATH)
	WebElement pokerPage;
	
	@FindBy(xpath = LORI_XPATH)
	WebElement loriPage;
	
	@FindBy(xpath = PYUNIK_XPATH)
	WebElement pyunikPage;
	
	public void navigateToAboutAs() {
		aboutAsPage.click();
	}
	
	public void navigateToContactAs() {
		contactAsPage.click();
	}
	
	public void navigateToFaq() {
		faqPage.click();
	}
	
	public void navigateToVacancies() {
		vacanciesPage.click();
	}
	
	public void navigateToBetshops() {
		betshopsPage.click();
	}
	
	public void navigateToGeneral() {
		generalPage.click();
	}
	
	public void navigateToRegulations() {
		regulationsPage.click();
	}
	
	public void navigateToRegulationsCasino() {
		regulationsCasinoPage.click();
	}
	
	public void navigateToPrivacy() {
		privacyPage.click();
	}
	
	public void navigateToResponsible() {
		responsiblePage.click();
	}
	
	public void navigateToSport() {
		sportPage.click();
	}
	
	public void navigateToBlot() {
		blotPage.click();
	}
	
	public void navigateToPoker() {
		pokerPage.click();
	}
	
	public void navigateToLori() {
		loriPage.click();
	}
	
	public void navigateToPyunik() {
		pyunikPage.click();
	}
	
	public boolean aboutAsPageDisplayed() {
		return aboutAsPage.isDisplayed();
	}
	
	public boolean contactsPageDisplayed() {
		return contactAsPage.isDisplayed();
	}
	
	public boolean faqPageDisplayed() {
		return faqPage.isDisplayed();
	}
	
	public boolean vacanciesPageDisplayed() {
		return vacanciesPage.isDisplayed();
	}
	
	public boolean betshopsPageDisplayed() {
		return betshopsPage.isDisplayed();
	}
	
	public boolean generalPageDisplayed() {
		return generalPage.isDisplayed();
	}
	
	public boolean regulationsPageDisplayed() {
		return regulationsPage.isDisplayed();
	}
	
	public boolean casinoPageDisplayed() {
		return regulationsCasinoPage.isDisplayed();
	}
	
	public boolean privacyPageDisplayed() {
		return privacyPage.isDisplayed();
	}
	
	public boolean responsiblePageDisplayed() {
		return responsiblePage.isDisplayed();
	}
	
	public boolean sportPageDisplayed() {
		return sportPage.isDisplayed();
	}
	
	public boolean blotPageDisplayed() {
		return blotPage.isDisplayed();
	}
	
	public boolean pokerPageDisplayed() {
		return pokerPage.isDisplayed();
	}
	
	public boolean loriPageDisplayed() {
		return loriPage.isDisplayed();
	}
	
	public boolean pyunikPageDisplayed() {
		return pyunikPage.isDisplayed();
	}
	
}
