package com.mytraine.Controller;

import com.mytraine.Model.DataInfo;
import com.mytraine.MyConstants.Constants;
import com.mytraine.View.PrintResult;


public class MyController implements PrintResult{


    private DataInfo dataInfo;


    public MyController(DataInfo dataInfo) {

        this.dataInfo = dataInfo;
    }



    public String setDataInfo() {
        return dataInfo.checkWord(Constants.stringPattern1, Constants.stringPattern2);
    }

    public DataInfo getDataInfo() {
        return dataInfo;
    }

    @Override
    public void printMyResult(String word1) {
        System.out.println(word1);
    }
}
