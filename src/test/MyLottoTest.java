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
    }

    public List<List<Integer>> testGetMyLottos() throws Exception{

        List<List<Integer>> testMyLottos = new ArrayList<>();
        testMyLottos.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6)));
        testMyLottos.add(new ArrayList<>(Arrays.asList(4,8,12,34,41,5)));
        testMyLottos.add(new ArrayList<>(Arrays.asList(9,4,1,2,7,24)));
        testMyLottos.add(new ArrayList<>(Arrays.asList(21,32,40,1,11,2)));

        if(testMyLottos == null) {
            throw new Exception("구매한 로또가 없습니다.");
        }
        testMyLottos.add(new ArrayList<>(Arrays.asList(21,32,40,1,11)));
        testMyLottos.add(new ArrayList<>(Arrays.asList(32,40,1,11)));

        System.out.println("구매한 로또 "+testMyLottos.size()+"개 반환 성공");
        return testMyLottos;
    }
    public void testStringToInt() throws Exception{
        String wonLottoNums = "1, 2, 3, 4, 5, 6";
        String [] wonLottoArr = wonLottoNums.replaceAll(",", "").split(" ");
        int [] lottoNums = new int[wonLottoArr.length];
        for(int i = 0; i < wonLottoArr.length; i++) {
            lottoNums[i] = Integer.parseInt(wonLottoArr[i]);
        }
        if(lottoNums.length != 6) {
            throw new Exception("당첨 번호 개수가 6개가 아닙니다.");
        }
        System.out.println("당첨 번호: "+Arrays.toString(lottoNums));
    }
    public void testWonLottoCheck() throws Exception {
        int [] wonLottoNums = {1, 2, 3, 4, 5, 6};
        if(wonLottoNums.length != 6) {
            throw new Exception("로또 당첨번호가 6자리가 아닙니다.");
        }
        List<List> myLottos = new ArrayList<>();
        myLottos.add(new ArrayList(Arrays.asList(1, 3, 5, 11, 32, 42)));
        myLottos.add(new ArrayList(Arrays.asList(16, 9, 12, 16, 32, 42)));
        myLottos.add(new ArrayList(Arrays.asList(7, 4, 30, 1, 32, 42)));
        myLottos.add(new ArrayList(Arrays.asList(22, 2, 8, 11, 38, 44)));
        myLottos.add(new ArrayList(Arrays.asList(34, 1, 5, 3, 4, 24)));
        myLottos.add(new ArrayList(Arrays.asList(2, 1, 5, 3, 4, 6)));
        myLottos.add(new ArrayList(Arrays.asList(6, 5, 4, 3, 2, 1)));
        int [] wonLottos = new int[7];

        for (int i = 0; i < myLottos.size(); i++) {
            List<Integer> lotto = myLottos.get(i);
            int cnt = 0;
            for(int j = 0; j < wonLottoNums.length; j++) {
                if(lotto.contains(wonLottoNums[j])) {
                    System.out.println(wonLottoNums[j]);
                    cnt++;
                }
            }
            wonLottos[cnt]++;
        }
        System.out.println("로또 당첨 확인 성공: "+Arrays.toString(wonLottos));
    }
    public void testGetProfitRate() {
        int totalPrize = 2000000000;
        int investment = 50000;
        System.out.println(totalPrize);
        double profitRate = (double) totalPrize / investment;

        System.out.println(profitRate);
    }

    public static void main(String[] args) {

        MyLottoTest test = new MyLottoTest();

        try {

            test.testMyLotto();
            test.testGetMoney();
            test.testBuyLottoCheck();
            test.testBuyLotto();
            test.testGetMyLottos();
            test.testStringToInt();
            test.testWonLottoCheck();
            test.testGetProfitRate();

        } catch (Exception e) {
            System.out.println("실패");
            e.printStackTrace();
            return;
        }
        System.out.println("성공");


    }
}
