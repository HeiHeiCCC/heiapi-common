package com.heihei.heiapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.heihei.heiapicommon.model.entity.UserInterfaceInfo;

/**
* @author HeiHei
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service
* @createDate 2023-03-05 17:09:15
*/
public interface InnerUserInterfaceInfoService  {

    /**
     * 调用接口
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);


}
