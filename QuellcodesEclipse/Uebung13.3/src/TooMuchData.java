
public class TooMuchData extends Exception{
	
	TooMuchData(){
		super("TooMuchData Exception wurde geworfen!");
	}
	
	TooMuchData(String msg){
		super(msg);
	}

}
