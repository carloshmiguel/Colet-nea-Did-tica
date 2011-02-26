import java.io.File;


/**

Tres formas diferentes de fazer fatorial

autor: Carlos Henrique Miguel

data: ano 2010

*/
public class Fatorial {

	public Fatorial() {
		// TODO Auto-generated constructor stub
	}

	public int fatorialRecursivo(int numero) throws Exception {
		if (numero < 0) {
			throw new Exception();
		} else if (numero == 0) {
			return 1;
		} else {
			return numero * fatorialRecursivo(numero - 1);
		}
	}

	public int fatorialWhile(int numero) throws Exception {
		int i = 1;
		int fatorialIntermediario = numero;
		if (numero >= 0) {
			while (i < numero) {
				fatorialIntermediario = fatorialIntermediario * (numero - i);
				i++;
			}
		} else {
			throw new Exception();
		}
		return fatorialIntermediario;
	}

	public int fatorialFor(int numero) throws Exception {

		int fatorialIntermediario = numero;
		
		if(numero >= 0) {
		for(int i=1; i < numero; i++) {
			fatorialIntermediario = fatorialIntermediario*(numero-i);
		} 
		} else {
			throw new Exception();
		}
		return fatorialIntermediario;
	}
	
	public static void main(String[] args) {
		Fatorial f = new Fatorial();
		try {
			System.out.println("O fatorial de 3 é:" + f.fatorialRecursivo(3));
			System.out.println("O fatorial de 3 é:" + f.fatorialWhile(3));
			System.out.println("O fatorial de 3 é:" + f.fatorialFor(3));
			System.out.println("Diretorio do sistema:"+System.getProperty("user.dir")+File.separator);
		} catch (Exception e) {
			System.out.println("Número negativo não tem fatorial");
		}
	}
}
