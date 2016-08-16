package com.springboot.controller.api.internal;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.controller.GlobalErrorController;
import com.springboot.model.ErrorResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ErrorController {
	
	@RequestMapping(value = "/api/internal/error")
	public ErrorResponse error(HttpServletRequest request) {
		Throwable e = (Throwable) request.getAttribute(GlobalErrorController.ERROR_EXCEPTION);

		// generate random string. a parameter is string length.
		String errorCode = RandomStringUtils.randomAlphabetic(15);

		log.error(e.getMessage(), e);

		return ErrorResponse.build(errorCode, e);
	}
}
