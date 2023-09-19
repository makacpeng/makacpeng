package com;

import com.utils.HammingUtil;
import com.utils.simHashUtil;
import com.utils.txtIOUtil;
import org.junit.Test;

public class MainTest {

    @Test
    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = txtIOUtil.readTxt("/Users/chendepeng/IdeaProjects/java ee/02-springmvc/day01/源码/springmvc/PaperReview/src/main/resources/txt/a.txt");
        str[1] = txtIOUtil.readTxt("/Users/chendepeng/IdeaProjects/java ee/02-springmvc/day01/源码/springmvc/PaperReview/src/main/resources/txt/b.txt");
        String ansFileName = "/Users/chendepeng/IdeaProjects/java ee/02-springmvc/day01/源码/springmvc/PaperReview/src/main/resources/txt/ans.txt";
        double ans = HammingUtil.getSimilarity(simHashUtil.getSimHash(str[0]), simHashUtil.getSimHash(str[1]));
        txtIOUtil.writeTxt(ans, ansFileName);
    }

}
