package resolve14.pb2;

public class TabletTester {
	
	private ITablet tablet;
	
	TabletTester(ITablet tablet) {
		this.tablet = tablet;
	}
	
	public void setTablet(ITablet tablet) {
		this.tablet = tablet;
	}
	public void test() {
		tablet.movie();
		tablet.music();
		tablet.readBook();
	}
}
