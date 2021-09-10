package jokenpo2;

import java.util.Random;
import java.util.Scanner;

public class JokenpoDois {

	  public static void main(String[] args) {
		
		  Scanner leitor = new Scanner (System.in);
		  Random sorteio = new Random();
		  
		 String jogardnv ;
		  int ganhouser = 0,ganhopc = 0,contadorempate=0;
		  int contador = 0;
		  int partidas,objetos,userjoga,vitoriaspc,vitoriasuser;
		  int pcjoga = sorteio.nextInt (3)+1;
		  
		  System.out.println("quantas partida deseja jogar? (escolha um numero impar ou maior que 3): ");
		  partidas = leitor.nextInt();
		  
		  if(partidas>=3) {
			     
		  while(contador<partidas) {
			  contador++;
			  System.out.println("escolha (1)pedra,(2)papel,(3)tesoura");
			  objetos = leitor.nextInt();
			  
			  if(objetos==1) {
					if(pcjoga==1) {
						System.out.println("empate!..... o computador escolheu " +pcjoga);
						contadorempate++;
					}else if(pcjoga==2) {
						System.out.println("derrota sua.....o computador escolheu " +pcjoga);
						ganhopc++;
					}else {
						System.out.println("vitoria sua..... o computador escolheu " +pcjoga);
					}ganhouser++;
						
				}else if(objetos==2) {
					if(pcjoga==2) {
						System.out.println("empate..... o computador escolheu " +pcjoga);
						contadorempate++;
					}else if(objetos==1) {
						System.out.println("vitoria sua ..... o computador escolheu " +pcjoga);
						ganhouser++;
					}else {
						System.out.println("derrota sua ..... o computador escolheu " +pcjoga);
					}ganhopc++;
				}else if(objetos==3) {
					if(pcjoga==3) {
						System.out.println("empate..... o computador escolheu " +pcjoga);
						contadorempate++;
					}else if(pcjoga==1) {
						System.out.println("vitoria pc..... o computador escolheu " +pcjoga);
						ganhopc++;
					}else if(pcjoga==2) {
						System.out.println("vitoria sua..... o computador escolheu " +pcjoga);
						ganhouser++;
					}else {
						System.out.println("derrota..... o computador escolheu " +pcjoga);
					}
				}else if (objetos>=4 || objetos==0){
					System.out.println("err0,escolha um numero entre 1 e 3.");
				}if(ganhopc>ganhouser) {
					System.out.println(+ganhopc+ " : placar pc X placar user : "+ganhouser);
					System.out.println("pc ganho");
				}else if(contadorempate==ganhouser && contadorempate==ganhopc) {
					System.out.println(+ganhopc+ " : placar pc X placar user : "+ganhouser);
					System.out.println("empato");
				}else {
					System.out.println(+ganhopc+ " : placar pc X placar user : "+ganhouser);
					System.out.println("vc ganhou!");
				}
					
				
			  }System.out.println("deseja jogar dnv?");
			  jogardnv = leitor.next();
			  
		       
		  
		  }
		  else {
			  System.out.println("Quantia muito baixo,escolha um numero maior!");
		  }


		  
		  
		  
		  
		  
	}
}
