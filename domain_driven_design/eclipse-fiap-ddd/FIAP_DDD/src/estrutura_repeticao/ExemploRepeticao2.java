package estrutura_repeticao;

public class ExemploRepeticao2 {
	public static void main(String[] args) {
		int i = 200;
		int f = 100;
		
		if(i < f) {
			System.out.printf("%d deve ser maior que %d \n", i,f);
		}else {
			while(i >= f) {
				System.out.println("i: " + i);
				if(i == 150)
					break;
				i--;
			}
		}
	}

}
