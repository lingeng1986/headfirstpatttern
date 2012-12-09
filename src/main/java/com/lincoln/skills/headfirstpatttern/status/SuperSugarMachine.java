package com.lincoln.skills.headfirstpatttern.status;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SuperSugarMachine {

	private State state;
	private int size;
	private State emptyState, hasQuarterState, noQuarterState, soldState,
			winnerState;

	public SuperSugarMachine(int size) {
		this.size = size;
		this.emptyState = new EmptyState();
		this.hasQuarterState = new HasQuarterState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);
		if (size > 0) {
			this.state = noQuarterState;
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
		this.state.insertQuarter();
	}

	public void ejectQuarter() {
		this.state.ejectQuarter();
	}

	public void turnCrank() {
		this.state.turnCrank();
		this.state.dispense();
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
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
