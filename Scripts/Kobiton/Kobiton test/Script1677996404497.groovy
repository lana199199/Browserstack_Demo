import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.driver.MobileDriverType
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.ios.IOSDriver


String kobitonServerUrl = "https://khang.dang:5c42af1c-f2e0-468c-9fb6-eb385a3c7be9@api.kobiton.com/wd/hub";

DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability("sessionName", "Automation test session");
capabilities.setCapability("sessionDescription", "");
capabilities.setCapability("deviceOrientation", "portrait");
capabilities.setCapability("captureScreenshots", true);
capabilities.setCapability("useConfiguration", "");
capabilities.setCapability("autoWebview", true);
capabilities.setCapability("browserName", "safari");
// The given team is used for finding devices and the created session will be visible for all members within the team.
capabilities.setCapability("groupId", 2939); // Group: katalon-team
capabilities.setCapability("deviceGroup", "KOBITON");
// For deviceName, platformVersion Kobiton supports wildcard
// character *, with 3 formats: *text, text* and *text*
// If there is no *, Kobiton will match the exact text provided
capabilities.setCapability("deviceName", "iPhone 12 ");
capabilities.setCapability("platformVersion", "15.0.1");
capabilities.setCapability("platformName", "iOS");

capabilities.setCapability("app", "kobiton-store:567050")

AppiumDriverManager.createMobileDriver(MobileDriverType.IOS_DRIVER, capabilities, new URL(kobitonServerUrl))
//Mobile.startApplication('kobiton-store:567050', false)


