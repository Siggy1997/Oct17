package com.drhome.docadmin;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocAdminService {

	@Autowired
	private DocAdminDAO docAdminDAO;

	public List<Map<String, Object>> telehealthHistory(int dno) {
		return docAdminDAO.telehealthHistory(dno);
	}

	public List<Map<String, Object>> searchMname(Map<String, Object> map) {
		return docAdminDAO.searchMname(map);
	}

	public int getHno(Map<String, Object> map) {
		return docAdminDAO.getHno(map);
	}

	public List<Map<String, Object>> dpKind(Map<String, Object> map) {
		return docAdminDAO.dpKind(map);
	}

	public Map<String, Object> docMainDetail(int dno) {
		return docAdminDAO.docMainDetail(dno);
	}

	public int deleteRows(List<Integer> tnoArr) {
		return docAdminDAO.deleteRows(tnoArr);

	}
	
}
