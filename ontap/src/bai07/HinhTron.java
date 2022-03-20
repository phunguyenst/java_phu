package bai07;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;
	
	public double tinhChuVi() {
		return 2 *Math.PI * banKinh; 
	}
	public double tinhDienTich() {
		return banKinh * banKinh * Math.PI;
	}
	@Override
	public String toString() {
	
		return String.format("Diện tích và chu vi hình tròn tâm %s có bán kính %.2f là %.2f và %.2f", this.getTam(), this.banKinh, this.tinhDienTich(), this.tinhChuVi());
	}
	public HinhTron(ToaDo tam, double banKinh) {
		setTam(tam);
		setBanKinh(banKinh);
	}
	public HinhTron() {
		this.tam = null;
		this.banKinh = 0;
	}
	public ToaDo getTam() {
		return tam;
	}
	public void setTam(ToaDo tam) {
		this.tam = tam;
	}
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
}
