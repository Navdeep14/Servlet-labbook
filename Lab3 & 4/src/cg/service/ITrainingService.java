package cg.service;

import java.util.List;

import cg.bean.Training;

public interface ITrainingService {
 List<Training> fetchdetails();
 void enroll(String name);
}
