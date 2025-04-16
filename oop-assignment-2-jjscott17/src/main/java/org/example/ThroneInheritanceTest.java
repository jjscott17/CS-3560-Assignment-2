package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ThroneInheritanceTest {

    @Test
    public void listofFive(){
        ThroneInheritance throne = new ThroneInheritance("king");
        throne.birth("king", "charles");
        throne.birth("king", "george");
        throne.birth("charles", "ben");
        throne.birth("george", "kevin");
        List<String> expected = new ArrayList<>();
        expected.add("king");
        expected.add("charles");
        expected.add("ben");
        expected.add("george");
        expected.add("kevin");
        assertEquals(expected, throne.getInheritanceOrder());
    }

    @Test
    public void twoDeaths() {
        ThroneInheritance throne = new ThroneInheritance("king");
        throne.birth("king", "charles");
        throne.birth("king", "george");
        throne.birth("charles", "ben");
        throne.birth("george", "kevin");
        throne.death("charles");
        throne.death("george");
        List<String> expected = new ArrayList<>();
        expected.add("king");
        expected.add("ben");
        expected.add("kevin");
        assertEquals(expected, throne.getInheritanceOrder());
    }

    @Test
    public void kingDies() {
        ThroneInheritance throne = new ThroneInheritance("king");
        throne.death("king");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, throne.getInheritanceOrder());
    }

}