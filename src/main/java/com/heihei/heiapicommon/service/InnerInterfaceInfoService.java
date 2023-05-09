package com.heihei.heiapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.heihei.heiapicommon.model.entity.InterfaceInfo;

/**
* @author HeiHei
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2023-02-24 15:09:12
*/
public interface InnerInterfaceInfoService  {

   /**
    * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
    * @param path
    * @param method
    * @return
    */
   InterfaceInfo getInterfaceInfo(String path, String method);

}
