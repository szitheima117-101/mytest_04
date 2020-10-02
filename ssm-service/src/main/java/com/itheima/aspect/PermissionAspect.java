package com.itheima.aspect;

import org.springframework.stereotype.Component;

@Component
public class PermissionAspect {
    public void checkPermission(){
        System.out.println("权限校验.....");
    }
}
