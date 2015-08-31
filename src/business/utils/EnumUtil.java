package business.utils;

import java.util.IllegalFormatException;

import business.cleaning.interfaces.IGenEnum;

public class EnumUtil {

	public static <E extends IGenEnum<?>> Boolean isUndefined(String value, E enumObj) {
		try {
			return enumObj.valOf(value) != null;
		} catch (IllegalFormatException e) {
			return false;
		}

	}
	
	public static  <E extends IGenEnum<E>> E valueOf(String value, E enumObj) {
		try {
			return enumObj.valOf(value);
		} catch (IllegalFormatException e) {
			return enumObj.getUndefined();
		}

	}

}
