package aplicativos.funcao;

import aplicativos.musica.AplicativoMusica;

public class OpcaoMusica implements AplicativoMusica {
    public void tocar(){
        System.out.println("Tocando no aplicativo de musica");
    }

    public void pausar() {
        System.out.println("Musica pausada pelo aplicativo de musica");
    }

    public void selecionar() {
        System.out.println("Musica selecionada pelo aplicativo de musica");
    }
}
