package com.bad_java.homework.hyperskill.decrypt_encrypt.part_6;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class ArgumentParserTest {

    @Test
    void testWithoutExceptions() {
        Map<String, String> stringStringMap = ArgumentParser.
                parseArguments(new String[]{"-in", "abbb", "-out", "bbb", "-data", "ffffff"});

        assertThat(stringStringMap)
                .containsAllEntriesOf(Map.of("-in", "abbb", "-out", "bbb", "-data", "ffffff"));
    }

    @Test
    void testExceptionThrows() {
        String[] inputArgs = {"-in", "abbb", "-out", "-aaa", "-data", "ffffff"};

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> ArgumentParser.parseArguments(inputArgs))
                .withMessage("After key mast be argument, not again key");

    }
}