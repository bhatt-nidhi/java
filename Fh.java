import java.util.*;
import java.io.*;


class file
{	
	Scanner sc=new Scanner(System.in);
	File file;
	String filename;

	file()
	{
		System.out.println("enter the file name");
		filename=sc.nextLine();
		file=new File("E:\\JAVA-CIA2\\"+filename);
	}
}
class choise extends file
{
	choise()
	{
		System.out.println("1-> to create a file");
		System.out.println("2-> file name");
		System.out.println("3->file path");
		System.out.println("4->file size");
		System.out.println("5->file read");
		//System.out.println("6->file write");
		System.out.println("7->file rename");
		System.out.println("8->delete");
		System.out.println("9->exits");
	}
}
class create extends file
{
	create()
	{
		try 
		{
			if(file.createNewFile())
			{
				System.out.println("file is created...");
			}
			else 
			{
				System.out.println("file is not created...");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class filename extends file
{
	filename()
	{
		System.out.println("file name is : "+file.getName());
	}
}

class path extends file
{
	path()
	{
		System.out.println("file path is : "+file.getAbsolutePath());
	}
}
class size extends file
{
	size()
	{
		System.out.println("the size of file is : "+file.length());
	}
}



class rename extends file
{
	rename()
	{
		String filename1;
		System.out.println("enter the new file name");
		filename1=sc.nextLine();
		File f =new File("E:\\JAVA-CIA2\\"+filename);
		File fi =new File("E:\\JAVA-CIA2\\"+filename1);

		if(file.exists())
		{
			f.renameTo(fi);
		}
		else 
		{
			System.out.println("file not found");
		}
	}
}

class delete extends file
{
	delete()
	{
		System.out.println("to dele the file "+file.delete());
	}
}

class Fh
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		while(true)
		{
			choise ch=new choise();
			System.out.println("enter the choise");
			int cn=s.nextInt();

			switch(cn)
			{
			case 1:
				create cr=new create();
				break;
			case 2:
				filename fn=new filename();
				break;
			case 3:
				path p=new path();
				break;
			case 4:
				size si=new size();
				break;
			case 5:
				read fr=new read();
				break;
			case 7:
				rename re=new rename();
				break;
			case 8:
				delete de=new delete();
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("invalid choise..");


			}
		}
		
	}
}