package file;
import java.io.*;

public class WriteAppend {
	public static void main(String[] args) {
		FileWriter fWrite = null;
		BufferedWriter bWrite = null;
		String addline = "JAVA";
		File myFile = new File("C:\\\\Users\\\\hp\\\\Desktop\\\\write.txt");
		
		try{
            if(!(myFile.exists())){
                myFile.createNewFile();
        }
        fWrite = new FileWriter(myFile, true); 
            bWrite = new BufferedWriter(fWrite);
            bWrite.write(addline);
            bWrite.close();
            
            System.out.println("file write");
            
        }catch (IOException e) {
            e.printStackTrace();
			
		
        }
	}
}


