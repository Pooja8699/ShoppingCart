package io.hng.starter.ProductMaster;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.hng.starter.BasketItem.BasketItem;

@Entity
public class ProductMaster {

	@Id
	private String productId;
	private short categoryId;
	private String categoryName;
	private String parentCategoryLink;
	private short brandId;
	private String brandName;
	private String productTitle;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date Created_TimeStamp;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date Last_updated_Timestamp;
	private float mRP_price;
	private float list_price;
	
	@OneToOne
	//@JoinColumn(name = "productId")
	private BasketItem basketItem;
	
	
	public ProductMaster() {
		
	}

	public ProductMaster(String productId) {
		this.productId = productId;
	}
	public ProductMaster(String productId, short categoryId, String categoryName, String parentCategoryLink,
			short brandId, String brandName, String productTitle, Date created_TimeStamp, Date last_updated_Timestamp,
			float mRP_price, float list_price, BasketItem basketItem) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.parentCategoryLink = parentCategoryLink;
		this.brandId = brandId;
		this.brandName = brandName;
		this.productTitle = productTitle;
		Created_TimeStamp = created_TimeStamp;
		Last_updated_Timestamp = last_updated_Timestamp;
		this.mRP_price = mRP_price;
		this.list_price = list_price;
		this.basketItem = basketItem;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public short getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(short categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getParentCategoryLink() {
		return parentCategoryLink;
	}

	public void setParentCategoryLink(String parentCategoryLink) {
		this.parentCategoryLink = parentCategoryLink;
	}

	public short getBrandId() {
		return brandId;
	}

	public void setBrandId(short brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public Date getCreated_TimeStamp() {
		return Created_TimeStamp;
	}

	public void setCreated_TimeStamp(Date created_TimeStamp) {
		Created_TimeStamp = created_TimeStamp;
	}

	public Date getLast_updated_Timestamp() {
		return Last_updated_Timestamp;
	}

	public void setLast_updated_Timestamp(Date last_updated_Timestamp) {
		Last_updated_Timestamp = last_updated_Timestamp;
	}

	public float getmRP_price() {
		return mRP_price;
	}

	public void setmRP_price(float mRP_price) {
		this.mRP_price = mRP_price;
	}

	public float getList_price() {
		return list_price;
	}

	public void setList_price(float list_price) {
		this.list_price = list_price;
	}

	public BasketItem getBasketItem() {
		return basketItem;
	}

	public void setBasketItem(BasketItem basketItem) {
		this.basketItem = basketItem;
	}
	
	
	
}
