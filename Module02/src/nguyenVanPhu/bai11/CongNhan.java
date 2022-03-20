package nguyenVanPhu.bai11;

public class CongNhan {
	private String mHo;
	private String mTen;
	private int mSoSP;

	public CongNhan() {
		super();
	}

	public CongNhan(String mHo, String mTen, int mSoSP) {
		super();
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		this.mHo = mHo;
	}

	public String getmTen() {
		return mTen;
	}

	public void setmTen(String mTen) {
		this.mTen = mTen;
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}

	public double tinhLuong() {
		double luong = 0;
		
			if(mSoSP>= 1 && mSoSP>= 199)
			{
				 luong = mSoSP * (double)0.5;
			}
			else if(mSoSP>=200 && mSoSP<=399)
			{
				   luong =mSoSP * (double)0.55;
			}
			else if(mSoSP>=400 && mSoSP<=599)
			{
				 luong = mSoSP * 0.6;
			}
			else if(mSoSP>600)
			{
				 luong =mSoSP * 0.65;
			}
		
	
			return luong ;
	}

	@Override
	public String toString() {
		return String.format("Họ: %s Tên: %s Mã số sản phẩm: %d\n", this.mHo, this.mTen, this.mSoSP);
	}

}
