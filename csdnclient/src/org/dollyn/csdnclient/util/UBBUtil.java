package org.dollyn.csdnclient.util;

public class UBBUtil {
	
	public static final String RED = "FF0000";
	
	public static String bold(String str) {
		return "[b]" + str + "[/b]";
	}
	
	public static String color(String str, String color) {
		return "[color=#" + color + "]" + str + "[/color]";
	}
	
	public static String image(String url) {
		return "[img=" + url + "]图[/img]";
	}
}
