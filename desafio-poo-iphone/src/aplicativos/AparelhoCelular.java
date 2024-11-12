package aplicativos;

import aplicativos.musica.AplicativoMusica;
import aplicativos.musica.TocadorMp3;
import aplicativos.funcao.OpcaoMusica;
import aplicativos.telefone.AplicativoTelefone;
import aplicativos.telefone.TelefoneCell;
import aplicativos.navegador.AplicativoNavegador;
import aplicativos.navegador.NavegadorInternet;

public class AparelhoCelular {
    private AplicativoMusica aplicativoMusica;
    private AplicativoTelefone aplicativoTelefone;
    private AplicativoNavegador aplicativoNavegador;

    // Construtor para inicializar todas as funcionalidades
    public AparelhoCelular(AplicativoMusica aplicativoMusica, AplicativoTelefone aplicativoTelefone, AplicativoNavegador aplicativoNavegador) {
        this.aplicativoMusica = aplicativoMusica;
        this.aplicativoTelefone = aplicativoTelefone;
        this.aplicativoNavegador = aplicativoNavegador;
    }

    // Método para acionar o aplicativo de música
    public void acionarAplicativoMusica() {
        aplicativoMusica.tocar();
    }

    // Método para acionar o aplicativo de telefone
    public void acionarAplicativoTelefone(String numero) {
        aplicativoTelefone.ligar(numero);
    }

    // Método para acionar o navegador
    public void acionarAplicativoNavegador(String url) {
        aplicativoNavegador.exibirPagina(url);
    }

    public static void main(String[] args) {
        // Criando as funcionalidades específicas
        AplicativoMusica musica = new TocadorMp3(); // Pode usar TocadorMp3 ou OpcaoMusica
        AplicativoTelefone telefone = new TelefoneCell();
        AplicativoNavegador navegador = new NavegadorInternet();

        // Criando o aparelho celular com as funcionalidades
        AparelhoCelular apcell = new AparelhoCelular(musica, telefone, navegador);

        // Testando os aplicativos
        System.out.println("Ação no reprodutor musical:");
        apcell.acionarAplicativoMusica(); // Testa o reprodutor musical

        System.out.println("\nAção no telefone:");
        apcell.acionarAplicativoTelefone("9611-4631"); // Testa a chamada telefônica

        System.out.println("\nAção no navegador:");
        apcell.acionarAplicativoNavegador("https://www.siteExemplo.com"); // Testa a navegação
    }
}

