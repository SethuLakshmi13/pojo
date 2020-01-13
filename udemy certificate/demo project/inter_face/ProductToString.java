package inter_face;

public class ProductToString {

	private long id;
	private String productName;
	private String supplierName;

	public ProductToString(long id, String productName, String supplierName) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}

	public String toString() {
		return id + ":" + productName + ":" + supplierName;
	}

}
