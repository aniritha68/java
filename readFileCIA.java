public class CIAfileReader {
	private String company;
	private String legalEntity;
	private String toDate;
	private long longtoDate;
	private int year;
	private String pod;

	public int getYear() {
		return year;
	}

	public long geLongToDate() {
		return longtoDate;
	}

	public String getCompany() {
		return company;
	}

	public String getLegalentity() {
		return legalEntity;
	}

	public String getTodate() {
		return toDate;
	}

	public String getPOD() {
		return pod;
	}

	public void setYear(int newyear) {
		year = newyear;
	}

	public void setLongToDate(long newlongToDate) {
		 longtoDate = newlongToDate;
	}

	public void setCompany(String newCompany) {
		company = newCompany;
	}

	public void setLegalentity(String newlegalEntity) {
		legalEntity = newlegalEntity;
	}

	public void setTodate(String newtoDate) {
		toDate = newtoDate;
	}

	public void SetPOD(String newpod) {
		// TODO Auto-generated method stub
		pod = newpod;
	}
}
