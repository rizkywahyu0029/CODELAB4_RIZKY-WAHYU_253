package kendaraan.util;

// Mendefinisikan antarmuka Flyable
public interface Flyable {
    @Override
    public void fly() {
        System.out.println("Pesawat lepas landas.");
    }
}
