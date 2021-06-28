package Controller;


import Model.DataInfo;
import MyConstants.Constants;
import View.PrintResult;

public class MyController implements PrintResult {


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
