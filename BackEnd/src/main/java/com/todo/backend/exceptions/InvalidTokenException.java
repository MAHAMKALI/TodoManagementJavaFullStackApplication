package com.todo.backend.exceptions;

public class InvalidTokenException extends RuntimeException{
	private static final long serialVersionUID = -3700741193887093791L;

	public InvalidTokenException(String message) {
		super(message);
	}
}
