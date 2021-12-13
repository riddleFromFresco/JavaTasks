package tasks.task21;

import java.util.ArrayList;
import java.util.Arrays;

public class SubwayLines extends Task21 {
	ArrayList<String> lines;

	public SubwayLines()
	{
		lines = new ArrayList<>(Arrays.asList("Sokolnicheckaya", "Zamoskworetskaya", "Arbatsko-Pokrovskaya",
				"Filyovksya", "Koltsevaya", "Kaluzhsko-Rizhskaya", "Tagansko-Krasnopresnenskaya",
				"Kalininskaya", "Serpukhovsko-Timiryazevskaya", "Lyublinskaya"));
	}

	public void printLines(boolean flag)
	{
		int i = flag? 1 : 0;

		for (;i < lines.size(); i += 2) {
			System.out.println(lines.get(i));
		}
	}
}
