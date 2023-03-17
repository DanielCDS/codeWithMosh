package com.code.with.mosh.classes;

public class TextBox {

    private String text =""; //Field
    public void setText(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void clear(){
        text = "";
    }
}
