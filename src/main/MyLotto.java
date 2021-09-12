package main;

public class MyLotto {

    private int money;

    public MyLotto(int money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }

    public boolean buyLotto() {
        if(this.money < 1000) {
            return false;
        }
        return true;
    }
}
