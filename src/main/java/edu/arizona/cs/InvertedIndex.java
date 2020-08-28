package edu.arizona.cs;

public class InvertedIndex {
    boolean indexExists=false;
    String inputFilePath ="";

    public InvertedIndex(String inputFile){
        inputFilePath =inputFile;
    }

    public static void main(String[] args ) {
        try {
            String fileName = "Docs.txt";
            System.out.println("********Welcome to  Homework 1!");
            String query = "schizophrenia AND drug";
            InvertedIndex objInvertedIndex = new InvertedIndex(fileName);
            String[]  ans2 = objInvertedIndex.runQ5_2(query);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String[] runQ5_1(String query) throws java.io.FileNotFoundException,java.io.IOException {
        String[] dummy_ans = {"Doc1","Doc4"};
        return dummy_ans;
    }

    public String[] runQ5_2(String query) throws java.io.FileNotFoundException,java.io.IOException {
        String[] dummy_ans = {"Doc1","Doc2","Doc3","Doc4"};
        return dummy_ans;
    }
    public String[] runQ5_3(String query) throws java.io.FileNotFoundException,java.io.IOException {
        String[] dummy_ans = {"Doc1","Doc2","Doc4"};
        return dummy_ans;
    }


}
