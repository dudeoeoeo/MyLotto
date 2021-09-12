package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyLotto {

    private int money;
    private List<List<Integer>> myLottos = new ArrayList<>();

    public MyLotto(int money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }

    public boolean buyLottoCheck() {
        if(this.money < 1000) {
            return false;
        }
        return true;
    }

    public void buyLotto() {
        List<Integer> lottoNums = new ArrayList<>();
        for(int i = 1; i < 46; i++) {
            lottoNums.add(i);
        }
        Collections.shuffle(lottoNums);
        lottoNums = lottoNums.subList(0, 6);
        this.myLottos.add(lottoNums);
        this.money = this.money - 1000;
    }

    public List<List<Integer>> getMyLottos() {
        return this.myLottos;
    }

    public int [] stringToInt(String wonLottoNums) {
        String [] wonLottoArr = wonLottoNums.replaceAll(",", "").split(" ");
        int [] lottoNums = new int[wonLottoArr.length];

        for(int i = 0; i < wonLottoArr.length; i++) {
            lottoNums[i] = Integer.parseInt(wonLottoArr[i]);
        }

        return lottoNums;
    }

    public int [] wonLottoCheck(int [] wonLottoNums) {
        int [] wonLottos = new int[7];
        for (int i = 0; i < this.myLottos.size(); i++) {
            List<Integer> lotto = myLottos.get(i);
            int cnt = 0;
            for(int j = 0; j < wonLottoNums.length; j++) {
                if(lotto.contains(wonLottoNums[j])) {
                    cnt++;
                }
            }
            wonLottos[cnt]++;
        }
        return wonLottos;
    }

    public double getProfitRate(int [] wonLottos) {
        int totalPrize = 0;
        int investment = 0;
        int [] prizeArr = {0, 0, 0, 5000, 50000, 1500000, 2000000000};
        for(int i = 0; i < prizeArr.length; i++) {
            totalPrize = totalPrize + prizeArr[i] * wonLottos[i];
            investment = investment + 1000 * wonLottos[i];
        }
        double profitRate = (double) totalPrize / investment;

        return profitRate;
    }

    public static void main(String[] args) {

        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        MyLotto myLotto = new MyLotto(inputView.setMoney());

        while (myLotto.buyLottoCheck()) {
            myLotto.buyLotto();
        }

        resultView.myLottoCheck(myLotto.getMyLottos());

        String wonLottoNums = inputView.getWonLottoNum();

        int [] wonLottoNum = myLotto.stringToInt(wonLottoNums);

        int [] wonLottoCheckArr = myLotto.wonLottoCheck(wonLottoNum);

        double myProfit = myLotto.getProfitRate(wonLottoCheckArr);

        resultView.winLottoCheck(wonLottoCheckArr, myProfit);

    }
}
