import java.io.*;
import java.util.*;

class filem {
    Scanner sc = new Scanner(System.in);
    String fileName;
    File file;

    filem() {
        System.out.print("Enter File Name:");
        fileName = sc.nextLine();
        file = new File("C:\\Users\\MCA2\\Desktop\\" + fileName);
    }
}

class Choice {
    Choice() {
        System.out.println("1.Create_File");
        System.out.println("2.File_Name");
        System.out.println("3.File_Path");
        System.out.println("4.File_Size");
        System.out.println("5.File_Delete");
        System.out.println("6.Exit Menu");
    }
}

class CreateFile extends filem 
 {
    CreateFile() {
     try 
         {
            if (file.createNewFile()) 
            {
                 System.out.println("File is Created...");
            }
            else
            {  
                System.out.println("File Not Created...");
            }
        } 
        catch (Exception ie) 
        {
            System.out.println("Error: " + ie.getMessage());
         }
     }
}

class FileName extends filem {
    FileName() {
        System.out.println("File Name is: " + file.getName());
    }
}

class FilePath extends filem {
    FilePath() {
        System.out.println("File Path is: " + file.getAbsolutePath());
    }
}

class FileSize extends filem {
    FileSize() {
        System.out.println("File Size is: " + file.length());
    }
}
class Filedelete extends filem
 {
   Filedelete () 
   {
        System.out.println("File is deleted..: " + file.delete());
    }
}

class Menu 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        while (true) 
        {
            Choice choice = new Choice();
            System.out.print("Enter Choice Number: ");
            int cn = sc.nextInt();

            switch(cn) 
            {
                case 1:
                    CreateFile createFile = new CreateFile();
                    break;
                case 2:
                    FileName fileName = new FileName();
                    break;
                case 3:
                    FilePath filePath = new FilePath();
                    break;
                case 4:
                    FileSize fileSize = new FileSize();
                    break;
                case 5:
                    Filedelete fd= new Filedelete();
                    // System.out.println("Helo.....");
                    break;
                case 6:
                    System.out.println("Helo.....");   
                    System.exit(0);
                    break;
                default:
                    // System.out.println(cn);     
                    System.out.println("Invalid choice");
            }
        }
    }
}


// rh.java
// Displaying rh.java.