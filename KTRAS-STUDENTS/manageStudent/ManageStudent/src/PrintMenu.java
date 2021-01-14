public class PrintMenu {
    public void menu(){
        System.out.println("MENU");
        System.out.println("========================================");
        System.out.println("1. Xem danh sách học viên: ");
        System.out.println("2. Thêm học viên");
        System.out.println("3. Sửa thông tin học viên");
        System.out.println("4. Xoá học viên");
        System.out.println("5. Nhập điểm");
        System.out.println("6. Sửa điểm học viên");
        System.out.println("7. Xếp loại học viên");
        System.out.println("8. Thoát");
        System.out.println("==========================================");
    }

    public void printScore(){
        System.out.println("Nhập điểm học viên: ");
        System.out.println("=============================");
        System.out.println("1. Nhập từng điểm cho 1 học sinh");
        System.out.println("2. Nhập toàn bộ điểm cho 1 học sinh");
    }


    public void enterCoefficient(){
        System.out.println("1. Nhập hệ số 1");
        System.out.println("2. Nhập hệ số 2");
        System.out.println("3. Nhập hệ số 3");
        System.out.println("4. Nhập hệ số 4");
        System.out.println("=========================");
    }

    public void printListEditScore(){
        System.out.println("Danh sách sửa");
        System.out.println("1. Sửa tên");
        System.out.println("2. Sửa ngày tháng năm sinh");
        System.out.println("3 Sửa giới tính");
        System.out.println("===================");
    }

    public void printEditScore(){
        System.out.println("1. Nhập hệ số 1");
        System.out.println("2. Nhập hệ số 2");
        System.out.println("3. Nhập hệ số 3");
        System.out.println("4. Nhập hệ số 4");
        System.out.println("5. Quay lại hàm");
        System.out.println("6. Quay lại Menu");
        System.out.println("=======================");
    }
}
