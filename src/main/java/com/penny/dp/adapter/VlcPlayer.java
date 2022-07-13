package com.penny.dp.adapter;

/**
 * @author <a href="Answer1331@163.com">Lambda</a>
 * @date 2022/07/11
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
