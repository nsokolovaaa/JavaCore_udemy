package System_reserv;

import System_reserv.Entity.Bill;
import System_reserv.Entity.Client;
import System_reserv.Entity.Hotel;
import System_reserv.Entity.Room;
import System_reserv.Service.BookingService;

/**В данном домашнем задании нужно написатьсистему бронировния номеров в отеле.
 Сущности: Client, Hotel, Room, Bill.

 Hotel будет содеражть поля: имя отеля, список номеров
 Room будет содеражть колличество человек, которых можно разместить, стоимость этого номера и свободен ли этот номер

 Сценарии:
 Нужно создать нескольких клиентов с счетами и внести им первоначальную сумму. Так же нужно создать
 несколько отелей, с разными наборами номеров (В списке внутри сущности Hotel)
 Клиент должен попробовать забронировать номер, для этого он так же указывает
 сколько человек в номере ему нужно разместить. После успешного бронирования списывать сумму со счета клиента.

 Так же при бронировании проверять есть ли свободные номера

 В одном из сценариев, клиенту должно не хватить денег для бронирования номера

 В методе main не нужно проводить никаких операций, кроме создания начальных объектов, сервисов и вызова их методов **/
public class Main {
    public static void main(String[] args) {
        Bill bill1 = new Bill(5655);
        Client client1 = new Client("Kate", "Mir", 57854681, "kate_mir@mail.ru", bill1);

        Bill bill2 = new Bill(59898);
        Client client2 = new Client("Nastya", "Sokol", 5985676, "meteorolog@mail.ru", bill1);

        Room[] room = new Room[]{new Room(2, 200, true), new Room(2, 580, true),
                new Room(3, 546, false)};
        Hotel MinskHotel = new Hotel("MinskHotel", room);

        Room[] room2 = new Room[]{new Room(3, 300, false), new Room(2, 200, true),
                new Room(1, 146, false)};
        Hotel BeingHotel = new Hotel("BeingHotel", room2);

        BookingService bookingService = new BookingService();
        bookingService.book(MinskHotel, client2, 2);
        System.out.println("***************");
        bookingService.book(MinskHotel, client2, 5);


    }
}
