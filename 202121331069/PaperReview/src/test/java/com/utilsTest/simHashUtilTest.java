package com.utilsTest;

import com.utils.simHashUtil;
import com.utils.txtIOUtil;
import org.junit.Test;

public class simHashUtilTest {

    @Test
    public void getHashTest(){
        String[] strings = {"余华", "是", "一位", "真正", "的", "作家"};
        for (String string : strings) {
            String stringHash = simHashUtil.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
        String str0 = txtIOUtil.readTxt("/Users/chendepeng/IdeaProjects/java ee/02-springmvc/day01/源码/springmvc/PaperReview/src/main/resources/txt/a.txt");
        String str1 = txtIOUtil.readTxt("/Users/chendepeng/IdeaProjects/java ee/02-springmvc/day01/源码/springmvc/PaperReview/src/main/resources/txt/b.txt");
        System.out.println(simHashUtil.getSimHash(str0));
        System.out.println(simHashUtil.getSimHash(str1));
    }
}
