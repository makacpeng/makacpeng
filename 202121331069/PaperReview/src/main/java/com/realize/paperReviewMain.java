package com.realize;

import com.utils.HammingUtil;
import com.utils.simHashUtil;
import com.utils.txtIOUtil;

public class paperReviewMain {
    public static void main(String[] args) {
        // 从命令行输入的路径名读取对应的文件，将文件的内容转化为对应的字符串
        String str0 = txtIOUtil.readTxt(args[0]);
        String str1 = txtIOUtil.readTxt(args[1]);
        String resultFileName = args[2];
        // 由字符串得出对应的 simHash值
        String simHash0 = simHashUtil.getSimHash(str0);
        String simHash1 = simHashUtil.getSimHash(str1);
        // 由 simHash值求出相似度
        double similarity = HammingUtil.getSimilarity(simHash0, simHash1);
        // 把相似度写入最后的结果文件中
        txtIOUtil.writeTxt(similarity, resultFileName);

        System.exit(0);
    }
}
