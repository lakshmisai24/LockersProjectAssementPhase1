package app.filehandling.prj;
import java.io.*;
import java.util.Scanner;

public class AddingNewFile 
{
	public void AddFile()
	{
      System.out.println("Enter new File name");
      try
      {
	  Scanner sc=new Scanner(System.in);
	  String Filename=sc.next();
	  System.out.println("Enter File Path to create File ");
	  String filepath=sc.next();
	  String newFile=filepath+File.separator+Filename;
	  if(!(Filename.equals(null)))
	  {
	  File file=new File(newFile);
	  
	  if(file.createNewFile())
	   {
		System.out.println(file.getName()+" created successfully");
		}
		else
		{
		System.out.println("File name  can't be null/empty");
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
		catch(IOException e)
        {
			e.printStackTrace();
		}
      
		
	}
}
	
