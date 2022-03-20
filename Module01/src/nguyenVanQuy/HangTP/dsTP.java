package nguyenVanQuy.HangTP;



public class dsTP {

		//khai bao manh
		TPham dsTP[];
		public int soluongTPHienTai = 0;
		
		public dsTP(int soLuongTP) {
			dsTP = new TPham[soLuongTP];
		}
		
		private void tangKichThuocMang()
		{
			TPham tempTP[] = new TPham[dsTP.length*2];
			for(int i=0; i<dsTP.length; i++)
			{
				tempTP[i] = dsTP[i];
			}
			dsTP = tempTP;
		}
		
		 public int timKiem(String maHang)
		{
			int viTri = -1;
			for(int i=0; i<soluongTPHienTai; i++)
			{
				//if(dsAcc[i].getSoTaiKhoan().equals(soTaiKhoan))
				if(dsTP[i].getMaHang() == maHang)
				{
					viTri=i;
					break;
				}
			}
			return viTri;
		}
		 
		  public boolean themTP(TPham tp)
			{
				if(soluongTPHienTai == dsTP.length)
					tangKichThuocMang();
				if(timKiem(tp.getMaHang()) != -1)  //tìm thấy
					return false;
				else
				{
					dsTP[soluongTPHienTai] = tp;
					soluongTPHienTai++;
					return true;
				}
			}
		  
		  public boolean xoaTP(String maHang)
			{
				boolean hoanTat = true;
				int viTri = timKiem(maHang);
				if(viTri != 1)
				{
					for(int i=viTri; i<dsTP.length-1; i++)
					{
						dsTP[i] = dsTP[i+1];
					}
					soluongTPHienTai--;
				}
				else {
					return false;
				}
				return hoanTat;
			}
		 
			public void Sua(TPham sua)
			{
				int vt = timKiem(sua.getMaHang());
				dsTP[vt] = sua;
			}
			
		  public TPham[] xuatDS() {
				return dsTP;
			}
		  public TPham xuatThongTinTP(int viTri)
			{
				return dsTP[viTri];
			}
	}


