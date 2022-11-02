package Bank_System;

import Bank_System.Entity.Account;
import Bank_System.Entity.Bill;
import Bank_System.Entity.Person;
import Bank_System.Service.DepositService;
import Bank_System.Service.PaymentService;
import Bank_System.Service.TransferService;

/**
 В данном домашнем задании нужно написать небольшую банковскую систему.
 Минимальная банковская система будет состоять из классов (сущностей): Bill (счет) Account (аккаунт)
 Person (личность человека) Deopsit (пополнение счета) Payment (платеж).

 Связи между сущностями будут такие: Account имеет поле типа Person, так же Account имеет поле типа Bill
 Adjustment и Payment имеют по одному полю Bill

 Класс Person будет иметь следующие поля: имя, фамилия, номер телефона.
 Класс Account будет иметь поля: Bill и Person.
 Класс Bill будет содеражать поле с числовым значением внутри: например Integer amount
 Класс Payment будет содержать поле Bill
 Класс Adjustment будет содержать поле Bill

 Сценарии:
 Созадние нескольких аккаунтов и счетов
 В классах-сервисах (Напримет класс PaymentService) совершенить платежа (уменьшение счета)
 И депозит (DepositService) (увеличение счета)

 Перевод денег с одного аккаунта на другой
 Создать дополнительный класс TransferService, создать в нем метод transfer и реализовать логику перевода денег с одного аккаунта на другой

 В методе main не должно происходить никакой логики, кроме вызовов сервисов.
 Сервисы будут выполнять все действия, в методе main можно только создавать изначальные объекты и вызывать сервисы

 Так же стоит предусмотреть критические случаи, например не оставлять отрицательную сумму на счету**/

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setPhoneNumber(58984868);
        person.setName("Lori");
        person.setLastName("Kravc");
        System.out.println(person);
        Bill bill = new Bill();
        bill.setAmount(6846);
        Person katePerson = new Person("Kate", "Mir", 55884168);
        Account account = new Account(person, bill);
        Bill kateBill = new Bill();
        kateBill.setAmount(6488);
        Account accountBill = new Account(katePerson, kateBill);
        PaymentService paymentService = new PaymentService();
        paymentService.pay(account, 55);

        DepositService depositService = new DepositService();
        depositService.deposit(account, 577899655);
        TransferService transferService =  new  TransferService();
        transferService.Transfer(account, accountBill, 1000);

    }

}