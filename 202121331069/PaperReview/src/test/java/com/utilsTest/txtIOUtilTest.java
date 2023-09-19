package com.utilsTest;

import com.utils.txtIOUtil;
import org.junit.Test;

public class txtIOUtilTest {

    @Test
    public void readTxtTest() {
        // 路径存在，正常读取
        String str = txtIOUtil.readTxt("/Users/chendepeng/IdeaProjects/java ee/02-springmvc/day01/源码/springmvc/PaperReview/src/main/resources/txt/a.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void writeTxtTest() {
        // 路径存在，正常写入
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            txtIOUtil.writeTxt(elem[i], "/Users/chendepeng/IdeaProjects/java ee/02-springmvc/day01/源码/springmvc/PaperReview/src/main/resources/txt/a.txt");
        }
    }

    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        String str = txtIOUtil.readTxt("/Users/chendepeng/IdeaProjects/java ee/02-springmvc/day01/源码/springmvc/PaperReview/src/main/resources/txt/a.txt");
    }

    @Test
    public void writeTxtFailTest() {
        // 路径错误，写入失败
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            txtIOUtil.writeTxt(elem[i], "/Users/chendepeng/IdeaProjects/java ee/02-springmvc/day01/源码/springmvc/PaperReview/src/main/resources/txt/a.txt");
        }
    }
}
