package ru.netology.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RadioTest {
    Radio radio = new Radio();
    @Test
    public void validateRadioWaveOverPossible() {
        radio.setCurrentRadioWave(18);
        assertEquals(0, radio.getCurrentRadioWave());
    }
    @Test
    public void validateRadioWaveLessPossible() {
        radio.setCurrentRadioWave(-1);
        assertEquals(9, radio.getCurrentRadioWave());
    }
    @Test
    public void currentRadioWaveUp() {
        radio.setCurrentRadioWave(9);
        assertEquals(0, radio.currentRadioWaveUp());
    }
    @Test
    public void currentRadioWaveDown() {
        radio.setCurrentRadioWave(0);
        assertEquals(9, radio.currentRadioWaveDown());
    }

    @Test
    public void validateChangeSoundLevelOverPossible() {
        radio.setCurrentSoundLevel(15);
        assertEquals(10, radio.getCurrentSoundLevel());
    }

    @Test
    public void validateChangeSoundLevelUnderPossible() {
        radio.setCurrentSoundLevel(-8);
        assertEquals(0, radio.getCurrentSoundLevel());
    }

    @Test
    public void currentSoundLevelUp() {
        radio.setCurrentSoundLevel(10);
        assertEquals(10, radio.currentSoundLevelUp());
    }

    @Test
    public void currentSoundLevelDown() {
        radio.setCurrentSoundLevel(0);
        assertEquals(0, radio.currentSoundLevelDown());
    }

}