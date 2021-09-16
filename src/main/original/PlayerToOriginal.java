package main.original;

import main.original.companions.CompanionBase;

public class PlayerToOriginal {

    private int stamina;
    private int attackPower;
    private int defensePower;

    protected CompanionBase companion;

    public PlayerToOriginal(int stamina, int attackPower, int defensePower) {
        this.stamina = stamina;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public PlayerToOriginal(int stamina, int attackPower, int defensePower, CompanionBase companion) {
        this(stamina, attackPower, defensePower);
        this.companion = companion;
    }

    public void setCompanion(CompanionBase companion) {
        this.companion = companion;
    }

    public void increaseHP(int increase) {
        stamina += increase;
    }

    public void increaseAP(int increase) {
        attackPower += increase;
    }

    public void increaseDP(int increase) {
        defensePower += increase;
    }

    public int getStamina() {
        return stamina;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void callForHelp() {
        companion.action(this);
    }

    @Override
    public String toString() {
        return "HP: " + stamina +
                ", DP: " + defensePower +
                ", AP: " + attackPower;
    }

}
