
// import java.util.*;
// import java.io.*;
// import java.io.IOException;

// class file 
// {
//    static  Scanner sc=new Scanner (System.in);

// }

// class create extends file
// {
//     create()
//     {


//     File f=new File("nidhi.txt");
//     System.out.println("the file "+f.getName()+" is created..");

//     // try 
//     // {
//     //     if(f.createNewFile())
//     //         {
//     //             System.out.println("the file "+f.getName()+" is created..");

//     //         }
//     //     else 
//     //         {
//     //             System.out.println("file is not created..");
//     //         }
//     // }
//     //     catch (Exception e)
//     //         {
//     //             System.out.println("An error occurred.");
//     //              e.printStackTrace();
//     //         }
//     }
// }
// class Menu  
// {
//     Menu()
//     {


//     System.out.println("file Handling menu");
//     System.out.println("1--> create file");
//     System.out.println("2--> name of the file");
//     System.out.println("3--> write to file");
//     System.out.println("4--> read file");
//     System.out.println("5--> rename file");
//     System.out.println("6--> delete file");
//     System.out.println("7--> exit");
//     }

// }
// class Name
// {
   
//     Name()
//     {
//         File f=new File("nidhi.txt");
//         System.out.println("The name of the file is "+f.getName());
//     }
// }
// class write
// {
     

//    write()
//    {
     
//      try 
//      {
//         FileWriter fw=new FileWriter("nidhi.txt");
//         fw.write("heelooo everyone ...!");
//         fw.close();
//      }
//      catch(IOException i)
//      {
//         System.out.println(i);
//      }
//    }
// }

// class read
// {
//     File f=new File("nidhi.txt");

//     read()
//     {
//         try
//         {

//             FileReader fr=new FileReader("nidhi.txt");
//             try 
//             {
//                 int i;
//                     while((i=fr.read())!=-1)
//                     {
//                         System.out.print((char)i);
//                     }
//             }
//             finally
//             {
//                 fr.close();
//             }
//         }
//         catch(Exception e)
//         {

//         }
//     }
// }
// class rename
// {
//     rename()
//     {
//         File f=new File("nidhi.txt");
//         File n=new File("helloo.txt");
//         if(f.exists())
//         {
//             System.out.println(f.renameTo(n));
//             System.out.println("new name of the file is :"+n.getName());
//         }
//         else 
//         {
//             System.out.println("file does not exist.");
//         }
//     }
// }
// class del 
// {
//     File f=new File("nidhi.txt");
//     del()
//     {
//         System.out.println("file is deleted."+f.delete());
//     }
// }
// class Fh_static extends file
// {
//     public static void main(String[] args)
//     {
        
//         while(true)
//         {

//             Menu m=new Menu();


//             System.out.println("enter your choise");
//             int ch=sc.nextInt();

//             switch(ch)
//             {
//             case 1:
//                 create cr=new create();
//                 break;
//             case 2:
//                 Name n=new Name();
//                 break;
//             case 3:
//                 write wr=new write();
//                 break;
//             case 4:
//                 read r=new read();
//                 break;
//             case 5:
//                 rename re=new rename();
//                 break;
//             case 6:
//                 del d=new del();
//                 break;
//             case 7:
//                 System.exit(0);
//                 break;
//             default:
//                 System.out.println("plz enter valid choice");


//             }
//         }
//     }
// }


import java.util.*;
import java.io.*;


class file 
{
    static Scanner sc=new Scanner(System.in);

}

class create 
{
    create()
    {
        File f=new File("morning.txt");
        try 
        {
            if(f.createNewFile())
            {
                System.out.println("file is created....");
            }
            else 
            {
                System.out.println("not created...");
            }
        }
        catch(Exception e)
        {

        }
        //System.out.println("the file "+ f.createNewFile()+" is created..");
    }
}

class Name
{
    Name()
    {
        File f=new File("morning.txt");
        System.out.println("file name is "+f.getName());
    }
}

class Menu
{
    Menu()
    {
        System.out.println("1. to create a new file");
        System.out.println("2. file name");
        System.out.println("3. file write");
        System.out.println("4. file read");
        System.out.println("5. file rename");
        System.out.println("6. delete");
        System.out.println("7. exit");
    }
}

class write
{
    write()
    {
        try 
        {
            FileWriter fw=new FileWriter("morning.txt");
            fw.write("hellooo everyone");
            fw.close();

        }
        catch(Exception e)
        {

        }
    }
}

class read
{
     File f=new File("morning.txt");
    read()
    {
        try 
        {
            FileReader fr=new FileReader("morning.txt");
            try 
            {
                int i;
                while((i=fr.read())!=-1)
                {
                    System.out.print((char)i);
                }
                
            }
            finally 
            {
                fr.close();
            }

        }
        catch(Exception e)
        {

        }
    }
}

class rename 
{
    rename()
    {
        File f=new File("morning.txt");
        File n=new File("hyy.txt");
        if(f.exists())
        {
             System.out.println(f.renameTo(n));
        }
       else 
       {
        System.out.println("file not exists");
       }
    }
}
class del
{
    del()
    {
        File f=new File("hyy.txt");
        {
            System.out.println("file is deleted.."+f.delete());
        }
    }
}
class Fh extends file
{
    public static void main(String[] args)
    {
        while(true)
        {
            Menu m = new Menu();


            
            System.out.println("enter the choice");
            int no=sc.nextInt();

            switch(no)
            {
            case 1:
                create c=new create();
                break;
            case 2:
                Name n=new Name();
                break;
            case 3:
                write w=new write();
                break;
            case 4:
                read r =new read();
                break;
            case 5:
                rename re=new rename();
                break;
            case 6:
                del d=new del();
                break;
            case 7:
                System.exit(0);
                break;
             default:
                System.out.println("invalid choise..");
            }
        }
    }
}