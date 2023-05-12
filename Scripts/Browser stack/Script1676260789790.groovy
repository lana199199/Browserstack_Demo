import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager as AppiumDriverManager
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.driver.MobileDriverType as MobileDriverType
import com.kms.katalon.core.constants.StringConstants as StringConstants
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import groovy.json.JsonSlurper as JsonSlurper

//String settingsPath = ""
//
//'Uses default Remote settings'
//
//settingsPath = RunConfiguration.getProjectDir() + '/settings/internal/com.kms.katalon.core.webui.remote.properties'
//
//def remoteContents = new File(settingsPath).text
//
//def json = new JsonSlurper().parseText(remoteContents)
//
// 
//
//'Set desired capabilities'
//
//DesiredCapabilities capabilities = new DesiredCapabilities()
//
//json.REMOTE_WEB_DRIVER.each { key, value ->
//
//if ("$key" != 'remoteWebDriverUrl' && "$key" != "remoteWebDriverType")
//
//{
//
//KeywordUtil.logInfo("Using " + "$key with value is: $value")
//
//capabilities.setCapability("$key", "$value")
//
//}
//
// 
//
//} 
//
//'Create a Katalon-like mobile session'
//
//AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(json.REMOTE_WEB_DRIVER.remoteWebDriverUrl))
Mobile.startApplication('bs://3fb73dc8a155e682d6fea519c452851e504c3c30', true)

Mobile.tap(findTestObject('Object Repository/Browserstack1/android.widget.Button - TEST TOUCH'), 0)

Mobile.tap(findTestObject('Object Repository/Browserstack1/android.widget.Button - COUNT UP'), 0)

Mobile.pressBack()

Mobile.closeApplication()

