package aplicativos.musica;

public class TocadorMp3 implements AplicativoMusica{
    public void tocar(){
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionar() {
        System.out.println("Opção de musica selecionada");
    }
}
