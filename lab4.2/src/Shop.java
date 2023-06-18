public class Shop {
    private String name;
    private Department[] departments;

    public Shop(String name, int numDepartments) {
        this.name = name;
        this.departments = new Department[numDepartments];
    }

    public void addDepartment(int index, String departmentName, int numProducts) {
        departments[index] = new Department(departmentName, numProducts);
    }

    public void displayDepartments() {
        for (Department department : departments) {
            System.out.println("Department: " + department.getName());
            System.out.println("Products: " + department.getNumProducts());
            System.out.println("-------------------------");
        }
    }

    public class Department {
        private String name;
        private int numProducts;

        public Department(String name, int numProducts) {
            this.name = name;
            this.numProducts = numProducts;
        }

        public String getName() {
            return name;
        }

        public int getNumProducts() {
            return numProducts;
        }
    }
}
