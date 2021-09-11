package test;

import main.MyLotto;

public class MyLottoTest {

    public void testMyLotto() throws Exception {
        MyLotto myLotto = new MyLotto();
        if(myLotto == null) {
            throw new Exception("로또 계정 생성 실패");
        }
    }

    public static void main(String[] args) {
        MyLottoTest test = new MyLottoTest();
        try {
            test.testMyLotto();
        } catch (Exception e) {
            System.out.println("실패");
            e.printStackTrace();
            return;
        }
        System.out.println("성공");
    }
}
