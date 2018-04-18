import java.util.ArrayList;

/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 */

public class DatabaseRoom
{
    // instance variables - replace the example below with your own
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }
    public static boolean addRoom(Room baru)
    {
        if(baru.getHotel() != null) {
            for (Room kamar :
                    ROOM_DATABASE) {
                if(kamar.getHotel().equals(baru.getHotel())){
                    if(baru.getNomorKamar().compareTo(kamar.getNomorKamar()) == 0){
                        return false;
                    }
                }
            }
            ROOM_DATABASE.add(baru);
            return true;
        }
        else return false;
    }

    public static Room getRoom(Hotel hotel,String nomor_kamar)
    {
        for (Room kamar :
                ROOM_DATABASE) {
            if (kamar.getHotel().equals(hotel) && kamar.getNomorKamar().compareTo(nomor_kamar) == 0) {
                return kamar;
            }
        }
        return null;
    }

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel){
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getHotel().equals(hotel)){
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }

    public static ArrayList<Room> getVacantRooms() {
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar :
                ROOM_DATABASE) {
            if (kamar.getStatusKamar().equals(StatusKamar.VACANT)) {
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }

    public static boolean removeRoom(Hotel hotel, String nomor_kamar){
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getHotel().equals(hotel)){
                if(kamar.getNomorKamar().compareTo(nomor_kamar) == 0){
                    Administrasi.pesananDibatalkan(kamar);
                    ROOM_DATABASE.remove(kamar);
                    return true;
                }
            }
        }
        return false;
    }
}
