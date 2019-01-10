package com.coding.product.api;

import com.ishanshan.gateway.auth.AuthResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AuthSessionResponse extends AuthResponse {

    private static final long serialVersionUID = 7634137762454706703L;

    private String otherInfo;
}
