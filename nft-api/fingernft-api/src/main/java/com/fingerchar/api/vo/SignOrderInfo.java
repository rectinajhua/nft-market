package com.fingerchar.api.vo;

public class SignOrderInfo {

	private String owner;

	private String salt;

	private String sellerToken;

	private String sellerTokenId;

	private String sellerAssetType;

	private String buyerToken;

	private String buyerTokenId;

	private String buyerAssetType;

	private String selling;

	private String buying;

	private String sellerFee;

	private String signature;

	private String buyFee;

	private String r;

	private String s;

	private String v;

	public SignOrderInfo(String owner, String salt, String sellerToken, String sellerTokenId, String sellerAssetType,
			String buyerToken, String buyerTokenId, String buyerAssetType, String selling, String buying,
			String sellerFee) {
		this.owner = owner;
		this.salt = salt;
		this.sellerToken = sellerToken;
		this.sellerTokenId = sellerTokenId;
		this.sellerAssetType = sellerAssetType;
		this.buyerToken = buyerToken;
		this.buyerTokenId = buyerTokenId;
		this.buyerAssetType = buyerAssetType;
		this.selling = selling;
		this.buying = buying;
		this.sellerFee = sellerFee;
	}

	public SignOrderInfo() {

	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getSellerToken() {
		return sellerToken;
	}

	public void setSellerToken(String sellerToken) {
		this.sellerToken = sellerToken;
	}

	public String getSellerTokenId() {
		return sellerTokenId;
	}

	public void setSellerTokenId(String sellerTokenId) {
		this.sellerTokenId = sellerTokenId;
	}

	public String getSellerAssetType() {
		return sellerAssetType;
	}

	public void setSellerAssetType(String sellerAssetType) {
		this.sellerAssetType = sellerAssetType;
	}

	public String getBuyerToken() {
		return buyerToken;
	}

	public void setBuyerToken(String buyerToken) {
		this.buyerToken = buyerToken;
	}

	public String getBuyerTokenId() {
		return buyerTokenId;
	}

	public void setBuyerTokenId(String buyerTokenId) {
		this.buyerTokenId = buyerTokenId;
	}

	public String getBuyerAssetType() {
		return buyerAssetType;
	}

	public void setBuyerAssetType(String buyerAssetType) {
		this.buyerAssetType = buyerAssetType;
	}

	public String getSelling() {
		return selling;
	}

	public void setSelling(String selling) {
		this.selling = selling;
	}

	public String getBuying() {
		return buying;
	}

	public void setBuying(String buying) {
		this.buying = buying;
	}

	public String getSellerFee() {
		return sellerFee;
	}

	public void setSellerFee(String sellerFee) {
		this.sellerFee = sellerFee;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getBuyFee() {
		return buyFee;
	}

	public void setBuyFee(String buyFee) {
		this.buyFee = buyFee;
	}

	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}
}
