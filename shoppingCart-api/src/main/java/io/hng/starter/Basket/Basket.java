package io.hng.starter.Basket;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import io.hng.starter.BasketItem.BasketItem;
import io.hng.starter.UserProfile.UserProfile;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class Basket {

	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	private int UserId; 
	private int noOfItems;
	private float GrandTotal;
	private float DeliveryCharges;
	private String Coupon_Code;
	private float coupon_amount;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@OneToOne
	private UserProfile userInfo;
	
	 @OneToMany
	 private Set<BasketItem> basketItem = new HashSet<>();
	 
	
	
	public Basket() {
		
	}	
	
	public Basket(int id) {
		this.id= id;
	}
	
	public Basket(int id, int userId, int noOfItems, float grandTotal, float deliveryCharges, String coupon_Code,
			float coupon_amount, int itemId, String productId, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.UserId = userId;
		this.noOfItems = noOfItems;
		this.GrandTotal = grandTotal;
		this.DeliveryCharges = deliveryCharges;
		this.Coupon_Code = coupon_Code;
		this.coupon_amount = coupon_amount;
		this.userInfo = new UserProfile(userId);
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		
		Set<BasketItem> basketItem = new HashSet<>();
		this.basketItem = basketItem;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		this.UserId = userId;
	}
	
	public float getGrandTotal() {
		return GrandTotal;
	}
	public void setGrandTotal(float grandTotal) {
		this.GrandTotal = grandTotal;
	}
	public float getDeliveryCharges() {
		return DeliveryCharges;
	}
	public void setDeliveryCharges(float deliveryCharges) {
		this.DeliveryCharges = deliveryCharges;
	}
	public String getCoupon_Code() {
		return Coupon_Code;
	}
	public void setCoupon_Code(String coupon_Code) {
		this.Coupon_Code = coupon_Code;
	}
	
	 public UserProfile getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserProfile userInfo) {
		this.userInfo = userInfo;
	}
	
	public float getCoupon_amount() {
		return coupon_amount;
	}

	public void setCoupon_amount(float coupon_amount) {
		this.coupon_amount = coupon_amount;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Set<BasketItem> getBasketItem() {
		return basketItem;
	}

	public Set<BasketItem> setBasketItem(Set<BasketItem> basketItem) {
		return this.basketItem = basketItem;
	}

	
	
}
