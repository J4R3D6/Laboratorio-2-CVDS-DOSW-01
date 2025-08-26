class VehicleFactory {
    public static Vehicle createVehicle(int type, int model) {
        switch(type) {
            case 1:
                if (model == 1) return new Car();
                if (model == 2) return new Bicycle();
                if (model == 3) return new Motocycle();
                break;
            case 2:
                if (model == 1) return new Boat();
                if (model == 2) return new Sailboat();
                if (model == 3) return new JetSki();
                break;
            case 3:
                if (model == 1) return new Plane();
                if (model == 2) return new SmallPlane();
                if (model == 3) return new Helicopter();
                break;
        }
        return null;
    }
}