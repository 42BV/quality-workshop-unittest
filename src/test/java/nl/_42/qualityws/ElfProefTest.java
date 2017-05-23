package nl._42.qualityws;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ElfProefTest {
    
    @Test
    public void elfProef_shouldSucceed_whenRekeningNummer_valid_padded_numericChars() {
        final String rekeningNummer = "0736160221";
        assertTrue(ElfProef.execute(rekeningNummer));
    }

    @Test
    public void elfProef_shouldSucceed_whenRekeningNummer_valid_padded_mixedChars() {
        final String rekeningNummer = "073.61.60.221";
        assertTrue(ElfProef.execute(rekeningNummer));
    }

    @Test
    public void elfProef_shouldSucceed_whenRekeningNummer_valid_unpadded_numericChars() {
        final String rekeningNummer = "736160221";
        assertTrue(ElfProef.execute(rekeningNummer));
    }

    @Test
    public void elfProef_shouldSucceed_whenRekeningNummer_valid_unpadded_mixedChars() {
        final String rekeningNummer = "73.61.60.221";
        assertTrue(ElfProef.execute(rekeningNummer));
    }

    @Test
    public void elfProef_shouldFail_whenRekeningNummer_invalid_padded_numericChars() {
        final String rekeningNummer = "0736160222";
        assertFalse(ElfProef.execute(rekeningNummer));
    }

    @Test
    public void elfProef_shouldFail_whenRekeningNummer_invalid_padded_mixedChars() {
        final String rekeningNummer = "073.61.60.222";
        assertFalse(ElfProef.execute(rekeningNummer));
    }

    @Test
    public void elfProef_shouldFail_whenRekeningNummer_invalid_unpadded_numericChars() {
        final String rekeningNummer = "736160222";
        assertFalse(ElfProef.execute(rekeningNummer));
    }

    @Test
    public void elfProef_shouldFail_whenRekeningNummer_invalid_unpadded_mixedChars() {
        final String rekeningNummer = "73.61.60.222";
        assertFalse(ElfProef.execute(rekeningNummer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void elfProef_shouldError_whenRekeningNummer_null() {
        ElfProef.execute(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void elfProef_shouldError_whenRekeningNummer_zeroesOnly() {
        ElfProef.execute("00000000");
    }

    @Test(expected = IllegalArgumentException.class)
    public void elfProef_shouldError_whenRekeningNummer_exceedsMaxLength() {
        ElfProef.execute("123456789012");
    }
}
