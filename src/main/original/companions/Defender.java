package main.original.companions;

import main.original.PlayerToOriginal;

public class Defender extends CompanionBase {

    @Override
    public void action(PlayerToOriginal player) {
        player.increaseDP(100);
    }

}
