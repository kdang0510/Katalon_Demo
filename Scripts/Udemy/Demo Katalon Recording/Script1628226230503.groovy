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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Page_Registration/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Log In/input_Username or Email Address_log'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log In/input_Password_pwd'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Page_Log In/input_Remember Me_wp-submit'))

WebUI.verifyTextPresent('Howdy, ks2041', false)

WebUI.click(findTestObject('Page_Dashboard/div_Comments_wp-menu-image dashicons-before_190109'))

WebUI.click(findTestObject('Page_Profile/tr_First Name'))

WebUI.setText(findTestObject('Page_Profile/input_First Name_first_name'), 'Dang')

WebUI.click(findTestObject('Page_Profile/tr_Last Name'))

WebUI.setText(findTestObject('Page_Profile/input_Last Name_last_name'), 'Khang')

WebUI.click(findTestObject('Page_Profile/input_Log Out Everywhere Else_submit'))

WebUI.closeBrowser()

