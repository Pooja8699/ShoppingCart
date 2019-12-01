package io.hng.starter.BasketItem;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ForeignKey;

import io.hng.starter.Basket.Basket;
import io.hng.starter.ProductMaster.ProductMaster;

@Entity
public class BasketItem{
	

	@JoinColumn(foreignKey = @ForeignKey(name = "id"))
	private int itemId;
	@Id
	private String productId;
	private short quantity;
	private float MRP_price;
	private float LIST_price;
	private String product_name;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date Last_Updated_Timestamp;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date Created_Timestamp;
	

	@ManyToOne
	//@JoinColumn(name = "id")
    private Basket bigBasket;
	                       
    
	@OneToOne
	private ProductMaster product;
	
	
	public BasketItem() {
		
	}
	
	
	public BasketItem(int itemId, String productId, int basketId) {
		this.bigBasket = new Basket(basketId);
		this.product = new ProductMaster(productId);
	}

	public BasketItem(int itemId, String productId, short quantity, float mRP_price, float lIST_price,
			String product_name, Date last_Updated_Timestamp, Date created_Timestamp, int basketId) {
		super();
		this.itemId = itemId;
		this.productId = productId;
		this.quantity = quantity;
		this.MRP_price = mRP_price;
		this.LIST_price = lIST_price;
		this.product_name = product_name;
		this.Last_Updated_Timestamp = last_Updated_Timestamp;
		this.Created_Timestamp = created_Timestamp;
		this.product = new ProductMaster(productId);
		this.bigBasket = new Basket(basketId);
	}

	public int getBasketId() {
		return itemId;
	}

	public void setBasketId(int basketId) {
		this.itemId = basketId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public short getQuantity() {
		return quantity;
	}

	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}

	public float getMRP_price() {
		return MRP_price;
	}

	public void setMRP_price(float mRP_price) {
		this.MRP_price = mRP_price;
	}

	public float getLIST_price() {
		return LIST_price;
	}

	public void setLIST_price(float lIST_price) {
		this.LIST_price = lIST_price;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Date getLast_Updated_Timestamp() {
		return Last_Updated_Timestamp;
	}

	public void setLast_Updated_Timestamp(Date last_Updated_Timestamp) {
		this.Last_Updated_Timestamp = last_Updated_Timestamp;
	}

	public Date getCreated_Timestamp() {
		return Created_Timestamp;
	}

	public void setCreated_Timestamp(Date created_Timestamp) {
		this.Created_Timestamp = created_Timestamp;
	}

	public ProductMaster getProduct() {
		return product;
	}

	public void setProduct(ProductMaster product) {
		this.product = product;
	}


	public Basket getBasket() {
		return bigBasket;
	}


	public void setBasket(Basket bigBasket) {
		this.bigBasket = bigBasket;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	
}
