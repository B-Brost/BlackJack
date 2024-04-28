package HW2;

public class Player {
    Hand player = new Hand();
    int standValue = 0;
    boolean isHardStand = true;

    Player(int standValue, boolean isHardStand) {
        this.standValue = standValue;
        this.player = new Hand();
        this.isHardStand = isHardStand;
    }

    public String toString() {
        return player.toString();
    }

    public void play(Deck deck) {
        if (player.getScore() == 0) { // Deal two cards initially
            player.addCard(deck.deal());
            player.addCard(deck.deal());
        } else { // Then deal cards based on player's decision
            if (this.isHardStand == false) {
                while (player.getScore() < standValue) {
                    player.addCard(deck.deal());
                }
            } else {
                if (player.getIsHard() == true) {
                    while (player.getScore() < standValue) {
                        player.addCard(deck.deal());
                    }
                } else {
                    player.addCard(deck.deal());
                }
            }
        }
    }

    public Boolean isBust() {
        if (player.getScore() > 21) {
            return true;
        }
        return false;
    }

    public int compareScores(Player that) {
        return this.player.getScore() - that.player.getScore();
    }

    public int getScore() {
        return player.getScore();
    }
}
