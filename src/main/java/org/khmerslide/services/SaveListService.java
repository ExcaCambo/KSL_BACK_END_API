package org.khmerslide.services;

import java.util.ArrayList;

import org.khmerslide.entities.Save_List;

public interface SaveListService {
	public ArrayList<Save_List> getSaveList();
	public boolean addSaveList(Save_List  sl);
	public boolean deleteSaveList(int  sl_id);
	public boolean updateSaveList(Save_List sl);
}
