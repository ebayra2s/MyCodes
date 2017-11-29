
public class A7 {
	static int[][] matrixErzeugen(int n, int m) {
		int[][] matrix = new int[n][m];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = i + j + 1;
			}
		}

		return matrix;
	}

	static int[][] matrixKopierenMitMultiplizieren(int[][] a, int faktor) {
		int[][] matrix = new int[a.length][a[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = a[i][j] * faktor;
			}
		}

		return matrix;
	}
	
	static void ausgeben(int [][] a){
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.println(a[i][j]);
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int faktor = Integer.parseInt(args[2]);
		
		int [][] matrix = matrixErzeugen(n, m);
		ausgeben(matrix);
		matrix = matrixKopierenMitMultiplizieren(matrix, faktor);
		ausgeben(matrix);
	}
}
