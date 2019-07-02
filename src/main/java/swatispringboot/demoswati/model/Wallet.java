package swatispringboot.demoswati.model;

public class Wallet {

	private long seq;
	private String color;
	private Double amount;

	
	public Wallet(long seq, String color, Double amount) {
		super();
		this.seq = seq;
		this.color = color;
		this.amount = amount;
	}

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}

}
