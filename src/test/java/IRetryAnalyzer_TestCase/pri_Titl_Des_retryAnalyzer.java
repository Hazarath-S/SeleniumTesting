package IRetryAnalyzer_TestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class pri_Titl_Des_retryAnalyzer implements IRetryAnalyzer
{
 int Starting_Count =0;
 int Retry_Count =3;
 
	@Override
	public boolean retry(ITestResult result)
	{
		if(Starting_Count<Retry_Count)
		{
			Starting_Count++;
			return true;		
		}	
		return false;
	}

}
