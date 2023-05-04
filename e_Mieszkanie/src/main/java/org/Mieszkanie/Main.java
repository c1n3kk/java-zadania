package org.Mieszkanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean editApartment = true;
        List<Room> rooms = new ArrayList<>();
        List<Resident> residents = new ArrayList<>();
        List<Furniture> furnitureKorytaz = new ArrayList<>();
        List<Furniture> furnitureSalon = new ArrayList<>();
        List<Furniture> furnitureSypialnia = new ArrayList<>();
        List<Furniture> furnitureKuchnia = new ArrayList<>();
        List<Furniture> furnitureLazienka = new ArrayList<>();

        furnitureKorytaz.add(new Furniture("wieszak", "metal"));
        furnitureKorytaz.add(new Furniture("szafa", "drewno"));
        furnitureSalon.add(new Furniture("sofa", "drewno"));
        furnitureSalon.add(new Furniture("komoda", "drewno"));
        furnitureSypialnia.add(new Furniture("łóżko", "drewno"));
        furnitureSypialnia.add(new Furniture("szafa", "drewno"));
        furnitureKuchnia.add(new Furniture("stół", "drewno"));
        furnitureKuchnia.add(new Furniture("krzesło", "drewno"));
        furnitureLazienka.add(new Furniture("wanna", "metal"));

        rooms.add(new Room("Korytaz", 5, 0, furnitureKorytaz));
        rooms.add(new Room("Salon", 20, 2, furnitureSalon));
        rooms.add(new Room("Sypialnia", 12, 1, furnitureSypialnia));
        rooms.add(new Kitchen("Kuchnia", 15, 1, furnitureKuchnia));
        rooms.add(new Bathroom("Łazienka", 8, 0, furnitureLazienka));

        residents.add(new Resident("Marek Kowalski", true));
        residents.add(new Resident("Anna Kowalska", false));
        residents.add(new Resident("Wojtek Kowalski", false));

        Apartment apartment = new Apartment(13, rooms, residents, 1, "cegła", true,
                "panele");
        apartment.printApartmentInfo();

        while (editApartment) {
            System.out.println("-----------------------");
            System.out.println("Co chcesz teraz zrobić?");
            System.out.println("1 - pokaż podstawowe informacje o mieszkaniu");
            System.out.println("2 - pokaż zameldowanych mieszkańców");
            System.out.println("3 - zmień właściciela mieszkania");
            System.out.println("4 - zamelduj nowego mieszkańca");
            System.out.println("5 - wymelduj mieszkańca");
            System.out.println("6 - pokaż wszystkie meble w mieszkaniu");
            System.out.println("7 - pokaż meble w wybranym pokoju");
            System.out.println("8 - dodaj meble");
            System.out.println("9 - usuń meble");
            System.out.println("0 - wyjście");

            int userAction = new Scanner(System.in).nextInt();
            if (userAction == 0) {
                System.out.println("Zamykam program...");
                editApartment = false;
            } else if (userAction == 1) {
                apartment.printApartmentInfo();
            } else if (userAction == 2) {
                apartment.printResidents();
            } else if (userAction == 3) {
                System.out.println("Podaj imię i nazwisko nowego właścieila:");
                String newOwner = new Scanner(System.in).nextLine();
                apartment.setOwner(newOwner);
            } else if (userAction == 4) {
                System.out.println("Podaj imię i nazwisko mieszkańca do zameldowania:");
                String newResidentName = new Scanner(System.in).nextLine();
                apartment.addNewResident(newResidentName);
            } else if (userAction == 5) {
                System.out.println("Podaj imię i nazwisko mieszkańca do wymeldowania:");
                String residentNameToRemove = new Scanner(System.in).nextLine();
                apartment.removeResident(residentNameToRemove);
            } else if (userAction == 6) {
                List<Furniture> allFurniture = apartment.getApartmentFurniture();
                apartment.printApartmentFurniture(allFurniture);
            } else if (userAction == 7) {
                System.out.println("Podaj nazwę pokoju, z którego chcesz wyświetlić meble:");
                String roomName = new Scanner(System.in).nextLine();
                List<Furniture> roomFurniture = apartment.getRoomFurniture(roomName);
                apartment.printRoomFurniture(roomName, roomFurniture);
            } else if (userAction == 8) {
                System.out.println("Podaj nazwę pokoju, do którego chcesz dodać mebel:");
                String roomName = new Scanner(System.in).nextLine();
                System.out.println("Podaj nazwę mebla, którego chcesz dodać:");
                String newFurnitureName = new Scanner(System.in).nextLine();
                System.out.println("Podaj materiał mebla, którego chcesz dodać:");
                String newFurnitureMaterial = new Scanner(System.in).nextLine();
                apartment.addRoomFurniture(roomName, newFurnitureName, newFurnitureMaterial);
            } else if (userAction == 9) {
                System.out.println("Podaj nazwę pokoju, z którego chcesz usunąć mebel:");
                String roomName = new Scanner(System.in).nextLine();
                System.out.println("Podaj nazwę mebla, którego chcesz usunąć:");
                String furnitureName = new Scanner(System.in).nextLine();
                apartment.removeRoomFurniture(roomName, furnitureName);
            } else {
                System.out.println("Niepoprawny wybór!");
            }
        }
    }

}
