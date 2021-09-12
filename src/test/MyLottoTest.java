package test;

import main.InputView;
import main.MyLotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyLottoTest {

    public void testMyLotto() throws Exception {
        MyLotto myLotto = new MyLotto(1000);
        if(myLotto == null) {
            throw new Exception("로또 계정 생성 실패");
        }
    }

    public void testGetMoney() throws Exception {
        MyLotto myLotto = new MyLotto(5000);
        if(myLotto.getMoney() != 5000) {
            throw new Exception("계정 잔고가 5000원이 아닙니다.");
        }
        System.out.println("계정 잔고가 5000원이 맞습니다.");

        myLotto = new MyLotto(15000);
        if(myLotto.getMoney() != 15000) {
            throw new Exception("계정 잔고가 15000원이 아닙니다.");
        }
        System.out.println("계정 잔고가 15000원이 맞습니다.");

        myLotto = new MyLotto(12000);
        if(myLotto.getMoney() != 12000) {
            throw new Exception("계정 잔고가 12000원이 아닙니다.");
        }
        System.out.println("계정 잔고가 12000원이 맞습니다.");
    }
    public boolean testBuyLottoCheck() throws Exception{
        MyLotto myLotto = new MyLotto(5000);
        if(myLotto.getMoney() < 1000) {
            throw new Exception("계정 잔고가 부족하여 로또를 구매할 수 없습니다.");
        }
        System.out.println("로또를 구매했습니다.");
        return true;
    }
    public void testBuyLotto() throws Exception {
        int money = 1000;
        List<Integer> lottoNums = new ArrayList<>();

        while (money >= 1000) {
            lottoNums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
            break;
        }
        if(lottoNums.size() <= 0) {
            throw new Exception("로또 구매를 실패했습니다.");
        }
        System.out.println(lottoNums.toString());

        money = 999;
        lottoNums = new ArrayList<>();

        while (money >= 1000) {
            lottoNums = new ArrayList<>(Arrays.asList(11,22,33,44,45,2));
            break;
        }
        if(lottoNums.size() <= 0) {
            throw new Exception("로또 구매를 실패했습니다.");
        }
        System.out.println(lottoNums.toString());
    }

    public static void main(String[] args) {

        MyLottoTest test = new MyLottoTest();

        try {

            test.testMyLotto();
            test.testGetMoney();
            while (test.testBuyLottoCheck()) {
                test.testBuyLotto();
            }

        } catch (Exception e) {
            System.out.println("실패");
            e.printStackTrace();
            return;
        }
        System.out.println("성공");


    }
}
