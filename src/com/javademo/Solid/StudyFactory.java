package com.javademo.Solid;

public class StudyFactory {
    public Studies creatStudyObject(String str){
        if(str.equals("java"))
            return new Java();
        else if(str.equals("python"))
            return new Python();
        else
            return new Java();
    }
}
