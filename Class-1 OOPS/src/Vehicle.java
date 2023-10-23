public class Vehicle {

    public Vehicle() {
    }

    public Vehicle(String name) {
        System.out.println("Parent constructor" + name);
    }


/*
	final method -> Can't override

        public final String switch_engine() throws Exception {
            return "switch engine in vehicle";
        }
*/

    private String switch_engine() throws Exception {
        return "switch engine in vehicle";
    }





}
