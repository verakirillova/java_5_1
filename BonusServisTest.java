import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServisTest {


    @Test
    void shouldCalculateRegisteredAndBonusUnderLimit() {
        BonusServis service = new BonusServis();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

       assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredAndBonusOverLimit() {
        BonusServis service = new BonusServis();

        // подготавливаем данные:
        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateUnregisteredAndBonusLimit() {
        BonusServis service = new BonusServis();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateUnregisteredAndBonusOverLimit() {
        BonusServis service = new BonusServis();

        // подготавливаем данные:
        long amount = 1000_000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

}

