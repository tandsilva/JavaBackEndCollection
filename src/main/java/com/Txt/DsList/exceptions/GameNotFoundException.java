package com.Txt.DsList.exceptions;



	public class GameNotFoundException extends RuntimeException {
	    // Construtor que recebe uma mensagem de erro
	    public GameNotFoundException(String message) {
	        super(message);
	    }

	    // Construtor que recebe a mensagem de erro e a causa da exceção
	    public GameNotFoundException(String message, Throwable cause) {
	        super(message, cause);
	    }
	}


