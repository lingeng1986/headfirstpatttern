package com.lincoln.skills.headfirstpatttern.templatemethod.sort;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ComparableDuck implements Comparable<ComparableDuck> {

	private int size;

	public ComparableDuck(int size) {
		this.size = size;
	}

	public int compareTo(ComparableDuck o) {
		return size - o.size;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
