package com.marong.apple.danmu;

import com.orzangleli.xdanmuku.Model;

/**
 * Created by apple on 2017/4/27.
 */

public class DanmuEntity extends Model {
    public String content;
    public int textColor;
    public String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }
}
