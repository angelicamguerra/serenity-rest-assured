package models;


import au.com.bytecode.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import utils.Credentials;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCSVFile {

    public static  void main(String[] args) {
        List<Credentials> credentials = new ArrayList<Credentials>();

        try {
            String fileCSV = "data/credentials.csv";
            CSVReader reader = new CSVReader(new FileReader(fileCSV));
            String[] nextline;

            while ((nextline = reader.readNext()) != null) {
                String[] splitted = nextline.split(",");
                for (String index : splitted) {
                    Credentials credential = new Credentials();
                    credentials.add(credential, credential);
                }
            }
        }catch(Exception e){
                System.out.println(e);
            }
        }

                for (int i = 0; i < nextLine.length; i++) {
                    list.add(nextLine[i]);
                if (nextline != null){
                    System.out.println(Arrays.toString(nextline));
                }
                }

    }


    //public void ReadCSVFile{

    public static void main(String[] args) throws Exception {

            String fileCSV = "data/credentials.csv";
            try {
            List<Credentials> beans = new CsvToBeanBuilder(new FileReader(fileCSV))
                    .withType(Credentials.class)
                    .build()
                    .parse();
            beans.forEach(System.out::println);
            }
            catch (Exception e){
            System.out.println(e);
            }


    }
}

    /*String fileCSV = "data/credentials.csv";

    public static void main(String[] args) throws Exception {
        System.out.println();
    }

    public ArrayList<ArrayList<String>> getCSVContent (String filepath) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(fileCSV);
        ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>();
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            ArrayList<String> list = new ArrayList<String>();
            for (int i = 0; i < nextLine.length; i++) {
                list.add(nextLine[i]);
            }
            array.add(list);
        }
        reader.close();
        return array;
    }*/








