package IRetryAnalyzer_TestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Registration_IretryAnalyser implements IRetryAnalyzer
{
	int starting_Count =0;
	int Retry_Count =3;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(starting_Count<Retry_Count)
		{
			starting_Count++;
			return true;	
		}	
		return false;
	}
}
