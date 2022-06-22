package view;

import thread.Exit;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {

    static Scanner scanner = new Scanner(System.in);

    public Menu() {
        startMenu();
    }

    public static void startMenu() {
        try {
            boolean flag = true;
            do {
                mainMenu();
                String num = scanner.nextLine();
                switch (num) {
                    case "1":
                        StudentView.showAll();
                        break;
                    case "2":
                        StudentView.add();
                        break;
                    case "3":
                        StudentView.update();
                        break;
                    case "4":
                        StudentView.remove();
                        break;
                    case "5":
                        SearchMenu.searchMenu();
                        break;
                    case "6":
                        MenuSort.option();
                        break;

                    case "0":
                        exit();
                        break;
                    default:
                        System.out.println("Không hợp lệ. Vui lòng nhập lại");
                        flag = false;
                }
            } while (!flag);
        } catch (InputMismatchException io) {
            io.printStackTrace();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }



    public static void mainMenu() {

        System.out.print("╔══════════════════════════════════════════════════════════════════╗\n" +
                "║                                                                  ║\n" +
                "║                       QUẢN LÝ SINH VIÊN                          ║\n" +
                "║                                                                  ║\n" +
                "║               [1] Hiển thị danh sách sinh viên                   ║\n" +
                "║               [2] Thêm sinh viên mới                             ║\n" +
                "║               [3] Cập nhật danh sách sinh viên                   ║\n" +
                "║               [4] Xóa sinh viên khỏi danh sách                   ║\n" +
                "║               [5] Tìm kiếm nhân sinh viên                        ║\n" +
                "║               [6] Hiển thị sắp xếp sinh viên                     ║\n" +
                "║               [0] Thoát chương trình                             ║\n" +
                "║                                                                  ║\n" +
                "╚══════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("Chọn chức năng  \n➨ \t");
    }

    public static void exit() {
        Exit exit = new Exit();
        Thread thread1 = new Thread(exit);
        thread1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\t\t Bạn vừa thoát khỏi chương trình");
        System.exit(0);
    }

    public static void inputUpdate() {
        System.out.print("╔══════════════════════════════════════════════════════════════════╗\n" +
                "║                                                                  ║\n" +
                "║                                                                  ║\n" +
                "║                   [1] Cập nhật họ tên sinh viên                  ║\n" +
                "║                   [2] Cập nhật tuổi của sinh viên                ║\n" +
                "║                   [3] Cập nhật giới tính sinh viên               ║\n" +
                "║                   [4] Cập nhật địa chỉ                           ║\n" +
                "║                   [5] Cập nhật điểm trung bình                   ║\n" +
                "║                   [0] Quay lại                                   ║\n" +
                "║                                                                  ║\n" +
                "╚══════════════════════════════════════════════════════════════════╝\n");
        System.out.println("Chọn chức năng");
        System.out.printf("➨ \t");
    }

    public static void removeConfirm() {
        System.out.print("╔══════════════════════════════════════════════════════════════════╗\n" +
                "║                                                                  ║\n" +
                "║                    BẠN CHẮC CHẮN MUỐN XÓA                        ║\n" +
                "║                                                                  ║\n" +
                "║                   [1] Nhấn 'y' để xác nhận xóa                   ║\n" +
                "║                   [2] Nhấn 'c' để quay lại                       ║\n" +
                "║                                                                  ║\n" +
                "╚══════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("➨ \t");
    }
}
