/**
Algoritmo de busca binaria em vetor

autor: Carlos Henrique Miguel

data: ano 2010

*/

public class BuscaBin {
	
	private int BinarySearch(int n, int[] v) {
		int esq = 0;
		int dir = v.length-1;
		int med = (esq+dir)/2; 
		while (esq <= dir){
			if(v[med] == n){
				return med;
			} else if (v[med]< n){
				esq = med + 1;
				med = (esq + dir)/2;
			} else {
				dir = med - 1 ;
				med = (esq + dir)/2;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] v ={1,4,23,45,78,88,90};
		BuscaBin b = new BuscaBin();
		int result = b.BinarySearch(90, v);
		System.out.println(result);
	}
}
