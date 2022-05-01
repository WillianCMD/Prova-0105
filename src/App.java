import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        String pesquisa;
    int armazenamento = 10;
    int pilotoscadastrados = 0;
    piloto[] _pilotos = new piloto [armazenamento];
        try (Scanner scanner = new Scanner(System.in)) {
        int opcao;
            do {      
                System.out.println("1 - Cadastrar piloto");
                System.out.println("2 - Listar pilotos cadastrados");
                System.out.println("3 - Localizar piloto pelo CPF");
                System.out.println("4 - Aumentar espaço de armazenamento");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
    opcao = scanner.nextInt();
        switch(opcao){
        case 1: if(pilotoscadastrados == _pilotos.length)
        {System.out.println("Capacidade de armazenamento maxima atingida, selecione a opcão 4 para expandir o armazenamento!");
        break ;}
        else{System.out.println("Informe o nome do piloto");
        String nome = scanner.next();
        System.out.println("Informe o CPF do piloto");
        String cpf = scanner.next();
        piloto piloto = new piloto(nome, cpf); 
        
        _pilotos[pilotoscadastrados] = piloto;
        pilotoscadastrados++;

        System.out.println("piloto cadastrado");

         break;}


         case 2: if(pilotoscadastrados == 0) 
         {System.out.println("Não há piloto cadastrado");}
        else
         {System.out.println("Abaixo lista de pilotos cadastrados");
        for(int i = 0; i <= pilotoscadastrados; i++){
        System.out.println(_pilotos[i]);}
            
        }break;
    
        case 4: {System.out.println("informe a capacidade de armazenamento desejada ");
        armazenamento = scanner.nextInt();
        System.out.println("A capacidade de armazenamento foi aumentada para "+armazenamento+" ");
        break;
        }}}
        while(opcao!=0); 
        
    }
}}