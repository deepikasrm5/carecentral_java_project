package in.deepikasriram.carecentral.interfaceFiles;

import java.time.LocalDate;

import in.deepikasriram.carecentral.model.Task;

public interface TaskInterface extends Base<Task> {
	public abstract void sortByDate(LocalDate date);
	public abstract int count();
}
