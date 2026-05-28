import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class airbnbHomePage {
    WebDriver driver;

    public airbnbHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Airbnb logo (navbar)
    By airbnbLogo = By.xpath("//img[@alt='Cyber Logo']");

    // Home nav link
    By homeNavLink = By.linkText("Home");

    // About nav link
    By aboutNavLink = By.linkText("About");

    // User/Profile icon (navbar)
    By profileIcon = By.id("user-menu-button");

    // Location input field ("Dia diem")
    By locationInput = By.xpath("//p[text()='Địa điểm']/parent::div");

    // Date range picker
    By dateRangePicker = By.xpath("//p[contains(text(), '2026')]/parent::div");

    // Guest section ("Them khach")
    By addGuestSection = By.xpath("//p[text()='Thêm khách']/parent::div");

    // Guest decrease button (-)
    By guestDecreaseButton = By.cssSelector(".guest-counter button.btn-decrease");

    // Guest increase button (+)
    By guestIncreaseButton = By.cssSelector(".guest-counter button.btn-increase");

    // Filter: "Loai noi o" (Type of accommodation)
    By filterAccommodationType = By.xpath("//button[text()='Loại nơi ở']");

    // Filter: "Gia" (Price)
    By filterPrice = By.xpath("//button[text()='Giá']");

    // "Ho Chi Minh" destination card
    By hoChiMinhCard = By.xpath("//h2[text()='Hồ Chí Minh']/ancestor::a");

    // "Can Tho" destination card
    By canThoCard = By.xpath("//h2[text()='Cần Thơ']/ancestor::a");

    // "Nha Trang" travel time label ("6.5 gio lai xe")
    By nhaTrangTravelTime = By.xpath("//h2[text()='Nha Trang']/following-sibling::p");
}
