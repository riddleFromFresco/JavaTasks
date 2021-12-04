package tasks.task20;

import java.util.Calendar;
import java.util.Date;

public class Task {
	String lastname;
	Calendar taskReceiptDate;
	Date handOverTaskDate;

	public Task(String lastname, Calendar taskReceiptDate)
	{
		this.lastname = lastname;
		this.taskReceiptDate = taskReceiptDate;
	}

	public void handOver()
	{
		this.handOverTaskDate = new Date();
	}

	@Override
	public String toString() {
		return "Task{" +
				"lastname='" + lastname + '\'' +
				", taskReceiptDate=" + taskReceiptDate +
				", handOverTaskDate=" + handOverTaskDate +
				'}';
	}
}
