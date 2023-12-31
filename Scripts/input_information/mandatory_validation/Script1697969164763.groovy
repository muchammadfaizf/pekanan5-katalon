
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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseURL)

WebUI.setText(findTestObject('Login/username'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Login/password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Login/btn_login'))

WebUI.click(findTestObject('Beli/addCart_bikeLight'))

WebUI.click(findTestObject('Beli/btn_shoppingCart'))

WebUI.click(findTestObject('Beli/btn_checkOut'))

inputInformationURL = WebUI.getUrl()

WebUI.verifyMatch(inputInformationURL, 'https://www.saucedemo.com/checkout-step-one.html', false)

WebUI.setText(findTestObject('Beli/Information_submission/firstName'), '')

WebUI.setText(findTestObject('Beli/Information_submission/lastName'), '')

WebUI.setText(findTestObject('Beli/Information_submission/zipCode'), '')

WebUI.click(findTestObject('Beli/Information_submission/btn_continue'))
WebUI.verifyElementVisible(findTestObject('Login/error_login'))