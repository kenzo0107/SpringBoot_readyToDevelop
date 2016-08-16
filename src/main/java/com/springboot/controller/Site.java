package com.springboot.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * URL design.
 * @author kenzo.tanaka
 */

@AllArgsConstructor
@Getter
public enum Site {
	API_INTERNAL("API INTERNAL", "/api/internal", false),
	API_EXTERNAL("API EXTERNAL", "/api", false),
	SCREEN_ADMIN("ADMIN", "/admin", true),
	SCREEN_USER("USER", "", true);
	
	private String label;
	private String baseUrl;
	private boolean protectCsrf;
	
	public static Site of(String url) {
		if (url == null) {
			return SCREEN_USER;
		}
		
		for (Site location : values()) {
			if (url.startsWith(location.baseUrl)) {
				return location;
			}
		}
		return SCREEN_USER;
	}
}
