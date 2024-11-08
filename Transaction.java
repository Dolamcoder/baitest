package BT3;
public class Transaction implements ITransaction {
private boolean lcd; // loai giao dich:L nap tien=true va rut tien=false;
private double amount;
private String date;
public Transaction(boolean lcd, double amount, String date) {
	this.lcd = lcd;
	this.amount = amount;
	this.date = date;
}
public Transaction(boolean lcd, double amount) {
	this.lcd = lcd;
	this.amount = amount;
}
public double tinhPhigiaodich(Account account) {
	if(lcd==true)
	{
		return this.amount*0;
	}
	else return this.amount*0.5/100;
 }
public void thucHiengiaodich(Account account) {
	if(this.lcd==true) {
		account.napTien(amount);
	}
	else {
		account.rutTien(amount);
	}
}
public String toString()
{
	return "Loai giao dich:"+this.lcd+",So tien:"+this.amount;
}
}