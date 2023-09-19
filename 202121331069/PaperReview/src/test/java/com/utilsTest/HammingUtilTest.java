package com.utilsTest;

import com.utils.HammingUtil;
import com.utils.simHashUtil;
import com.utils.txtIOUtil;
import org.junit.Test;

public class HammingUtilTest {

    @Test
    public void getHammingDistanceTest() {
        String str0 = txtIOUtil.readTxt("/Users/chendepeng/IdeaProjects/java ee/02-springmvc/day01/源码/springmvc/PaperReview/src/main/resources/txt/a.txt");
        String str1 = txtIOUtil.readTxt("/Users/chendepeng/IdeaProjects/java ee/02-springmvc/day01/源码/springmvc/PaperReview/src/main/resources/txt/b.txt");
        int distance = HammingUtil.getHammingDistance(simHashUtil.getSimHash(str0), simHashUtil.getSimHash(str1));
        System.out.println("海明距离：" + distance);
        System.out.println("相似度: " + (100 - distance * 100 / 128) + "%");
    }

    @Test
    public void getHammingDistanceFailTest() throws InterruptedException {
        // 测试str0.length()!=str1.length()的情况
        String str0 = "10101010";
        String str1 = "1010101";
        System.out.println(HammingUtil.getHammingDistance(str0, str1));
    }

    @Test
    public void getSimilarityTest() {
        String str0 = txtIOUtil.readTxt("/Users/chendepeng/IdeaProjects/java ee/02-springmvc/day01/源码/springmvc/PaperReview/src/main/resources/txt/a.txt");
        String str1 = txtIOUtil.readTxt("/Users/chendepeng/IdeaProjects/java ee/02-springmvc/day01/源码/springmvc/PaperReview/src/main/resources/txt/b.txt");
        int distance = HammingUtil.getHammingDistance(simHashUtil.getSimHash(str0), simHashUtil.getSimHash(str1));
        double similarity = HammingUtil.getSimilarity(simHashUtil.getSimHash(str0), simHashUtil.getSimHash(str1));
        System.out.println("str0和str1的汉明距离: " + distance);
        System.out.println("str0和str1的相似度:" + similarity);
    }
}
