package org.khmerslide.services.implement;

import java.util.ArrayList;

import org.khmerslide.entities.View_History;
import org.khmerslide.repositories.ViewHistoryRepository;
import org.khmerslide.services.ViewHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewHistoryServiceImplement implements ViewHistoryService {
	@Autowired
	private ViewHistoryRepository  viewhistoryRepository;
	@Override
	public ArrayList<View_History> getViewHistory() {
		return viewhistoryRepository.getViewHistory();
	}

	@Override
	public boolean addViewHistory(View_History vh) {
		return viewhistoryRepository.addViewHistory(vh);
	}

	@Override
	public boolean updateViewHistory(View_History vh) {
		return viewhistoryRepository.updateViewHistory(vh);
	}

	@Override
	public boolean deleteViewHistory(int vh_id) {
		return viewhistoryRepository.deleteViewHistory(vh_id);
	}

}
