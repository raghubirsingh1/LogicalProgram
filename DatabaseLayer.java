package com.nt.singleton;

//Double Checking singleton
public class DatabaseLayer {

	private static DatabaseLayer db = null;

	private DatabaseLayer() { // through refelection api we can create object

		if (db != null) {
			throw new RuntimeException("get your object by getInstance");
		}

	}

	public static DatabaseLayer getInstance() {
		if (db == null) {
			synchronized (DatabaseLayer.class) {
				if (db == null) {
					db = new DatabaseLayer();
				}

			}
		}
		return db;
	}

}
