package testes;

import java.util.Scanner;

public class SaOutubro {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[][] reservas = new String[20][12];
        int resp;
        int horarioUser;
        int salaUser;
        String nomes = null;
        
        for(int i = 0; i < 20; i++) {
            for(int j = 0; j < 12; j++) {
                reservas[i][j] = "livre"; 
            }
        }
        
        
        System.out.println("Seja bem vindo!"
        +"\n--------------------------");

        do {
            do {
        	System.out.print("\n"
                    +"Menu:\n"
                    +"1. Criar reserva\r\n"
                    + "2. Acompanhar reserva\r\n"
                    + "3. Sair\n"
                    + "\nDigite o código da ação: ");
            resp = input.nextInt();
            if(resp < 1 || resp > 3) {
            	System.out.println("\nCódigo inválido!");
            }
            }while(resp < 1 || resp > 3);
        System.out.println("--------------------------\n");
            //Switch entra
            switch(resp) {
            //caso o usuário insira 1 o programa vai reservar uma sala
            case 1:
                //Criação de sala
            	
            	System.out.println("Salas:");
                for(int sala = 0; sala < reservas.length; sala++) {
                    System.out.println("Sala "+(sala+1));
                    int horasLivres = 0;
                    for(int horario = 0; horario < 12; horario++) {
                        if(reservas[sala][horario].equals("livre")) {
                            horasLivres++;
                        }                    
                    }
                    System.out.println(horasLivres+" Horários Livres\n");
                    
                }
                do {
                System.out.print("Escolha uma sala para reservar: ");
                salaUser = input.nextInt();
                salaUser--;
            	
                System.out.println();
                
                if(salaUser < 0 || salaUser > 19) {
                	System.out.println("Sala inválida! Tente novamente...\n");
                }
            	} while(salaUser < 0 || salaUser > 19);
                
                //Comando para que mostra os horários disponíveis
                for(int horarios = 0; horarios < 12; horarios++) {
                    System.out.print("Horario "+(horarios+1)+": "+(horarios+8)+":00 horas = "); 
                    if(reservas[salaUser][horarios].equals("livre")) {
                    	System.out.println("Livre");
                    	}
                    else {
                    	System.out.println("Ocupado");
                    	}
                	}
                System.out.print("\nInsira o horário a ser reservado:  ");
                horarioUser = input.nextInt();
                horarioUser--;
        
                //se a reserva existir o programa vai reiniciar e informar a já existencia de um usuario 
                if(!reservas[salaUser][horarioUser].equals("livre")) {
                    System.out.println("\nSala "+(salaUser+1)+" no horário das "+(horarioUser+8)+" já está reservada!");
                }
                //se não a sala já é reservada
                else {
                	//o usuário só precisa inserir seu nome para identificar o quarto
                	System.out.print("\nDigite seu nome: ");
                    nomes = input.next();
                	reservas[salaUser][horarioUser] = nomes;
                	System.out.println();
                	System.out.println("Sala "+(salaUser+1)+" no horário das "+(horarioUser+8)+" foi reservada!");
                	System.out.println("--------------------------");
                }
                break;
            
            case 2:
                System.out.print("Insira a sala: ");
                salaUser = input.nextInt();
                salaUser--;
                System.out.print("Insira o horário:  ");
                horarioUser = input.nextInt();
                horarioUser--;
                if(!reservas[salaUser][horarioUser].equals("livre")) {
                    System.out.println("Sala "+(salaUser+1)+" no horário das "+(horarioUser+8)+" foi reservado por = "
                                        +reservas[salaUser][horarioUser]);
                }
                else {
                    System.out.println("\nEsta sala está vazia!");
                }
                break; 
           
            case 3:
                System.out.println("Programa Finalizado!");
                break;
            }
        
        }while(resp != 3);
        
        input.close();
    }
}