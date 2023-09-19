package com.utilsTest;

import com.utils.simHashUtil;
import org.junit.Test;

public class shortStringExceptionTest {

    @Test
    public void shortStringExceptionTest(){
        //测试str.length()<200的情况
        System.out.println(simHashUtil.getSimHash("一位正真的作家"));
    }
}
