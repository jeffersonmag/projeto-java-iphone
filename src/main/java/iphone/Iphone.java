package main.java.iphone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Iphone implements Telefone, Navegador, Reprodutor {

    private Map<String, Integer> contatos;
    private List<String> musicas;

    public Iphone() {
        this.contatos = new HashMap<>();
        this.musicas = new ArrayList<>();
    }

    @Override
    public void ligar(String contato) {
        if (contatos.containsKey(contato)) {
            Integer numero = contatos.get(contato);
            System.out.println("Ligando para o " + contato + ": " + numero);
        } else
            System.out.println("Contato não encontrado!");

    }

    @Override
    public void atender(String contato) {
        if (contatos.containsKey(contato)) {
            System.out.println("Atendendo a ligação!");
        } else
            System.out.println("Ligação recusada!");
    }

    @Override
    public void iniciarCorreioVoz(String contato) {
        if (contatos.containsKey(contato)) {
            System.out.println("Iniciando o correio de voz. Número: " + contato);
        } else
            System.out.println("Contato não encontrado!");
    }

    @Override
    public void selecionarMusica(String musica) {
        if (musicas.contains(musica)) {
            System.out.println("Musica foi Selecionada, Voce deseja tocá-la agora? s ou n ");
            Scanner scanner = new Scanner(System.in);
            String entrada = scanner.nextLine();
            if (Objects.equals(entrada, "s")) {
                tocar(musica);
            } else
                pausar(musica);
        } else
            System.out.println("Música não foi encontrada!");

    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando a música " + musica);
    }

    @Override
    public void pausar(String musica) {
        System.out.println(musica + " foi Pausada");

    }

    public void abrirNavegador() {
        System.out.println("Navagador aberto...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o site para navegar:");
        String entrada = scanner.nextLine();
        exibirPagina(entrada);
    }

    @Override
    public void exibirPagina(String site) {
        System.out.println("Entrando no site: " + site);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Add nova aba em branco");

    }

    @Override
    public void atualizar(String site) {
        System.out.println("Pagina atualizada no site " + site);

    }
}