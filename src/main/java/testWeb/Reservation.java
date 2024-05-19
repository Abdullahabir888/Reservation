package testWeb;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class Reservation {

    public  static ExtentReports extent;
    public static ExtentSparkReporter sparkReporter;
    public static ExtentTest test;

    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
        // Set the path to your Gecko WebDriver executable
        System.setProperty("Webdriver.gecko.driver", "D:\\resources\\geckodriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new FirefoxDriver();

        // Navigate to Restaurant360 login page
        driver.get("");
        driver.manage().window().maximize();

        // Locate the email/username input field and enter your credential
        WebElement emailField = fluentWait(driver, By.id("login-form_email"));
        emailField.sendKeys("");

        // Locate the password input field and enter your password
        WebElement passwordField = fluentWait(driver, By.id("login-form_password"));
        passwordField.sendKeys("");

        // Click the "Sign In" button
        WebElement signInButton = fluentWait(driver, By.xpath("//*[@id='login-form']/div/div[3]/div/div/div/div/div/button"));
        signInButton.click();

        Thread.sleep(3000);
        //Settings


        WebElement dashboardFull = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/header/div/div[2]/button[1]"));
        dashboardFull.click();
        dashboardFull.sendKeys(Keys.ESCAPE);


        WebElement dashboardDark = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/header/div/div[2]/div[2]/button"));
        dashboardDark.click();
        Thread.sleep(2000);
        dashboardDark.click();


        WebElement dashboardProfile = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/header/div/div[2]/button[2]"));
        dashboardProfile.click();


        WebElement dashboardProfileClick = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div/a[1]/span[2]"));
        dashboardProfileClick.click();


        WebElement dashboardProfileEdit = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div[1]/div/div[2]/button[1]"));
        dashboardProfileEdit.click();


        WebElement dashboardProfileEditName = fluentWait(driver, By.id("profileUpdate_name"));
        dashboardProfileEditName.clear();
        dashboardProfileEditName.sendKeys("ABir");


        WebElement dashboardProfileEditNum = fluentWait(driver, By.id("profileUpdate_phone"));
        dashboardProfileEditNum.sendKeys("");


        WebElement dashboardProfileEditSub = fluentWait(driver, By.xpath("//*[@id=\"profileUpdate\"]/div[2]/div/div/div/div/button"));
        dashboardProfileEditSub.click();


        WebElement dashboardChangePass = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div[1]/div/div[2]/button[2]"));
        dashboardChangePass.click();


        WebElement dashboardChangePassOld = fluentWait(driver, By.id("Updated_old_password"));
        dashboardChangePassOld.sendKeys("123456789");


        WebElement dashboardChangePassNew = fluentWait(driver, By.id("Updated_new_password"));
        dashboardChangePassNew.sendKeys("12345678");


        WebElement dashboardChangePassSub = fluentWait(driver, By.xpath("//*[@id=\"Updated\"]/div[2]/div/div/div/div/button"));
        dashboardChangePassSub.click();


        Thread.sleep(5000);


        WebElement dashboardChangePassClose = fluentWait(driver, By.cssSelector(".anticon-close > svg:nth-child(1)"));
        dashboardChangePassClose.click();


        Thread.sleep(2000);


        WebElement dashboard = fluentWait(driver, By.linkText("Dashboard"));
        dashboard.click();


        WebElement dashboardRoom = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div/div/div/div/div/a[1]/button"));
        dashboardRoom.click();


        Thread.sleep(2000);
        WebElement dashboardBack = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/header/div/div[1]/button[1]"));
        dashboardBack.click();


        WebElement dashboardHall = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div/div/div/div/div/a[2]/button"));
        dashboardHall.click();


        Thread.sleep(2000);
        WebElement dashboardBackS = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/header/div/div[1]/button[1]"));
        dashboardBackS.click();


        Thread.sleep(2000);


        WebElement dashboardHallD = fluentWait(driver, By.cssSelector("div.ant-col:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2) > div:nth-child(1) > span:nth-child(1)"));
        dashboardHallD.click();


        Thread.sleep(2000);


        WebElement dashboardHallM = fluentWait(driver, By.cssSelector("div.ant-col:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2) > div:nth-child(1) > span:nth-child(1)"));
        dashboardHallM.click();


        Thread.sleep(2000);


        WebElement dashboardHallY = fluentWait(driver, By.cssSelector("div.ant-col:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2) > div:nth-child(1) > span:nth-child(1)"));
        dashboardHallY.click();


        Thread.sleep(2000);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 700);");


        WebElement dashboardMAllC = fluentWait(driver, By.cssSelector("div.ant-col:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1)"));
        dashboardMAllC.click();


        JavascriptExecutor jse = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 700);");


        Thread.sleep(2000);


        WebElement dashboardMAllCh = fluentWait(driver, By.cssSelector("div.ant-col:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1)"));
        dashboardMAllCh.click();




        Thread.sleep(2000);


        WebElement dashboardMAllMb = fluentWait(driver, By.cssSelector("div.ant-col:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1)"));
        dashboardMAllMb.click();


        Thread.sleep(2000);


        WebElement dashboardYAllC = fluentWait(driver, By.cssSelector("div.ant-col:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1)"));
        dashboardYAllC.click();


        Thread.sleep(2000);


        WebElement dashboardYAllCh = fluentWait(driver, By.cssSelector("div.ant-col:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1)"));
        dashboardYAllCh.click();


        Thread.sleep(2000);


        WebElement dashboardYAllMb = fluentWait(driver, By.cssSelector("div.ant-col:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1)"));
        dashboardYAllMb.click();


        Thread.sleep(2000);


        WebElement dashboardYAllRc = fluentWait(driver, By.cssSelector("div.ant-col:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1)"));
        dashboardYAllRc.click();


        Thread.sleep(2000);


        WebElement dashboardYAllRch = fluentWait(driver, By.cssSelector("div.ant-col:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1)"));
        dashboardYAllRch.click();


        Thread.sleep(2000);


        WebElement dashboardYAllRMb = fluentWait(driver, By.cssSelector("div.ant-col:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1)"));
        dashboardYAllRMb.click();


        Thread.sleep(3000);


//Room book

        WebElement element = fluentWait(driver, By.xpath("/html/body/div/div/div/div/div/aside/div[1]/ul/li[2]/div"));
        element.click();


        WebElement roomC = fluentWait(driver, By.linkText("Room Create"));
        roomC.click();




        WebElement roomS = fluentWait(driver, By.xpath("//*[@id=\"create room_room_number\"]"));
        roomS.sendKeys("Hl-01");


        WebElement roomT = fluentWait(driver, By.xpath("//*[@id=\"create room_room_type\"]"));
        roomT.click();


        Thread.sleep(2000);
        // Condition to select roomTy or roomTe
        boolean selectRoomTy = false; // Change this to false if you want to select roomTe


        if (selectRoomTy) {
            WebElement roomTy = fluentWait(driver, By.cssSelector("div.ant-select-item:nth-child(1) > div:nth-child(1)]"));
            roomTy.click();
        } else {
            WebElement roomTe = fluentWait(driver, By.cssSelector("div.ant-select-item:nth-child(2) > div:nth-child(1)"));
            roomTe.click();
        }
        WebElement roomSe = fluentWait(driver, By.xpath("//*[@id=\"create room_room_size\"]"));
        roomSe.sendKeys("1542");


        WebElement bedTm = fluentWait(driver, By.xpath("//*[@id=\"create room_bed_type\"]"));
        bedTm.click();


        Thread.sleep(2000);




        String bedType = "bedTe"; // Change this to "bedTe", "bedTy", or "bedTk" as needed


        if (bedType.equals("bedT")) {
            WebElement bedT = fluentWait(driver, By.cssSelector("div.ant-select-item-option-active:nth-child(1)"));
            bedT.click();
        } else if (bedType.equals("bedTe")) {
            WebElement bedTe = fluentWait(driver, By.cssSelector("div.ant-select-dropdown:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)"));
            bedTe.click();
        } else if (bedType.equals("bedTy")) {
            WebElement bedTy = fluentWait(driver, By.cssSelector("div.ant-select-item:nth-child(3)"));
            bedTy.click();
        } else if (bedType.equals("bedTk")) {
            WebElement bedTk = fluentWait(driver, By.cssSelector("div.ant-select-item:nth-child(4)"));
            bedTk.click();
        }


        WebElement price = fluentWait(driver, By.xpath("//*[@id=\"create room_rate_per_night\"]"));
        price.clear();
        price.sendKeys("4000");




        WebElement discount = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/div/main/div[3]/div/div/div/div/form/div[2]/div[2]/div/div/div[2]/div/div/div"));
        discount.click();


        Thread.sleep(2000);
        boolean selectDiscountT = false; // Change this to true if you want to select discountT


        if (selectDiscountT) {
            WebElement discountT = fluentWait(driver, By.cssSelector("div.ant-select-item-option-active:nth-child(1)"));
            if (!discountT.isSelected()) {
                discountT.click();
            }
        } else {
            WebElement discountTe = fluentWait(driver, By.cssSelector("div.ant-select-dropdown:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)"));
            if (!discountTe.isSelected()) {
                discountTe.click();
            }
        }
        WebElement refund = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/div/main/div[3]/div/div/div/div/form/div[2]/div[4]/div/div/div[2]/div/div/div"));
        refund.click();


        Thread.sleep(2000);


        boolean selectRefundT = false; // Change this to true if you want to select discountT


        if (selectRefundT) {
            WebElement refundT = fluentWait(driver, By.xpath("/html/body/div/div/div/div[7]/div/div[2]/div/div/div/div[2]"));
            if (!refundT.isSelected()) {
                refundT.click();
            }
        } else {
            WebElement refundTe = fluentWait(driver, By.xpath("/html/body/div/div/div/div[7]/div/div[2]/div/div/div/div[1]"));
            if (!refundTe.isSelected()) {
                refundTe.click();
            }
        }


        WebElement adult = fluentWait(driver, By.xpath("//*[@id=\"create room_adult\"]"));
        adult.clear();
        adult.sendKeys("1");


        WebElement amines = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/div/main/div[3]/div/div/div/div/form/div[2]/div[8]/div/div/div[2]/div/div/div"));
        amines.click();




        JavascriptExecutor jsss= (JavascriptExecutor) driver;
        jsss.executeScript("window.scrollBy(0, 700);");


        Thread.sleep(2000);
        // Use a single condition to determine which set of elements to select
        if (false) {
            // Select the first set of elements
            WebElement aminesT = fluentWait(driver, By.cssSelector("div.ant-select-dropdown:nth-child(8) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)]"));
            aminesT.click();


            WebElement aminesTe = fluentWait(driver, By.cssSelector("div.ant-select-dropdown:nth-child(8) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)"));
            aminesTe.click();


            WebElement aminesTy = fluentWait(driver, By.cssSelector("div.ant-select-dropdown:nth-child(8) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3)"));
            aminesTy.click();


            WebElement aminesTk = fluentWait(driver, By.cssSelector("div.ant-select-dropdown:nth-child(8) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4)"));
            aminesTk.click();


            WebElement aminesTl = fluentWait(driver, By.cssSelector("div.ant-select-item:nth-child(5)"));
            aminesTl.click();
        } else {
            // Select the second set of elements
            WebElement aminesTe = fluentWait(driver, By.cssSelector("div.ant-select-dropdown:nth-child(8) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)"));
            aminesTe.click();


            WebElement aminesTy = fluentWait(driver, By.cssSelector("div.ant-select-dropdown:nth-child(8) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3)"));
            aminesTy.click();


            WebElement aminesTk = fluentWait(driver, By.cssSelector("div.ant-select-dropdown:nth-child(8) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4)"));
            aminesTk.click();


            WebElement aminesTl = fluentWait(driver, By.cssSelector("div.ant-select-item:nth-child(5)"));
            aminesTl.click();
        }


        WebElement submit = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/div/main/div[3]/div/div/div/div/form/div[3]/div/div/div/div/button"));
        submit.click();


        WebElement roomSear = fluentWait(driver, By.cssSelector(".ant-input"));
        roomSear.sendKeys("01");
        roomSear.clear();
        Thread.sleep(2000);




        WebElement roomBoo = fluentWait(driver, By.cssSelector("li.ant-menu-submenu:nth-child(3) > div:nth-child(1) > span:nth-child(2)"));
        roomBoo.click();


        WebElement bookCre = fluentWait(driver, By.linkText("Create Booking"));
        bookCre.click();
// Check in
        WebElement datePicker = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/div/main/div/div[1]/div/form/div[1]/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div"));
        datePicker.click();


        // Find and select the desired date from the calendar popup
        WebElement dateElement = fluentWait(driver, By.xpath("//div[@class='ant-picker-cell-inner' and text()='16']"));
        dateElement.click();


        // Find and click the time picker element
        WebElement hourElement = fluentWait(driver, By.xpath("//div[@class='ant-picker-time-panel-cell-inner' and text()='12']"));
        hourElement.click();


        // Find and click the minute element in the time picker
        WebElement minuteElement = fluentWait(driver, By.xpath("//div[@class='ant-picker-time-panel-cell-inner' and text()='45']"));
        minuteElement.click();




        WebElement ok = fluentWait(driver, By.cssSelector(".ant-picker-ok > button:nth-child(1)"));
        ok.click();
        // Find and select the desired time from the time picker


        //Check out


        WebElement check = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/div/main/div/div[1]/div/form/div[1]/div/div[1]/div/div/div[2]/div/div/div[2]/div/div/div"));
        check.click();


        WebElement checkOut=  fluentWait(driver, By.cssSelector("td.ant-picker-cell-selected:nth-child(4)"));
        checkOut.click();


        // Find and click the time picker element
        WebElement checkH = fluentWait(driver, By.xpath("/html/body/div/div/div/div[3]/div/div/div/div[1]/div[2]/div[2]/ul[1]/li[13]/div"));
        checkH.click();


        // Find and click the minute element in the time picker
        WebElement checkMin = fluentWait(driver, By.xpath("/html/body/div/div/div/div[3]/div/div/div/div[1]/div[2]/div[2]/ul[2]/li[46]/div"));
        checkMin.click();






        WebElement oke = fluentWait(driver, By.cssSelector("div.ant-picker-dropdown:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > button:nth-child(1)"));
        oke.click();


        WebElement email = fluentWait(driver, By.xpath("//*[@id=\"property Status_email\"]"));
        email.sendKeys("ahad@yopmail.com");


        WebElement name = fluentWait(driver, By.xpath("//*[@id=\"property Status_name\"]"));
        name.sendKeys("Raju");


        WebElement guest = fluentWait(driver, By.xpath("//*[@id=\"property Status_total_occupancy\"]"));
        guest.sendKeys("2");


        WebElement payment = fluentWait(driver, By.xpath("//*[@id=\"property Status_payment_method\"]"));
        payment.click();


        String selectPaymentT = "paymentT";


        if ((selectPaymentT.equals("paymentT"))) {
            WebElement paymentT = fluentWait(driver, By.xpath("/html/body/div/div/div/div[4]/div/div[2]/div/div/div/div[1]/div"));
            paymentT.click();
        } else if ((selectPaymentT.equals("paymentTe"))) { // Add your condition here
            WebElement paymentTe = fluentWait(driver, By.xpath("/html/body/div/div/div/div[4]/div/div[2]/div/div/div/div[2]/div"));
            paymentTe.click();
        } else if(((selectPaymentT.equals("paymentTs")))) {
            WebElement paymentTs = fluentWait(driver, By.xpath("/html/body/div/div/div/div[4]/div/div[2]/div/div/div/div[3]/div"));
            paymentTs.click();
        }


        WebElement roomK = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/div/main/div/div[1]/div/form/div[1]/div/div[2]/div/div[5]/div[2]/div/div/div[2]/div/div/div/div/span[2]"));
        roomK.click();


        boolean selectCheck = false; // Change this to false if you want to select roomTe


        if (selectCheck) {
            WebElement selectTy = fluentWait(driver, By.xpath("/html/body/div/div/div/div[5]/div/div[2]/div/div/div/div[1]"));
            selectTy.click();
        } else {
            WebElement selectTe = fluentWait(driver, By.xpath("/html/body/div/div/div/div[5]/div/div[2]/div/div/div/div[2]/div"));
            selectTe.click();
        }


        WebElement roomSey = fluentWait(driver, By.xpath("//*[@id=\"property Status_booking_rooms_0_room_type\"]"));
        roomSey.click();


        String selectRoomTyp = "roomTyp";


        if ((selectRoomTyp.equals("roomTyp"))) {
            WebElement roomTyp = fluentWait(driver, By.xpath("/html/body/div/div/div/div[6]/div/div[2]/div/div/div/div[1]/div"));
            roomTyp.click();
        } else if ((selectPaymentT.equals("roomTe"))) { // Add your condition here
            WebElement roomTe = fluentWait(driver, By.xpath("/html/body/div/div/div/div[6]/div/div[2]/div/div/div/div[2]/div"));
            roomTe.click();
        } else if(((selectPaymentT.equals("roomTye")))) {
            WebElement roomTye = fluentWait(driver, By.xpath("/html/body/div/div/div/div[6]/div/div[2]/div/div/div/div[3]/div"));
            roomTye.click();
        }
        else if(((selectPaymentT.equals("roomTs")))) {
            WebElement roomTs = fluentWait(driver, By.xpath("/html/body/div/div/div/div[6]/div/div[2]/div/div/div/div[4]/div"));
            roomTs.click();
        }
        else if(((selectPaymentT.equals("roomTn")))) {
            WebElement roomTn = fluentWait(driver, By.xpath("/html/body/div/div/div/div[6]/div/div[2]/div/div/div/div[5]/div"));
            roomTn.click();
        }
        WebElement confirm = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/div/main/div/div[1]/div/form/div[2]/div/div/div/div/div/button"));
        confirm.click();




        Thread.sleep(2000);


        WebElement bookingList = fluentWait(driver, By.linkText("Booking List"));
        bookingList.click();


        WebElement bookingSearch = fluentWait(driver, By.xpath("/html/body/div/div/div/div/div/div/main/div/div[1]/div/div/form/div[1]/div/div/div[2]/div/div/span/span/input"));
        bookingSearch.sendKeys("Abir");
        Thread.sleep(2000);


        bookingSearch.clear();


        WebElement action = fluentWait(driver, By.xpath(("/html/body/div/div/div/div/div/div/main/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[13]/div")));
        action.click();


        WebElement returnBack = fluentWait(driver, By.xpath("/html/body/div/div/div/div/div/div/main/div/div[1]/div/a/button/span[2]"));
        returnBack.click();


        WebElement checkOutS = fluentWait(driver, By.xpath("/html/body/div/div/div/div/div/div/main/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[12]/div/div/form/button"));
        checkOutS.click();




        WebElement bookingIn = fluentWait(driver, By.linkText("Booking Invoice"));
        bookingIn.click();


        WebElement listS = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/div/main/div/div/div[1]/div/div/form/div[1]/div/div[2]/div/div/span/span/input"));
        listS.sendKeys("Abir");
        listS.clear();


        WebElement actionS = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/div/main/div/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[13]/div/div"));
        actionS.click();


        // WebElement print =  fluentWait(driver, By.xpath("/html/body/div/div/div/div/div/div/main/div[2]/button"));
        //print.click();






        WebElement backN = fluentWait(driver, By.xpath("/html/body/div/div/div/div/div/div/main/div[2]/a/div/button"));
        backN.click();


        //Hall create




        WebElement hall = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/aside/div[1]/ul/li[4]/div"));
        hall.click();


        WebElement halls = fluentWait(driver, By.linkText("Hall Create"));
        halls.click();


        WebElement hallE = fluentWait(driver, By.id("create Hall_name"));
        hallE.sendKeys("Gala Hall");


        WebElement hallC = fluentWait(driver, By.id("create Hall_capacity"));
        hallC.sendKeys("500");


        WebElement hallSize = fluentWait(driver, By.id("create Hall_size"));
        hallSize.sendKeys("1545");


        WebElement hallL = fluentWait(driver, By.id("create Hall_location"));
        hallL.sendKeys("Basement");


        WebElement hallP = fluentWait(driver, By.id("create Hall_rate_per_hour"));
        hallP.clear();
        hallP.sendKeys("1400");


        WebElement hallA = fluentWait(driver, By.xpath("//*[@id=\"create Hall\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div"));
        hallA.click();


        // Select the first set of elements
        WebElement hallAmT = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div"));
        hallAmT.click();


        WebElement hallAmTe = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[2]/div"));
        hallAmTe.click();


        WebElement hallAmTy = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[3]/div"));
        hallAmTy.click();


        WebElement hallAmTk = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[4]/div"));
        hallAmTk.click();


        WebElement hallAmTl = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[5]/div"));
        hallAmTl.click();


        WebElement hallAmTn = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[6]/div"));
        hallAmTn.click();


        WebElement hallAmTg = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[7]/div"));
        hallAmTg.click();


        WebElement hallAmTo = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[8]/div"));
        hallAmTo.click();




        WebElement hallSubm = fluentWait(driver, By.xpath("//*[@id=\"create Hall\"]/div[4]/div/div/div/div/button"));
        hallSubm.click();


        if (driver.getPageSource().contains("Book Now")) {
            // If the text is available, find and click on the "View More Details..." link
            WebElement hallV = fluentWait(driver, By.linkText("View More Details..."));
            hallV.click();
        }




//Hall book
        Thread.sleep(2000);


        WebElement hallBoo = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/aside/div[1]/ul/li[5]/div/span"));
        hallBoo.click();
//
        WebElement hallCre = fluentWait(driver, By.linkText("Create Hall Booking"));
        hallCre.click();
//            Check in
        WebElement datePickerN = fluentWait(driver, By.id("Hall Booking_start_time"));
        datePickerN.click();


        // Find and select the desired date from the calendar popup


        // Find and click the time picker element
        WebElement hourElementLO = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/ul/li[1]/a"));
        hourElementLO.click();




        //Check out


        WebElement checkHlj = fluentWait(driver, By.id("Hall Booking_end_time"));
        checkHlj.click();


        WebElement checkHa = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/div[1]/div/ul[1]/li[10]/div"));
        checkHa.click();


        WebElement checkHal = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/div[1]/div/ul[2]/li[1]/div"));
        checkHal.click();


        boolean isAMorPMFound = false;


        if (isAMorPMFound) {
            WebElement formatElement = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/div[1]/div/ul[3]/li[1]/div"));
            formatElement.click();
        } else {
            WebElement formateElement = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/div[1]/div/ul[3]/li[2]/div"));
            formateElement.click();
        }




        WebElement okH = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/div[2]/ul/li[2]/button"));
        okH.click();


        // Find and click the time picker element


        WebElement emailH = fluentWait(driver, By.xpath("//*[@id=\"Hall Booking_name\"]"));
        emailH.sendKeys("Ahad");


        WebElement nameH = fluentWait(driver, By.id("Hall Booking_email"));
        nameH.sendKeys("ahad@yopmail.com");


        WebElement dateH = fluentWait(driver, By.xpath("//*[@id=\"Hall Booking\"]/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div/div"));
        dateH.click();


        WebElement dateP = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div/div[2]/a"));
        dateP.click();


        WebElement dateEvent = fluentWait(driver, By.id("Hall Booking_event_date"));
        dateEvent.click();


        WebElement dateEventEnd = fluentWait(driver, By.xpath("/html/body/div/div/div/div[5]/div/div/div/div[1]/div[2]/table/tbody/tr[5]/td[3]/div"));
        dateEventEnd.click();


        WebElement guestNum = fluentWait(driver, By.id("Hall Booking_total_occupancy"));
        guestNum.sendKeys("400");


        WebElement paymentjgj = fluentWait(driver, By.xpath("//*[@id=\"Hall Booking\"]/div[1]/div/div[2]/div/div[5]/div[1]/div/div/div[2]/div/div/div"));
        paymentjgj.click();


        String selectPaymentH = "paymentHs";


        if ((selectPaymentH.equals("paymentH"))) {
            WebElement paymentH = fluentWait(driver, By.xpath("/html/body/div/div/div/div[6]/div/div[2]/div/div/div/div[1]"));
            paymentH.click();
        } else if ((selectPaymentH.equals("paymentHe"))) { // Add your condition here
            WebElement paymentHe = fluentWait(driver, By.xpath("/html/body/div/div/div/div[6]/div/div[2]/div/div/div/div[2]"));
            paymentHe.click();
        } else if (((selectPaymentH.equals("paymentHs")))) {
            WebElement paymentHs = fluentWait(driver, By.xpath("/html/body/div/div/div/div[6]/div/div[2]/div/div/div/div[3]"));
            paymentHs.click();
        }
//
//        WebElement chckTy = fluentWait(driver, By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div"));
////        chckTy.click();
        Thread.sleep(2000);
        JavascriptExecutor jses = (JavascriptExecutor) driver;
        jses.executeScript("window.scrollBy(0, 700);");


        WebElement hallk = fluentWait(driver, By.id("Hall Booking_booking_halls_0_room_type"));
        hallk.click();


        String HallType = "hallTy"; //


        if (HallType.equals("hallT")) {
            WebElement hallT = fluentWait(driver, By.xpath("//*[@id=\"22\"]"));
            hallT.click();
        } else if (HallType.equals("hallTe")) {
            WebElement hallTe = fluentWait(driver, By.xpath("//*[@id=\"23\"]"));
            hallTe.click();
        } else if (HallType.equals("hallTy")) {
            WebElement hallTy = fluentWait(driver, By.xpath("//*[@id=\"26\"]"));
            hallTy.click();
        } else if (HallType.equals("hallTk")) {
            WebElement hallTk = fluentWait(driver, By.xpath("//*[@id=\"27\"]"));
            hallTk.click();
        }




        WebElement hallAmount = fluentWait(driver, By.id("Hall Booking_paid_amount_full"));
        hallAmount.sendKeys("7,250");


        WebElement hallPayment = fluentWait(driver, By.id("Hall Booking_payment_type"));
        hallPayment.click();


        String selectHallTyp = "hallTs";


        if ((selectHallTyp.equals("hallTyp"))) {
            WebElement hallTyp = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[8]/div/div[2]/div/div/div/div[1]/div"));
            hallTyp.click();
        } else if ((selectHallTyp.equals("hallTe"))) { // Add your condition here
            WebElement hallTe = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[8]/div/div[2]/div/div/div/div[2]/div"));
            hallTe.click();
        } else if (((selectHallTyp.equals("hallTye")))) {
            WebElement hallTye = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[8]/div/div[2]/div/div/div/div[3]/div"));
            hallTye.click();
        } else if (((selectHallTyp.equals("hallTs")))) {
            WebElement hallTs = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[8]/div/div[2]/div/div/div/div[4]/div"));
            hallTs.click();


        }
        WebElement hallConfirm = fluentWait(driver, By.xpath("//*[@id=\"Hall Booking\"]/div[2]/div/div/div/div/div/button"));
        hallConfirm.click();


// Hall booking list..


        WebElement hallBooklis = fluentWait(driver, By.linkText("Hall Booking List"));
        hallBooklis.click();


        WebElement hallBookSearch = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div[1]/div/div/form/div[1]/div/div[2]/div/div/span/span/input"));
        hallBookSearch.sendKeys("Abdullah");
        Thread.sleep(2000);


        hallBookSearch.clear();


        Thread.sleep(2000);


        WebElement hallAction;
        String buttonText = "";
        try {
            hallAction = fluentWait(driver, By.xpath("/html/body/div/div/div/div/div/div/main/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[14]/form/button"));
            buttonText = hallAction.getText();
            if (buttonText.equals("Hall Check In")) {
                hallAction.click();
            }
        } catch (NoSuchElementException e) {
            // Handle exception or ignore it
        }


        try {
            hallAction = fluentWait(driver, By.xpath("//*[@id='root']/div/div/div/div/div/main/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[14]/div/div/form/button"));
            buttonText = hallAction.getText();
            if (buttonText.equals("Make Check Out")) {
                hallAction.click();
            }
        } catch (NoSuchElementException e) {


        }


        WebElement hallView = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[15]/div"));
        hallView.click();


        WebElement hallBac = fluentWait(driver, By.xpath("/html/body/div/div/div/div/div/div/main/div/div[1]/div/a/button"));
        hallBac.click();




//  Hall  Booking invoice
        WebElement hallIn = fluentWait(driver, By.linkText("Hall Booking Invoice"));
        hallIn.click();


        WebElement hallListS = fluentWait(driver, By.xpath("/html/body/div/div/div/div/div/div/main/div/div/div[1]/div/div/form/div[1]/div/div[2]/div/div/span/span/input"));
        hallListS.sendKeys("Abdullah");
        hallListS.clear();


        WebElement hallActionS = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/div/main/div/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[13]/div/div"));
        hallActionS.click();
        ;


        WebElement HallBackN = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div[2]/a/div/button"));
        HallBackN.click();


        // Create invoice


        WebElement invoice = fluentWait(driver, By.xpath("/html/body/div/div/div/div/div/aside/div[1]/ul/li[6]/div"));
        invoice.click();


        WebElement invoiceC = fluentWait(driver, By.linkText("Create Invoice"));
        invoiceC.click();


        WebElement invoiceT = fluentWait(driver, By.xpath(" /html/body/div/div/div/div[1]/div/div/main/div/form/div[2]/div/div/div[1]/div/div/div[2]/div/div/div/div"));
        invoiceT.click();




        String condition = "invoiceS"; // Change this to "bedTe", "bedTy", or "bedTk" as needed


        {
            // Set the condition to true or false based on your requirement


            if (condition.equals("invoiceS")) {
                WebElement invoiceS = fluentWait(driver, By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div"));
                invoiceS.click();
            } else if (condition.equals("invoiceSK")) {
                WebElement invoiceK = fluentWait(driver, By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/div[3]"));
                invoiceK.click();
            } else if (condition.equals("invoiceL")) {
                WebElement invoiceL = fluentWait(driver, By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/div[4]"));
                invoiceL.click();
            }
        }
        WebElement guestNam = driver.findElement(By.id("property_status_user_id"));
        guestNam.click();


        String guestName = "guestNa";
        {
            // Set the condition to true or false based on your requirement


            if (guestName.equals("guestNa")) {
                WebElement guestNa = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[1]/div"));
                guestNa.click();
            } else if (guestName.equals("guestNamK")) {
                WebElement guestNamK = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[2]/div"));
                guestNamK.click();
            } else if (guestName.equals("guestNaL")) {
                WebElement guestNaL = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[3]/div"));
                guestNaL.click();
            } else if (guestName.equals("guestNaA")) {
                WebElement guestNaA = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[4]/div"));
                guestNaA.click();
            } else if (guestName.equals("guestNaG")) {
                WebElement guestNaG = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[5]/div"));
                guestNaG.click();
            }


        }




//        WebElement item =  driver.findElement( By.id("property_status_invoice_item_0_name"));
//        item.sendKeys("Party");
//
//        WebElement itemP =  driver.findElement( By.id("property_status_invoice_item_0_price"));
//        itemP.sendKeys("7200");
//
//        WebElement submite =  driver.findElement( By.xpath("/html/body/div/div/div/div/div/div/main/div/form/div[5]/div/div/div/div/button"));
//        submite.click();


        // Invoice list...
        WebElement involist = driver.findElement(By.linkText("Invoice List"));
        involist.click();


        WebElement invoser = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div[1]/div/div/form/div[1]/div/div[2]/div/div/span/span/input"));
        invoser.sendKeys("Abir");


        WebElement moneyReceip = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/aside/div[1]/ul/li[7]/div"));
        moneyReceip.click();


        WebElement moneyRecei = driver.findElement(By.linkText("Invoice Money Receipt"));
        moneyRecei.click();


        WebElement moneySearch = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div[1]/div/span/span/input"));
        moneySearch.sendKeys("HLBMB-2024-274");
        Thread.sleep(2000);
        moneySearch.clear();


        WebElement moneyView = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/main/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[8]/div/a"));
        moneyView.click();


        WebElement moneyBack = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div[2]/div[1]/a/button"));
        moneyBack.click();


        //Advance return...


        WebElement advanceRet = driver.findElement(By.linkText("Advance Return"));
        advanceRet.click();




        //Guest...
        WebElement guestS = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/aside/div[1]/ul/li[8]/div"));
        guestS.click();


        WebElement guestList = driver.findElement(By.linkText("Guest List"));
        guestList.click();


        //Accounts....


        Thread.sleep(2000);


        WebElement accounts = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/aside/div[1]/ul/li[9]/div"));
        accounts.click();


        WebElement createA = driver.findElement(By.linkText("Create Account"));
        createA.click();


        WebElement accountNa = driver.findElement(By.id("name"));
        accountNa.sendKeys("Abir");


        WebElement accountPay = driver.findElement(By.id("ac_type"));
        accountPay.click();


        String accountType = "mobile";
        {
            // Set the condition to true or false based on your requirement


            if (accountType.equals("mobile")) {
                WebElement mobile = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[4]/div"));
                mobile.click();
            } else if (accountType.equals("bank")) {
                WebElement bank = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div"));
                bank.click();
            } else if (accountType.equals("cash")) {
                WebElement cash = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[2]/div"));
                cash.click();
            } else if (accountType.equals("cheque")) {
                WebElement cheque = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[3]/div"));
                cheque.click();
            }
        }
        WebElement bankField = fluentWait(driver, By.id("bank"));


        String paymentMethod = "Mobile Banking";


        if (paymentMethod.equals("Mobile Banking")) {
            bankField.sendKeys("Bkash");
        } else if (paymentMethod.equals("Bank") || paymentMethod.equals("Cheque")) {
            bankField.sendKeys("EBL");
        } else {
            bankField.clear(); // If none of the conditions match, clear the field
        }




        WebElement branchNames = fluentWait(driver, By.id("branch"));


        String branchName = "Mobile Banking";
        {
            if (branchName.equals("Mobile Banking")) {
                branchNames.sendKeys("Banani");
            } else if (branchName.equals("Bank")) {
                branchNames.sendKeys("Banani");
            } else if (branchName.equals("Cheque")) {
                branchNames.sendKeys("Banani");
            } else {
                branchNames.sendKeys(""); // Hide the element
            }
        }


        WebElement accountNumber = fluentWait(driver, By.id("account_number"));


        String acoountNam = "Mobile Banking";
        {
            switch (acoountNam) {
                case "Mobile Banking":
                    accountNumber.sendKeys("152122262");
                    break;
                case "Bank":
                    accountNumber.sendKeys("526641451");
                    break;
                case "Cheque":
                    accountNumber.sendKeys("01256256");
                    break;
                default:
                    accountNumber.sendKeys(""); // Hide the element
                    break;
            }
        }


        WebElement balance = driver.findElement(By.id("opening_balance"));
        balance.sendKeys("121822601");


//        WebElement submitMK =  driver.findElement( By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[3]/div/div/div/form/button"));
//        submitMK.click();


        //Account
        WebElement accountList = fluentWait(driver, By.linkText("Account List"));
        accountList.click();


        WebElement addAc = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div[1]/div/div[1]/div/a/button"));
        addAc.click();


        WebElement accountBa = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div[2]/a/button"));
        accountBa.click();


        WebElement accountSer = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div[1]/div/div[1]/div/div/span/span/input"));
        accountSer.sendKeys("Abir");
        accountSer.clear();


//        WebElement accountEdit =  fluentWait(driver,By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[11]/div/div/button"));
//        accountEdit.click();


//        WebElement clickSta =  fluentWait(driver, By.xpath("//*[@id=\"upate Account \"]/div[7]/div/div[2]/div/div/div"));
//        clickSta.click();


//        WebElement accountUpdate = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div[2]/div/div/div/div[1]/div"));
//        WebElement accountUp = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div[2]/div/div/div/div[2]/div"));
//         String previouslySelectedOption = "accountUpdate";
//        {
//            if (previouslySelectedOption.equals("accountUpdate")) {
//                accountUp.click();
//            } else if (previouslySelectedOption.equals("accountUp")) {
//                accountUpdate.click();
//            }
//        }
//        WebElement updateSK = fluentWait(driver, By.xpath("//*[@id=\"upate Account \"]/div[9]/div/div/div/div/div/button"));
//        updateSK.click();


        //Expense
        Thread.sleep(2000);


        WebElement expense = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/aside/div[1]/ul/li[10]/div"));
        expense.click();


//        WebElement expenseHead = fluentWait(driver, By.linkText("Expense Head"));
//        expenseHead.click();
//
//        WebElement createHea =fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div/div[1]/button"));
//        createHea.click();
//
//        WebElement createHead =fluentWait(driver, By.xpath("//*[@id=\"name\"]"));
//        createHead.sendKeys("Ahad");
//
//        WebElement headSub =fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/form/div[2]/button"));
//        headSub.click();
//
//        WebElement placeHea =fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div/div[1]/div/span/span/input"));
//        placeHea.sendKeys("Ahad");
//        placeHea.clear();
//
//        WebElement headEdit =fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div/button[1]"));
//        headEdit.click();
//
//        WebElement updateHead =fluentWait(driver, By.id("upate Expense_name"));
//        updateHead.clear();
//        updateHead.sendKeys("Ahad Abir");
//        updateHead.sendKeys(Keys.ENTER);
//
//        WebElement updateHea =fluentWait(driver, By.xpath("/html/body/div/div/div/div[3]/div[2]/div/div[2]/div/form/div[2]/div/div/div/div/button"));
//        updateHea.click();


//        WebElement expenseAdd = fluentWait(driver, By.linkText("Add Expense"));
//        expenseAdd.click();
//
//        WebElement expe = fluentWait(driver, By.id("expense_expense_item_0_name"));
//        expe.click();
//
//        WebElement exph = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div"));
//        exph.click();
//
//        WebElement expM = fluentWait(driver, By.id("expense_expense_item_0_amount"));
//        expM.sendKeys("10000");
//
//        WebElement expName = fluentWait(driver, By.id("expense_name"));
//        expName.sendKeys("Hall");
//
//        WebElement expMethod = fluentWait(driver, By.id("expense_method"));
//        expMethod.click();
//
//
        String expenseMethod = "expMethon";


        if ((expenseMethod.equals("expMetho"))) {
            WebElement expMetho = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[1]/div"));
//            expMetho.click();
        } else if ((expenseMethod.equals("expMethoe"))) { // Add your condition here
            WebElement expMethoe = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[2]/div"));
            expMethoe.click();
        } else if (((expenseMethod.equals("expMethon")))) {
            WebElement expMethon = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[3]/div"));
            expMethon.click();
        } else if (((expenseMethod.equals("expMethol")))) {
            WebElement expMethol = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[4]/div"));
            expMethol.click();
        }
//
//
//        WebElement expenseDate = fluentWait(driver, By.id("expense_expense_date"));
//        expenseDate.click();
//
//        WebElement expenseDa = fluentWait(driver, By.xpath("/html/body/div/div/div/div[4]/div/div/div/div[1]/div[2]/table/tbody/tr[3]/td[3]/div"));
//        expenseDa.click();
//
//        WebElement expenseSubmit = fluentWait(driver, By.xpath("//*[@id=\"expense\"]/div[3]/div/div/div/div/div/button"));
//        expenseSubmit.click();


        Thread.sleep(2000);


        WebElement expenseSearc = fluentWait(driver, By.linkText("Expense History"));
        expenseSearc.click();


        WebElement expenseSrch = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div[1]/div/div/div[2]/span/span/input"));
        expenseSrch.sendKeys("Abir");
        Thread.sleep(3000);
        expenseSrch.clear();
        expenseSrch.sendKeys("Hall equiments");
        Thread.sleep(3000);
        expenseSrch.clear();




        //Payroll
        Thread.sleep(2000);




        WebElement payRoll = fluentWait(driver, By.linkText("Payroll"));
        payRoll.click();




        WebElement payRollSrch = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div[1]/form/div[1]/div/div[2]/div/div/span/span/input"));
        payRollSrch.sendKeys("Abir");
        Thread.sleep(1000);
        Pdf pdf = ((PrintsPage) driver).print(new PrintOptions());
        Files.write(Paths.get("./Reservation 27.pdf"), OutputType.BYTES.convertFromBase64Png (pdf.getContent()));
        payRollSrch.clear();
        payRollSrch.sendKeys("PR-202467");
        Thread.sleep(1000);
        Pdf pdfs = ((PrintsPage) driver).print(new PrintOptions());
        Files.write(Paths.get("./Reservation 28.pdf"), OutputType.BYTES.convertFromBase64Png (pdfs.getContent()));
        payRollSrch.clear();


        WebElement addEmployeeSalary = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div[1]/button"));
        addEmployeeSalary.click();


        WebElement addEmp = fluentWait(driver, By.id("employee_id"));
        addEmp.click();


        WebElement selectEmp = fluentWait(driver, By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div/div/div/div"));
        selectEmp.click();




        WebElement houre = fluentWait(driver, By.id("select_salary_type"));
        houre.click();




        boolean selectSalarySelect = true; // Change this to false if you want to select roomTe




        if (selectSalarySelect) {
            WebElement hour = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div[2]/div/div/div/div[1]"));
            hour.click();
        } else {
            WebElement min = fluentWait(driver, By.xpath("/html/body/div[1]/div/div/div[4]/div/div[2]/div/div/div/div[2]"));
            min.click();
        }


        WebElement workingDay = fluentWait(driver, By.id("attendance_days_daily"));
        workingDay.sendKeys("30");


        WebElement methodExp = fluentWait(driver, By.id("method"));
        methodExp.click();




        String expenseMethodK = "methodAl";


        if ((expenseMethodK.equals("methodA"))) {
            WebElement methodA = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[7]/div/div[2]/div/div/div/div[1]/div"));
            methodA.click();
        } else if ((expenseMethodK.equals("methodAs"))) {
            WebElement methodAs = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[7]/div/div[2]/div/div/div/div[2]/div"));
            methodAs.click();
        } else if (((expenseMethodK.equals("methodAl")))) {
            WebElement methodAL = fluentWait(driver, By.xpath("/html/body/div[1]/div/div/div[5]/div/div[2]/div/div/div/div[3]/div"));
            methodAL.click();
        } else if (((expenseMethodK.equals("methodAn")))) {
            WebElement methodAn = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[7]/div/div[2]/div/div/div/div[4]/div"));
            methodAn.click();
        }
        WebElement accountNg = fluentWait(driver, By.id("ac_tr_ac_id"));
        accountNg.click();




        WebElement accountNs = fluentWait(driver, By.xpath("/html/body/div/div/div/div[6]/div/div[2]/div/div/div/div/div"));
        accountNs.click();




        WebElement salaryDate = fluentWait(driver, By.id("salary_date"));
        salaryDate.click();




        WebElement salaryDat = fluentWait(driver, By.xpath("/html/body/div[1]/div/div/div[7]/div/div/div/div[1]/div[2]/table/tbody/tr[4]/td[3]/div"));
        salaryDat.click();


        Pdf pdfl = ((PrintsPage) driver).print(new PrintOptions());
        Files.write(Paths.get("./Reservation 29.pdf"), OutputType.BYTES.convertFromBase64Png (pdfl.getContent()));




        JavascriptExecutor jsk = (JavascriptExecutor) driver;
        jsk.executeScript("window.scrollBy(0, 700);");


        WebElement sumbitSalary = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/form/div[9]/button"));
        sumbitSalary.click();
    //Report


       Thread.sleep(2000);


    WebElement report = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/aside/div[1]/ul/li[12]/div"));
       report.click();


    //Room  Report


       Thread.sleep(2000);


    WebElement reportRoom = fluentWait(driver, By.linkText("Room Report"));
       reportRoom.click();


       Thread.sleep(2000);


    WebElement reportRoomDateStartIn = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div[1]/div/div/form/div/div/div[2]/div/div/div/div[1]"));
       reportRoomDateStartIn.click();


    WebElement reportRoomDateStartBu = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div[1]/button[2]"));
       reportRoomDateStartBu.click();


    WebElement reportRoomDateStart = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/table/tbody/tr[3]/td[2]"));
       reportRoomDateStart.click();


    WebElement reportRoomDateStartTime = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[2]/div[2]/ul[1]/li[13]/div"));
       reportRoomDateStartTime.click();


    WebElement reportRoomDateStartTimeOk = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div[2]/ul/li/button"));
       reportRoomDateStartTimeOk.click();


    WebElement reportRoomDateStartInp = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div[1]/div/div/form/div/div/div[2]/div/div/div/div[3]"));
       reportRoomDateStartInp.click();


    WebElement reportRoomDateEnd = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/table/tbody/tr[5]/td[6]/div"));
       reportRoomDateEnd.click();




    WebElement reportRoomDateStartTimeOke = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div[2]/ul/li/button"));
       reportRoomDateStartTimeOke.click();


//
//        Thread.sleep(5000);
//        WebElement reportRoomPrint = fluentWait(driver,By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div[1]/div/div/button"));
//        reportRoomPrint.click();
//        Thread.sleep(5000);
//        reportRoomPrint.sendKeys(Keys.TAB);
//        reportRoomPrint.sendKeys(Keys.ENTER);




    //Room Booking Report
       Thread.sleep(2000);


    WebElement reportRoomBoo = fluentWait(driver, By.linkText("Room Booking Report"));
       reportRoomBoo.click();


    WebElement reportRoomBooDateStartIn = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div[1]/div/div/form/div[1]/div/div[2]/div/div/div/div[1]"));
       reportRoomBooDateStartIn.click();


    WebElement reportRoomBooDateStartBu = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/button[2]"));
       reportRoomBooDateStartBu.click();


    WebElement reportRoomBooDateStart = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/table/tbody/tr[2]/td[2]"));
       reportRoomBooDateStart.click();


    WebElement reportRoomBooDateEnd = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[7]"));
       reportRoomBooDateEnd.click();


    WebElement reportRoomBooFilter = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div[1]/div/div/form/div[2]/div/div[2]/div/div/div/div/span[2]"));
       reportRoomBooFilter.click();


    WebElement reportRoomBooFilterSelect = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[4]/div"));
       reportRoomBooFilterSelect.click();


    WebElement reportRoomBooStatus = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div[1]/div/div/form/div[3]/div/div[2]/div/div/div/div/span[2]"));
       reportRoomBooStatus.click();


    WebElement reportRoomBooStatusSelect = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div[2]/div/div/div/div[2]/div"));
       reportRoomBooStatusSelect.click();


//        Thread.sleep(5000);
//        WebElement reportRoomBooPrint = fluentWait(driver,By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div[1]/div/div/button"));
//        reportRoomBooPrint.click();
//        Thread.sleep(5000);


    // Hall Booking report
       Thread.sleep(2000);


    WebElement reportHallBoo = fluentWait(driver, By.linkText("Hall Booking Report"));
       reportHallBoo.click();


       Thread.sleep(2000);


    WebElement reportHallBooFilter = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/div/main/div[1]/div/div/form/div[1]/div/div[2]/div/div/div"));
       reportHallBooFilter.click();


    WebElement reportHallBooFilterSelect = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[2]/div"));
       reportHallBooFilterSelect.click();


    WebElement reportHallBooDateStartIn = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div/form/div[2]/div/div[2]/div/div/div/div[1]"));
       reportHallBooDateStartIn.click();


    WebElement reportHallBooDateStartBu = fluentWait(driver, By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/button[2]"));
       reportHallBooDateStartBu.click();


    WebElement reportHallBooDateStart = fluentWait(driver, By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[2]/table/tbody/tr[3]/td[2]/div"));
       reportHallBooDateStart.click();


    WebElement reportHallBooDateEnd = fluentWait(driver, By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[6]/div"));
       reportHallBooDateEnd.click();


    //Account Report
       Thread.sleep(2000);


    WebElement reportAccount = fluentWait(driver, By.linkText("Account Report"));
       reportAccount.click();


    WebElement reportAccountFilter = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/div/main/div[2]/div/div/form/div[1]/div/div[2]/div/div/div"));
       reportAccountFilter.click();


    WebElement reportAccountFilterSelect = fluentWait(driver, By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div"));
       reportAccountFilterSelect.click();


    WebElement reportAccountDateStartIn = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[2]/div/div/form/div[2]/div/div[2]/div/div/div/div[1]"));
       reportAccountDateStartIn.click();


    WebElement reportAccountDateStartBu = fluentWait(driver, By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/button[2]"));
       reportAccountDateStartBu.click();


    WebElement reportAccountDateStart = fluentWait(driver, By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[2]/table/tbody/tr[3]/td[2]/div"));
       reportAccountDateStart.click();


    WebElement reportAccountDateEnd = fluentWait(driver, By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[6]/div"));
       reportAccountDateEnd.click();


    //Guest Ledger Report
       Thread.sleep(2000);


    WebElement reportGuest = fluentWait(driver, By.linkText("Guest Ledger Report"));
       reportGuest.click();


    WebElement reportGuestDateStartIn = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div[1]/div/div/form/div[1]/div/div[2]/div/div"));
       reportGuestDateStartIn.click();


    WebElement reportGuestDateStartBu = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/button[2]"));
       reportGuestDateStartBu.click();


    WebElement reportGuestDateStart = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/table/tbody/tr[3]/td[2]/div"));
       reportGuestDateStart.click();


    WebElement reportGuestDateEnd = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[6]/div"));
       reportGuestDateEnd.click();


    WebElement reportGuestFilter = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div[1]/div/div/form/div[2]/div/div[2]/div/div/div"));
       reportGuestFilter.click();


    WebElement reportGuestFilterSelect = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[2]/div"));
       reportGuestFilterSelect.click();


       Thread.sleep(1000);
    WebElement reportGuestStatus = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div[1]/div/div/form/div[3]/div/div[2]/div/div/div"));
       reportGuestStatus.click();


       Thread.sleep(1000);
    WebElement reportGuestStatusSelect = driver.findElement(By.xpath("//div[@class='ant-select-item-option-content' and text()='Credit']"));
       reportGuestStatusSelect.click();


//Expense Report
       Thread.sleep(2000);


    WebElement reportExpense = fluentWait(driver, By.linkText("Expense Report"));
       reportExpense.click();


    WebElement reportExpenseFilter = driver.findElement(By.xpath("//span[@class='ant-select-selection-item' and @title='All']"));
       reportExpenseFilter.click();


    WebElement reportExpenseFilterSelect = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[2]/div"));
       reportExpenseFilterSelect.click();


    WebElement reportExpenseDateStartIn = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div/form/div[2]/div/div[2]/div/div/div/div[1]"));
       reportExpenseDateStartIn.click();


    WebElement reportExpenseDateStartBu = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/button[1]"));
       reportExpenseDateStartBu.click();


    WebElement reportExpenseDateStart = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[2]/table/tbody/tr[3]/td[2]/div"));
       reportExpenseDateStart.click();


    WebElement reportExpenseDateEnd = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[6]/div"));
       reportExpenseDateEnd.click();


       Thread.sleep(2000);


    WebElement menuItem = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/aside/div[1]/ul"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuItem);


       Thread.sleep(2000);


    WebElement reportSalary = fluentWait(driver, By.linkText("Salary Report"));
       reportSalary.click();


    WebElement reportSalaryFilter = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div[1]/div/div[1]/div/div/form/div[1]/div/div[2]/div/div/input"));
       reportSalaryFilter.sendKeys("Abdullah");


    WebElement reportSalaryDateStartIn = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div[1]/div/div[1]/div/div/form/div[2]/div/div[2]/div/div/div/div[1]"));
       reportSalaryDateStartIn.click();


    WebElement reportSalaryStartBu = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/button[2]"));
       reportSalaryStartBu.click();


    WebElement reportSalaryDateStart = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/table/tbody/tr[3]/td[2]/div"));
       reportSalaryDateStart.click();


    WebElement reportSalaryDateEnd = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/table/tbody/tr[5]/td[6]/div"));
       reportSalaryDateEnd.click();


    //Administration
       Thread.sleep(2000);


    WebElement administration = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/aside/div[1]/ul/li[13]/div"));
       administration.click();


//Admin
       Thread.sleep(2000);


    WebElement admin = fluentWait(driver, By.cssSelector("li.ant-menu-submenu:nth-child(1) > div:nth-child(1) > span:nth-child(2)"));
       admin.click();


    WebElement adminList = fluentWait(driver, By.linkText("Admin List"));
       adminList.click();


    WebElement adminCreate = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div[2]/button"));
       adminCreate.click();


    WebElement adminName = fluentWait(driver, By.id("name"));
       adminName.sendKeys("RajU");


    WebElement adminEmail = fluentWait(driver, By.id("email"));
       adminEmail.sendKeys("R@mail.com");


    WebElement adminPhone = fluentWait(driver, By.id("phone"));
       adminPhone.sendKeys("01624514235");


    WebElement adminRole = fluentWait(driver, By.id("role"));
       adminRole.click();


    boolean adminRoleT = true; // Change this to true if you want to select discountT


       if (adminRoleT) {
        WebElement RoleT = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[1]/div"));
        if (!RoleT.isSelected()) {
            RoleT.click();
        }
    } else {
        WebElement RoleTe = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div/div[2]/div"));
        if (!RoleTe.isSelected()) {
            RoleTe.click();
        }
    }


    WebElement adminPass = fluentWait(driver, By.id("password"));
       adminPass.sendKeys("1234567");
       adminPass.sendKeys(Keys.ENTER);

       Thread.sleep(3000);

    WebElement role = fluentWait(driver, By.xpath("/html/body/div/div/div/div[1]/div/aside/div[1]/ul/li[13]/ul/li[2]/div/span"));
       role.click();


    WebElement roleList = fluentWait(driver, By.linkText("Role List"));
       roleList.click();

    WebElement roleCreate = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div[2]/button"));
       roleCreate.click();

    WebElement roleName = fluentWait(driver, By.id("role_name"));
       roleName.sendKeys("Admin");

    WebElement roleCheckBox1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[1]/span[3]/span"));
       roleCheckBox1.click();

    WebElement roleCheckBox2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[2]/span[3]/span"));
       roleCheckBox2.click();

    WebElement roleCheckBox3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[3]/span[3]/span"));
       roleCheckBox3.click();

    WebElement roleCheckBox4 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[4]/span[3]/span"));
       roleCheckBox4.click();

    WebElement roleCheckBox5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[5]/span[3]/span"));
       roleCheckBox5.click();

    WebElement roleCheckBox6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[6]/span[3]/span"));
       roleCheckBox6.click();

    WebElement roleCheckBox7 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[7]/span[3]/span"));
       roleCheckBox7.click();

    WebElement roleCheckBox8 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[8]/span[3]/span"));
       roleCheckBox8.click();

    WebElement roleCheckBox9 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[9]/span[3]/span"));
       roleCheckBox9.click();

    WebElement roleCheckBox10 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[10]/span[3]/span"));
       roleCheckBox10.click();

    WebElement roleCheckBox11 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[11]/span[3]/span"));
       roleCheckBox11.click();

    WebElement roleCheckBox12 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[12]/span[3]/span"));
       roleCheckBox12.click();

    WebElement roleCheckBox13 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div[13]/span[3]/span"));
       roleCheckBox13.click();

    WebElement roleSubmit = fluentWait(driver, By.xpath("/html/body/div/div/div/div[3]/div[3]/div/div/div[2]/form/div[3]/div/div/div/div/button"));
       roleSubmit.click();

       Thread.sleep(2000);

    //Settings

    WebElement setting = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/aside/div[1]/ul/li[14]/div"));
       setting.click();

    //Hotel details Setting
    WebElement settingHotel = fluentWait(driver, By.linkText("Hotel Details"));
       settingHotel.click();

    WebElement hotelDetailsUp = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div[1]/button"));
       hotelDetailsUp.click();

    WebElement hotelDetailsUpl = fluentWait(driver, By.id("country"));
       hotelDetailsUpl.clear();
       hotelDetailsUpl.sendKeys("Bangladesh");
       hotelDetailsUpl.sendKeys(Keys.ENTER);

       Thread.sleep(2000);

    //Room settings

    WebElement settingRoom = fluentWait(driver, By.linkText("Room Type"));
       settingRoom.click();


    WebElement settingRoomAd = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/button"));
       settingRoomAd.click();

    WebElement settingRoomAdd = fluentWait(driver, By.id("room_type"));
       settingRoomAdd.sendKeys("Ac/Non");
       settingRoomAdd.sendKeys(Keys.ENTER);


    WebElement settingRoomAddS = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/form/div[2]/button"));
       settingRoomAddS.click();

       Thread.sleep(2000);
//        WebElement settingRoomSearch = fluentWait(driver, By.xpath("room_type"));
//        settingRoomSearch.sendKeys("Ac");
//        settingRoomSearch.sendKeys(Keys.ENTER);
       Thread.sleep(7000);


//        settingRoomSearch.clear()

       Thread.sleep(2000);

    //Bed Type

    WebElement settingBe = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/aside/div[1]/ul/li[14]/div"));
       settingBe.click();

    WebElement settingBed = fluentWait(driver, By.linkText("Bed Type"));
       settingBed.click();

    WebElement settingBedAd = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/button"));
       settingBedAd.click();

    WebElement settingBedAdd = fluentWait(driver, By.id("bed_type"));
       settingBedAdd.sendKeys("Double");
       settingBedAdd.sendKeys(Keys.ENTER);

//        WebElement settingBedAddS = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/form/div[2]/button"));
//        settingBedAddS.click();

       Thread.sleep(2000);

    WebElement settingBedSearch = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div/div[1]/div/span/span/input"));
       settingBedSearch.sendKeys("Double");
       settingBedSearch.sendKeys(Keys.ENTER);
       Thread.sleep(7000);
       settingBedSearch.clear();

       Thread.sleep(2000);

//Room Amenities

    WebElement settingRoomAmi = fluentWait(driver, By.linkText("Room Amenities"));
       settingRoomAmi.click();


    WebElement settingRoomAmiAd = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/button"));
       settingRoomAmiAd.click();


    WebElement settingRoomAmiAdd = fluentWait(driver, By.id("room_amenities"));
       settingRoomAmiAdd.sendKeys("ShowerGEl");
       settingRoomAmiAdd.sendKeys(Keys.ENTER);


//        WebElement settingRoomAmiAddS = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/form/div[2]/button"));
//        settingRoomAmiAddS.click();


       Thread.sleep(2000);

    WebElement settingRoomAmiSearch = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div/div[1]/div/span/span/input"));
       settingRoomAmiSearch.sendKeys("ShowerGEl");
       settingRoomAmiSearch.sendKeys(Keys.ENTER);
       Thread.sleep(7000);
       settingRoomAmiSearch.clear();


       Thread.sleep(2000);


    //Hall Amenities


    WebElement menuItems = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/aside/div[1]/ul"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuItems);


       Thread.sleep(2000);


    WebElement settingHallAmi = fluentWait(driver, By.linkText("Hall Amenities"));
       settingHallAmi.click();


    WebElement settingHallAmiAd = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/button"));
       settingHallAmiAd.click();


    WebElement settingHallAmiAdd = fluentWait(driver, By.id("name"));
       settingHallAmiAdd.sendKeys("Scraf");
       settingHallAmiAdd.sendKeys(Keys.ENTER);


//        WebElement settingHallAmiAddS = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/form/div[2]/button"));
//        settingHallAmiAddS.click();




       Thread.sleep(2000);




    WebElement settingHallAmiSearch = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div/div[1]/div/span/span/input"));
       settingHallAmiSearch.sendKeys("Scraf");
       settingHallAmiSearch.sendKeys(Keys.ENTER);
       Thread.sleep(7000);
       settingHallAmiSearch.clear();


       Thread.sleep(2000);


    //Department




       Thread.sleep(2000);


    WebElement menuItemSF = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/aside/div[1]/ul"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuItemSF);


    WebElement Department = fluentWait(driver, By.linkText("Department"));
       Department.click();


    WebElement DepartmentAd = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/button"));
       DepartmentAd.click();


    WebElement DepartmentAdd = fluentWait(driver, By.id("name"));
       DepartmentAdd.sendKeys("kitchen");
       DepartmentAdd.sendKeys(Keys.ENTER);


    WebElement DepartmentEdit = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/form/div[2]/button"));
       DepartmentEdit.click();




       Thread.sleep(2000);


    WebElement DepartmentSearch = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div/div[1]/div/span/span/input"));
       DepartmentSearch.sendKeys("kitchen");
       DepartmentSearch.sendKeys(Keys.ENTER);
       Thread.sleep(7000);
       DepartmentSearch.clear();


    WebElement menuItemSK = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/aside/div[1]/ul"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(0,300);", menuItemSK);


       Thread.sleep(2000);


    //Designation




    WebElement Designation = fluentWait(driver, By.linkText("Designation"));
       Designation.click();


    WebElement DesignationAd = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/button"));
       DesignationAd.click();


    WebElement DesignationAdd = fluentWait(driver, By.cssSelector("#name"));
       DesignationAdd.sendKeys("Chef");
       DesignationAdd.sendKeys(Keys.ENTER);


//        WebElement DesignationEdit = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/form/div[2]/button"));
//        DesignationEdit.click();




       Thread.sleep(2000);


    WebElement DesignationSearch = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div/div[1]/div/span/span/input"));
       DesignationSearch.sendKeys("Chef");
       DesignationSearch.sendKeys(Keys.ENTER);
       Thread.sleep(7000);
       DesignationSearch.clear();




       Thread.sleep(2000);


    //Payroll Month




       Thread.sleep(2000);


    WebElement Payroll = fluentWait(driver, By.linkText("Payroll Month"));
       Payroll.click();


    WebElement PayrollAd = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/button"));
       PayrollAd.click();


    WebElement PayrollAdd = fluentWait(driver, By.id("name"));
       PayrollAdd.click();


    String PayrollAddD = "may";
    {
        if (PayrollAddD.equals("january")) {
            WebElement january = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div[1]/div/div/div[1]/div"));
            january.click();
        } else if (PayrollAddD.equals("february")) {
            WebElement february = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div[1]/div/div/div[2]/div"));
            february.click();
        } else if (PayrollAddD.equals("march")) {
            WebElement march = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div[1]/div/div/div[3]/div"));
            march.click();
        } else if (PayrollAddD.equals("april")) {
            WebElement april = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div[1]/div/div/div[4]/div"));
            april.click();
        } else if (PayrollAddD.equals("may")) {
            WebElement may = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div[1]/div/div/div[5]/div"));
            may.click();
        } else if (PayrollAddD.equals("June")) {
            WebElement June = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div[1]/div/div/div[6]/div"));
            June.click();
        } else if (PayrollAddD.equals("july")) {
            WebElement july = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div[1]/div/div/div[7]/div"));
            july.click();
        } else if (PayrollAddD.equals("august")) {
            WebElement august = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div[1]/div/div/div[8]/div"));
            august.click();
        } else if (PayrollAddD.equals("september")) {
            WebElement september = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div[1]/div/div/div[9]/div"));
            september.click();
        } else if (PayrollAddD.equals("october")) {
            WebElement october = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div[1]/div/div/div[10]/div"));
            october.click();
        } else if (PayrollAddD.equals("november")) {
            WebElement november = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div[1]/div/div/div[11]/div"));
            november.click();
        } else if (PayrollAddD.equals("december")) {
            WebElement december = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div[1]/div/div/div[12]/div"));
            december.click();
        }
    }

    boolean PayrollAddWor = false; // Change this to false if you want to select roomTe

       if (PayrollAddWor) {
        WebElement PayrollAddWork = fluentWait(driver, By.id("total_workings_days"));
        PayrollAddWork.sendKeys("22");
    } else {
        WebElement PayrollAddWorks = fluentWait(driver, By.id("total_workings_days"));
        PayrollAddWorks.sendKeys("23");
    }

    WebElement PayrollAddWorkMin = fluentWait(driver, By.id("hour_per_day"));
       PayrollAddWorkMin.sendKeys("8");
       PayrollAddWorkMin.sendKeys(Keys.ENTER);


//        WebElement PayrollEdit = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/form/div[2]/button"));
//        PayrollEdit.click();

       Thread.sleep(2000);

    WebElement PayrollSearch = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/main/div/div/div[1]/div/span/span/input"));
       PayrollSearch.sendKeys("May");
       PayrollSearch.sendKeys(Keys.ENTER);
       Thread.sleep(7000);
       PayrollSearch.clear();
       Thread.sleep(2000);

//Employee
       Thread.sleep(2000);

    WebElement Employee = fluentWait(driver, By.linkText("Employee"));
       Employee.click();

    WebElement EmployeeAd = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/button"));
       EmployeeAd.click();

    WebElement EmployeeNameAm = fluentWait(driver, By.id("name"));
       EmployeeNameAm.sendKeys("AHAD");

    WebElement EmployeeNo = fluentWait(driver, By.id("mobile_no"));
       EmployeeNo.sendKeys("01252151562");

    WebElement EmployeeBDate = fluentWait(driver, By.id("birth_date"));
       EmployeeBDate.click();

    WebElement EmployeeBDat = fluentWait(driver, By.cssSelector("#root > div > div > div.ant-picker-dropdown.css-wto8vz.ant-picker-dropdown-placement-bottomLeft > div > div > div > div.ant-picker-date-panel > div.ant-picker-body > table > tbody > tr:nth-child(3) > td:nth-child(6) > div"));
       EmployeeBDat.click();

    WebElement EmployeeApDat = fluentWait(driver, By.id("appointment_date"));
       EmployeeApDat.click();

       Thread.sleep(2000);

    WebElement EmployeeApDate = fluentWait(driver, By.cssSelector("div.ant-picker-dropdown:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4)"));
       EmployeeApDate.click();

    WebElement EmployeeJoDate = fluentWait(driver, By.id("joining_date"));
       EmployeeJoDate.click();

       Thread.sleep(2000);

    WebElement EmployeeJoDat = fluentWait(driver, By.xpath("/html/body/div/div/div/div[5]/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[4]/div"));
       EmployeeJoDat.click();


    WebElement EmployeeDepartmentS = fluentWait(driver, By.xpath(" //*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/form/div[3]/div[1]/div/div/div[2]/div/div/div"));
       EmployeeDepartmentS.click();

    String EmployeeDepartment = "EmployeeDepartments";


       if ((EmployeeDepartment.equals("EmployeeDepartments"))) {
        WebElement EmployeeDepartments = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[6]/div/div[2]/div/div/div/div[1]/div"));
        EmployeeDepartments.click();
    } else if (EmployeeDepartment.equals("EmployeeDepartmentJ")) {
        WebElement EmployeeDepartmentJ = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div[2]/div/div/div/div[2]/div"));
        EmployeeDepartmentJ.click();
    } else if (EmployeeDepartment.equals("EmployeeDepartmentK")) {
        WebElement EmployeeDepartmentK = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div[2]/div/div/div/div[3]/div"));
        EmployeeDepartmentK.click();
    }

    WebElement EmployeeDgi = fluentWait(driver, By.id("designation_id"));
       EmployeeDgi.click();

    String EmployeeDesignation = "EmployeeDepartments";


       if ((EmployeeDesignation.equals("EmployeeDepartments"))) {
        WebElement EmployeeDesignations = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[7]/div/div[2]/div/div/div/div[1]/div"));
        EmployeeDesignations.click();
    } else if (EmployeeDesignation.equals("EmployeeDepartmentJ")) {
        WebElement EmployeeDesignationJ = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[7]/div/div[2]/div/div/div/div[2]/div"));
        EmployeeDesignationJ.click();
    } else if (EmployeeDesignation.equals("EmployeeDepartmentK")) {
        WebElement EmployeeDesignationV = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div[7]/div/div[2]/div/div/div/div[3]/div"));
        EmployeeDesignationV.click();
    }


    WebElement EmployeeDesignatinSa = fluentWait(driver, By.id("salary"));
       EmployeeDesignatinSa.sendKeys("12000");
       EmployeeDesignatinSa.sendKeys(Keys.ENTER);

    WebElement EmployeeDetailsViewSSS = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[8]/div/a/button"));
       EmployeeDetailsViewSSS.click();


       Thread.sleep(2000);


    WebElement EmployeeSearch = fluentWait(driver, By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div[1]/div/span/span/input"));
       EmployeeSearch.sendKeys("Abir");
       EmployeeSearch.sendKeys(Keys.ENTER);
       Thread.sleep(7000);
       EmployeeSearch.clear();

        Pdf pdfS = ((PrintsPage) driver).print(new PrintOptions());
        Files.write(Paths.get("./Reservation.pdf"), OutputType.BYTES.convertFromBase64Png (pdfS.getContent()));

}

//    public void initializeReport() {
//        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"Reports/ExtentReport.html");
//        sparkReporter.config().setDocumentTitle("Automation Report");
//        sparkReporter.config().setReportName("Automation Test Execution Report");
//        sparkReporter.config().setTheme(Theme.STANDARD);
//        sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
//        extent = new ExtentReports();
//        extent.attachReporter(sparkReporter);
//    }


    // Fluent Wait function
    public static WebElement fluentWait(WebDriver driver, By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);

        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
