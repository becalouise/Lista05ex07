package Lista05ex07;

import java.util.Scanner;

public class Ex07 { 
     	public static void main(String args[])throws Exception {
		
		System.out.println("Calcula prestação");
		
		Scanner sc = new Scanner(System.in);
		
		int cont;
		int quantPrest = 0;
		double valorTotal;
		double totalAPagar=0;
		
		System.out.print("\nPressione 1 para inciar ou 2 para sair do programa: ");
		
		cont=sc.nextInt();
		
		while (cont==1) {
			
			System.out.print("\nInforme o valor da prestação: ");
			double prestacao = sc.nextDouble();
			System.out.print("\nInforme os dias em atraso: ");
			int diasAt = sc.nextInt();
			
			valorTotal = valorPagamento(prestacao, diasAt);
			
			System.out.print("\n\nValor a pagar referente a essa prestação: "+valorTotal);
			
			totalAPagar = totalAPagar+valorTotal;
			
			System.out.print("\n\nDeseja informar outra prestação? 1 - Sim 2 - Não: ");
			
			cont=sc.nextInt();
			
			quantPrest++;
			
		}
		
		sc.close();
		
		
		System.out.print("\n\nRelatório dia:\nQuantidade de prestações: "
							+quantPrest
							+"\nValor total a pagar(acrescido de juros caso haja): R$ "
							+totalAPagar);
		
	}
	
	public static double valorPagamento(double prestacao, int diasAt) {
		
		if(diasAt!=0) {
			prestacao=prestacao+(prestacao*0.03)+(diasAt*(prestacao*0.001));
		}else {
			
		}
		return prestacao;
	}
}