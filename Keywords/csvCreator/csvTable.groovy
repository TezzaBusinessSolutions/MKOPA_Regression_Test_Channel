package csvCreator

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




@Keyword
def public class csvTable {
	class Student{
		def id
		def firstName
		def lastName
		def gender
		def age

	}

	def String CommaDelimiter=","
	def String NewLine="\n"
	def String csvFileHeader="id,firstName,lastName,gender,age"

	def writeCsvFile(String fileName)
	{
		Student student1 = new Student(1, "Ahmed", "Mohamed", "M", 25)
		
		List students=new ArrayList<Student>()
		students.add(student1)
		
		FileWriter fileWriter=new FileWriter(null)
		try{
			fileWriter = new FileWriter(fileName)
			fileWriter.append(csvFileHeader.toString())
			fileWriter.append(NewLine)
			for(Student student:students)
			{
				fileWriter.append(String.valueOf(student.getId()))
				fileWriter.append(CommaDelimiter)
				fileWriter.append(student.getFirstName())
				fileWriter.append(CommaDelimiter)
				fileWriter.append(student.getLastName())
				fileWriter.append(CommaDelimiter)
				fileWriter.append(student.getGender())
				fileWriter.append(CommaDelimiter)
				fileWriter.append(student.getAge())
				fileWriter.append(NewLine)		
								
			}
		}
		catch(Exception e)
		{		
			e.printStackTrace();
		}
		
		finally{
			try{
				fileWriter.flush()
				fileWriter.close()
			}
			catch(IOException e)
			{
				e.printStackTrace()
			}
		}
	}
	
	@Keyword
	def  csvCreatorKW() {
		File fileGenerated=new File("C:/Users/dennis.gituto/Desktop/moran.csv", csvTable)
		
		//fileGenerated.append(csvTable)
		
	}

}
