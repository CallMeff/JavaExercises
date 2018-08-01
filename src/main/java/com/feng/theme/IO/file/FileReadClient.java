package com.feng.theme.IO.file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileReadClient {

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        readFile.setReadFilePath("D:\\桌面\\手机号归属地列表.txt");
        readFile.setWriteFilePath("D:\\桌面\\手机号归属城市列表.txt");

        List<String> cityList = readFile.getLineToList();
        Set<String> citySet = new HashSet<>(cityList);
        List<String> resultList = new ArrayList<>();
        for (String cityName:citySet) {
            String resultCityName = cityName.substring(0,cityName.indexOf("\""));
            resultList.add(resultCityName);
        }
        System.out.println("cityList size: "+cityList.size());
        System.out.println("citySet size: "+citySet.size());

        readFile.writeList(resultList);

    }
}
