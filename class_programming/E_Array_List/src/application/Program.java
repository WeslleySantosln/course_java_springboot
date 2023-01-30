package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = (int)(Math.random() * 5 + 1);
		
		
		
		 List<String> list = new ArrayList<>();  
		 
		 list.add("-------- N O M E S -------");
		 list.add("Weslley");
		 list.add("Islanny");
		 list.add("Heitor");
		 list.add("Maria");
		 list.add("Hellen");
		 list.add("Jesus");
		 
		 System.out.println();
		 for(String ltn : list) {
			 System.out.println(ltn);
		 }
		 
		 System.out.println();
		 System.out.println("--------- TAMANHO DA LISTA ---------");		 
		 System.out.println("Tamanho da lista: " + list.size());
		 System.out.println("Weslley está na posição: " + list.indexOf("Weslley"));
		 System.out.println();
		 
		 
		 
		 System.out.println();
		 list.remove(0);
		 list.add(0, "-----------E L I M I N A Ç Ã O------------");
		 list.remove(i);
		 list.add(i, "-----------ELIMINADO------------");
	
		 for(String ltn : list) {
			 System.out.println(ltn);
		 }
		 
		 System.out.println();
		 
		 
		 System.out.println("");
		 System.out.println("-------- Filtrando quem tem a segunda letra com (e)--------------- ");
		 List<String> filtri = list.stream().filter(x -> x.charAt(1) == 'e').collect(Collectors.toList());
		 
		 for(String x : filtri) {
			 System.out.println(x);
		 }
		 
		 System.out.println("");
		 System.out.println("Removendo quem não começa com J");
		 System.out.println("");
		 
		 
		 list.removeIf(x -> x.charAt(0) !=  'J');
		 
		 System.out.println("Imprimindo");
		 for(String ltn : list) {
			 System.out.println(ltn);
		 }
		 
		 System.out.println();
		 
		 
	}

}