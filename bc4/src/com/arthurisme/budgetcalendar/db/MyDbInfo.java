package com.arthurisme.budgetcalendar.db;

public class MyDbInfo {
	
	private static String TableNames[] = {
		"TBL_EXPENDITURE_CATEGORY",
		"TBL_EXPENDITURE_SUB_CATEGORY",
		"TBL_INCOME_CATEGORY",
		"TBL_INCOME_SUB_CATEGORY",
		"TBL_ACCOUNT_TYPE",
		"TBL_ACCOUNT_SUB_TYPE",
		"TBL_ACCOUNT",
		"TBL_STORE",
		"TBL_ITEM",
		"TBL_EXPENDITURE",
		"TBL_INCOME",
		"TBL_TRANSFER"
	};//表名
	

	private static String FieldNames[][] = {
			{"ID","NAME","BUDGET"},
			{"ID","NAME","PARENT_CATEGORY_ID"},
			{"ID","NAME"},
			{"ID","NAME","PARENT_CATEGORY_ID"},
			{"ID","NAME","POSTIVE"},
			{"ID","NAME","PARENT_TYPE_ID"},
			{"ID","NAME","TYPE_ID","SUB_TYPE_ID","ACCOUNT_BALANCE"},
			{"ID","NAME"},
			{"ID","NAME"},
			{"ID", "AMOUNT", "EXPENDITURE_CATEGORY_ID", "EXPENDITURE_SUB_CATEGORY_ID", "ACCOUNT_ID", "STORE_ID", "ITEM_ID", "DATE", "MEMO"},
			{"ID", "AMOUNT", "INCOME_CATEGORY_ID", "INCOME_SUB_CATEGORY_ID", "ACCOUNT_ID", "ITEM_ID", "DATE", "MEMO"},
			{"ID", "AMOUNT", "ACCOUNT_ID", "ITEM_ID", "DATE", "MEMO"}
			
			
	};//字段名
	
	private static String FieldTypes[][] = {
			{"INTEGER PRIMARY KEY AUTOINCREMENT","text","DOUBLE"},
			{"INTEGER PRIMARY KEY AUTOINCREMENT","TEXT","INTEGER"},
			{"INTEGER PRIMARY KEY AUTOINCREMENT","TEXT"},
			{"INTEGER PRIMARY KEY AUTOINCREMENT","TEXT","INTEGER"},
			{"INTEGER PRIMARY KEY AUTOINCREMENT","TEXT","INTEGER","DOUBLE"},
			{"INTEGER PRIMARY KEY AUTOINCREMENT","TEXT","INTEGER"},
			{"INTEGER PRIMARY KEY AUTOINCREMENT","TEXT","INTEGER","INTEGER","DOUBLE"},
			{"INTEGER PRIMARY KEY AUTOINCREMENT","TEXT"},
			{"INTEGER PRIMARY KEY AUTOINCREMENT","TEXT"},
			{"INTEGER PRIMARY KEY AUTOINCREMENT","DOUBLE","INTEGER","INTEGER","INTEGER","INTEGER","INTEGER","TEXT","TEXT"},
			{"INTEGER PRIMARY KEY AUTOINCREMENT","DOUBLE","INTEGER","INTEGER","INTEGER","INTEGER","TEXT","TEXT"},
			{"INTEGER PRIMARY KEY AUTOINCREMENT","DOUBLE","INTEGER","INTEGER","TEXT","TEXT"}
	};//字段类型
	
	public MyDbInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public static String[] getTableNames() {
		return TableNames;
	}
	
	public static String[][] getFieldNames() {
		return FieldNames;
	}
	
	public static String[][] getFieldTypes() {
		return FieldTypes;
	}
	
}
