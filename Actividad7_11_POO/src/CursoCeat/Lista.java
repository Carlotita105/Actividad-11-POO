package CursoCeat;


import java.util.Arrays;

public class Lista {
	
	
	Integer [] tabla;
	
	public Lista() {
		tabla=new Integer [0];
		
	}

	void insertarPrincipio (Integer nuevo) {
		tabla= Arrays.copyOf(tabla, tabla.length + 1);
		System.arraycopy(tabla,0,tabla,1,tabla.length - 1);
		tabla[0] =nuevo;
	}
	void insertarFinal (Integer nuevo) {
		tabla=Arrays.copyOf(tabla, tabla.length + 1);
		tabla [tabla.length - 1] = nuevo;
	}
	
	
	
	void insertarFinal(Lista otraLista) { 
		int tamIni=tabla.length; //Tamaño inicial tabla
		tabla=Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
		System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
		
	}
	//el primer parámetro es el índice del lugar donde queremos insertar el valor del segundo parámetro
	void insertar(int posicion,Integer nuevo) {
		tabla=Arrays.copyOf(tabla, tabla.length + 1);
		System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
		tabla[posicion] =nuevo;
		
		
	}
	//Se elimina el elemento conrrespondiente a indice y se devuelve 
	Integer eliminar (int indice) {
		Integer eliminado=null;
		if (indice >=0 && indice < tabla.length) {
		eliminado = tabla[indice];
		for (int i=indice + 1; i< tabla.length; i++) {
			tabla [ i - 1 ] = tabla[i];
			
		}
		tabla=Arrays.copyOf(tabla, tabla.length - 1);
	}
	return eliminado;

}
	Integer get (int indice) {
	Integer resultado=null;
	if (indice >=0 && indice < tabla.length) { //indice válido
		resultado=tabla[indice];
	}

	return resultado;
	
	
	}
	
	int buscar (Integer claveBusqueda) {
		int indice = -1;
		for (int i=0; i< tabla.length && indice == -1; i++) {
			if (tabla[i].equals(claveBusqueda)) { //no vale tabla [i] ==claveBusqueda
				indice=i;
			}
		}
		return indice;
	}
	//el numero de elementos de la lista es el número de elementos de la tabla
		public int numeroElementos() {
			return tabla.length;
		}
		
		//Muestra por consola el contenido de la lista
		public void mostrar() {
			System.out.println("Lista: " + Arrays.toString(tabla));
		}
			
		
}