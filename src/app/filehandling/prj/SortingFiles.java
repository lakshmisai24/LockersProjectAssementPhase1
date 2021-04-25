package app.filehandling.prj;

import java.io.File;
import java.lang.Exception;
import java.util.Scanner;
import java.util.TreeSet;

public class SortingFiles {	
   Scanner sc=new Scanner(System.in);
	public void Listfiles()
	{
		try
		{
	     System.out.println("Enter File Path to list Files ");
	     File dir = new File(sc.nextLine());
	     File[] files = dir.listFiles();
	     TreeSet<File> set = new TreeSet<>();
	     if(!(dir.exists()))
			{
				System.out.println("File path does'nt exists");
			}
	     	
	for(File file : files)
	{
		set.add(file);
		System.out.print(file.getName()+"\n");
	}	
	}
	catch(Exception ex)
	{
		ex.getMessage();
	}
	System.out.println("--------------------------------------------------");
	System.out.println("If u want to return to Welcome Screen : Enter Yes");
	String confirm=sc.next();
	if(confirm.equalsIgnoreCase("yes"))
	{
		FilesOperations fp =new FilesOperations();
		fp.welcomeFunction();
			
	}
}
}



