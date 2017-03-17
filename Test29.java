package job;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.Number;

public class Test29
{

	public static void main(String[] args) throws Exception
	{
		//open excel file for reading
		File f=new File("F:\\Batch230\\Automation\\kalam\\book1.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nor=rsh.getRows();
		//open excel file for writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		//data driven
		for(int i=1;i<nor;i++)
		{
			int x=Integer.parseInt(rsh.getCell(0,i).getContents());
			int y=Integer.parseInt(rsh.getCell(1,i).getContents());
			int z=x+y;
			Number n=new Number(2,i,z);
			wsh.addCell(n);
		}
		wwb.write();
		wwb.close();
		rwb.close();
		

	}

}
