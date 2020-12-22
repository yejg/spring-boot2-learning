package com.yejg.registerbeanintospringcontainer.importAnnotion;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yejg<br>
 * 开发时间: 2018年11月27日<br>
 */
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        importingClassMetadata.getAnnotationTypes();
        // 不可返回null
        return new String[]{"com.yejg.registerbeanintospringcontainer.importAnnotion.inner.Tom"};
    }
}
