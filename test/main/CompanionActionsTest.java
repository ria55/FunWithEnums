package main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanionActionsTest {

    private static Companion[] companions;

    private Player player;

    @BeforeAll
    static void setUp() {
        companions = new Companion[3];
        companions[0] = new Companion(CompanionType.HEALER);
        companions[1] = new Companion(CompanionType.DEFENDER);
        companions[2] = new Companion(CompanionType.FIGHTER);
    }

    @BeforeEach
    void init() {
        player = new Player(0, 0, 0);
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