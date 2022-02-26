package com.curso.enums;

public enum OrderStatus {
	
	WAITING(1),
	PEDDING(2),
	SHIPPED(3),
	CANCELLED(4);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		
		throw new IllegalArgumentException("Id incorreto!!");
	}
}
