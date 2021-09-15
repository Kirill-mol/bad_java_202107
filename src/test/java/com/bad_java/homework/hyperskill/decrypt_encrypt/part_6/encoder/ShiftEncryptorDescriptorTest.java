package com.bad_java.homework.hyperskill.decrypt_encrypt.part_6.encoder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ShiftEncryptorDescriptorTest {

    ShiftEncryptorDescriptor shiftEncryptorDescriptor = new ShiftEncryptorDescriptor(5);

    @Test
    void testEncryptUpper() {
        Assertions.assertThat(shiftEncryptorDescriptor.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ"))
                .isEqualTo("FGHIJKLMNOPQRSTUVWXYZABCDE");
    }

    @Test
    void testEncryptLower() {
        Assertions.assertThat(shiftEncryptorDescriptor.encrypt("abcdefghijklmnopqrstuvwxyz"))
                .isEqualTo("fghijklmnopqrstuvwxyzabcde");
    }

    @Test
    void testDecryptUpper() {
        Assertions.assertThat(shiftEncryptorDescriptor.decrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ"))
                .isEqualTo("VWXYZABCDEFGHIJKLMNOPQRSTU");
    }

    @Test
    void testDecryptLower() {
        Assertions.assertThat(shiftEncryptorDescriptor.decrypt("abcdefghijklmnopqrstuvwxyz"))
                .isEqualTo("vwxyzabcdefghijklmnopqrstu");
    }

}