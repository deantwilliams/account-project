package com.qa.account.utils;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONConvert {
	private Gson gson;
	private Gson gson_pretty;
	
	public JSONConvert() {
		gson = new Gson();
		gson_pretty = new GsonBuilder().setPrettyPrinting().create();
	}
	
	public String mapToJSON(Map map)
	{
		return gson.toJson(map);
	}
	
	public String mapToJSONPretty(Map map)
	{
		return gson_pretty.toJson(map);
	}

}
