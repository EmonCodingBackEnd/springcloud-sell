/*
 * 文件名称：LoginRequest.java
 * 系统名称：[系统名称]
 * 模块名称：[模块名称]
 * 软件版权：Copyright (c) 2011-2019, liming20110711@163.com All Rights Reserved.
 * 功能说明：[请在此处输入功能说明]
 * 开发人员：Rushing0711
 * 创建日期：20190110 22:51
 * 修改记录：
 * <Version>        <DateSerial>        <Author>        <Description>
 * 1.0.0            20190110-01         Rushing0711     M201901102251 新建文件
 ********************************************************************************/
package com.coding.product.api;

import com.ishanshan.gateway.auth.AuthRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class LoginRequest extends AuthRequest<LoginResponse> {

    private static final long serialVersionUID = -7836782278755539417L;

    private String authType;

    private String username;

    private String password;
}
