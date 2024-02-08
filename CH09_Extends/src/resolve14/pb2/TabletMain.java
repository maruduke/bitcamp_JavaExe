package resolve14.pb2;

public class TabletMain {

	public static void main(String[] args) {
		ITablet tablet = new LGTablet("movie","music","book");
		ITablet tablet2 = new SamsungTablet("movie","music","book");

		TabletTester test = new TabletTester(tablet);
		test.test();
		test.setTablet(tablet2);
		test.test();
	}

}
