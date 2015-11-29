package com.bs.domain;

import java.io.Serializable;

/**
 * 系统通知
 * 
 * @author 阳发
 * 
 */
@SuppressWarnings("serial")
public class SystemNotice implements Serializable {

	public static final String VIEWY = "YES";
	public static final String VIEWN = "NO";
	
	// -----------------------------------------
	private Long id;
	private String noticeNumber;// 通知编号
	private String name;
	private String summary; // 通知摘要
	private String content; // 通知内容
	private String viewyn; // 通知是否被查看

	// =============setter and getter methods=======================
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNoticeNumber() {
		return noticeNumber;
	}

	public void setNoticeNumber(String noticeNumber) {
		this.noticeNumber = noticeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getViewyn() {
		return viewyn;
	}

	public void setViewyn(String viewyn) {
		this.viewyn = viewyn;
	}

}
