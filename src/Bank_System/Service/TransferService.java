package Bank_System.Service;

import Bank_System.Entity.Account;

public class TransferService {
    public void Transfer(Account accountFrom, Account accountTo, int amout) {
        int billAccountFrom = accountFrom.getBill().getAmount();
        int billAccountTo = accountTo.getBill().getAmount();
        if(billAccountFrom < amout) {
            System.out.println("Перевод невозможен, нехватает средств");
        } else {
            System.out.println("Происходит перевод с " +accountFrom + "на аккаунт" +accountFrom);
            accountFrom.getBill().setAmount(billAccountFrom -amout);
            accountTo.getBill().setAmount(billAccountTo + amout);
            System.out.println("Перевод успешно завершен: " + accountTo.getBill().getAmount());
        }
    }
}
