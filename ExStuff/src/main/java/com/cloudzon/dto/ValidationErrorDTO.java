package com.cloudzon.dto;

import java.util.ArrayList;
import java.util.List;

public class ValidationErrorDTO {
	private List<FieldErrorDTO> fieldErrors = new ArrayList<FieldErrorDTO>();

	public ValidationErrorDTO() {

	}

	public void addFieldError(String field, String message) {
		FieldErrorDTO error = new FieldErrorDTO(field, message);
		fieldErrors.add(error);
	}

	public List<FieldErrorDTO> getFieldErrors() {
		return fieldErrors;
	}

	public void setFieldErrors(List<FieldErrorDTO> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}
}
