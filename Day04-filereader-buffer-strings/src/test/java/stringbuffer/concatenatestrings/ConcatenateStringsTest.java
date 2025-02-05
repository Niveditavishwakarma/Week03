package stringbuffer.concatenatestrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateStringsTest {

    @Test
    void concatenateStrings() {
        assertEquals("Hello world!",ConcatenateStrings.concatenateStrings(new String[]{"Hello"," ","world","!"}));
    }
}