package org.diophone.iPhone.devices;

import org.diophone.iPhone.apps.browser.Browser;
import org.diophone.iPhone.apps.music.Music;
import org.diophone.iPhone.apps.phone.Phone;

public class iPhone implements Music, Phone, Browser {

    @Override
    public void showPage(String url) {
        if(url == null || url.isEmpty()) {
            throw new IllegalArgumentException("Digite a URL corretamente");
        }

        System.out.println("Pagina exibida com sucesso");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void play() {
        System.out.println("Tocando musica");
    }

    @Override
    public void stop() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selectMusic(String music) {
        if(music == null || music.isEmpty()) {
            throw new IllegalArgumentException("Musica nao econtrada");
        }
        System.out.println("Tocando " + music);
    }

    @Override
    public void call(String number) {
        if(number == null || number.isEmpty()) {
            throw new IllegalArgumentException("Musica nao econtrada");
        }
        System.out.println("Ligando para o numero: " + number);
    }

    @Override
    public void answer() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Correio de voz iniciado");
    }
}
