package com.tegareng.perpustakaan.util;

import java.util.UUID;

public class Util {
	
	public static String generateID(){
		return UUID.randomUUID().toString().replaceAll("-", "").trim();
	}
	
}
