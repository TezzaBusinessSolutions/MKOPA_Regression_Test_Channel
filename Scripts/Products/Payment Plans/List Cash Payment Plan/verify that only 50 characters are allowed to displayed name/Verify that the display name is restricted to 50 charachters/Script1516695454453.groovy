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

dispNameUnrequiredLength = displayNameGenerator('abcdefghijklmnopqstuvwxyz', 51)

dispNamerequiredLegnth = displayNameGenerator('abcdefghijklmnopqstuvwxyz', 49)

WebUI.callTestCase(findTestCase('Common/Login'), [('Email') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Products/Payment Plans/List Cash Payment Plan/verify that only 50 characters are allowed to displayed name/Edit payment plan steps'), 
    [('editCashPaymentPlan') : 'cash1'], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Products/Payments Plan/List Cash Payment Plan/txt_Display Name'), dispNameUnrequiredLength)

WebUI.verifyElementText(findTestObject('Products/Payments Plan/List Cash Payment Plan/msg_Error Message'), errorMessage)

WebUI.setText(findTestObject('Products/Payments Plan/List Cash Payment Plan/txt_Requester Notes'), requestorNotes)

WebUI.click(findTestObject('Products/Payments Plan/List Cash Payment Plan/btn_Save'))

marketing_name = WebUI.getText(findTestObject('Products/Payments Plan/List Cash Payment Plan/Display name'))

if (marketing_name != displayName) {
    WebUI.callTestCase(findTestCase('Products/Payment Plans/List Cash Payment Plan/verify that only 50 characters are allowed to displayed name/Edit payment plan steps'), 
        [('editCashPaymentPlan') : 'cash1'], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Products/Payments Plan/List Cash Payment Plan/txt_Display Name'), dispNamerequiredLegnth)

    WebUI.setText(findTestObject('Products/Payments Plan/List Cash Payment Plan/txt_Requester Notes'), requestorNotes)

    WebUI.click(findTestObject('Products/Payments Plan/List Cash Payment Plan/btn_Save'))

    WebUI.callTestCase(findTestCase('Products/Payment Plans/List Cash Payment Plan/Approve Cash Payment Plan/Approve Cash Payment Plan (Update Name and Display Name)'), 
        [('paymentPlan') : findTestData('Edit Cash Payment Plan/edit Cash Payment Plan').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

    WebUI.acceptAlert()
} else {
    WebUI.closeBrowser()
}

String displayNameGenerator(String chars, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(chars.charAt(rand.nextInt(chars.length())))
    }
    
    return sb.toString()
}

