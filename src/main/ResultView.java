package main;

import java.util.List;

public class ResultView {

    public void myLottoCheck(List<List<Integer>> lottos) {
        System.out.println(lottos.size()+"개를 구매했습니다.");
        for(List<Integer> lotto : lottos) {
            System.out.println(lotto.toString());
        }
    }

    public void winLottoCheck(int [] wonLottos, double rate) {
        System.out.println("당첨 통계");
        System.out.println("---------");
        System.out.printf("3개 일치 (5000원)- %s개 \n", wonLottos[0]);
        System.out.printf("4개 일치 (50000원)- %s개 \n", wonLottos[1]);
        System.out.printf("5개 일치 (1500000원)- %s개 \n", wonLottos[2]);
        System.out.printf("6개 일치 (2000000000원)- %s개 \n", wonLottos[3]);
        System.out.printf("총 수익률은 %.2f입니다. \n", rate);
    }
}
