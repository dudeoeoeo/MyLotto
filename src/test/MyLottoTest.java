package test;

import main.InputView;
import main.MyLotto;

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
            new Exception("계정 잔고가 5000원이 아닙니다.");
        }
        System.out.println("계정 잔고가 5000원이 맞습니다.");

        myLotto = new MyLotto(15000);
        if(myLotto.getMoney() != 15000) {
            new Exception("계정 잔고가 15000원이 아닙니다.");
        }
        System.out.println("계정 잔고가 15000원이 맞습니다.");

        myLotto = new MyLotto(12000);
        if(myLotto.getMoney() != 12000) {
            new Exception("계정 잔고가 12000원이 아닙니다.");
        }
        System.out.println("계정 잔고가 12000원이 맞습니다.");

    }

    public static void main(String[] args) {

        MyLottoTest test = new MyLottoTest();

        try {

            test.testMyLotto();
            test.testGetMoney();

        } catch (Exception e) {
            System.out.println("실패");
            e.printStackTrace();
            return;
        }
        System.out.println("성공");


    }
}
