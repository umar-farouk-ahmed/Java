class Airplane{
    public String model;
    public int year;
    public int seatingCapacity;
    public double unitCost;
    public int[] availableSeats;

    public Airplane(String model,int year,int seatingCapacity,double unitCost,int[] availableSeats){
        this.year = year;
        this.model = model;
        this.seatingCapacity = seatingCapacity;
        this.unitCost = unitCost;
        this.availableSeats = new int[seatingCapacity];
    }

    public  Airplane(String model,int year,int seatingCapacity){
          this.model = model;
          this.year = year;
          this.seatingCapacity = seatingCapacity;
    }

    void Booking(int n,int luggage){
        if(n > seatingCapacity){
            System.out.println("Seats are not available");
        }
        else{
            boolean  seat = true;
            int[] count = new int[30];
            for(int i=1; i<=seatingCapacity-n; i++){
                seat = true;
                if(availableSeats[i] == 1){
                    seat = false;
                    break;
                }
                else{
                    for(int j=i; j<(i+n); j++){
                        if(availableSeats[j] == 1){
                            seat = false;
                            break;
                        }
                        else{
                            
                        }
                    }
                }
            }
            if(seat == true){
                if(luggage <= 3){
                    double total_cost = n * unitCost;
                }
                else{
                    double total_cost = (n * unitCost)+((luggage-3)*600);
                }
            }
            else{
                System.out.println("Seats are not available");
            }
        }
    }
}
public class MyBooking {
    public static void main(String[] args) {
        Airplane qatar = new Airplane("boeing747",2012,30);
        qatar.unitCost = 12000;
        qatar.Booking(5,5);
    }
}
