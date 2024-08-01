class Car:
    def __init__(self, manufacturer, model, make, transmission, color): 
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")
 
    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")
        	
car1 = Car("Toyota", "Corolla", "2015", "Auto", "White")
car2 = Car("Maruti", "800", "2013", "Manual", "Black")
car3 = Car("Nexa", "Baleno", "2023", "Manual", "Blue")
 
car3.accelerate()
car3.stop()