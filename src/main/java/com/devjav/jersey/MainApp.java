/*
 * devjav [http://devjav.com]
 * Copyright (C) 2014-2014 Pham Thai Thinh
 * Contact:phamthaithinh@gmail.com
 * 
 */
package com.devjav.jersey;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * 
 * @author Pham Thai Thinh
 * 
 */
public class MainApp extends ResourceConfig {

	/**
	 * Entry point
	 */
	public MainApp() {
		super();
		packages("com.devjav.jersey");
		register(JacksonFeature.class);
	}

}
