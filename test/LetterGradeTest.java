import org.junit.Test;

import static org.junit.Assert.*;

public class LetterGradeTest {
    @Test
    public void convertLetterGradeToNumber() throws Exception {
        assertEquals("message", 4, LetterGrade.convertLetterGradeToNumber('A'));
        assertEquals("message", 0, LetterGrade.convertLetterGradeToNumber('F'));
        assertEquals("message", -1, LetterGrade.convertLetterGradeToNumber('5'));
        assertEquals("message", -1, LetterGrade.convertLetterGradeToNumber('E'));
    }

}