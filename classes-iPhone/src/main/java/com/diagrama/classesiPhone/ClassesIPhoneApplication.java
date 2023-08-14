package com.diagrama.classesiPhone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassesIPhoneApplication implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	private ReprodutorMusical musicPlayer;
    private AparelhoTelefonico phoneNumber;
    private NavegadorInternet browser;

	public void playMusic() {
        // Implementação da reprodução de música
    }

    public void makeCall() {
        // Implementação da realização de chamada
    }

    public void browseInternet() {
        // Implementação da navegação na internet
    }

    @Override
    public void play() {
        // Implementação da reprodução de música
    }

    @Override
    public void pause() {
        // Implementação da pausa da música
    }

    @Override
    public void stop() {
        // Implementação da parada da música
    }

    @Override
    public void call(String phoneNumber) {
        // Implementação da realização de chamada
    }

    @Override
    public void hangUp() {
        // Implementação da finalização da chamada
    }

    @Override
    public void openWebsite(String url) {
        // Implementação da abertura de um site
    }

    @Override
    public void closeWebsite() {
        // Implementação do fechamento do site
    }

	
	public static void main(String[] args) {
		SpringApplication.run(ClassesIPhoneApplication.class, args);
	}

}
