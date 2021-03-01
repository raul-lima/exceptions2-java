package exceptions;

public class WithdrawLimitException extends Exception {

	public WithdrawLimitException(String msg) {
		super(msg);
	}
	private static final long serialVersionUID = 1L;

}
