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

displayNameGenerator = generateName('abcdefghijklmnop', 5)

WebUI.callTestCase(findTestCase('Common/Login'), [('Email') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Products/Common/mnu_ProductsDropdownMenu'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Products/Common/sbm-Payments Plan'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/Common/sbm_List Cash Payment Plans'))

WebUI.click(findTestObject('Products/Payments Plan/List Cash Payment Plan/lnk_Edit Payment Plan', [('editCashPaymentPlan') : editCashPaymentPlan]))

WebUI.setText(findTestObject('Products/Payments Plan/List Cash Payment Plan/txt_Plan Name'), 'Moran')

WebUI.setText(findTestObject('Products/Payments Plan/List Cash Payment Plan/txt_Display Name'), displayNameGenerator)

WebUI.setText(findTestObject('Products/Payments Plan/List Cash Payment Plan/txt_Requester Notes'), 'The name and Display name has changed')

WebUI.click(findTestObject('Products/Payments Plan/List Cash Payment Plan/btn_Save'))

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Products/Payment Plans/List Cash Payment Plan/Approve Cash Payment Plan (Update Name and Display Name)'), 
    [('paymentPlan') : 'Moran'], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Products/Common/mnu_ProductsDropdownMenu'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Products/Common/sbm-Payments Plan'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/Common/sbm_List Cash Payment Plans'))

WebUI.verifyElementPresent(findTestObject('Products/Payments Plan/List Cash Payment Plan/txt_VerifyPlanPresent', [('paymentPlan') : paymentPlan]), 
    0)

WebUI.closeBrowser()

String generateName(String chars, Integer length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(chars.charAt(rand.nextInt(chars.length())))
    }
    
    return sb.toString()
}

