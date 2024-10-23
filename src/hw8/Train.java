package hw8;

import java.util.Objects;

public class Train implements Comparable<Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	void setNumber(int number) {
		this.number = number;
	}

	void setType(String type) {
		this.type = type;
	}

	void setStart(String start) {
		this.start = start;
	}

	void setDest(String dest) {
		this.dest = dest;
	}

	void setPrice(double price) {
		this.price = price;
	}

	int getNumber() {
		return this.number;
	}

	String getType() {
		return this.type;
	}

	String getStart() {
		return this.start;
	}

	String getDest() {
		return this.dest;
	}

	Double getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return "Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	@Override
	public int compareTo(Train newTrain) {
		if (this.number > newTrain.number) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
