package pretty;

public class Myexception extends Exception { 
	private static final long serialVersionUID = 6094833211177931713L;  //????
//	String message; 
//	 public Myexception(String ErrorMessagr) {  
//	       message = ErrorMessagr;
//	 }
//	 
//	 @Override
//	 public String getMessage(){
//		 return message;
//	 }
	
	public Myexception(String message) {
		super(message);
	}
}