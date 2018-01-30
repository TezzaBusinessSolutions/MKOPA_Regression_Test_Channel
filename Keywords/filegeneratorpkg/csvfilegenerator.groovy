package filegeneratorpkg

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI


	

String generateRandom(String chars='QWERTYUIOPASDFGHJKLZXCVBNM1234567890', Integer length=10) {
	Random rand = new Random()

	StringBuilder sb = new StringBuilder()

	for (int i = 0; i < length; i++) {
		sb.append(chars.charAt(rand.nextInt(chars.length())))
	}
	
	return sb.toString()
}

/*This Function creates a CSV file and random generates the Receipt Number.
You will have to update the following parameters (Amount, Phone and Account).
 Also change the path to store the file*/

@Keyword
def  csvfilegenerator(String account,String phone,String amount=null) {
	if(amount==null){
		amount = 100
	}

	
	//Creating a parameterized File Location Path
	String path = System.getenv('USERPROFILE')
	File fileGenerated=new File(path+"/git/MKOPA_Regression_Test_Channel/FilesToUpload/payments.csv")
	
	//Checks if the file exists
	if(!fileGenerated.exists())
	{
		
	def text=generateRandom()
	fileGenerated.append("Receipt No.,Completion Time,Initiation Time,Details,Transaction Status,Paid In,Withdrawn,Balance,Balance Confirmed,Reason Type,Other Party Info,Linked Transaction ID,A/C No.\r\n")
	fileGenerated.append(text+",15:50,20-04-2017 15:50,Pay Bill from "+phone+ " - Customer Credits Acc. "
		+account+",Completed,"+amount+",,66,TRUE,Pay Utility,"+phone+"- Customer Credits,,"+account)}
		
	//Deletes the file if it exists
	else {fileGenerated.delete()
	
	//Generates the file and stores it in the location
	def text=generateRandom()
	fileGenerated.append("Receipt No.,Completion Time,Initiation Time,Details,Transaction Status,Paid In,Withdrawn,Balance,Balance Confirmed,Reason Type,Other Party Info,Linked Transaction ID,A/C No.\r\n")
	fileGenerated.append(text+",15:50,20-04-2017 15:50,Pay Bill from "+phone+ " - Customer Credits Acc. "
		+account+",Completed,"+amount+",,66,TRUE,Pay Utility,"+phone+"- Customer Credits,,"+account)}
	
}


