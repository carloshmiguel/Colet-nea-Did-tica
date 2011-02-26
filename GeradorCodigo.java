/** 

Algoritmo recursivo que constroi o codigo com todas as possibilidades de combinacao entre variaveis booleanas de um dado conjunto.

autor: Carlos Henrique Miguel

data: ano 2010

*/

public class GeradorCodigo {

	public boolean montaCodigo(int i, String[] b, boolean elseIf) {
		int j;
		boolean isFolha = false;
		if (i < b.length) {

			System.out.println("if(" + b[i] + ") {");

			montaCodigo(i + 1, b, false);

			System.out.print("} else ");

			isFolha = montaCodigo(i + 1, b, true);
			if (isFolha) {
				System.out.print(" { ");
			}
			if (!elseIf) {

				System.out.println("}");
			}
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		String[] b = { "b1", "b2", "b3","b4"};
		boolean b1=false, b2=false, b3=false, b4=false;
		int i = 0;		
		GeradorCodigo gc = new GeradorCodigo();
		gc.montaCodigo(i, b, false);

	// O codigo gerado deve ser identico ao codigo abaixo	

		
		if (b1) {

			if (b2) {

				if (b3) {

					if (b4) {

					} else {
					}
				} else if (b4) {

				} else {
				}
			} else if (b3) {

				if (b4) {

				} else {
				}
			} else if (b4) {

			} else {
			}
		} else if (b2) {

			if (b3) {

				if (b4) {

				} else {
				}
			} else if (b4) {

			} else {
			}
		} else if (b3) {

			if (b4) {

			} else {
			}
		} else if (b4) {

		} else {
		}		
		
	}
}
