import java.util.HashMap;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Scanner scan = new Scanner(System.in);

        int decisao = 0;
        while (decisao != 8) {
            System.out.println("1 - Adicionar valor.");
            System.out.println("2 - Resgatar valor.");
            System.out.println("3 - Remover valor.");
            System.out.println("4 - Total de itens.");
            System.out.println("5 - Mostrar todas as chaves.");
            System.out.println("6 - Mostrar todos os valores.");
            System.out.println("7 - Mostrar todas as chaves e valores.");
            System.out.println("8 - Sair do sistema");

            System.out.print("Por favor, selecione uma opção: ");
            decisao = scan.nextInt();

            switch(decisao) {

                case 1:
                    System.out.print("Por favor, insira uma chave para esse valor: ");
                    String chave = scan.nextLine();
                    chave = scan.nextLine();
                    System.out.print("Por favor, insira o valor: ");
                    String valor = scan.nextLine();
                    valor = scan.nextLine();
                    hashMap.put(chave, valor);
                    continue;

                case 2:
                    System.out.print("Insira a chave do valor que deseja buscar: ");
                    chave = scan.nextLine();
                    chave = scan.nextLine();
                    String imprime = null;
                    for (String item : hashMap.keySet()) {
                        if (item == chave) {
                            System.out.println(item);
                            imprime = item;
                        }
                    }
                    if (imprime == null) {
                        System.out.println("Chave inválida.");
                    }
                    continue;

                case 3:
                    System.out.print("Insira a chave do valor que deseja buscar: ");
                    chave = scan.nextLine();
                    chave = scan.nextLine();
                    imprime = null;
                    for (String item : hashMap.keySet()) {
                        if (item == chave) {
                            hashMap.remove(item);
                            imprime = item;
                        }
                    }
                    if (imprime == null) {
                        System.out.println("Chave inválida.");
                    }
                    continue;

                case 4:
                    System.out.println(hashMap.size());
                    continue;

                case 5:
                    for (String item : hashMap.keySet()) {
                        System.out.println(item);
                    }
                    continue;

                case 6:
                    for (String item : hashMap.values()) {
                        System.out.println(item);
                    }
                    continue;

                case 7:
                    for (String item : hashMap.keySet()) {
                        System.out.println("Chave: " + item + "Valor: " + hashMap.get(item));
                    }
                    continue;

                case 8:
                    break;
            }
            System.out.println("Obrigado por utilizar nossos serviços.");
        }
    }
}
