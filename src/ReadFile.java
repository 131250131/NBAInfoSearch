import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//最后把static去掉
public class ReadFile {
	 static String read;
	 static Stringoperator operator;
	 public ReadFile() {
     } 
     public static boolean readfile(String filepath,String type) throws FileNotFoundException, IOException {    
    	 try {
                     File file = new File(filepath);
                     if (!file.isDirectory()) {
                          
                            //System.out.println("path=" + file.getPath());
                             //System.out.println("absolutepath=" + file.getAbsolutePath());
                             //System.out.println("name=" + file.getName());

                     } else if(file.isDirectory()) {
                         
                             String[] filelist = file.list();
                             for (int i = 0; i < filelist.length; i++) {
                            	 //    System.out.println(filepath + "/" + filelist[i]);
                                     File readfile = new File(filepath + "/" + filelist[i]);
                                     if (!readfile.isDirectory()) {
                                            /*
                                             *  System.out.println("path=" + readfile.getPath());
                                             
                                             System.out.println("absolutepath="
                                                             + readfile.getAbsolutePath());
                                             System.out.println("name=" + readfile.getName());
                                             */
                                    	 FileReader fileread = new FileReader(readfile); 
                                    	 BufferedReader bufread = new BufferedReader(fileread); 
                                    	 if(type.equals("player")){
                                    	 while ((read = bufread.readLine()) != null )
                                    	 {
                                    		 operator=new Stringoperator(read);
                                             operator.playeroperaator();
                                             char[] pl=read.toCharArray();
                                    		 System.out.println(pl[8]);
                                    	 }
                                    	 }
                                    	 if(type.equals("match")){
                                    		 
                                    	 }
                                    	 if(type.equals("team")){
                                    		 
                                    	 }

                                     } else if (readfile.isDirectory()) {
                                             readfile(filepath + "\\" + filelist[i],type);
                                     }
                             }

                     }

             } catch (FileNotFoundException e) {
                     System.out.println("readfile()   Exception:" + e.getMessage());
             }
             return true;
     }
    	 
    	 
     
     
     public static void main(String[] args) {
         try {
                 readfile("C:\\Users\\apple\\Desktop\\player","player");
                 //deletefile("D:/file");
         } catch (FileNotFoundException ex) {
         } catch (IOException ex) {
         }
       //  System.out.println("ok");
 }
}
