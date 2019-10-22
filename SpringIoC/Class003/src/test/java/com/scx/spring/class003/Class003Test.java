package com.scx.spring.class003;

import com.scx.spring.class003.IoCContainer;
import com.scx.spring.class003.car.Audi;
import com.scx.spring.class003.car.Buick;
import com.scx.spring.class003.human.Human;
import com.scx.spring.class003.human.LiSi;
import com.scx.spring.class003.human.ZhangSan;
import org.junit.Before;
import org.junit.Test;

public class Class003Test {

    private IoCContainer ioCContainer = new IoCContainer();

    @Before
    public void before() {
        ioCContainer.setBeans(Audi.class, "audi");
        ioCContainer.setBeans(Buick.class, "buick");
        ioCContainer.setBeans(ZhangSan.class, "zhangsan","audi");
        ioCContainer.setBeans(LiSi.class, "lisi","buick");
    }

    @Test
    public void test() {
        Human zhangsan = (Human) ioCContainer.getBeans("zhangsan");
        zhangsan.goHome();
        Human lisi = (Human) ioCContainer.getBeans("lisi");
        lisi.goHome();
    }
}
