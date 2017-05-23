package nl._42.qualityws;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ElfProefTest {
    
    @Test
    public void elfProef_shouldSucceed_whenAccountNumber_valid_padded_numericChars() {
        final String accountNumber = "0736160221";
        assertTrue(ElfProef.execute(accountNumber));
    }

    @Test
    public void elfProef_shouldSucceed_whenAccountNumber_valid_padded_mixedChars() {
        final String accountNumber = "073.61.60.221";
        assertTrue(ElfProef.execute(accountNumber));
    }

    @Test
    public void elfProef_shouldSucceed_whenAccountNumber_valid_unpadded_numericChars() {
        final String accountNumber = "736160221";
        assertTrue(ElfProef.execute(accountNumber));
    }

    @Test
    public void elfProef_shouldSucceed_whenAccountNumber_valid_unpadded_mixedChars() {
        final String accountNumber = "73.61.60.221";
        assertTrue(ElfProef.execute(accountNumber));
    }

    @Test
    public void elfProef_shouldFail_whenAccountNumber_invalid_padded_numericChars() {
        final String accountNumber = "0736160222";
        // missing assertion
    }

    @Test
    public void elfProef_shouldFail_whenAccountNumber_invalid_padded_mixedChars() {
        final String accountNumber = "073.61.60.222";
        // missing assertion
    }

    @Test
    public void elfProef_shouldFail_whenAccountNumber_invalid_unpadded_numericChars() {
        final String accountNumber = "736160222";
        // missing assertion
    }

    @Test
    public void elfProef_shouldFail_whenAccountNumber_invalid_unpadded_mixedChars() {
        final String accountNumber = "73.61.60.222";
        // missing assertion
    }

    @Test(expected = IllegalArgumentException.class)
    public void elfProef_shouldError_whenAccountNumber_null() {
        ElfProef.execute(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void elfProef_shouldError_whenAccountNumber_zeroesOnly() {
        ElfProef.execute("00000000");
    }

    @Test(expected = IllegalArgumentException.class)
    public void elfProef_shouldError_whenAccountNumber_exceedsMaxLength() {
        ElfProef.execute("123456789012");
    }
}
