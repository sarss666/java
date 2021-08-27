package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Game {
    public static void  printfPlayerHandCardList(List<Player>playerList){
        for (Player player:playerList) {
            System.out.printf("玩家 [%s]的手牌是:%s%n",player.name, player.cardList);

        }


    }
    public static void main(String[] args) {
        //五名玩家
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("周润发"));
        playerList.add(new Player("刘德华"));
        playerList.add(new Player("高进"));
        playerList.add(new Player("陈小刀"));
        playerList.add(new Player("周星星"));



        List<Card> cardList = new ArrayList<>();
        initializeCards(cardList);
        //调用Collections，进行洗牌
        Collections.shuffle(cardList);
        System.out.println("抽牌前:");
        System.out.println(cardList);
        
        //发牌
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (Player player: playerList) {
                //从牌库中抽一张出来
                Card card = cardList.remove(0);
                player.cardList.add(card);
            }
        }
        System.out.println("抽牌后:");
        System.out.println(cardList);

        System.out.println("交换牌之前");
        printfPlayerHandCardList(playerList);

        Card toFoundCard = new Card("♠",1);
        Player 周润发 = playerList.get(0);

        if(周润发.cardList.contains(toFoundCard)){

            周润发.cardList.set(0,toFoundCard);
        }
        System.out.println("发哥第一次发功后");
        printfPlayerHandCardList(playerList);
        Random random = new Random();
        // 交换牌，每名玩家抽取下家一张牌
        for (int i = 0; i < playerList.size(); i++) {
            Player currentPlayer = playerList.get(i);
            Player nextPlayer = playerList.get(i != playerList.size()-1 ? i+1:0);
            // 要取的下标
            int toDrawIndex = random.nextInt(nextPlayer.cardList.size());
            //取牌
            Card drawCard = nextPlayer.cardList.remove((toDrawIndex));
            currentPlayer.cardList.add(drawCard);

            
        }
        System.out.println("交换牌之后");
        printfPlayerHandCardList(playerList);

        if(周润发.cardList.contains(toFoundCard)){

            周润发.cardList.set(0,toFoundCard);
        }
        System.out.println("发哥第二次发功");
        printfPlayerHandCardList(playerList);

        for (Player player:playerList) {
            if(player.cardList.contains(toFoundCard));
            {
                System.out.println(player.name + "获胜");
                return;
            }
//            for(Card card:player.cardList){
//                //比较
//                if(card.equals(toFoundCard)){
//
//                    System.out.println(player.name+"获胜");
//                    return;
//                }
//            }
        }

        System.out.println("无人获胜");
    }

    private static void initializeCards(List<Card> cards) {
        for(String suit:new String[]{"♠","♥","♦","♣"}){
            for (int rank = 1; rank <= 5 ; rank++) {
                Card card = new Card(suit,rank);
                cards.add(card);


            }
        }

    }

}
