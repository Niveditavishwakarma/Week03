package stringbuilder.reversestring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverse() {
        String expected = "dlrow olleh";
        String actual = ReverseString.reverse("hello world");
        assertEquals(expected, actual);
    }
}