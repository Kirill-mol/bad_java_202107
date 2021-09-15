package com.bad_java.homework.hyperskill.decrypt_encrypt.part_6.encoder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UnicodeEncryptorDescriptorTest {

    UnicodeEncryptorDescriptor unicodeEncryptorDescriptor;

    @Test
    void testEncryptShift1() {
        unicodeEncryptorDescriptor = new UnicodeEncryptorDescriptor(1);
        assertThat(unicodeEncryptorDescriptor.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789"))
                .isEqualTo("BCDEFGHIJKLMNOPQRSTUVWXYZ[23456789:");

    }

    @Test
    void testEncryptShift0() {
        unicodeEncryptorDescriptor = new UnicodeEncryptorDescriptor(0);
        assertThat(unicodeEncryptorDescriptor.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789"))
                .isEqualTo("ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789");

    }

    @Test
    void testDecryptShift1() {
        unicodeEncryptorDescriptor = new UnicodeEncryptorDescriptor(1);
        assertThat(unicodeEncryptorDescriptor.decrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789"))
                .isEqualTo("@ABCDEFGHIJKLMNOPQRSTUVWXY012345678");

    }

    @Test
    void testDecryptShift0() {
        unicodeEncryptorDescriptor = new UnicodeEncryptorDescriptor(0);
        assertThat(unicodeEncryptorDescriptor.decrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789"))
                .isEqualTo("ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789");

    }
}