package problem.code.no09;

public enum Chap1_no09_A {
	SUM("Sunday"), MON("Monday"), TUE("Tuesday");
	private String week;
	private Chap1_no09_A(String week) {
		System.out.println(week);
		this.week = week;
	}
	public String value() {
		return this.week;
	}
}
