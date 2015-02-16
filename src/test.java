

public class test {
	private long[] array;
	private long tam=50000;
	
	//carga vector de 500 nº ordenado descendentemente
	public void cargar() {
		array=new long[(int) tam];
		for(int f=0;f<tam;f++) {
		array[f]=tam-f;}
	}
	
	public void burbuja() {
		for (int i = 0; i< tam-1; i++)  {
			for (int j = (int) (tam-1); j > i; j--)  {
				if (array[j] < array[j-1]) {
					int aux = (int) array[j];
					array[j] = array [j-1];
					array[j-1] = aux;
					}
			}
		}
	}
	public void seleccion( ) {
		int minimo, aux;
		for (int i = 0; i< tam; i++) {
			minimo = i;
			for (int j = i+1; j < tam; j++)
				if (array[j] < array[minimo])
					minimo = j;
			aux = (int) array[minimo];
			array[minimo] = array [i];
			array[i] = aux;
		}
	}
	public  void insercion ( ) {
		int aux;
		int j;
		for (int i=1; i<=tam-1; i++) {
		aux = (int) array[i];
		for (j=i-1; j>=0 && array[j]>aux; j--){
				 array[j+1] = array[j];
				 array[j] = aux;
			}
		}
	}

	public void imprimir() {
		//System.out.println("Vector ordenado.");
		for(int f=0;f<array.length;f++) {
			System.out.print(array[f]+"\t");
			if (f%15==0) System.out.println();
		}
		System.out.println();
	}
	
	public void cuentaMili(long tiempo){
		System.out
		.println("\nTiempo de ejecucion "
				+ (System.currentTimeMillis() - tiempo)
				+ " milisegundos");
	}
	public static void main(String[] ar) {
		test pv=new test();
		long tiempoInicio = System.currentTimeMillis();

			System.out.println("Hola mundo");	
		pv.cargar();
		System.out.println("\nVector desordenado:");
		//pv.imprimir();
		pv.seleccion();
		System.out.println("Vector ordenado (SELECCIÓN):");
		//pv.imprimir();
		// Aquí se detiene el tiempo y calculamos la diferencia
		pv.cuentaMili(tiempoInicio);
		
		tiempoInicio = System.currentTimeMillis();
		pv.cargar();
		System.out.println("\nVector desordenado:");
		//pv.imprimir();
		pv.burbuja();
		System.out.println("Vector ordenado (BURBUJA):");
		//pv.imprimir();
		pv.cuentaMili(tiempoInicio);
		
		tiempoInicio = System.currentTimeMillis();
		pv.cargar();
		System.out.println("\nVector desordenado:");
		//pv.imprimir();
		pv.insercion();
		System.out.println("Vector ordenado (INSERCIÓN):");
		//pv.imprimir();
		pv.cuentaMili(tiempoInicio);
	}
}

