package com.senlainc.kuharevichvitaliy.senlatest.task6;

import java.util.Scanner;

import com.senlainc.kuharevichvitaliy.senlatest.task6.backpack.ISixthTask;
import com.senlainc.kuharevichvitaliy.senlatest.task6.backpack.implementation.WorkWithBag;

import static com.senlainc.kuharevichvitaliy.senlatest.menu.Menu.RESET_MENU_COLOR;
import static com.senlainc.kuharevichvitaliy.senlatest.menu.Menu.SET_MENU_COLOR;

public class SixthTask implements ISixthTask
{
	@Override
	public void runTask()
	{
		System.out.printf("%sTask 6%s\nPlease enter max backpack weight: ", SET_MENU_COLOR, RESET_MENU_COLOR);
		int mainWeight = new Scanner(System.in).nextInt();
		new WorkWithBag().getResult(mainWeight);
	}
}
