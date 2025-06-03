package com.example.InterFace.Web.RequestDTO;

import java.time.LocalDateTime;

public class PaymentRequest {
	
	
	private int id;
	
	
	private LocalDateTime paymentDate;
	
	private String paymentMethod;
	
	private String paymentStatus;
	
	private String transactionId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "PaymentRequest [id=" + id + ", paymentDate=" + paymentDate + ", paymentMethod=" + paymentMethod
				+ ", paymentStatus=" + paymentStatus + ", transactionId=" + transactionId + "]";
	}

	
	

}
