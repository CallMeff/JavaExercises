package com.feng.theme.IO.file;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 读取文件
 */
public class ReadFile {

    private String readFilePath;
    private String writeFilePath;
    /**
     * @return 读取文件中的所有行到List<String>
     * @throws IOException
     */
    public List<String> getLineToList() throws IOException {
        List<String> resultList = new ArrayList<>();
        BufferedReader bis = null;
        try {
            bis = new BufferedReader(new FileReader(readFilePath));
            String lineStr = null;
            while ((lineStr = bis.readLine()) != null) {
                resultList.add(lineStr);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(bis != null) {
                bis.close();
            }
        }
        return resultList;
    }

    public String getReadFilePath() {
        return readFilePath;
    }

    public void setReadFilePath(String readFilePath) {
        this.readFilePath = readFilePath;
    }


    public void writeList(List<String> strings) throws IOException {
        FileWriter fw = new FileWriter(writeFilePath);
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(fw);
            for (String s : strings) {
                bw.write(s);
                bw.newLine();
            }
        }finally {
            if(bw != null){
                bw.close();
            }
        }
    }

    public String getWriteFilePath() {
        return writeFilePath;
    }

    public void setWriteFilePath(String writeFilePath) {
        this.writeFilePath = writeFilePath;
    }
}
