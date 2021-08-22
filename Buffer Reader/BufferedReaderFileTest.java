import java.io.*;
import java.util.*;

public class BufferedReaderFileTest{
	public static void main(String[] args)throws Exception{
		
		FileInputStream f=new FileInputStream("createFile3.txt");
		InputStreamReader reader=new InputStreamReader(f);
		BufferedReader r=new BufferedReader(reader);
		
		String line;//=r.readLine();
		while((line=r.readLine())!=null){
		System.out.println(line);
		//line=r.readLine();
		}
		f.close();
	
	}
	
}