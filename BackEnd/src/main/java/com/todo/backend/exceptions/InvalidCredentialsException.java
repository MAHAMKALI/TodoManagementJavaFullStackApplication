package com.todo.backend.exceptions;

public class InvalidCredentialsException extends RuntimeException{
	private static final long serialVersionUID = -4836014323607899641L;

	public InvalidCredentialsException(String message) {
		super(message);
	}
}
