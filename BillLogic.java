package app1code;

public class BillLogic {

	public long calculateUnitCnsume(long current, long previous) {
		long unitConsume = current - previous;
		return unitConsume;
	}

	public float domesticBillAmount(long units) {
		float totalAmount = 0;
		if (units <= 100) {
			totalAmount = units * 1;
		} else if (units > 100 && units <= 200) {
			totalAmount = (units - 100) * 5 / 2 + (100 * 1);
		} else if (units > 200 && units <= 500) {
			totalAmount = (units - 200) * 4 + (100 * 5 / 2) + (100 * 1);
		} else if (units > 500) {
			totalAmount = (units - 500) * 6 + (300 * 4) + (100 * 5 / 2) + (100 * 1);
		}
		return totalAmount;
	}

	public float commercialBillAmount(long units) {
		float totalAmount = 0;
		if (units <= 100) {
			// For first 100 units the charge is rupees 2 per unit.
			totalAmount = units * 2;
		} else if (units > 100 && units <= 200) {
			// For 101 to 200 units the charge is 9/2 i.e 4.5 rupees per unit.
			totalAmount = (units - 100) * 9 / 2 + (100 * 2);
		} else if (units > 200 && units <= 500) {
			// For 201 to 500 units the charge is 6 rupees per unit.
			totalAmount = (units - 200) * 6 + (100 * 9 / 2) + (100 * 2);
		} else if (units > 500) {
			// For above 500 units the charge is 7 rupees per unit.
			totalAmount = (units - 500) * 7 + (300 * 6) + (100 * 9 / 2) + (100 * 2);
		}
		return totalAmount;
	}

}