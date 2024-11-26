package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cartao cartao = new Cartao();
        List<Compra> listaCompras = new ArrayList<>();

        System.out.println("Digite o limite do cartão: ");
        cartao.setLimite(scanner.nextDouble());

        double saldoAtual = cartao.getLimite();
        int opcao;

        do {
            Compra compra = new Compra();
            System.out.println("Digite a descrição da compra: ");
            compra.setDescricao(scanner.next());
            System.out.println("Digite o valor da compra: ");
            compra.setValor(scanner.nextDouble());

            if (compra.getValor() > cartao.getLimite()) {
                System.out.println("Limite insuficiente!!");
                System.out.println("Limite: " + cartao.getLimite());
                break;
            } else if (compra.getValor() > saldoAtual) {
                System.out.println("Saldo insuficiente!!");
                System.out.println("Saldo no cartão: " + saldoAtual);
                break;
            } else {
                System.out.println("Compra realizada!!");
                listaCompras.add(compra);
                saldoAtual -= compra.getValor();
                System.out.println("Saldo atual: " + saldoAtual);
            }

            System.out.println("Digite 0 para sair ou 1 para continuar");
            opcao = scanner.nextInt();

        } while (opcao != 0);

        System.out.println("*******************");
        System.out.println("COMPRAS REALIZADAS:");
        for (Compra c : listaCompras){
            System.out.println(c);
        }
        System.out.println("Saldo final: " + saldoAtual);
        System.out.println("*******************");
        scanner.close();
    }
}
