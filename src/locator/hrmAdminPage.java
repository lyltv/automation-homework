import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class hrmAdminPage {
    WebDriver driver;

    public hrmAdminPage(WebDriver driver) {
        this.driver = driver;
    }

    // --- Menus ---
    By adminMenuItem = By.xpath("//span[text()='Admin']/parent::a");
    By pimMenuItem = By.xpath("//span[text()='PIM']/parent::a");
    By leaveMenuItem = By.xpath("//span[text()='Leave']/parent::a");
    By userManagementMenu = By.xpath("//span[contains(normalize-space(), 'User Management')]");

    // --- Search Form ---
    By usernameInput = By.xpath("//label[text()='Username']/ancestor::div[contains(@class,'oxd-input-group')]//input");
    By userRoleDropdown = By.xpath("//label[text()='User Role']/ancestor::div[contains(@class,'oxd-input-group')]//div[contains(@class,'oxd-select-text')]");
    By userRoleClearButton = By.xpath("//label[text()='User Role']/ancestor::div[contains(@class,'oxd-input-group')]//i[contains(@class,'oxd-select-text--clear')]");
    By userRoleAdminOption = By.xpath("//div[@role='listbox']//span[text()='Admin']");
    By userRoleEssOption = By.xpath("//div[@role='listbox']//span[text()='ESS']");
    By employeeNameInput = By.xpath("//label[text()='Employee Name']/ancestor::div[contains(@class,'oxd-input-group')]//input");
    By statusDropdown = By.xpath("//label[text()='Status']/ancestor::div[contains(@class,'oxd-input-group')]//div[contains(@class,'oxd-select-text')]");

    // --- Buttons ---
    By resetButton = By.xpath("//button[normalize-space()='Reset']");
    By searchButton = By.xpath("//button[normalize-space()='Search']");
    By addButton = By.cssSelector("button.oxd-button--secondary");

    // --- Data Table (Fixed based on actual DOM) ---
    By tableHeaderUsername = By.xpath("//div[contains(@class,'oxd-table-card-cell')]//div[@class='header' and text()='Username']");
    By tableHeaderUserRole = By.xpath("//div[contains(@class,'oxd-table-card-cell')]//div[@class='header' and text()='User Role']");
    
    // Tương tác với dòng dữ liệu đầu tiên hiển thị trong bảng
    By firstRowUsername = By.xpath("(//div[contains(@class,'oxd-table-card')])[1]//div[text()='Username']/following-sibling::div");
    By firstRowUserRole = By.xpath("(//div[contains(@class,'oxd-table-card')])[1]//div[text()='User Role']/following-sibling::div");
    By editActionButton = By.xpath("(//div[contains(@class,'oxd-table-card')])[1]//button[.//i[contains(@class,'bi-pencil-fill')]]");
    By deleteActionButton = By.xpath("(//div[contains(@class,'oxd-table-card')])[1]//button[.//i[contains(@class,'bi-trash')]]");
}
