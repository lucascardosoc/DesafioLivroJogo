import java.util.Scanner;

public class DesafioLivro_Jogo {

	public static void main(String[] args) {
		/*AUTOR: LUCAS CARDOSO DE CASTRO
		 * NOME DO JOGO:
		 * Atividade realizada no módulo de Lógica de Programação da imersão Java Xpert*/
		
		String nome, resposta, nomeDog;
		int senha1=0, senha2=0;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Você não parece confiante, tem certeza que realmente deseja jogar?");
		resposta = leitor.next();
		
		if (resposta.equalsIgnoreCase("SIM")) {
			System.out.println("Ótimo! Qual seu nome aventureiro?");
			nome = leitor.next();
			System.out.println(nome + ", você tem uma ESPADA ou um CÃO para lhe acompanhar nessa aventura. Qual você deseja levar?");
			resposta = leitor.next();
		
			if(resposta.equalsIgnoreCase("CÃO")) {
				System.out.println("Agora escolha um nome para o seu companheiro");
				nomeDog = leitor.next();
				System.out.println("Certo! Está acotecendo um assalto na cidade de Los Dev, vá de pressa com o seu companheiro " + nomeDog + " para lá");
				System.out.println("Vocês devem recuperar todos produtos roubados da joalheria, vocês aceitam?");
				resposta = leitor.next();
				
				if(resposta.equalsIgnoreCase("SIM")) {
				    System.out.println("Após chegar ao local o companheiro do aventureiro reconheceu os bandidos");
					System.out.println(nome + ":" + " Se acalme " + nomeDog + " pare de latir!");
					System.out.println("Os bandidos escutaram o cachorro latindo e iniciaram uma fuga. Você deseja ir atrás dos bandidos para recuperar as jóias?");
					resposta = leitor.next();
					
					if(resposta.equalsIgnoreCase("SIM")) {
						System.out.println("Já que o cachorro conhecia os bandidos. O aventureiro perguntou se poderia levá-lo até o esconderijo");
						System.out.println(nome + ": " + nomeDog + ", você pode me levar até o esconderijo deles?");
						System.out.println("O cachorro balancou o rabo e latiu, se mostrando preocupado. Confirmou que poderia levá-lo");
						System.out.println("Você deseja ir até o esconderijo dos bandidos?");
						resposta = leitor.next();
						
						if(resposta.equalsIgnoreCase("SIM")) {
							System.out.println("Após chegar ao esconderijo, " + nome + " notou que haveria uma série de desafios para acessar o cofre dos bandidos onde foram guardados as jóias");
							System.out.println("Você deseja iniciar esses desafios?");
							resposta = leitor.next();
							
							if(resposta.equalsIgnoreCase("SIM")) {
								while(senha1!=8642) {
									System.out.println("Para que seja possível acessar o esconderijo dos bandidos, uma senha deve ser decifrada");
									System.out.println("Dica: uma sequência de 4 números pares decrescentes");
									senha1 = leitor.nextInt();
								}
								
								System.out.println("ACESSO LIBERADO");
								System.out.println("Deseja prosseguir para chegar ao cofre dos bandidos?");
								resposta = leitor.next();
								
								if(resposta.equalsIgnoreCase("SIM")) {
									System.out.println("Após entrar no esconderijo " + nome + " e " + nomeDog + " se depararam com os bandidos comemorando pelo assalto bem sucedido");
									System.out.println("Você deseja prender os bandidos?");
									resposta = leitor.next();
									
									if(resposta.equalsIgnoreCase("SIM")) {
										System.out.println("Agora que os bandidos estão presos, você deve procurar o cofre no esconderijo. Você aceita?");
										resposta = leitor.next();
										
										if(resposta.equalsIgnoreCase("SIM")) {
											System.out.println("Depois de algumas horas procurando pelo cofre, " + nomeDog + " conseguiu encontra-lo");
											System.out.println("O cofre tem outro desafio para que seja possível abri-lo. Você deseja resolver?");
											resposta = leitor.next();
											
											if(resposta.equalsIgnoreCase("SIM")) {
												while(senha2!=9631) {
													System.out.println("Dica: uma sequência de 4 números ímpares decrescentes");
													senha2 = leitor.nextInt();
												}
												
												System.out.println("COFRE DESBLOQUEADO");
												System.out.println("Você deseja devolver as jóias roubadas?");
												resposta = leitor.next();
												
												if(resposta.equalsIgnoreCase("SIM")) {
													System.out.println("MISSÃO CONCLUÍDA");
												}
												
											}
										}
									}
								
								}
									
							}
						}
					}
				}
			}
			
		
		 else {
			System.out.println("Melhor mesmo... Esse jogo não é para os fracos!");
		}
		leitor.close();
	}

}
}

