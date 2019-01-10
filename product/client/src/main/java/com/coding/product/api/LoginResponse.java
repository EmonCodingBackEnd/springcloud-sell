/*
 * 文件名称：LoginResponse.java
 * 系统名称：[系统名称]
 * 模块名称：[模块名称]
 * 软件版权：Copyright (c) 2011-2019, liming20110711@163.com All Rights Reserved.
 * 功能说明：[请在此处输入功能说明]
 * 开发人员：Rushing0711
 * 创建日期：20190110 22:55
 * 修改记录：
 * <Version>        <DateSerial>        <Author>        <Description>
 * 1.0.0            20190110-01         Rushing0711     M201901102255 新建文件
 ********************************************************************************/
package com.coding.product.api;

import com.ishanshan.gateway.auth.AuthResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class LoginResponse extends AuthResponse {
    private static final long serialVersionUID = 9002601652690881931L;
}
