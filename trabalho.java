package trabalho;

import java.util.Scanner;


public class trabalho1 {

  public static void main(String[] args) {
  Scanner obter = new Scanner(System.in);
  
  int opcao=0;
  int n = 0;
  
  int i;
  
String comidas[] = new String[10];
String bebidas[] = new String[10];
String sobm[] = new String[10];
String nome[]= new String[10];
String telefone[]= new String[10];
String com[]= new String[10];



while(opcao != 6 ) {
	
System.out.println("Bem-vindo(a) ao restaurante Mara foods.");
System.out.println("");  

System.out.println("o que você procura?");
System.out.println("1-Cadastro");
System.out.println("2-Pratos");
System.out.println("3-Bebidas");
System.out.println("4-Sobremesas");
System.out.println("5-Vizualição do pedido ");
System.out.println("6-Finalizar pedido");

opcao = obter.nextInt();

if(opcao >6){
  System.out.println("");
  System.out.println("Erro.");
  System.out.println("");
  System.out.println("Retornando ao sistema...");
  System.out.println("");
  
}



switch (opcao){

case 1 :
	
System.out.println("1- CADASTRO");
System.out.println("");

System.out.println("NÚMERO DE PESSOAS NA MESA.");
n = obter.nextInt();

 for( i= 0;i<n;i ++) {



System.out.println("NOME:");
nome [i] = obter.next();
System.out.println("");

System.out.println("TELEFONE");
 telefone [i] = obter.next();
 
System.out.println("AVALIAÇÃO DO ATENDIMENTO");
com [i]= obter.next();

}



break ;

case 2 : 
System.out.println("Pratos");
System.out.println("");
System.out.println("Cardápio");
System.out.println("");
for ( i = 0; i< n;i++){
System.out.println("batatinha");
System.out.println("Feijoada");
System.out.println("Baião");
System.out.println("Picanha");
System.out.println("");

System.out.println("digite o que deseja:");
comidas[i]= obter.next();

System.out.println("");
}
break;

case 3:
System.out.println("BEBIDAS");
System.out.println("");

for ( i = 0; i< n;i++){
  
  
System.out.println("Água");

System.out.println("Caipirinha");

System.out.println("Vinho");

System.out.println("Marguerita");

System.out.println("Tequila");

System.out.println("Refrigerante");

System.out.println("digite o que deseja:");
bebidas[i]= obter.next();

  
}


break ;

case 4:

System.out.println("SOBREMESAS");
System.out.println("");
for ( i = 0; i< n;i++){

System.out.println("Peddigatel");
System.out.println("Mousse");
System.out.println("Sorvete");
System.out.println("Pudim");

System.out.println("digite o que deseja:");
sobm[i] = obter.next();
}

break ;
  
  


case 5:

for(i=0;i<n;i++){
  System.out.println("nome: " + nome[i]);
  System.out.println("Prato(s) escolhido(s): " + comidas[i]);
  System.out.println("Bebida escolhida:" + bebidas[i]);
  System.out.println("Sobremess escolhida:"+ sobm[i]);
  System.out.println("Avaliação do cliente:"+ com[i]);
  System.out.println("");
  
}

System.out.println("");

break;


case 6 :
System.out.println("Voce deseja realmente finalizar o pedido? 1 - Sim, 2 - Não");
int sair = obter.nextInt();

if( sair == 1) {
System.out.println("Sistema finalizado. o pedido ja está em andamento...");


}
else {
System.out.println("Retornando ao sistema...");
opcao = 10;

}



break;


  }

}



}

}