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

WebUI.callTestCase(findTestCase('Products/Payment Plans/Cash Payment Plan/Add Cash Payment Plan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/MarkerCheckerLogin'), [('Email') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(
            1, 1), ('Password') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Products/Payment Plans/Cash Payment Plan/Approve Cash Payment Plan'), [('variable') : findTestData(
            'Payments/PaymentsModule').getValue(9, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Login'), [('Email') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Products/Payment Plans/common/mnuProductMenu'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Products/Payment Plans/common/mnu_PaymentPlans'))

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/mnu_AddcashPaymentPlan'))

WebUI.verifyElementVisible(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/grd_addcashpaymentplanpage'))

WebUI.setText(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/txt_cashname'), findTestData('Payments/PaymentsModule').getValue(
        1, 2))

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/txt_displayname(marketing)'), 
    findTestData('Payments/PaymentsModule').getValue(2, 2))

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/cashproducttypestoselect'))

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/btn_addcashproducttype'))

WebUI.setText(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/txt_cashprice'), findTestData(
        'Payments/PaymentsModule').getValue(3, 1))

WebUI.setText(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/txt_approvernotes'), findTestData(
        'Payments/PaymentsModule').getValue(9, 1))

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/btn_cashpaymentplansavebutton'))

String errduplicate = WebUI.getText(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/msg_dupliacatepaymentplanname'))

System.out.println(errduplicate)

WebUI.verifyElementText(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/msg_dupliacatepaymentplanname'), 
    errduplicate)

WebUI.closeBrowser()

