package org.khmerslide.services;

import java.util.ArrayList;

import org.khmerslide.entities.View_History;

public interface ViewHistoryService {
	public ArrayList<View_History> getViewHistory();
	public boolean addViewHistory(View_History vh);
	public boolean updateViewHistory(View_History vh);
	public boolean deleteViewHistory(int vh_id);
}
