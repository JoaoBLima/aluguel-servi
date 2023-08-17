package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import prova2.Aluguel;
import servicos.ServicoGerarBoleto;
import servicos.ServicoTaxaMarAzul;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("informe os dados da locaçao: ");
		System.out.println("codigo do imovel: ");
		int codigo = sc.nextInt();
		sc.nextLine();
		System.out.println("descricao: ");
		String descricao = sc.nextLine();
		System.out.println("valor da diaria: ");
		double valordiaria = sc.nextDouble();
		System.out.println("data de entrada: ");
		System.out.print("Data (dd/MM/yyyy): ");
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate entrada = LocalDate.parse(sc.next(),fmt);
		System.out.println("data de saida: ");
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate saida = LocalDate.parse(sc.next(),fmt1);
		
		  Aluguel aluguel = new Aluguel(entrada, saida);

	        
	        ServicoTaxaMarAzul servicoTaxa = new ServicoTaxaMarAzul();

	        
	        ServicoGerarBoleto servicoBoleto = new ServicoGerarBoleto(valordiaria, servicoTaxa);

	       
	        servicoBoleto.processarBoleto(aluguel);
	        System.out.println("boleto mar azul ");
	        System.out.println(" ");

	        sc.close();
		

	}

}
