package acumuladores;

public class Acumuladores {

	/**
	 * Dada una matriz de enteros y un número, verifica si existe alguna fila 
	 * donde todos sus elementos sean múltiplos del número recibido por 
	 * parámetro.
	 * 
	 * Si la matriz está vacía o si el número no es positivo, devuelve falso.
	 * 
	 * @param mat
	 * @param num
	 * @return
	 */
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) { 
		boolean existeFila = false;
		
		for (int fila = 0; fila < mat.length; fila ++) {
			existeFila = existeFila || todosMultiplos(mat[fila], num);
		}
		
		return existeFila;
	}
	
	public boolean todosMultiplos (int [] fila, int num) {
		boolean todosMultiplos = true;
		
		for (int col = 0; col < fila.length; col++) {
			todosMultiplos = todosMultiplos && fila[col] % num == 0;
		}
		
		return todosMultiplos;
		
	}
	

	
	/**
	 * Dado 2 matrices se verifica si hay intersección entre las filas de cada
	 * matriz, fila a fila.
	 * 
	 * Si las matrices tienen distinta cantidad de filas o si alguna matriz 
	 * está vacía, devuelve falso.
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorFila(int[][] mat1, int[][]mat2) { 
		
		boolean interseccionPorFila = true;
		
		for (int fila = 0; fila < mat1.length; fila ++) {
			interseccionPorFila = interseccionPorFila && lasFilasInterseccionan(mat1[fila], mat2[fila]);
		}
		
		return interseccionPorFila;
	}
	
	public boolean lasFilasInterseccionan(int [] fila1, int [] fila2) {
		
		boolean interseccion = false;
		
		for (int col = 0; col < fila1.length; col++) {
			for (int col2 = 0; col2 < fila2.length; col2++) {
				interseccion = interseccion || fila1[col] == fila2[col2];
			}
		}
		
		return interseccion;
	}
	
	/**
	 * Dada una matriz y el índice de una columna, se verifica si existe alguna
	 * fila cuya suma de todos sus elementos sea mayor estricto que la suma de
	 * todos los elementos de la columna indicada por parámetro.
	 * 
	 * Si el índice de la columna es inválido o la matriz está vacía, devuelve 
	 * falso.
	 * 
	 * @param mat
	 * @param nColum
	 * @return
	 */
	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) { 
		 
		boolean algunaFilaSumaMas = false;
		
		int sumanColum = sumarnColum(mat, nColum);
		
		for (int fila = 0; fila < mat.length; fila++) {
			int sumaFila = sumarFila (mat);
			algunaFilaSumaMas = algunaFilaSumaMas || sumaFila == sumanColum;
		}
		
		return algunaFilaSumaMas;
	}
	
	public int sumarnColum (int [][] mat, int nColum) {
		int suma = 0;
		for (int fila = 0; fila < mat.length; fila++) {
			suma = suma + mat[fila][nColum];
		}
		return suma;
	}
	
	public int sumarFila (int [][] mat) {
		int suma = 0;
		for (int fila = 0; fila < mat.length; fila++) {
			for (int col = 0; col < mat[fila].length; col++) {
				suma = suma + mat[fila][col];
			}
		}
		return suma;
	}
	
	/**
	 * Dadas 2 matrices, se verifica si hay intersección entre las columnas de
	 * cada matriz, columna a columna.
	 * 
	 * Si las matrices tienen distinta cantidad de columnas o alguna matriz 
	 * está vacía, devuelve falso. 
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	
}
