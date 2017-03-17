package job;

import java.rmi.RemoteException;
import java.util.Scanner;

import job.CalculatorStub.Add;
import job.CalculatorStub.AddResponse;
import job.CalculatorStub.Divide;
import job.CalculatorStub.DivideResponse;
import job.CalculatorStub.Multiply;
import job.CalculatorStub.MultiplyResponse;
import job.CalculatorStub.Subtract;
import job.CalculatorStub.SubtractResponse;

import org.apache.axis2.AxisFault;

public class Test20 {

	
	public static void main(String[] args) throws RemoteException
	{
		//get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int x=sc.nextInt();
		System.out.println("Enter a value");
		int y=sc.nextInt();
		//create object to stub class
		CalculatorStub stub=new CalculatorStub("http://www.dneonline.com/calculator.asmx?WSDL");
		//create object to request and set inputs
		Add ar=new Add();
		ar.setIntA(x);
		ar.setIntB(y);
		//create object to response and get result
		AddResponse are=stub.add(ar);
		System.out.println(are.getAddResult());
		//create object to request and set inputs
		Subtract sr=new Subtract();
		sr.setIntA(x);
		sr.setIntB(y);
		//create object to response and get result
		SubtractResponse sre=stub.subtract(sr);
		System.out.println(sre.getSubtractResult());
		//create object to request and set inputs
		Multiply mr=new Multiply();
		mr.setIntA(x);
		mr.setIntB(y);
		//create object to response and get result
		MultiplyResponse mre=stub.multiply(mr);
		System.out.println(mre.getMultiplyResult());
		//create object to request and set inputs
		Divide dr=new Divide();
		dr.setIntA(x);
		dr.setIntB(y);
		//create object to response and get result
		DivideResponse dre=stub.divide(dr);
		System.out.println(dre.getDivideResult());
		
				
				
				
				
		
		
		
		
	
	}

}
