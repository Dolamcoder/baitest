package BT3;

public class Test {
	public static void main(String[] args) {
		// true la nap tien
		// false la rut tien
		Account account = new Account("12345", "John Doe", 1000.0);
		System.out.println(account);
		ITransaction transaction1 = new Transaction(true, 1000.0);
		System.out.println("phi giao dich 1:"+transaction1.tinhPhigiaodich(account));
		ITransaction transaction2 = new Transaction(false, 500.0);
		System.out.println("phi giao dich 2:"+transaction1.tinhPhigiaodich(account));
		ITransaction transaction3 = new Transaction(false, 1000.0);
		System.out.println("phi giao dich 3:"+transaction1.tinhPhigiaodich(account));
		transaction1.thucHiengiaodich(account);
		transaction2.thucHiengiaodich(account);
		transaction3.thucHiengiaodich(account);
		account.lichSu();
		        BankManager bankManager = new BankManager();
		        Account account1 = new Account("10001", "Alice", 5000.0);
		        Account account2 = new Account("10002", "Bob", 3000.0);
		        Account account3 = new Account("10003", "Charlie", 7000.0);
		        bankManager.themTaiKhoan(account1);
		        bankManager.themTaiKhoan(account2);
		        bankManager.themTaiKhoan(account3);
		        System.out.println("Danh sách tài khoản sau khi thêm:");
		        bankManager.hienThiDanhSachTaiKhoan();
		        System.out.println("\nSửa tài khoản 10001:");
		        bankManager.suaTaiKhoan("10001", "Alice Cooper", 5500.0);
		        System.out.println("\nDanh sách tài khoản sau khi sửa:");
		        bankManager.hienThiDanhSachTaiKhoan();
		        System.out.println("\nLịch sử giao dịch tài khoản 10001:");
		        bankManager.hienThiLichSuGiaoDich("10001");
		        System.out.println("\nXóa tài khoản 10002:");
		        bankManager.xoaTaiKhoan("10002");
		        System.out.println("\nDanh sách tài khoản sau khi xóa:");
		        bankManager.hienThiDanhSachTaiKhoan();
		        System.out.println("\nTìm tài khoản không tồn tại:");
		        Account nonExistentAccount = bankManager.timTaiKhoan("99999");
		        if (nonExistentAccount == null) {
		            System.out.println("Không tìm thấy tài khoản với ID: 99999");
		        } else {
		            System.out.println("Tìm thấy tài khoản: " + nonExistentAccount);
		        }

        
	}

}

