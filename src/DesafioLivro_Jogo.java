import java.util.Scanner;

public class DesafioLivro_Jogo {

	public static void main(String[] args) {
		/*AUTOR: LUCAS CARDOSO DE CASTRO
		 * NOME DO JOGO:
		 * Atividade realizada no m�dulo de L�gica de Programa��o da imers�o Java Xpert*/
		
		String nome, resposta, nomeDog;
		int senha1=0, senha2=0;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Voc� n�o parece confiante, tem certeza que realmente deseja jogar?");
		resposta = leitor.next();
		
		if (resposta.equalsIgnoreCase("SIM")) {
			System.out.println("�timo! Qual seu nome aventureiro?");
			nome = leitor.next();
			System.out.println(nome + ", voc� tem uma ESPADA ou um C�O para lhe acompanhar nessa aventura. Qual voc� deseja levar?");
			resposta = leitor.next();
		
			if(resposta.equalsIgnoreCase("C�O")) {
				System.out.println("Agora escolha um nome para o seu companheiro");
				nomeDog = leitor.next();
				System.out.println("Certo! Est� acotecendo um assalto na cidade de Los Dev, v� de pressa com o seu companheiro " + nomeDog + " para l�");
				System.out.println("Voc�s devem recuperar todos produtos roubados da joalheria, voc�s aceitam?");
				resposta = leitor.next();
				
				if(resposta.equalsIgnoreCase("SIM")) {
				    System.out.println("Ap�s chegar ao local o companheiro do aventureiro reconheceu os bandidos");
					System.out.println(nome + ":" + " Se acalme " + nomeDog + " pare de latir!");
					System.out.println("Os bandidos escutaram o cachorro latindo e iniciaram uma fuga. Voc� deseja ir atr�s dos bandidos para recuperar as j�ias?");
					resposta = leitor.next();
					
					if(resposta.equalsIgnoreCase("SIM")) {
						System.out.println("J� que o cachorro conhecia os bandidos. O aventureiro perguntou se poderia lev�-lo at� o esconderijo");
						System.out.println(nome + ": " + nomeDog + ", voc� pode me levar at� o esconderijo deles?");
						System.out.println("O cachorro balancou o rabo e latiu, se mostrando preocupado. Confirmou que poderia lev�-lo");
						System.out.println("Voc� deseja ir at� o esconderijo dos bandidos?");
						resposta = leitor.next();
						
						if(resposta.equalsIgnoreCase("SIM")) {
							System.out.println("Ap�s chegar ao esconderijo, " + nome + " notou que haveria uma s�rie de desafios para acessar o cofre dos bandidos onde foram guardados as j�ias");
							System.out.println("Voc� deseja iniciar esses desafios?");
							resposta = leitor.next();
							
							if(resposta.equalsIgnoreCase("SIM")) {
								while(senha1!=8642) {
									System.out.println("Para que seja poss�vel acessar o esconderijo dos bandidos, uma senha deve ser decifrada");
									System.out.println("Dica: uma sequ�ncia de 4 n�meros pares decrescentes");
									senha1 = leitor.nextInt();
								}
								
								System.out.println("ACESSO LIBERADO");
								System.out.println("Deseja prosseguir para chegar ao cofre dos bandidos?");
								resposta = leitor.next();
								
								if(resposta.equalsIgnoreCase("SIM")) {
									System.out.println("Ap�s entrar no esconderijo " + nome + " e " + nomeDog + " se depararam com os bandidos comemorando pelo assalto bem sucedido");
									System.out.println("Voc� deseja prender os bandidos?");
									resposta = leitor.next();
									
									if(resposta.equalsIgnoreCase("SIM")) {
										System.out.println("Agora que os bandidos est�o presos, voc� deve procurar o cofre no esconderijo. Voc� aceita?");
										resposta = leitor.next();
										
										if(resposta.equalsIgnoreCase("SIM")) {
											System.out.println("Depois de algumas horas procurando pelo cofre, " + nomeDog + " conseguiu encontra-lo");
											System.out.println("O cofre tem outro desafio para que seja poss�vel abri-lo. Voc� deseja resolver?");
											resposta = leitor.next();
											
											if(resposta.equalsIgnoreCase("SIM")) {
												while(senha2!=9631) {
													System.out.println("Dica: uma sequ�ncia de 4 n�meros �mpares decrescentes");
													senha2 = leitor.nextInt();
												}
												
												System.out.println("COFRE DESBLOQUEADO");
												System.out.println("Voc� deseja devolver as j�ias roubadas?");
												resposta = leitor.next();
												
												if(resposta.equalsIgnoreCase("SIM")) {
													System.out.println("MISS�O CONCLU�DA");
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
			System.out.println("Melhor mesmo... Esse jogo n�o � para os fracos!");
		}
		leitor.close();
	}

}
}

