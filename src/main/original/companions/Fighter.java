package main.original.companions;

import main.original.PlayerToOriginal;

public class Fighter extends CompanionBase {

    @Override
    public void action(PlayerToOriginal player) {
        player.increaseAP(100);
    }

}
