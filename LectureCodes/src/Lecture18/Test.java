
package Lecture18;

import java.io.File; //Drive//Folder(s)//File(s) Controlling 
import java.io.IOException;
                     //Folder/File Create, Rename ,Copy,delete
                     // Writing /Reading contents into/from Files
                     // Path
                     // Drive:/Folder/File
                     // -Folder/file (inside current folder
                     // File (file in current folder)

                     // Path Separator example
                     // D:/Folder/File -Unix/MAC and preferred
                     // D:\\Folder\\File -Windows

public class Test {
    public static void main(String[] args) throws IOException {
        File file1 =new File("D:\\MyFiles");
        File file2=new File("https://docs.oracle.com/javase/8/docs/api/java/io/File.html");
        if (file1.isDirectory()){
            System.out.println("Folder");
        }
        if (file1.isFile()){
            System.out.println("File");
        }
        //isHidden() is a method to determine whether a folder or file is hidden or not 
        //lastModified()
        //length() is a method to determine file size
        //mkdir Creates the directory
        //mkdirs is used to create directory within a directory
        
        
        //File file3=new File("D:/MyFiles/Test");
        //boolean res =file3.mkdir();
        File file3=new File("D:/MyFiles/Test/Test1/Test2");
        boolean res =file3.mkdirs();
        if(res==true){
            System.out.println("folder created ");
            
        }
        else
            System.out.println("Error: Folder couldnt be created");
        
       /*File file4 =new File("D:/myDir");
       boolean res1=file4.renameTo(new File("D:/myDirs"));
        System.out.println(res1);
        
        File file5= new File("D:/myFolders");
        boolean res5= file5.delete(); // if there is a sub folder then it cannot be deleted. 
        System.out.println(res5); */
        
        File file6 =new File("D:/data.txt");
        if(file6.exists()){
            System.out.println("File already exists");
        }
        else{
            boolean res6=file6.createNewFile();
            System.out.println(res6);
        }
        
    }
    
}
