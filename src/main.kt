fun main(){
   var car= Car("Benz","Vox wagon","Red",40)
    car.carry(30)
    car.identity()
    println(car.calculateParkingFees(20))

    var vehicle = Bus("volvo","q3","grey",70)
        println(vehicle.maxTripFare(20.0))

      println(vehicle.parkingFees(300,3))


}
open class Car(var make:String,var model:String,var colour:String,var capacity:Int){
    fun carry(people:Int){
        var x = people-capacity
        if (people <=capacity){
            println("carrying $people passengers")
        }else
            println("Over capacity by $x people")
    }
    fun identity(){
        println("I am a $colour,$make,$model")
    }
    fun calculateParkingFees(hours:Int):Int {
        var T = hours * 20
        return T

    }

}
class Bus(make: String,model: String, colour: String, capacity: Int):Car(make,model,colour,capacity){
    fun maxTripFare(fare:Double):Double{
        var fare=70.5
        return fare
    }
    fun parkingFees(fee:Int,hours:Int) :Int{
        var fees= hours * fee
        return fees

    }


}
