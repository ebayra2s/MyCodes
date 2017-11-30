/**
 * @author ebayra2s
 */

public class Paar<E,Z> {
	private E e;
	private Z z;
	
	public Paar(E e, Z z){
		this.e = e;
		this.z = z;
	}
	
	public E erstes(){
		return this.e;
	}
	
	public Z zweites(){
		return this.z;
	}
	
	public E setErstes(E e){
		E tmp = this.e;
		this.e = e;
		return tmp;
	}
	
	public Z setZweites(Z z){
		Z tmp = this.z;
		this.z = z;
		return tmp;
	}
	
	public boolean equals(Paar<E,Z> ez2){
		if(erstes() == ez2.erstes() && zweites() == ez2.zweites()){
			return true;
		}
		
		return false;
	}
	
	public String toString(){
		return "("+this.e+ ","+ this.z+")";
	}

}
