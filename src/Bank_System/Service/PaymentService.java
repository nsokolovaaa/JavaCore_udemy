package Bank_System.Service;

import Bank_System.Entity.Account;
import Bank_System.Entity.Bill;

public class PaymentService {
    public void pay(Account account, int amout) {
        Bill bill = account.getBill();
        if(bill.getAmount() < amout) {
            System.out.println("Недостаточно средств");
        } else {
            int current = bill.getAmount();
            System.out.println("Происходит операция платежа : " + current);
            bill.setAmount(current - amout);
            System.out.println("Платеж завершен, новое значение счета :" + bill.getAmount());
        }


    }
}
