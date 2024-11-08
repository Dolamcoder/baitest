package BT3;

import java.util.ArrayList;

public class BankManager {
    private ArrayList<Account> accounts;  
    public BankManager() {
        this.accounts = new ArrayList<>();
    }

    public void themTaiKhoan(Account account) {
        accounts.add(account);
        System.out.println("them thanh cong");
    }

    public Account timTaiKhoan(String id) {
        for (Account account : accounts) {
            if (account.getId()==id) {
                return account; 
            }
        }
        return null;  
    }
    public void suaTaiKhoan(String id, String nameNew, double newBalance) {
        Account account = timTaiKhoan(id);
        if (account != null) {
            account.setName(nameNew);
            account.setSoDu(newBalance);
            System.out.println("Đã sửa tài khoan "+account.getName());
            System.out.println("tai khoan sau khi sua:");
            System.out.println(account);
        }
    }

    // Xóa tài khoản
    public void xoaTaiKhoan(String id) {
        Account account = timTaiKhoan(id);
        if (account != null) {
            accounts.remove(account);
            System.out.println("Đã xóa tài khoản: " + account.getName());
        }
    }
    public void hienThiDanhSachTaiKhoan() {
        if (accounts.isEmpty()) {
            System.out.println("khong co tai khoan nao");
        } else {
            System.out.println("Danh sach:");
            for (Account account : accounts) {
                System.out.println(account);
            }
        }
    }
    // Hiển thị lịch sử giao dịch của một tài khoản
    public void hienThiLichSuGiaoDich(String accountId) {
        Account account = timTaiKhoan(accountId);
        if (account != null) {
            account.lichSu();
        }
    }
}
