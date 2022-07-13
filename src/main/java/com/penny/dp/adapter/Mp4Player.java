package com.penny.dp.adapter;

/**
 * @author <a href="Answer1331@163.com">Lambda</a>
 * @date 2022/07/11
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
