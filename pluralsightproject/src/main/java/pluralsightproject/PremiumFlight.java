package pluralsightproject;

public class PremiumFlight extends Flight {
			   
			   public PremiumFlight(String id) {
			      super(id);
			   }
			 
			   @Override
			   public boolean addPassenger(Passenger passenger) {
			      if (passenger.isvip()) {
			         return passengersList.add(passenger);
			      }
			      return false;
			   }
			 
			   @Override
			   public boolean removePassenger(Passenger passenger) {
			        if (passenger.isvip()) {
			            return passengersList.remove(passenger);
			        }
			       return false;
			   }
			 
			}


