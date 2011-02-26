/**
Algoritmo de ordenacao BubbleSort

autor: Carlos Henrique Miguel

data: ano 2010


*/
public class BubbleSort {

	public static void main(String[] args) {
		int [] v= {7,9,1,6,5,10,0};
		int i,j, aux;
		for(i=0;i < v.length -1; i++){
			
			for(j=i+1; j < v.length; j++){
				if (v[i] > v[j]){
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
				
			}
			
		}
		for (i=0; i < v.length; i++){
			System.out.print(v[i]);
			if (i < v.length - 1){
				System.out.print(", ");
			}
		}
	}
}
