package ge.ufc.main;

public class Main {
	
	public static void main(String[] args) {
		
		Rectangle test,test2;
		/*test.getLength(); ქომფაილთაიმ ერორი ლოკალური ცვლადი არ არის ინიციალიზებული
		test=null;
		System.out.println(test.getLength()); დაგვირტყა java.lang.NullPointerException*/
		test=new Rectangle();
		test2=new Rectangle();
		/*System.out.println(test.getLength());
		System.out.println(test2.getLength());
		გვიბეჭდავს ნულებს რადგან დეფოლთად მიენიჭათ ეს ოდენობა.*/
		System.out.println(test==test2);//false
		test=test2;
		System.out.println(test==test2);//true
		/*რადგან მე17 ხაზზე test და test2 გავუტოლეთ ორივე რეფერენსი ჰიპში მიუთითებს ერთ ობიექტს.
		თუ ნებისმიერ რეფერენსზე გამოვიძახებთ სეტტერს ორივესთვის შეიცვლება მნიშვნელობა რადგან რეალურად
		ერთ ობიექტი გვაქ*/
		test.setLength(10);
		System.out.println(test2.getLength());
		
		int a;
		//a++; ეს ოპერაცია აგდებს ქომფაილთაიმ ერორს რადგან ეს ცვლადი ინიციალიზებული არაა
		//შევქმნათ ერთი დასახელების ცვლადები ისეთ ადგილებში რომ შეცდომა არ დაფიქსირდეს
		if(true) {int b=1;System.out.println(b);}//იბეჭდება 1
		int b =2;
		System.out.println(b);//იბეჭდება 2
		
	
		//ფართობების შედარება:
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.setLength(10);
		r1.setWidth(5);
		r2.setLength(10);
		r2.setWidth(4);
		System.out.println(sheadareFartobi(r1,r2));
		
	}
	
	public static int sheadareFartobi(Rectangle erti, Rectangle meore) {
		 return erti.fartobi() > meore.fartobi() ? 1 : erti.fartobi() < meore.fartobi() ? -1 : 0;
	}
	
}

