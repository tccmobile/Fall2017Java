import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextAnalyzerTest {



    TextAnalyzer one = new TextAnalyzer();


    @Test
    void getNumOfCharacters() {


        assertEquals(12,one.getNumOfCharacters("hello world!"));
    }

}