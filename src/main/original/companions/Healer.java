package main.original.companions;

import main.original.PlayerToOriginal;

public class Healer extends CompanionBase {

    @Override
    public void action(PlayerToOriginal player) {
        player.increaseHP(100);
    }

}
