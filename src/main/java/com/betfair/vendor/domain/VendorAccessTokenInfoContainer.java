package com.betfair.vendor.domain;

/**
 * A container for Vendor Access Token Info details returned from the token operation
 */
public class VendorAccessTokenInfoContainer extends ResponseContainer {

    private String id;
    private VendorAccessTokenInfo result;
    private AccountApiError error;

    public VendorAccessTokenInfo getResult() {
        return result;
    }

    public void setResult(VendorAccessTokenInfo result) {
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccountApiError getError() {
        return error;
    }

    public void setError(AccountApiError error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "VendorAccessTokenInfoContainer{" +
                ", id='" + id + '\'' +
                ", result=" + result +
                ", error=" + error +
                '}';
    }
}
