package baitu;

import java.sql.Date;

public class SinhVien {
	
		private String Masv;
		private String Tensv;
		private Date Namsinh;
		private String Diachi;
		private String Lop;
		public String getMasv() {
		return Masv;
		}
		public void setMasv(String masv) {
		Masv = masv;
		}
		public String getTensv() {
		return Tensv;
		}
		public void setTensv(String tensv) {
		Tensv = tensv;
		}
		public Date getNamsinh() {
		return Namsinh;
	
		}
		public void setNamsinh(Date namsinh) {
		Namsinh = namsinh;
		}
		public String getDiachi() {
		return Diachi;
		}
		public void setDiachi(String diachi) {
		Diachi = diachi;
		}
		public String getLop() {
		return Lop;
		}
		public void setLop(String lop) {
		Lop = lop;
		}
		public String toString() {
		return "Sinhvien [Masv=" + Masv + ", Tensv=" + Tensv + ", Namsinh="
		+ Namsinh + ", Diachi=" + Diachi + ", Lop=" + Lop + "]";
		}
	}


