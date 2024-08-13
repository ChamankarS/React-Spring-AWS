package com.eventmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonApiResponse {
    private String responseMessage;
    private boolean isSuccess;
    
    
    // Getters and setters

    public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	// Builder pattern
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String responseMessage;
        private boolean isSuccess;

        public Builder responseMessage(String responseMessage) {
            this.responseMessage = responseMessage;
            return this;
        }

        public Builder isSuccess(boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        public CommonApiResponse build() {
            CommonApiResponse response = new CommonApiResponse();
            response.responseMessage = this.responseMessage;
            response.isSuccess = this.isSuccess;
            return response;
        }
    }
}

