package app.filehandling.prj;
import java.util.Scanner;
import java.io.*;

public class DeleteAFile {
	
	public void deleteFile()
	{
		System.out.println("Enter a File name which u want to delete");
		try
		{
	    Scanner sc=new Scanner(System.in);
		String Filename=sc.next();
		System.out.println("Enter File Path to delete File ");
		String filepath=sc.next();
		File directory=new File(filepath);
		File[] files=directory.listFiles();
		 if(files.length>0)
		 {
		    for(File file:files)
		     {			
		    	if(Filename.equals(file.getName()))
				{
					file.delete();		  		
					System.out.println("File successfully deleted");
				}
					     		 
		     }
		  }
		else
		{
			System.err.println("Cannot find a file "+ Filename +"in this "+directory);
		}
		
		
		
		//Return to main screen
		 System.out.println("--------------------------------------------------");
			System.out.println("If u want to return to Welcome Screen : Enter Yes");
			String confirm=sc.next();
			if(confirm.equalsIgnoreCase("yes"))
			{
				FilesOperations fp =new FilesOperations();
				fp.welcomeFunction();
					
			}
		
		sc.close();
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
}
}
