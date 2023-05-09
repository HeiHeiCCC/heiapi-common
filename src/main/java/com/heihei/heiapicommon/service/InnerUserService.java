package com.heihei.heiapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.heihei.heiapicommon.model.entity.User;


/**
 * 用户服务
 *
 * @author heihei
 */
public interface InnerUserService {
    /**从数据库中查是否已分配给用户密钥（accessKey， secretKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
