package com.senlainc.kuharevichvitaliy.senlatest.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.senlainc.kuharevichvitaliy.senlatest.menu.enumeration.MenuOption;
import com.senlainc.kuharevichvitaliy.senlatest.task1.FirstTask;
import com.senlainc.kuharevichvitaliy.senlatest.task2.SecondTask;
import com.senlainc.kuharevichvitaliy.senlatest.task3.ThirdTask;
import com.senlainc.kuharevichvitaliy.senlatest.task4.FourthTask;
import com.senlainc.kuharevichvitaliy.senlatest.task5.FifthTask;
import com.senlainc.kuharevichvitaliy.senlatest.task6.SixthTask;

/**
 * Class that represents console menu
 */
public class Menu
{

	public static final String SET_MENU_COLOR = "\u001b[33m";
	public static final String RESET_MENU_COLOR = "\u001b[0m";

	/** App menu */
	public static void startMainMenu()
	{
		MenuOption[] menuOptions = MenuOption.values(); /* Enum values to use in switch */
		while (true)
		{
			System.out.print("Please chose operation:\n");
			printOperations(menuOptions);
			System.out.print("Enter data: ");
			operationSelection(menuOptions);
		}
	}

	private static void printOperations(MenuOption[] menuOptions)
	{
		for (MenuOption bufMenu : menuOptions)
		{
			System.out.printf("%s%d%s)%s\n", Menu.SET_MENU_COLOR, ( bufMenu.ordinal() + 1 ),
				Menu.RESET_MENU_COLOR, bufMenu.getMenuName());
		}
	}

	private static void operationSelection(MenuOption[] menuOptions)
	{
		try
		{
			int chosenOperation = new Scanner(System.in).nextInt();
			switch (menuOptions[chosenOperation - 1])
			{
				case TASK_1:
					new FirstTask().runTask();
					break;
				case TASK_2:
					new SecondTask().runTask();
					break;
				case TASK_3:
					new ThirdTask().runTask();
					break;
				case TASK_4:
					new FourthTask().runTask();
					break;
				case TASK_5:
					new FifthTask().runTask();
					break;
				case TASK_6:
					new SixthTask().runTask();
					break;
			}
		}
		catch (InputMismatchException | NumberFormatException e)
		{
			System.err.print("You entered wrong data\n");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.printf("The selected operation does not exist. Choose operation 1 - %d\n", menuOptions.length);
		}
	}

}
