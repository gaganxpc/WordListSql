package com.android.example.wordlistsql;

/**
 * Created by Agan on 12/10/2017.
 */

public class WordItem {
       
    private int mId;
    private String mWord;
    public WordItem() {}
    public int getId() {return this.mId;}
    public String getWord() {return this.mWord;}
    public void setId(int id) {this.mId = id;}
    public void setWord(String word) {this.mWord = word;}

}
