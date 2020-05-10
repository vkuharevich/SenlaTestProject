package com.senlainc.kuharevichvitaliy.senlatest.task5;

import java.util.Scanner;

import com.senlainc.kuharevichvitaliy.senlatest.task5.sequence.IFifthTask;
import com.senlainc.kuharevichvitaliy.senlatest.task5.sequence.implementation.WorkWithSequence;

import static com.senlainc.kuharevichvitaliy.senlatest.menu.Menu.RESET_MENU_COLOR;
import static com.senlainc.kuharevichvitaliy.senlatest.menu.Menu.SET_MENU_COLOR;

public class FifthTask implements IFifthTask
{
	@Override
	public void runTask()
	{
		System.out.printf("%sTask 5%s\nPlease enter size of sequence: ", SET_MENU_COLOR, RESET_MENU_COLOR);
		int sizeSequence = new Scanner(System.in).nextInt();
		if (sizeSequence > 100 || sizeSequence <= 0)
		{
			System.out.printf("You entered: %s'%d'%s . You should entered variable less than 100 or more than 0\n",
				SET_MENU_COLOR, sizeSequence, RESET_MENU_COLOR);
			return;
		}
		for (int i = 0;i < sizeSequence;i++)
		{
			System.out.print(new WorkWithSequence().toString(sizeSequence, i));
		}
	}
}
