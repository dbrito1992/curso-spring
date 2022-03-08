package com.curso.enums;

public enum OrderStatus {
	
	WAITING(1, "Aguardando"),
	PEDDING(2, "Pendente"),
	SHIPPED(3, "Enviado"),
	CANCELLED(4, "Cancelado"),
	PAY(5, "Pago");
	
	private int code;
	private String descriptions;
	
	private OrderStatus(int code, String descriptions) {
		this.code = code;
		this.descriptions = descriptions;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getDescriptions() {
		return descriptions;
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
