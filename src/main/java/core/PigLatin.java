package main.java.core;

/**
 * Created by 71903 on 2017/5/10.
 */
public class PigLatin {
    private String sourceString;

    public String getSourceString() {
        return sourceString;
    }

    public void setSourceString(String sourceString) {
        this.sourceString = sourceString;
    }

    public String getPigLatin(){
        String head;
        String tail;
        head=sourceString.substring(0,1);
        tail=sourceString.substring(1,sourceString.length());
        return tail+"-"+head+"ay";
    }
}
