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

WebUI.navigateToUrl('https://kiemthutudong.com/blog/')

WebUI.click(findTestObject('Object Repository/Page_Automation Blog  Quality is not an act_8c22d4/a_Create New AccountCreate New Account'))

WebUI.click(findTestObject('Object Repository/Page_Registration Form  Automation Blog  WordPress/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Log In  Automation Blog  WordPress/input_Username or Email Address_log'), 
    'ks2041')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log In  Automation Blog  WordPress/input_Password_pwd'), 'P1vY6fhEy+4=')

WebUI.click(findTestObject('Object Repository/Page_Log In  Automation Blog  WordPress/input_Remember Me_wp-submit'))

WebUI.verifyTextNotPresent('ERROR', false)

