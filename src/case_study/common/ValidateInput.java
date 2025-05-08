package case_study.common;

import case_study.view.CustomerView;
import case_study.view.EmployeeView;
import case_study.view.FacilityView;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputName() {
        String regex = "^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$";
        Pattern pattern = Pattern.compile(regex);
        String name;
        do {
            System.out.print("Nhập tên (Nguyen Van A): ");
            name = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(name);

            if (matcher.matches()) {
                return name;
            } else {
                System.out.println("Không hợp lệ.");
            }
        } while (true);
    }

    public static String inputEmployeeId() {
        String id;
        String regex = "NV-[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        do {
            System.out.print("Nhập id nhân viên (NV-XXXX): ");
            id = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(id);

            if (matcher.matches()) {
                return id;
            } else {
                System.out.println("Không hợp lệ.");
            }
        } while (true);
    }


    public static String inputDate(String type) {
        String date;
        String regex = "\\d{2}-\\d{2}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        do {
            System.out.print("Nhập " + type + " (dd-MM-yyyy): ");
            date = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches() && isValidDate(date)) {
                return date;
            } else {
                System.out.println("Không hợp lệ");
            }
        } while (true);
    }

    public static String inputIdCard() {
        String idCard;
        String regex = "\\d{9}(\\d{3})?$";
        Pattern pattern = Pattern.compile(regex);

        do {
            System.out.print("Nhập CMND (XXXXXXXXX(XXX)): ");
            idCard = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(idCard);
            if (matcher.matches()) {
                return idCard;
            } else {
                System.out.println("Không hợp lệ");
            }
        } while (true);
    }


    public static long inputSalary() {
        long salary = 0;
        do {
            System.out.print("Nhập lương: ");
            salary = Long.parseLong(scanner.nextLine());
            if (salary <= 0) {
                System.out.println("Lương phải lớn hơn 0");
            } else {
                return salary;
            }
        } while (true);
    }

    public static boolean inputGender() {
        int gender;
        do {
            System.out.print("Nhập giới tính (nam: 1 || nữ: 0): ");
            gender = Integer.parseInt(scanner.nextLine());
            if (gender != 0 && gender != 1) {
                System.out.println("Vui lòng nhập theo yêu cầu");
            } else {
                return (gender == 1) ? true : false;
            }
        } while (true);
    }

    public static String inputPhone() {
        String phone;
        String regex = "0\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        do {
            System.out.print("Nhập số điện thoại (0XXXXXXXXX): ");
            phone = scanner.nextLine();
            Matcher matcher = pattern.matcher(phone);
            if (matcher.matches()) {
                return phone;
            } else {
                System.out.println("Cần nhập đúng định dạng số điện thoại");
            }
        } while (true);
    }

    public static String inputEmail() {
        String email;
        String regex = "[\\w.+-]+@[\\w.+-]+\\.[\\w.+-]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        do {
            System.out.print("Nhập email (example@gmail.com): ");
            email = scanner.nextLine();
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                return email;
            } else {
                System.out.println("Sai định dạng");
            }
        } while (true);
    }

    private static boolean isValidDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }


    public static String inputCustomerId() {
        String id;
        String regex = "KH-[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        do {
            System.out.print("Nhập id khách hàng (KH-XXXX): ");
            id = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(id);

            if (matcher.matches()) {
                return id;
            } else {
                System.out.println("Không hợp lệ.");
            }
        } while (true);
    }

    public static String inputHouseId() {
        String id;
        String regex = "^SVHO-[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        do {
            System.out.print("Nhập mã House(SVHO-XXXX): ");
            id = scanner.nextLine();
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                return id;
            } else {
                System.out.println("Không hợp lệ");
            }
        } while (true);
    }

    public static String inputRoomId() {
        String id;
        String regex = "^SVRO-[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        do {
            System.out.print("Nhập mã Room(SVRO-XXXX): ");
            id = scanner.nextLine();
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                return id;
            } else {
                System.out.println("Không hợp lệ");
            }
        } while (true);
    }

    public static String inputServiceName() {
        String name;
        String regex = "^([A-Z][a-z]*)+(\\s[A-Za-z]+)*$";
        Pattern pattern = Pattern.compile(regex);
        do {
            System.out.print("Nhập tên dịch vụ: ");
            name = scanner.nextLine();
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                return name;
            } else {
                System.out.println("Không hợp lệ");
            }
        } while (true);
    }

    public static Double inputArea() {
        double area = 0;
        while (area < 30) {
            try {
                System.out.print("Nhập diện tích: ");
                area = Double.parseDouble(scanner.nextLine());
                if (area < 30) {
                    System.out.println("Diện tích phải lớn hơn 30");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng số");
            }
        }
        return area;

    }

    public static long inputPrice() {
        long price = 0;
        while (price < 1) {
            try {
                System.out.print("Nhập giá thuê: ");
                price = Long.parseLong(scanner.nextLine());
                if (price < 1) {
                    System.out.println("Giá thuê phải lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng số.");
            }
        }
        return price;
    }

    public static int inputMaxPeople() {
        int max = 0;
        while (max < 1 || max > 20) {
            try {
                System.out.print("Nhập số người tối đa: ");
                max = Integer.parseInt(scanner.nextLine());
                if (max < 1 || max > 20) {
                    System.out.println("Số người tối thiểu là 1 và tối đa là 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng số");
            }
        }
        return max;
    }

    public static int inputNumberOfFloors() {
        int numberOfFloors = 0;
        while (numberOfFloors < 1) {
            try {
                System.out.print("Nhập số tầng: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors < 1) {
                    System.out.println("Số tầng phải là số dương");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
        }
        return numberOfFloors;
    }

    public static String inputVillaId() {
        String id;
        String regex = "^SVVL-[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        do {
            System.out.print("Nhập mã Villa(SVVL-XXXX): ");
            id = scanner.nextLine();
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                return id;
            } else {
                System.out.println("Không hợp lệ");
            }
        } while (true);
    }

    public static double inputPoolArea() {
        double area = 0;
        while (area < 30) {
            try {
                System.out.print("Nhập diện tích hồ bơi: ");
                area = Double.parseDouble(scanner.nextLine());
                if (area < 30) {
                    System.out.println("Diện tích phải lớn hơn 30");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng số");
            }
        }
        return area;
    }

    public static String inputBookingId() {
        String id;
        String regex = "^BK-[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        do {
            System.out.print("Nhập mã Booking(BK-XXXX): ");
            id = scanner.nextLine();
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                return id;
            } else {
                System.out.println("Không hợp lệ");
            }
        } while (true);
    }

    public static String inputEmployeeDate() {
        String date;
        String regex = "\\d{2}-\\d{2}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        do {
            System.out.print("Nhập ngày sinh nhân viên (dd-MM-yyyy): ");
            date = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches() && isValidDate(date)) {
                if (checkAge(date)) {
                    return date;
                } else {
                    System.out.println("Nhân viên phải đủ 18 tuổi");
                }
            } else {
                System.out.println("Không hợp lệ");
            }
        } while (true);
    }

    private static boolean checkAge(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate birthday = LocalDate.parse(dateStr, formatter);
            LocalDate today = LocalDate.now();
            Period age = Period.between(birthday, today);
            return age.getYears() >= 18;
        } catch (DateTimeException e) {
            return false;
        }
    }

    public static String inputPosition() {
        int chon;
        do {
            chon = EmployeeView.selectPosition();
            if (chon < 1 || chon > 6) {
                System.out.println("Không hợp lệ. Chọn lại");
            }
        } while (chon < 1 || chon > 6);

        String[] positions = {"Lễ Tân", "Phục vụ", "Chuyên viên", "Giám sát", "Quản lý", "Giám đốc"};
        return positions[chon - 1];
    }

    public static String inputQualification() {
        int chon;
        do {
            chon = EmployeeView.selectQualification();
            if (chon < 1 || chon > 4) {
                System.out.println("Không hợp lệ. Chọn lại");
            }
        } while (chon < 1 || chon > 4);
        String[] qualifications = {"Trung cấp", "Cao đẳng", "Đại học", "Sau đại học"};
        return qualifications[chon - 1];
    }

    public static String inputRank() {
        int chon;
        do {
            chon = CustomerView.selectRank();
            if (chon < 1 || chon > 5) {
                System.out.println("Không hợp lệ. Chọn lại");
            }
        } while (chon < 1 || chon > 5);
        String[] ranks = {"Thành viên", "Bạc", "Vàng", "Bạch kim", "Kim cương"};
        return ranks[chon - 1];
    }

    public static String inputRentType() {
        int chon;
        do {
            chon = FacilityView.selectRentType();
            if (chon < 1 || chon > 4) {
                System.out.println("Không hợp lệ. Chọn lại");
            }
        } while (chon < 1 || chon > 4);
        String[] rentTypes = {"Giờ", "Ngày", "Tháng", "Năm"};
        return rentTypes[chon - 1];
    }
}
