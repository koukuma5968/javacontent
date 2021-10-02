package problem.code.no17;

public enum Cap3_no17_ENUM {
	ONE(true),
	TWO(false),
	THREE(true),
	FOUR(false);
	private Cap3_no17_ENUM(boolean b) {
		this.b = b;
	}
	private boolean b;
	public boolean isB() {
		return b;
	}
}
