import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pocker {
    static class Card {
        private String suit;
        private int rank;

        public Card(String suit, int rank) {
            this.suit = suit;
            this.rank = rank;
        }

        public String getSuit() {
            return suit;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }
    }

    public static class TestCard {
        public static final String[] suits = {"桃心", "黑桃", "梅花", "方片"};

        //填充卡牌
        public static List<Card> buyCard() {
            List<Card> desk = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 13; j++) {
                    String suit = suits[i];
                    Card card = new Card(suit, j);
                    desk.add(card);
                }
            }
            return desk;
        }

        public static void shuffle(List<Card> cardList) {
            for (int i = cardList.size() - 1; i > 0; i--) {
                Random random = new Random();
                int index = random.nextInt();
                swap(cardList, i, index);
            }

        }

        public static void swap(List<Card> cardList, int i, int index) {
         Card tmp = cardList.get(i);
         cardList.set(i,cardList.get(index));
         cardList.set(index,tmp);
        }

        public static void main(String[] args) {
            List<Card> cardList = buyCard();
            System.out.println(cardList);
            shuffle(cardList);
            System.out.println();
            List<Card> hand1=new ArrayList<>();
            List<Card> hand2=new ArrayList<>();
            List<Card> hand3=new ArrayList<>();
            List<List<Card>> hands =new ArrayList<>();
            hands.add(hand1);
            hands.add(hand2);
            hands.add(hand3);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 3; j++) {
                    Card card =cardList.remove(0);
                    List<Card> hand =hands.get(j);//第几个人
                    hand.set(i,card);//第几张牌
                }
            }

        }

    }



}
