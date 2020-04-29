package cg.bean;

public class Training {
private int trainingId,availableSeat;
private String TrainingName;
public int getTrainingId() {
	return trainingId;
}
public void setTrainingId(int trainingId) {
	this.trainingId = trainingId;
}
public int getAvailableSeat() {
	return availableSeat;
}
public void setAvailableSeat(int availableSeat) {
	this.availableSeat = availableSeat;
}
public String getTrainingName() {
	return TrainingName;
}
public void setTrainingName(String trainingName) {
	TrainingName = trainingName;
}
public Training(int trainingId, String trainingName,int availableSeat) {
	this.trainingId = trainingId;
	this.availableSeat = availableSeat;
	TrainingName = trainingName;
}

}
