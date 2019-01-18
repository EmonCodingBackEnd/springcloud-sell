package com.coding.product.api;

import com.ishanshan.gateway.auth.AuthDetail;
import com.ishanshan.gateway.auth.AuthResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AuthSessionResponse extends AuthResponse {

    private static final long serialVersionUID = 7634137762454706703L;

    private String otherInfo;

    @EqualsAndHashCode(callSuper = true)
    @Data
    public static class CustomAuthDetail extends AuthDetail {
        private static final long serialVersionUID = -9083806959527704848L;
        private String tenantId = "10000";
        private String orgId = "1000010000";
        private String username;

        public static CustomAuthDetail buildCustomAuthDetail() {
            return new CustomAuthDetail();
        }
    }
}
