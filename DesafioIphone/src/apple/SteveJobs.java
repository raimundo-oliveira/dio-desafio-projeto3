package apple;

import equipamentos.smartPhone.IPhone;

public class SteveJobs {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        System.out.println("Aparelho Telefônico");
        iphone.ligar("8377429374");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("Navegador de Internet");
        iphone.exibirPagina("www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("Reprodutor Musical");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Trem das onze");

    }
}
