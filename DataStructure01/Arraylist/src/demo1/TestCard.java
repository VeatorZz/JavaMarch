package demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestCard {

        public static final String[] suits = new String[]{"♥", "♠", "♣", "♦"};


       public TestCard(){

       }

        //填充卡牌
        public static List<Card> buyCard() {
            List<Card> desk = new ArrayList<>();

            for (int i = 0; i < 4; ++i) {
                for (int j = 1; j <=13; ++j) {
                    String suit = suits[i];
                    Card card = new Card(suit, j);
                    desk.add(card);
                }
            }
            return desk;
        }

        public static void shuffle(List<Card> cardList) {
            for (int i = cardList.size() - 1; i > 0; --i) {
                Random random = new Random();
                int index = random.nextInt(i);
                swap(cardList, i, index);
            }

        }

        public static void swap(List<Card> cardList, int i, int index) {
         Card tmp =(Card) cardList.get(i);
         cardList.set(i,cardList.get(index));
         cardList.set(index,tmp);
        }

        public static void main(String[] args) {
            List<Card> cardList = buyCard();
            System.out.println("买牌"+cardList);
            shuffle(cardList);
            System.out.println("洗牌"+cardList);
            List<Card> hand1=new ArrayList<>();
            List<Card> hand2=new ArrayList<>();
            List<Card> hand3=new ArrayList<>();
            List<List<Card>> hands =new ArrayList();
            hands.add(hand1);
            hands.add(hand2);
            hands.add(hand3);

            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < 3; ++j) {
                    //每次获取都去获取cardList的0下标的数据(删除)
                    Card card =cardList.remove(0);
                    List<Card> hand =hands.get(j);//第几个人
                    hand.add(i,card);//第几张牌
                }
            }

            System.out.println("第一人"+hand1);
            System.out.println("第二人"+hand2);
            System.out.println("第三人"+hand3);
            System.out.println("剩余的牌"+cardList);

        }

    }




