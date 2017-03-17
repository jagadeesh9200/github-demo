package job;

import java.util.Scanner;

import job.CurrencyConvertorStub.ConversionRate;
import job.CurrencyConvertorStub.ConversionRateResponse;
import job.CurrencyConvertorStub.Currency;
import org.apache.axis2.AxisFault;

public class Test22 
{

	public static void main(String[] args) throws Exception 
	{
	
	
		
	 //get data from keyboard
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter from Currency");
		String x=sc.nextLine();
		System.out.println("Enter to Currency");
		String y=sc.nextLine();	
		Currency fc=new Currency(x,false);
		Currency tc=new Currency(y,false);		
		//create object to stub class
		CurrencyConvertorStub stub=new CurrencyConvertorStub("http://www.webservicex.com/CurrencyConvertor.asmx?wsdl");
		//create object to request and set inputs
		ConversionRate req=new ConversionRate();
		req.setFromCurrency(fc);
		req.setToCurrency(tc);
		//create object response and get output
		ConversionRateResponse res=stub.conversionRate(req);
		System.out.println(res.getConversionRateResult());
		
	}
}
