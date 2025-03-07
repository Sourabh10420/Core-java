package in.co.rays.Payment;

import java.util.Date;

public class PaymentBean {

	private int id;
	private Date payementDate;
	private String description;
	private int ammount;
	private String paymentMethod;
	private String status;
	private String payer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPayementDate() {
		return payementDate;
	}

	public void setPayementDate(Date payementDate) {
		this.payementDate = payementDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmmount() {
		return ammount;
	}

	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}
}