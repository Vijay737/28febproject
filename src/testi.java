
public class testi implements moveable,Rollable {

	@Override
	public boolean isRollable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isMoveable() {
		// TODO Auto-generated method stub
		return false;
	}
	
public static void main(String[] args) {
	testi bbb=new testi();
	System.out.println(bbb.isMoveable());
	System.out.println(bbb.isRollable());
}
	
}
