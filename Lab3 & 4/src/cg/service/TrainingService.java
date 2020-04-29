package cg.service;

import java.util.List;

import cg.bean.Training;
import cg.dao.ITrainingDao;
import cg.dao.TrainingDao;

public class TrainingService implements ITrainingService {
	ITrainingDao dao;

	public TrainingService() {
		dao = new TrainingDao();
	}

	@Override
	public List<Training> fetchdetails() {
		// TODO Auto-generated method stub
		return dao.fetchdetails();
	}

	@Override
	public void enroll(String id) {
		dao.enroll(id);
	}
}
