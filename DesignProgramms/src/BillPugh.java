
public class BillPugh {
	
	private BillPugh() {}
	
	private static class SingletonHelper{
		private static final BillPugh billInstance = new BillPugh(); 
	}
	private static BillPugh getInstance() {
		return SingletonHelper.billInstance;
	}

}
