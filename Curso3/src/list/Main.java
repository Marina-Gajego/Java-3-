package list;

//**Exercicios**
//1. Crie uma classe `Pessoa` com atributos como nome, idade, e um metodo toString que represente esses atributos.
//No metodo main da classe `Principal`, crie um ArrayList de Pessoa chamado listaDePessoas.
//Adicione pelo menos três pessoas à lista utilizando o metodo add.
//Imprima o tamanho da lista utilizando o metodo size.
//Imprima a primeira pessoa da lista utilizando o metodo get.
//Imprima a lista completa
//3 Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
//4 Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
//5 Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.
//6 Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
//7 Crie uma interface Forma com um metodo calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.
//8 Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.
//9 Crie uma lista de números inteiros e utilize o metodo Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.
//10 Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.
//11 No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o metodo Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(20, "Fernando");
        Pessoa pessoa2 = new Pessoa(15, "Denise");
        Pessoa pessoa3 = new Pessoa(30, "Sandra");

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        System.out.println("Lista completa");
        System.out.println(listaDePessoas);
        System.out.println("-----------------------------------------------------------------------------------------");

        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Teste");
        listaStrings.add("Nome");
        listaStrings.add("Titulo");
        listaStrings.add("Letras");

        for (String item : listaStrings){
            System.out.println(item);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        Cachorro cachorro = new Cachorro();
        Animal animal = cachorro;

        if (animal instanceof Cachorro){
            cachorro = (Cachorro) animal;
            System.out.println("Cast realizado");
        }else{
            System.out.println("Cast falhou!!");
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        Produto produto1 = new Produto("Tenis", 100);
        Produto produto2 = new Produto("Blusa", 30);
        Produto produto3 = new Produto("Calça", 70);
        Produto produto4 = new Produto("Colete", 60);
        Produto produto5 = new Produto("Colar", 1000);

        List<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
        listaProduto.add(produto4);
        listaProduto.add(produto5);

        double soma = 0;
        for (Produto itemLista : listaProduto){
            soma += itemLista.getPreco();
        }

        System.out.println("Preço medio dos produtos: " + soma/listaProduto.size());
        System.out.println("-----------------------------------------------------------------------------------------");

        Quadrado quadrado1 = new Quadrado(2);
        Quadrado quadrado2 = new Quadrado(9);

        Circulo circulo1 = new Circulo(4.15);
        Circulo circulo2 = new Circulo(9);

        List<Forma> listaForma = new ArrayList<>();
        listaForma.add(quadrado1);
        listaForma.add(quadrado2);
        listaForma.add(circulo1);
        listaForma.add(circulo2);

        for (Forma item : listaForma){
            System.out.println("Area: " + item.calculaArea());
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        ContaBancaria conta2 = new ContaBancaria(125, 500);
        ContaBancaria conta3 = new ContaBancaria(854, 154400);
        ContaBancaria conta4 = new ContaBancaria(985, 2000);
        ContaBancaria conta5 = new ContaBancaria(778, 3000);

        List<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta2);
        listaContas.add(conta3);
        listaContas.add(conta4);
        listaContas.add(conta5);

        ContaBancaria contaMaiorSaldo = null;
        for (ContaBancaria item : listaContas){
            if (contaMaiorSaldo == null || item.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = item;
            }
        }

        System.out.println("Conta com maior saldo, numero:  " + contaMaiorSaldo.getNumeroConta() + " Saldo: R$"+ contaMaiorSaldo.getSaldo());
        System.out.println("-----------------------------------------------------------------------------------------");

        List<Integer> listaInteiros = new ArrayList();
            listaInteiros.add(2);
            listaInteiros.add(9);
            listaInteiros.add(8);
            listaInteiros.add(1);
            listaInteiros.add(6);

        Collections.sort(listaInteiros);
        System.out.println("Lista ordenada");
        System.out.println(listaInteiros);
        System.out.println("-----------------------------------------------------------------------------------------");

        List<String> listaTitulo = new ArrayList<>();
        listaTitulo.add("Teste");
        listaTitulo.add("Nome");
        listaTitulo.add("Titulo");
        listaTitulo.add("Letras");

        Collections.sort(listaTitulo);
        System.out.println(listaTitulo);

    }
}
