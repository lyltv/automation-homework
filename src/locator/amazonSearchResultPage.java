import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class amazonSearchResultPage {
    WebDriver driver;

    public amazonSearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    // --- Header & Search Bar ---
    By amazonLogo = By.id("nav-logo-sprites");
    By searchCategoryDropdown = By.id("searchDropdownBox");
    By searchInput = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");

    // --- Search Results Info ---
    By searchResultsCount = By.xpath("//span[contains(text(),'results for')]");
    By searchKeywordHighlight = By.cssSelector("span.a-color-state.a-text-bold");

    // --- Sidebar Filters ---
    By womensFootwearCard = By.xpath("//span[text()=\"Women's Footwear\"]/ancestor::a");
    By shoeSize6 = By.xpath("//span[text()='6' and contains(@class, 'a-size-base')]/ancestor::button");
    By genderMenCheckbox = By.xpath("//span[text()='Men' and @dir='auto']/ancestor::li//input[@type='checkbox']");

    // --- Top Collections Section ---
    By shopTopCollectionsHeader = By.xpath("//h2[contains(text(),'Shop top adidas collections')]");
    By bagsBackpacksCard = By.xpath("//span[text()='Bags & Backpacks']/ancestor::a");

    // --- First Product Item ---
    By bestSellerBadge = By.cssSelector("span.a-badge[data-a-badge-type='best-seller']");
    By firstProductTitle = By.xpath("(//div[@data-component-type='s-search-result'])[1]//h2/a/span");
    By productReviewCount = By.xpath("(//div[@data-component-type='s-search-result'])[1]//a[contains(@href, '#customerReviews')]//span");
    By firstProductPrice = By.xpath("(//div[@data-component-type='s-search-result'])[1]//span[@class='a-price-whole']");
    By deliveryDateInfo = By.xpath("(//div[@data-component-type='s-search-result'])[1]//span[contains(@class,'a-text-bold') and contains(text(),'Delivery')]");
}
