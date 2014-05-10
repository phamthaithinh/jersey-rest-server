/*
 * devjav [http://devjav.com]
 * Copyright (C) 2014-2014 Pham Thai Thinh
 * Contact:phamthaithinh@gmail.com
 * 
 */
package com.devjav.jersey;

import java.io.Serializable;

/**
 * 
 * @author Pham Thai Thinh
 * 
 */
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5844780011894209010L;
	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
