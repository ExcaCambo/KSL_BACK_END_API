package org.khmerslide.services.implement;

import java.util.ArrayList;

import org.khmerslide.entities.Save_List;
import org.khmerslide.repositories.SaveListRepository;
import org.khmerslide.services.SaveListService;
import org.khmerslide.utilities.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SaveListImplement implements  SaveListService {
	
	@Autowired
	private SaveListRepository  savelistRepository;
	@Override
	public ArrayList<Save_List> getSaveList(Pagination pagination) {
		return savelistRepository.getSaveList(pagination);
	}

	@Override
	public boolean addSaveList(Save_List sl) {
		return savelistRepository.addSaveList(sl);
	}

	@Override
	public boolean deleteSaveList(int sl_id) {
		return savelistRepository.deleteSaveList(sl_id);
	}

	@Override
	public boolean updateSaveList(Save_List sl) {
		return savelistRepository.updateSaveList(sl);
	}

	@Override
	public ArrayList<Save_List> getSaveListById(int sl_id) {
		return savelistRepository.getSaveListById(sl_id);
	}

}
