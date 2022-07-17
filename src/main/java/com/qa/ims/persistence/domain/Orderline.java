package com.qa.ims.persistence.domain;

public class Orderline {

	private Long fk_orderID;
	private Long fk_itemID;
	private Long quantity;

	public Orderline(Long fk_orderID, Long fk_itemID, Long quantity) {
		this.setFk_orderID(fk_orderID);
		this.setFk_itemID(fk_itemID);
		this.setQuantity(quantity);
	}

	public Orderline(Long fk_orderID, Long quantity) {
		this.setFk_orderID(fk_orderID);
		this.setQuantity(quantity);
	}

	@Override
	public String toString() {
		return "fk_orderID=" + fk_orderID + " fk_itemID=" + fk_itemID + " quantity=" + quantity;
	}

	public Long getFk_orderID() {
		return fk_orderID;
	}

	public void setFk_orderID(Long fk_orderID) {
		this.fk_orderID = fk_orderID;
	}

	public Long getFk_itemID() {
		return fk_itemID;
	}

	public void setFk_itemID(Long fk_itemID) {
		this.fk_itemID = fk_itemID;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fk_orderID == null) ? 0 : fk_orderID.hashCode());
		result = prime * result + ((fk_itemID == null) ? 0 : fk_itemID.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orderline other = (Orderline) obj;
		if (getFk_orderID() == null) {
			if (other.getFk_orderID() != null)
				return false;
		} else if (!getFk_orderID().equals(other.getFk_orderID()))
			return false;
		if (getFk_itemID() == null) {
			if (other.getFk_itemID() != null)
				return false;
		} else if (!getFk_itemID().equals(other.getFk_itemID()))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}

}
