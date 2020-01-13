package module4;

public class Product {

	private long id;
	private String productName;
	private String supplierName;

	public Product(long id, String productName, String supplierName) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}

	public long getid() {
		return this.id;
	}

	public void setid(long id) {

		this.id = id;
	}

	public String getproductName() {
		return this.productName;
	}

	public void setproductName(String productName) {
		this.productName = productName;
	}

	public String getsupplierName() {
		return this.supplierName;
	}

	public void setsupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	

}
