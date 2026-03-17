package calculos;

import corpo.Titulo;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import com.google.gson.reflect.TypeToken;


public class GerenciadorDeEstoque {
    private List<Titulo> listaDeProdutos = new ArrayList<>();

    public void adicionarProduto(Titulo titulo) {
        listaDeProdutos.add(titulo);
    }

    public void removerProduto(Titulo titulo, int quantidadeParaTirar) {
        //Numero de Peças do estoque:
        int quantidadeAtual = titulo.getQuantidade();
        //Faz a remoção:
        int novaQuantidade = quantidadeAtual - quantidadeParaTirar;
        //Salva o novo valor:
        titulo.setQuantidade(novaQuantidade);
        System.out.println("Quantidade atual: " + novaQuantidade);
    }

    public void exibirEstoque() {
        Collections.sort(listaDeProdutos);
        for (Titulo item : listaDeProdutos) {
            System.out.println(item);
        }

    }

    public ArrayList<Titulo> getListaDeProdutos() {
        return (ArrayList<Titulo>) this.listaDeProdutos;
    }

    public void carregarDados() {
        File arquivo = new File("estoque.json");
        if (!arquivo.exists()) return;

        // USE FILEREADER PARA LER
        try (FileReader reader = new FileReader(arquivo)) {
            Gson gson = new Gson();
            Type tipoLista = new TypeToken<ArrayList<Titulo>>() {
            }.getType();
            ArrayList<Titulo> listaLida = gson.fromJson(reader, tipoLista);

            if (listaLida != null) {
                this.listaDeProdutos.clear();
                this.listaDeProdutos.addAll(listaLida);
                System.out.println("Antigos itens recuperados: " + this.listaDeProdutos.size());
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar: " + e.getMessage());
        }
    }

    public void salvarDados() {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("estoque.json")) {

            gson.toJson(this.listaDeProdutos, writer);
            System.out.println("Sucesso! Tudo foi gravado no arquivo.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }
}




