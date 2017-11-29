
public class FlaecheBerechnen {
	public static void main(String[] args) {
		float [][] polygon = {{0,0}, {1,0},{1,1},{0,1}};
		
		System.out.println(flaecheBerechnen(polygon));
	}
	
	public static float flaecheBerechnen(float[][] coord){
		float ergebnis = 0.0f;
		int x = 0;
		int y = 1;
		
		for(int i = 0; i<coord.length; i++){
			int verbindung = (i + 1) % coord.length;
			ergebnis += (coord[i][x] + coord[verbindung][x]) * (coord[verbindung][y] - coord[i][y]);
		}
		
		return Math.abs(ergebnis * 0.5f);
	}
	

	

}
