package System_reserv.Service;

import System_reserv.Entity.Bill;
import System_reserv.Entity.Client;
import System_reserv.Entity.Hotel;
import System_reserv.Entity.Room;

public class BookingService {
    public void book(Hotel hotel, Client client, int numberOfPerson) {
        Room[] rooms = hotel.getRooms();
        boolean isFree = false;
        for(Room room : rooms){
            if(room.isFree()) {
                isFree = true;
            }

        }
        if(!isFree){
            System.out.println("Свободных номеров в отеле" + hotel.getName() +" нет");
        }
        bookRoom(client, numberOfPerson, rooms);

    }

    private static void bookRoom(Client client, int numberOfPerson, Room[] rooms) {
        boolean success = false;
        String name = client.getName();
        for (Room r : rooms) {
            if (r.getNumberOfPerson() == numberOfPerson) {
                success = true;
                System.out.println("Нашелся номер для пользователя: " + name);
                if (client.getBill().getSumCosts() >= r.getCostOfNumber()) {

                    Bill clientBill = client.getBill();
                    clientBill.setSumCosts(clientBill.getSumCosts() - r.getCostOfNumber());
                    r.setFree(false);
                    System.out.println("Номер успешно забронирован клиентом:" + name + " " + client.getLastName());
                } else {
                    System.out.println("Не достаточно денег для бронирования номера");
                }
            } else {
                System.out.println("Не нашлось номера для клиента: " + name);

            }
        }
        if(!success) {
            System.out.println("Не нашлось номера для клиента: " + name);
        }
    }
}

