package main;

import java.util.Scanner;

public class InputView {

    private Scanner sc = new Scanner(System.in);

    public int setMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        int money = sc.nextInt();
        return money;
    }

    public String getWonLottoNum() {
        System.out.println("\n지난 주 당첨 번호를 입력해 주세요");
        sc.nextLine();
        String wonNums = sc.nextLine();
        return wonNums;
    }
}
