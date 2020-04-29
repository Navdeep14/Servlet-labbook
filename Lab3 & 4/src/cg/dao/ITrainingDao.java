package cg.dao;

import java.util.List;

import cg.bean.Training;

public interface ITrainingDao {
	List<Training> fetchdetails();

	void enroll(String id);
}
