/**
 * 
 */
package com.example;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @author rakeshc
 *
 */
public class WebSecurityAdaptor extends
		AbstractSecurityWebApplicationInitializer {
	
	public WebSecurityAdaptor() {
		super(SecurityConfig.class);
	}

}
