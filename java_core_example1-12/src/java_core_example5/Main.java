package java_core_example5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * The Class Main.
 */
public class Main {
    
    /** The sc. */
    static Scanner sc = new Scanner(System.in);

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();

        do {
            System.out.println("Chương trình quản lý Khách sạn");
            System.out.println("Các chức năng của chương trình");
            System.out.println("1. Thêm thông tin người đặt phòng");
            System.out.println("2. Hiển thị thông tin khách hàng");
            System.out.println("3. Thoát chương trình");
            System.out.println("-----------------------------------------");
            System.out.print("Vui lòng chọn chức năng: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    ArrayList<Room> newRooms = insert_Rooms();
                    rooms.addAll(newRooms);
                    break;
                case 2:
                    displayAllRooms(rooms);
                    break;
                case 3:
                    System.out.print("Nhập số CMND để xóa thông tin: ");
                    String cmndToDelete = sc.next();
                    removeRoomByCMND(rooms, cmndToDelete);
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        } while (true);
    }

    /**
     * Insert rooms.
     *
     * @return the array list
     */
    public static ArrayList<Room> insert_Rooms() {
        ArrayList<Room> newRooms = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
            Room room = new Room();

            RoomDetails roomDetails = new RoomDetails();
            RoomType roomType = null;
            boolean isValidRoomType = false;

            while (!isValidRoomType) {
                System.out.println("Chọn loại phòng A, B, C: ");
                String roomTypeStr = sc.next();

                try {
                    roomType = RoomType.valueOf(roomTypeStr);
                    isValidRoomType = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Loại phòng không hợp lệ. Vui lòng chọn lại.");
                }
            }

            roomDetails.setRoomType(roomType);

            System.out.println("Nhập số ngày thuê: ");
            room.setNumberOfDays(sc.nextInt());
            sc.nextLine(); // Đọc dòng mới sau khi nhập số

            Person person = new Person();
            System.out.println("Nhập họ và tên: ");
            person.setName(sc.nextLine());
            System.out.println("Nhập tuổi: ");
            person.setAge(sc.nextInt());
            sc.nextLine(); // Đọc dòng mới sau khi nhập số
            System.out.println("Nhập CMND: ");
            person.setCmnd(sc.nextLine());
            System.out.println("Nhập địa chỉ: ");
            person.setAddres(sc.nextLine());
            System.out.print("Nhập số điện thoại: ");
            person.setPhone(sc.nextLine());

            room.setPerson(person);
            newRooms.add(room);
        }

        return newRooms;
    }

    /**
     * Display all rooms.
     *
     * @param rooms the rooms
     */
    public static void displayAllRooms(ArrayList<Room> rooms) {
        if (rooms.isEmpty()) {
            System.out.println("Danh sách phòng trống.");
        } else {
            for (Room room : rooms) {
                System.out.println("Thông tin phòng:");
                System.out.println("Loại phòng: " + room.getRomDetails().getRoomType());
                System.out.println("Số ngày thuê: " + room.getNumberOfDays());
                System.out.println("Thông tin người thuê:");
                System.out.println("Họ và tên: " + room.getPerson().getName());
                System.out.println("Tuổi: " + room.getPerson().getAge());
                System.out.println("CMND: " + room.getPerson().getCmnd());
                System.out.println("Địa chỉ: " + room.getPerson().getAddres());
                System.out.println("Số điện thoại: " + room.getPerson().getPhone());
                System.out.println("---------------------------------");
            }
        }
    }
    
    /**
     * Removes the room by CMND.
     *
     * @param rooms the rooms
     * @param cmndToDelete the cmnd to delete
     */
    public static void removeRoomByCMND(ArrayList<Room> rooms, String cmndToDelete) {
        Iterator<Room> iterator = rooms.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            if (room.getPerson().getCmnd().equals(cmndToDelete)) {
                iterator.remove();
                System.out.println("Đã xóa thông tin phòng của người có số CMND: " + cmndToDelete);
            }
        }
    }
}