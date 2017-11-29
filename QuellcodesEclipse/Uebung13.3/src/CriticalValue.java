
public class CriticalValue extends Exception{
	
	CriticalValue(){
		super("CriticalValue Exception wurde geworfen!");
	}
	
	CriticalValue(String msg){
		super(msg);
	}

}
