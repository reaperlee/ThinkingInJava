package exception;
import java.util.logging.*;
import java.io.*;
class LogException extends Exception{
	private static Logger logger=Logger.getLogger("LoggingException");
	public LogException(){
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
class ExceptionLogger{
	private static Logger logger=Logger.getLogger("ExceptionLogger");
	public static void logException(Exception e){
		StringWriter trace=new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
public class LoggingException {
	public static void main(String[] args){
		try{
			throw new LogException();
		}catch(LogException e){
			System.err.println("Caught e!");
		}
		try{
			throw new NullPointerException();
		}catch(NullPointerException e){
			ExceptionLogger.logException(e);
		}
	}
}
