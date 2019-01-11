/*
 * 文件名称：AuthSessionRequest.java
 * 系统名称：[系统名称]
 * 模块名称：[模块名称]
 * 软件版权：Copyright (c) 2011-2019, liming20110711@163.com All Rights Reserved.
 * 功能说明：[请在此处输入功能说明]
 * 开发人员：Rushing0711
 * 创建日期：20190111 06:15
 * 修改记录：
 * <Version>        <DateSerial>        <Author>        <Description>
 * 1.0.0            20190111-01         Rushing0711     M201901110615 新建文件
 ********************************************************************************/
package com.coding.product.api;

import com.ishanshan.gateway.auth.AuthRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AuthSessionRequest extends AuthRequest<AuthSessionResponse> {
    private static final long serialVersionUID = -6291170404443079363L;

    private String extraParam;
}
