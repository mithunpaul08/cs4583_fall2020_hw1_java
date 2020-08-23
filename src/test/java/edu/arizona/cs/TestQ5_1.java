package edu.arizona.cs;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestQ5_1 {

    @Test
    public void testDocsAndScores() {
        String inputFileFullPath="src/main/resources/Docs.txt";
        try {
            String query = "schizophrenia AND drug";
            InvertedIndex objInvertedIndex = new InvertedIndex(inputFileFullPath);
            String[] ans_q5_1 = objInvertedIndex.runQ5_2(query);
            String[] doc_names_q1 = {"Doc1", "Doc2"};
            int counter1 = 0;
            assertEquals((doc_names_q1.length) , ans_q5_1.length);
            for (String docs : ans_q5_1) {
                assertEquals(doc_names_q1[counter1], ans_q5_1[counter1]);
                counter1 = counter1 + 1;
            }
        }
        catch ( java.io.FileNotFoundException ex)
        {
            System.out.println(ex.getMessage()); }

        catch ( java.io.IOException ex)
        {
            System.out.println(ex.getMessage()); }

    }


}



