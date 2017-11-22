package com.example.kaligaswag.mdesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kaligaswag on 22/11/2017.
 */

public class emojiModel {

    // 1. buat variabel int id untuk gambar dan string untuk title
    private int imageID;
    private String title;

    // 2. buat getter and setter untuk masing-masing variabel
    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // 3. buat metod dengan List<> untuk mengambil data imageID dan title menjadi 1
    public static List<emojiModel> getObjectList(){
        List<emojiModel> dataList = new ArrayList<>();
        int[] images = getImages();

        for (int i = 0; i < images.length; i++){
            emojiModel emoji = new emojiModel();
            emoji.setImageID(images[i]);
            emoji.setTitle("Emoji " + i);
            dataList.add(emoji);
        }
        return dataList;
    }

    private static int[] getImages(){

        int[] images = {
                R.drawable.emoji1, R.drawable.emoji2, R.drawable.emoji3, R.drawable.emoji4,
                R.drawable.emoji5, R.drawable.emoji6
        };

        return images;
    }
}
