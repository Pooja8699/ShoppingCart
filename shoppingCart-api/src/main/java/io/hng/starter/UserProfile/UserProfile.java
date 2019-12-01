package io.hng.starter.UserProfile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.hng.starter.Basket.Basket;

import java.util.Date;

@Entity
public class UserProfile {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int userId;
	private int userLoginId;
	private String password;
	private Long mobileNo;
	private int authToken;
	private String userStatus;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date CreatedStamp;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date LastUpdatedStamp;
	
	@OneToOne
	private Basket basket;
	
	public UserProfile() {
		
	}
	
	public UserProfile(int userId) {
		this.userId =userId;
	}
	
	public UserProfile(int userId, int userLoginId, String password, Long mobileNo, int authToken, String userStatus,
			Date createdStamp, Date lastUpdatedStamp) {
		super();
		this.userId = userId;
		this.userLoginId = userLoginId;
		this.password = password;
		this.mobileNo = mobileNo;
		this.authToken = authToken;
		this.userStatus = userStatus;
		this.CreatedStamp = createdStamp;
		this.LastUpdatedStamp = lastUpdatedStamp;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserLoginId() {
		return userLoginId;
	}
	public void setUserLoginId(int userLoginId) {
		this.userLoginId = userLoginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAuthToken() {
		return authToken;
	}
	public void setAuthToken(int authToken) {
		this.authToken = authToken;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public Date getCreatedStamp() {
		return CreatedStamp;
	}
	public void setCreatedStamp(Date createdStamp) {
		this.CreatedStamp = createdStamp;
	}
	public Date getLastUpdatedStamp() {
		return LastUpdatedStamp;
	}
	public void setLastUpdatedStamp(Date lastUpdatedStamp) {
		this.LastUpdatedStamp = lastUpdatedStamp;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}
	
}
