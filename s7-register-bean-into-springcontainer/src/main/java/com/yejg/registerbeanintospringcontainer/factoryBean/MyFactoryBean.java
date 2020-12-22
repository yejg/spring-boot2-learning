package com.yejg.registerbeanintospringcontainer.factoryBean;

import com.yejg.registerbeanintospringcontainer.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yejg<br>
 * 开发时间: 2018年11月27日<br>
 */
public class MyFactoryBean implements FactoryBean<Person> {

    @Override
    public Person getObject() throws Exception {
        return new Person("哈罗", 100);
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
