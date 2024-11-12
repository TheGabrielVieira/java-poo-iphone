package aplicativos.telefone;

public class TelefoneCell implements AplicativoTelefone{
    public void ligar(String numero){
        System.out.println("Fazendo uma chamada para " + numero);
    }

    public void atender() {
        System.out.println("O celular está tocando");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz foi iniciado");
    }
}
