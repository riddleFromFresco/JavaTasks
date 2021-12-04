package tasks.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task27 {
	public void subTask1()
	{
		HashMap<String, String> people = new HashMap<>();
		people.put("Petrov", "Petr");
		people.put("Smirnov", "Alexey");
		people.put("Ivanov", "Alexander");
		people.put("Vasilyev", "Gennadiy");
		people.put("Sokolov", "Gleb");
		people.put("Mikhaylov", "Artyom");
		people.put("Lebedev", "Bogdan");
		people.put("Sokolov", "Gleb");
		people.put("Pavlov", "Andrey");
		people.put("Vasilyev", "Gennadiy");
		people.put("Makarov", "Vladimir");

		HashMap<String, String> temp = new HashMap<>();

		//reversing keys and values in hashmap to remove all duplicates
		for(Map.Entry<String, String> entry : people.entrySet())
			temp.put(entry.getValue(), entry.getKey());

		people.clear();

		for(Map.Entry<String, String> entry : temp.entrySet())
			people.put(entry.getValue(), entry.getKey());

		temp.clear();

		System.out.println(people);
	}

	public void subTask2()
	{
		ArrayList<City> cities = new ArrayList<>();
		cities.add(new City("Moscow", "Russia"));
		cities.add(new City("Saratov", "Russia"));
		cities.add(new City("New York", "USA"));
		cities.add(new City("Los Angeles", "USA"));
		cities.add(new City("Berlin", "Germany"));
		cities.add(new City("Warsaw", "Poland"));

		HashMap<String, ArrayList<String>> citiesCountry = new HashMap<>();
		ArrayList<String> temp = new ArrayList<>();

		for (City city : cities)
		{
			temp = citiesCountry.get(city.getCountry());
			if (temp == null)
				temp = new ArrayList<>();
			temp.add(city.city);
			citiesCountry.put(city.getCountry(), temp);
		}
		System.out.println(citiesCountry);
	}

	public static void main(String[] args) {
		Task27 task = new Task27();
		task.subTask1();
		task.subTask2();
	}
}
