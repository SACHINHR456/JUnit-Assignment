package com.te.junit.pkg1;

import java.util.ArrayList;

public interface JUnitDemo {

	public void insert(int uid, String uname);

	public ArrayList<Object> select();

	public void update(int uid, String uname);

	public void delete(int uid);

}
