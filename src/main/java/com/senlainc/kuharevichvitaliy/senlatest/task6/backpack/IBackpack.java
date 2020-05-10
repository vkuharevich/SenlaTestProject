package com.senlainc.kuharevichvitaliy.senlatest.task6.backpack;

import java.util.List;

public interface IBackpack<T>
{
	Integer getStuffListSize();

	List<T> getMainStuffList();

	void setMainStuffList(List<T> bufStuffList);

	Integer getMaxWeight();
}
