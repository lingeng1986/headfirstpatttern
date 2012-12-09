package com.lincoln.skills.headfirstpatttern.status;

public class SuperSugarMachine {

	private State state;
	private int size;
	private State emptyState, hasQuarterState, noQuarterState, soldState,
			winnerState;

	public SuperSugarMachine(int size) {
		this.size = size;
		emptyState = new EmptyState(this);
		hasQuarterState = new HasQuarterState(this);
		noQuarterState = new NoQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		if (size > 0) {
			state = noQuarterState;
		}
	}

	public synchronized void releaseBall() {
		System.out.println("release ball.");
		if (size > 0) {
			size--;
		}
	}

	public int getSize() {
		return size;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		if (state.turnCrank()) {
			state.dispense();
		}
	}

	/**
	 * @return the emptyState
	 */
	public State getEmptyState() {
		return emptyState;
	}

	/**
	 * @return the hasQuarterState
	 */
	public State getHasQuarterState() {
		return hasQuarterState;
	}

	/**
	 * @return the noQuarterState
	 */
	public State getNoQuarterState() {
		return noQuarterState;
	}

	/**
	 * @return the soldState
	 */
	public State getSoldState() {
		return soldState;
	}

	/**
	 * @return the winnerState
	 */
	public State getWinnerState() {
		return winnerState;
	}

	public String toString() {
		StringBuffer toString = new StringBuffer(128);

		toString.append("size=").append(size);
		toString.append(";");
		toString.append("state=").append(state);
		return toString.toString();
	}
}
