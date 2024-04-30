public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Ligando via iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo via iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica via iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica via iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica via iphone");
    }
}
