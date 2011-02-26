/**

Código para testar se o sorteio realizado 
pelo Math.random é tendencioso

*/

public class MathRandomTest {
	public static void main(String[] args) {
		int zero = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		
		for (int i = 0; i < 20000; i++) {
			int x = (int) (Math.random() * 5);
			switch(x){
				case 0: zero++; break;
				case 1: um++; break;
				case 2: dois++; break;
				case 3: tres++; break;
				case 4: quatro++; break;
			}
			System.out.println(x);
		}
		System.out.println("zero: "+zero);
		System.out.println("um: "+um);
		System.out.println("dois: "+dois);
		System.out.println("tres: "+tres);
		System.out.println("quatro: "+quatro);
	}

}
