package main;

import main.original.PlayerToOriginal;
import main.original.companions.CompanionBase;
import main.original.companions.Defender;
import main.original.companions.Fighter;
import main.original.companions.Healer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OriginalCompanionActionTest {

    private static CompanionBase[] companions;

    private PlayerToOriginal player;

    @BeforeAll
    static void setUp() {
        companions = new CompanionBase[3];
        companions[0] = new Healer();
        companions[1] = new Defender();
        companions[2] = new Fighter();
    }

    @BeforeEach
    void init() {
        player = new PlayerToOriginal(0, 0, 0);
    }

    @Test
    void testHealerCompanion() {
        setAndCallCompanion(0);

        assertEquals(100, player.getStamina());
        assertEquals(0, player.getDefensePower());
        assertEquals(0, player.getAttackPower());
    }

    @Test
    void testDefenderCompanion() {
        setAndCallCompanion(1);

        assertEquals(100, player.getDefensePower());
        assertEquals(0, player.getStamina());
        assertEquals(0, player.getAttackPower());
    }

    @Test
    void testFighterCompanion() {
        setAndCallCompanion(2);

        assertEquals(100, player.getAttackPower());
        assertEquals(0, player.getDefensePower());
        assertEquals(0, player.getStamina());
    }

    private void setAndCallCompanion(int index) {
        player.setCompanion(companions[index]);
        player.callForHelp();
    }

}
