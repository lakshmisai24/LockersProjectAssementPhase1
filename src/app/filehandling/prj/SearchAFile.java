package app.filehandling.prj;
import java.io.*;
import java.util.Scanner;

public class SearchAFile {
	public void getFile()
	{		 
		 int count=0;
		 File filename=null;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter File name to be searched");
		 String name=sc.next();
		 try
		 {
	      System.out.println("Enter File Path to search File ");
	     String filepath=sc.next();
		 File directory=new File(filepath);
		 File[] files=directory.listFiles();
		 if(files.length>0)
		 {
		    for(File file:files)
		     {			
				if(name.equals(file.getName()))
				{
					count=1;
					filename=file;
				}	     		 
		     }
		  }
		 }		 
		 catch(Exception e)
		 {
			 e.getMessage();
		 }
		 //checking for the file
		 if(count==1)
		 System.out.println(filename.getName()+" file is found in the given path "+filename.getPath());
		else
		{
				 if(count==0)
		System.out.println("File not found");
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
	}

		 
		 
