package principal;

import calculos.GerenciadorDeEstoque;
import calculos.DadosUsuario;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeEstoque meuEstoque = new GerenciadorDeEstoque();

        meuEstoque.carregarDados();

        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) {
            DadosUsuario formulario = new DadosUsuario(meuEstoque);
            formulario.solicitarDadosUsuario();

            System.out.print("Deseja cadastrar mais algum item ? (s/n): ");
            continuar = scanner.nextLine();
        }

        meuEstoque.salvarDados();
        System.out.println("Projeto Finalizado!");
    }
}






