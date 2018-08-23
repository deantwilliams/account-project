package com.qa.account.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONConvert {
	private static Gson gson;
	private static Gson gson_pretty;
	
	public static String objectToJSON(Object object)
	{
		gson = new Gson();
		return gson.toJson(object);
	}
	
	public static String objectToJSONPretty(Object object)
	{
		gson_pretty = new GsonBuilder().setPrettyPrinting().create();
		return gson_pretty.toJson(object);
	}

}
