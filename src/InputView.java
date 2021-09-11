import java.util.Arrays;
import java.util.Scanner;

public class InputView {

    private Scanner sc = new Scanner(System.in);

    public int setMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        int money = sc.nextInt();
        System.out.println(money);
        return money;
    }

    public String getWonLottoNum() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요");
        String lottoNum = sc.nextLine();
        System.out.println(lottoNum);
        return lottoNum;
    }
}
