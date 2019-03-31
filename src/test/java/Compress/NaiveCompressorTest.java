package Compress;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NaiveCompressorTest {

    private NaiveCompressor compressor;

    @Before
    public void setUp() throws Exception {
        compressor = new NaiveCompressor();
    }

    @Test
    public void test_compress() {
        String given = "Ala ma kota";
        String expected = "AlaMaKota";
        assertEquals(expected, compressor.compress(given));
    }
    @Test
    public void test_compress_empty() {
        String given = "";
        String expected = "";
        assertEquals(expected, compressor.compress(given));
    }

    @Test
    public void test_compress_mixed_case() {
        String given = "ALa mA kOtA";
        String expected = "AlaMaKota";
        assertEquals(expected, compressor.compress(given));
    }

    @Test
    public void test_uncompress() {
        String given = "AlaMaKota";
        String expected = "ala ma kota";
        assertEquals(expected, compressor.uncompress(given));
    }

    @Test
    public void test_uncompress_empty() {
        String given = "";
        String expected = "";
        assertEquals(expected, compressor.uncompress(given));
    }
}