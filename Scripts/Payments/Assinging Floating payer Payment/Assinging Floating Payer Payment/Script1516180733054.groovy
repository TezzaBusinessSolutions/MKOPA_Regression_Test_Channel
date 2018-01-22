import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Common/Login'), [('Email') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/Menu-Payments'))

WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/SubMenu-CustomerPayments'))

WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/Submenu-Menu-Floating Payments'))

'change in the xpath and put anothe reference number after the test case is complete\r\n'
-WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/Select Floating payment'))

WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/Button-Assign Button'))

WebUI.verifyTextPresent('\'Comment\' should not be empty.', false)

WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/SelectOnPayerReference'))

WebUI.delay(2)

WebUI.setMaskedText(findTestObject('Payments/Assinging Floating Payer Payment/Inputbox-Payer Reference Number'), '10121874')

WebUI.setText(findTestObject('Payments/Assinging Floating Payer Payment/InputBox For Comment'), 'Assigned due to lack of the owner')

WebUI.delay(2)

WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/Dropdown To Select Product account'))

WebUI.delay(2)

WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/Dropdown To Select Product account'))

WebUI.doubleClick(findTestObject('Payments/Assinging Floating Payer Payment/SelectingProductAccount'))

WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/Button-Assign Button'))

