package com.lilianlima.app.exceptions;

public class UserServiceException extends RuntimeException {
	
	private static final long serialVersionUID = -1056182613119792789L;

	public UserServiceException(String message)
	{
		super(message);
	}

}
