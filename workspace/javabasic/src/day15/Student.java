package day15;

public class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.getName());
		//return Integer.compare(score, o.score);
		// score < o.score : 음수
		// score == o.score : 0
		// score > o.score : 양수 리턴
	}
}
