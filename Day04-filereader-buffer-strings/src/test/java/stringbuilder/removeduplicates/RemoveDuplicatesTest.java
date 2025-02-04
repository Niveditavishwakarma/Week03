package stringbuilder.removeduplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        assertEquals("progamin", RemoveDuplicates.removeDuplicates("programming"));
        assertEquals("abc", RemoveDuplicates.removeDuplicates("aabbcc"));
        assertEquals("helo wrd", RemoveDuplicates.removeDuplicates("hello world"));
    }
}