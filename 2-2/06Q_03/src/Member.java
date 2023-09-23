class Member {
	private int Id;
	private int hak;
	private String name;

	public Member(int Id, int hak, String name) {
		this.hak = hak;
		this.name = name;
		this.Id = Id;
	}

	public void Show() {
		System.out.print(Id + "\t" + hak + "\t" + name + "\t");
	}
}

class Mentor extends Member {
	private String org;

	public Mentor(int Id, int hak, String name, String org) {
		super(Id, hak, name);
		this.org = org;
	}

	public void Show() {
		super.Show();
		System.out.println(org);
	}
}

class Mentee extends Member {
	private String major;

	public Mentee(int Id, int hak, String name, String major) {
		super(Id, hak, name);
		this.major = major;
	}

	public void Show() {
		super.Show();
		System.out.println(major);
	}
}