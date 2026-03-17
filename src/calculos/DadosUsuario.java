package calculos;

import java.util.InputMismatchException;
import java.util.Scanner;
import corpo.Titulo;

public class DadosUsuario {

    private GerenciadorDeEstoque estoque;

    public DadosUsuario(GerenciadorDeEstoque estoqueAdicionado) {
        this.estoque = estoqueAdicionado;
    }

    public void solicitarDadosUsuario() {
        Scanner leitura = new Scanner(System.in);
        System.out.println(" Cadastro de Equipamentos ");

        System.out.print("Nome do item: ");
        String nome = leitura.nextLine();

        int quantidade = 0;
        boolean entradaValida = false;


        while (!entradaValida) {
            try {
                System.out.print("Quantidade: ");
                quantidade = leitura.nextInt();
                leitura.nextLine();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("=> ERRO: Você digitou uma letra! Use apenas números.");
                leitura.nextLine();
            }
        }

        System.out.print("Qualidade: ");
        String qualidade = leitura.nextLine();

        System.out.print("Localização: ");
        String local = leitura.nextLine();

        Titulo novoItem = new Titulo(nome, quantidade, qualidade, local);
        this.estoque.adicionarProduto(novoItem);
    }
}

