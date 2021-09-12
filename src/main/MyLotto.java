package main;

import java.util.ArrayList;
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
}
