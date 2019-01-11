/*
 * 文件名称：AuthController.java
 * 系统名称：[系统名称]
 * 模块名称：[模块名称]
 * 软件版权：Copyright (c) 2011-2019, liming20110711@163.com All Rights Reserved.
 * 功能说明：[请在此处输入功能说明]
 * 开发人员：Rushing0711
 * 创建日期：20190110 22:46
 * 修改记录：
 * <Version>        <DateSerial>        <Author>        <Description>
 * 1.0.0            20190110-01         Rushing0711     M201901102246 新建文件
 ********************************************************************************/
package com.coding.product.controller;

import com.coding.product.api.AuthSessionRequest;
import com.coding.product.api.AuthSessionResponse;
import com.coding.product.api.LoginRequest;
import com.coding.product.api.LoginResponse;
import com.ishanshan.gateway.auth.AuthDetail;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/auth")
public class AuthController {

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        LoginResponse response = new LoginResponse();

        if (!request.getUsername().equals("9000107")) {
            response.setErrorCode(191919);
        } else {
            AuthDetail authDetail = new AuthDetail();
            authDetail.setUsername("9000107");
            response.setAuthDetail(authDetail);
        }
        return response;
    }

    @PostMapping("/session")
    public AuthSessionResponse login(@RequestBody AuthSessionRequest request) {
        AuthSessionResponse response = new AuthSessionResponse();

        String username = request.getAuthDetail().getUsername();
        AuthDetail authDetail = request.getAuthDetail();
        response.setOtherInfo("其他信息");

        return response;
    }
}
