package ru.job4j.calculate;

/**
* Class used for develop "Hello world" program.
*
*/
public class Calculate {

	/**
	* main method of program "Hello world"
	*
	* @param args command line arguments
	*/
	public static void main(String... args) {
		System.out.println("Hello World");
	}

	/**
	* Method echo.
	* @param name Your name.
	* @return Echo plus your name.
	*/
	public String echo(String name) {
		return "Echo, echo, echo : " + name;
	}

}