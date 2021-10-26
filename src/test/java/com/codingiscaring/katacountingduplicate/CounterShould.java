package com.codingiscaring.katacountingduplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterShould {

    Counter counter = new Counter();

    @Test
    void countRepeatedCharacters() {
        assertEquals(0, counter.countRepeatedCharacters("abcde"));
        assertEquals(1, counter.countRepeatedCharacters("indivisibility"));
        assertEquals(2, counter.countRepeatedCharacters("aabbcde"));
        assertEquals(2, counter.countRepeatedCharacters("aa11"));
        assertEquals(1, counter.countRepeatedCharacters("**"));
    }

    @Test
    void beCaseInsensitive() {
        assertEquals(2, counter.countRepeatedCharacters("IndIvisibilities"));
    }

}