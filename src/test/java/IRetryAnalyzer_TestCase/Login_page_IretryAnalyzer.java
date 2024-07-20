package IRetryAnalyzer_TestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Login_page_IretryAnalyzer implements IRetryAnalyzer
{
	int Starting_Count =0;
	int retry_Count =3;
	

	@Override
	public boolean retry(ITestResult result)
	{
		if(Starting_Count<retry_Count) 
		{
			Starting_Count++;
			return true;		
		}	
		return false;
	}
}
