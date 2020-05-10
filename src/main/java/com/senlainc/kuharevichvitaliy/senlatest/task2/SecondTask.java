package com.senlainc.kuharevichvitaliy.senlatest.task2;

import java.util.Scanner;

import com.senlainc.kuharevichvitaliy.senlatest.task2.lcmgcd.ISecondTask;
import com.senlainc.kuharevichvitaliy.senlatest.task2.lcmgcd.implementation.LcmGcdExecution;

import static com.senlainc.kuharevichvitaliy.senlatest.menu.Menu.RESET_MENU_COLOR;
import static com.senlainc.kuharevichvitaliy.senlatest.menu.Menu.SET_MENU_COLOR;

public class SecondTask implements ISecondTask
{
	@Override
	public void runTask()
	{
		System.out.printf("%sTask 2%s\nPlease enter 2 variables separating by space: ", SET_MENU_COLOR, RESET_MENU_COLOR);
		String[] mainVariables = new Scanner(System.in).nextLine().split(" ");
		System.out.println(new LcmGcdExecution().toString(mainVariables));
	}
}
