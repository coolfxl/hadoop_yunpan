package com.weirq.test;

import com.weirq.db.HbaseDB;

public class DbTest {

	public static void main(String[] args) throws Exception {
		HbaseDB db = HbaseDB.getInstance();
		
		String table_user = "user_id11";
		String[] fam_user = {"id11"};
		db.createTable(table_user, fam_user,1);
		
		System.out.println("ok");
	}

}
