package inter_face;

public class Product {

	private long id;
	private String productName;
	private String supplierName;

	public Product(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean equals(Object obj) {
		boolean equalsFlag = false;
		if (obj != null) {
			Product p = (Product) obj;
			if (this.id == p.id && (this.productName).equals(p.productName)
					&& (this.supplierName).equals(p.supplierName)) {
				equalsFlag = true;
			}

		}
		return equalsFlag;

	}
}
