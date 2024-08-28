package Usuario;

import Iphone.IOS;
import Iphone.Apps.AparelhoTelefonico;
import Iphone.Apps.NavegadorInternet;
import Iphone.Apps.ReprodutorMusical;

public class Usuario {
    public static void main(String[] args) {
        IOS apple = new IOS();

        AparelhoTelefonico telefone = apple;
        NavegadorInternet internet = apple;
        ReprodutorMusical musica = apple;

        internet.exibirPagina("www.apple.com.br");
        internet.atualizarPagina();
        internet.adicionarNovaAba();
        telefone.ligar("992658799");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        musica.selecionarMusica("Super Shy: New Jeans");
        musica.tocar();
        musica.pausar();
    }
}
