package employee_management_system;

class Employee {
    private int id;
    private String name;
    private int age;
    private String designation;

    public Employee(int id, String name, int age, String designation) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setDesignation(designation);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}