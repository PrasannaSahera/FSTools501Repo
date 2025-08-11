package com.nt.payment;

public class UPIPayment {
	public String doPhonePay(long phoneno, double amt)
	{
		return  amt + "Payment happening from the phone number :: "+phoneno+"  using phone pay ";
	}
}
