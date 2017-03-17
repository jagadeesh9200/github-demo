package job;

import java.rmi.RemoteException;
import java.util.Scanner;

import job.Live_Sensex_Bse_IndexStub.ArrayOfString;
import job.Live_Sensex_Bse_IndexStub.GetLiveSensex;
import job.Live_Sensex_Bse_IndexStub.GetLiveSensexResponse;

import org.apache.axis2.AxisFault;

public class Test21 
{
	public static void main(String[] args) throws RemoteException
	{
		//get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String x=sc.nextLine();
		System.out.println("Enter password");
		String y=sc.nextLine();
		//create object stub class
		Live_Sensex_Bse_IndexStub stub=new Live_Sensex_Bse_IndexStub("http://freewebservicesx.com/live-sensex-bse-index.asmx?WSDL");
		//create object to request and set inputs
		GetLiveSensex req=new GetLiveSensex();
		req.setUserName(x);
		req.setPassword(y);
		//create object to response and get output
		GetLiveSensexResponse res=stub.getLiveSensex(req);
		ArrayOfString as=res.getGetLiveSensexResult();
		//translate service type to java type
		String[] o=as.localString;
		for(int i=0;i<o.length;i++)
		{
			System.out.println(o[i]);
			
		}
	}

}
