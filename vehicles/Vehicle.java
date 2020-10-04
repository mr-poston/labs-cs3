public interface Vehicle {
    /**
     * Should return the final price of this vehicle,
     * after applicable price mods.
     */
    public double getPrice();

    /**
     * Should return a String listing all the pertinent
     * info for this Vehicle.
     */
    public String getInfo();
}
