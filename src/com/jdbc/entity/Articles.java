package com.jdbc.entity;

import java.math.BigDecimal;

public class Articles {

	private Integer articlesId;
	private String articlesName;
	private String articlesDecription;
	private Integer articlesCount;
	private String articlesStatus;
	private BigDecimal articlesMoney;
	public Integer getArticlesId() {
		return articlesId;
	}
	public void setArticlesId(Integer articlesId) {
		this.articlesId = articlesId;
	}
	public String getArticlesName() {
		return articlesName;
	}
	public void setArticlesName(String articlesName) {
		this.articlesName = articlesName;
	}
	public String getArticlesDecription() {
		return articlesDecription;
	}
	public void setArticlesDecription(String articlesDecription) {
		this.articlesDecription = articlesDecription;
	}
	public Integer getArticlesCount() {
		return articlesCount;
	}
	public void setArticlesCount(Integer articlesCount) {
		this.articlesCount = articlesCount;
	}
	public String getArticlesStatus() {
		return articlesStatus;
	}
	public void setArticlesStatus(String articlesStatus) {
		this.articlesStatus = articlesStatus;
	}
	public BigDecimal getArticlesMoney() {
		return articlesMoney;
	}
	public void setArticlesMoney(BigDecimal articlesMoney) {
		this.articlesMoney = articlesMoney;
	}
	
	

}
