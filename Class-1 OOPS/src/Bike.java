public class Bike extends Vehicle {

    public Bike() {

    }

    @Override
    public String switch_engine() throws Exception{
        throw new Exception("Not possible");
    }

    public String turnOff() {
        return "turnedOff bike";
    }
}


// 			Vehicle
//  		 ^
//  	/        \
//  /  			  \
// 	Bike           Scooter


// 		\        /

//       two wheeler