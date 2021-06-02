package com.codingiscaring.katacountingduplicate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountingDuplicateShould {

    @Test
    void doesNotFindDuplicatedCharacters() {
        assertEquals(0, CountingDuplicate.count("abcde"));
    }

    @Test
    void doesFindOneCharacterDuplicated() {
        assertEquals(1, CountingDuplicate.count("indivisibility"));
    }

    @Test
    void doesFindTwoCharacterDuplicated() {
        assertEquals(2, CountingDuplicate.count("aabbcde"));
    }

    @Test
    void doesRemoveDuplicates() {
        assertEquals("abcde", CountingDuplicate.removeDuplicates("aabbcde"));
    }

    @Test
    void doesFindLowerCaseAndUpperCaseCharactersDuplicated() {
        assertEquals(2, CountingDuplicate.count("IndIvisibilities"));
    }

    @Test
    void doesFindCharactersAndNumbersDuplicated() {
        assertEquals(2, CountingDuplicate.count("aA11"));
    }

    @Test
    void getFrequency() {
        assertEquals(2, CountingDuplicate.getFrequency("aabcde", "a"));
    }

    @Test
    void wordToList() {
        List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
        assertEquals(expected, Arrays.asList("aabcd".split("")));
    }

}