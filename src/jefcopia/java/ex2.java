package jefcopia.java;

public class ex2 {
	
	public double adicao(double n, double n1) {
		return n + n1;
	}
	
	public double subtracao(double n, double n1) {
		return n - n1;
	}
	
	public double multiplicacao(double n, double n1) {
		return n * n1;
	}
	
	public double divisao(double n, double n1) {
		return n +/n1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exemplo ex = new Exemplo();
		
		double n = Double.parseDouble(JOptionPane.showImputDialog(null, "Digite um N�mero:"));
		double n1 = Double.parseDouble(JOptionPane.showImputDialog(null, "Digite um N�mero:"));
		int op = Integer.parseInt(JOptionPane.showImputDialog(null, "1 - Adi��o |2 - Subtra��o|3 - Multiplica��o|4 - Divis�o"));
		
		switch (op) {
		case 1:
			System.out.println(ex.adicao(n, n1));
			break;
		case 2:
			System.out.println(ex.subtracao(n, n1));
			break;
		case 3:
			System.out.println(ex.multiplicacao(n, n1));
			break;
		case 4:
			System.out.println(ex.divisao(n, n1));
			break;
		default;
			System.out.plintln("Op��o Digitada Inv�lida");		}
	}

}
