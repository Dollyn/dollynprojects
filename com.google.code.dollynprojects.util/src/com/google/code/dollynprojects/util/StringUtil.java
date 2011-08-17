/*******************************************************************************
 * Copyright (c) 2008, 2009 Dollyn and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dollyn ---- dollyn.sun@gmail.com
 *******************************************************************************/
package com.google.code.dollynprojects.util;

/**
 * @author Dollyn
 *
 */
public class StringUtil {

	/**
	 * Returns true if the given string is an empty string.
	 * @param str the string
	 * @return <code>true</code> if the given string is empty or null
	 */
	public static boolean isEmpty(String str) {
		return str == null || str.trim().length() == 0;
	}
}
