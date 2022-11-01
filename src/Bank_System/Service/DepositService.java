package Service;

import Entity.Account;
import Entity.Bill;

public class DepositService {
    public void deposit(Account account, int amout) {
        Bill bill = account.getBill();
        int currentBill = bill.getAmount();
        System.out.println("Операция пополнения счета, текущее значение :" +currentBill);
        bill.setAmount(currentBill + amout);
        System.out.println("Пополнение счета прошло успешно, новое значение счета: " + bill.getAmount());
    }
}
