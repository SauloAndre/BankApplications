package models;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ModelsUlti {
	
	static NumberFormat formatingValues = new DecimalFormat("$ #,##0.00");

	public static String doubleToString(Double value) {
		return formatingValues.format(value);
	}
}
