package module4;

public class GetterSetter {

	private long id;
	private String productName;
	private String supplierName;

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
