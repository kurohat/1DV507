package aa224iu__assign1.Exercise_2;

public class Bus extends Vehicle {

	private final int MAX_PASSENGER = 20;
	
	public Bus (int ppl , int id) {
		if (ppl <= MAX_PASSENGER) {
			super.space = 20;
			super.size = ppl;
			super.id = id;
			super.totalPrice = 200 + (ppl*10);
		}
		else
			System.err.println("NOT ENOUGH SPACES FOR PASSENGER");
	}
	
	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return super.totalPrice;
	}

	@Override
	public int getMaxPassanger() {
		// TODO Auto-generated method stub
		return MAX_PASSENGER;
	}

	@Override
	public int getVehicleSpace() {
		// TODO Auto-generated method stub
		return super.space;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.id;
	}
	
	
}
