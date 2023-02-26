
class PhoneInfo {

	String name;
	String phoneNumber;
	String birth;

	public PhoneInfo(String name, String num, String birth) {
		this.name = name;
		phoneNumber = num;
		this.birth = birth;

	}

	public PhoneInfo(String name, String num) {
		this.name = name;
		phoneNumber = num;
		this.birth = null;

	}

	public void showPhoneInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
		if (birth != null) {
			System.out.println("birth : " + birth);
		}

		System.out.println("");
	}

}

class PhoneBookVer01 {
	public static void main(String[] args) {
		PhoneInfo pInfo1 = new PhoneInfo("홍길동", "123-4567", "01.02.03");
		PhoneInfo pInfo2 = new PhoneInfo("홍길서", "890-1234");
		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();
	}

	}
