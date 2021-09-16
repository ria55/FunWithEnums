package main;

public enum CompanionType {

    HEALER {
        @Override
        public void action(Player player) {
            player.increaseHP(100);
        }
    },
    DEFENDER {
        @Override
        public void action(Player player) {
            player.increaseDP(100);
        }
    },
    FIGHTER {
        @Override
        public void action(Player player) {
            player.increaseAP(100);
        }
    };

    public void action(Player player) {
        System.out.println("no action available");
    }

}
