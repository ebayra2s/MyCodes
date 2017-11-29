
public class IllegalValue extends RuntimeException{
	
	IllegalValue(){
		super("IllegalValue Exception wurde geworfen!");
	}
	
	IllegalValue(String msg){
		super(msg);
	}

}
