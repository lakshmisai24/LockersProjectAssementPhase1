package app.filehandling.prj;

import java.util.Scanner;

public class FilesOperations 
{
	public static int option=0;
	public void welcomeFunction()
	{
		Scanner sc =new Scanner(System.in); 
		System.out.println("Welcome To Company Lockers Pvt Ltd \nApplication : Files Handling Project \nDeveloper  : Lakshmi Sai \n-------------------------------------");
		System.out.println("Please select given options in order to perform File Handling Operations"+"\n"+
		                   " 1 : List File"+"\n"+
				           " 2 : Add File"+"\n"+
		                   " 3 : Delete File"+"\n"+
				           " 4 : Search File"+"\n"+"----------------------------------------");
	     System.out.println("Select your option to be performed"); 
	     try
			{
		    option=sc.nextInt();
		    if(option==1)
			{
			   SortingFiles sf=new SortingFiles();
			   sf.Listfiles();	
			}
			if(option==2)
			{
				AddingNewFile nf=new AddingNewFile();
				nf.AddFile();			
			}
			if(option==3)
			{
				DeleteAFile df=new DeleteAFile();
				df.deleteFile();
			}
			if(option==4)
			{
				SearchAFile SF=new SearchAFile();
				SF.getFile();
			}		
		       sc.close();  
			}
			catch(IllegalStateException ex)
			{
				ex.getMessage();
			}
			

	}	
	public static void main(String[] args) 
	{	
		FilesOperations fp =new FilesOperations();
		fp.welcomeFunction();
			
	}
}


