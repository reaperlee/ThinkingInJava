package exception;
import java.io.*;
public class InputFile {
	private BufferedReader in;
	public InputFile(String fname) throws Exception{
		try{
			in=new BufferedReader(new FileReader(fname));
		}catch(FileNotFoundException e){
			System.out.println("Could not found file");
			throw e;
		}catch(Exception e){
			try{
				in.close();
			}catch(IOException e2){
				System.out.println("in.close() Error!");
			}
			throw e;
		}finally{
			
		}
	}
	public String getLine(){
		String s;
		try{
			s=in.readLine();
		}catch(IOException e){
			throw new RuntimeException("Read Error!");
		}
		return s;
	}
}
