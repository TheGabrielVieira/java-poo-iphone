package aplicativos.navegador;

public class NavegadorInternet implements AplicativoNavegador {
    private int abas;

    public NavegadorInternet() {
        abas = 0; // Inicia com zero abas abertas
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        abas++;
        System.out.println("Nova aba adicionada. Total de abas: " + abas);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
