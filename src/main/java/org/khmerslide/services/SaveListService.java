package org.khmerslide.services;

import java.util.ArrayList;

import org.khmerslide.entities.Save_List;
import org.khmerslide.entities.User;
import org.khmerslide.utilities.Pagination;

public interface SaveListService {
	public ArrayList<Save_List> getSaveList(Pagination pagination);
	public boolean addSaveList(Save_List  sl);
	public boolean deleteSaveList(int  sl_id);
	public boolean updateSaveList(Save_List sl);
	public ArrayList<Save_List> getSaveListById(int sl_id);
}
