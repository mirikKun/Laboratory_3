

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Lab3IterableTest {

    private Lab3Iterable iterable = new Lab3Iterable();

    @Test
    void Filter_integer() {

        List<Integer> testData = new ArrayList<>();
        testData.add(1);
        testData.add(2);
        testData.add(3);
        testData.add(2);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);

        Iterable<Integer> actual = Lab3Iterable.Filter(testData, integer -> integer == 2);

        assertEquals(expected, actual);
    }

    @Test
    void Filter_string() {

        List<String> testData = new ArrayList<>();
        testData.add("qwe");
        testData.add("qwerty");
        testData.add("asd");

        List<String> expected = new ArrayList<>();
        expected.add("qwe");
        expected.add("asd");

        Iterable<String> actual = Lab3Iterable.Filter(testData, string -> string.length() == 3);

        assertEquals(expected, actual);
    }

    @Test
    void Filter_character() {

        List<Character> testData = new ArrayList<>();
        testData.add('a');
        testData.add('b');
        testData.add('c');
        testData.add('a');

        List<Character> expected = new ArrayList<>();
        expected.add('a');
        expected.add('a');

        Iterable<Character> actual = Lab3Iterable.Filter(testData, character -> character == 'a');

        assertEquals(expected, actual);
    }

    @Test
    void Filter_double() {

        List<Double> testData = new ArrayList<>();
        testData.add(2.5);
        testData.add(11.1);

        List<Double> expected = new ArrayList<>();
        expected.add(11.1);

        Iterable<Double> actual = Lab3Iterable.Filter(testData, doublePrecision -> doublePrecision > 4);

        assertEquals(expected, actual);
    }

    @Test
    void Transform_string() {

        List<String> testData = new ArrayList<>();
        testData.add("qwe");
        testData.add("qwerty");
        testData.add("qwer");

        List<String> expected = new ArrayList<>();
        expected.add("we");
        expected.add("werty");
        expected.add("wer");

        Iterable<String> actual = Lab3Iterable.Transform(testData, string -> string.substring(1));

        assertEquals(expected, actual);
    }

    @Test
    void Transform_integer() {

        List<Integer> testData = new ArrayList<>();
        testData.add(1);
        testData.add(2);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);

        Iterable<Integer> actual = Lab3Iterable.Transform(testData, integer -> integer + 1);

        assertEquals(expected, actual);
    }



    @Test
    void Transform_character() {

        List<Character> testData = new ArrayList<>();
        testData.add('a');
        testData.add('b');
        testData.add('c');

        List<Character> expected = new ArrayList<>();
        expected.add('*');
        expected.add('b');
        expected.add('c');

        Iterable<Character> actual = Lab3Iterable.Transform(testData, character -> {
            if (character == 'a') {
                return '*';
            }
            return character;
        });

        assertEquals(expected, actual);
    }

    @Test
    void Transform_double() {

        List<Double> testData = new ArrayList<>();
        testData.add(4.0);
        testData.add(4.5);
        testData.add(5.0);

        List<Double> expected = new ArrayList<>();
        expected.add(2.0);
        expected.add(2.25);
        expected.add(2.5);

        Iterable<Double> actual = Lab3Iterable.Transform(testData, doublePrecision -> doublePrecision / 2);

        assertEquals(expected, actual);
    }
}