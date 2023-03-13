package trainReservation.entity;
// 비용 (class - 출발역, 도착역, 금액) - train에 종속되지 않음
// 비용 Entity class
public class Cost {
	private String departureStation;
	private String arrivalStation;
	private int amount;
	
	public Cost() {}
	
	public Cost(String departureStation, String arrivalStation, int amount) {
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
		this.amount = amount;
	}
	
	public String getDepartureStation() {
		return this.departureStation; // -> this 찍는 게 더 정확하고 좋음
	}
	
	public String getArrivalStation() {
		return this.arrivalStation;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public String toString() {
		return "Cost [departureStation: " + this.departureStation +
				", arrivalStation: " + this.arrivalStation + 
				" , amount: " + this.amount + "]";
	}
	
	
}
