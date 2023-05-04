package org.Mieszkanie;

import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private final int number;
    private final List<Room> rooms;
    private int area;
    private final List<Resident> residents;
    private final int entrances;
    private final String material;
    private int windows;
    private final boolean balcony;
    private final String floor;
    private List<Furniture> furniture;

    public Apartment (int number, List<Room> rooms, List<Resident> residents, int entrances, String material,
                      boolean balcony, String floor) {
        this.number = number;
        this.rooms = rooms;
        for (Room room:rooms) {
            area += room.getArea();
            windows += room.getWindows();
        }
        furniture = getApartmentFurniture();
        this.residents = residents;
        this.entrances = entrances;
        this.material = material;
        this.balcony = balcony;
        this.floor = floor;
    }

    public void printApartmentInfo() {
        System.out.println("================================================");
        System.out.println("Mieszkanie o numerze " + number + " - podstawowe informacje: ");
        System.out.println(" - powierchnia: " + area + " m2");
        System.out.println(" - liczba pokoi: " + rooms.size());
        System.out.println(" - właściciel: " + getOwner());
        System.out.println(" - liczba mieszkańców: " + residents.size());
        System.out.println(" - liczba drzwi wejściowych: " + entrances);
        System.out.println(" - budulec: " + material);
        System.out.println(" - liczba okien: " + windows);
        System.out.println(" - czy jest balkon: " + (balcony ? "tak" : "nie"));
        System.out.println(" - typ podłogi: " + floor);
        System.out.println(" - Liczba mebli: " + furniture.size());
    }

    public String getOwner() {
        for (Resident resident:residents) {
            if (resident.isOwner) {
                return resident.name;
            }
        }
        return "brak";
    }

    public void setOwner(String newOwner) {
        removeCurrentOwner();
        for (Resident resident:residents) {
            if (resident.name.equals(newOwner)) {
                resident.setIsOwner(true);
                System.out.println("Nowym właścicielem mieszkania jest: " + newOwner);
                return;
            }
        }
        System.out.println("Nie znaleziono mieszkańca '" + newOwner + "'!");
    }

    public void removeCurrentOwner() {
        for (Resident resident:residents) {
            resident.setIsOwner(false);
        }
    }

    public void printResidents() {
        System.out.println("Lista zameldowanych mieszkańców:");
        for (Resident resident:residents) {
            String owner = "";
            if (resident.isOwner) {
                owner = " (właściciel)";
            }
            System.out.println("- " + resident.name + owner);
        }
    }

    public void addNewResident(String name) {
        residents.add(new Resident(name, false));
        System.out.println("Nowy mieszkaniec '" + name + "' został zameldowany.");
    }

    public void removeResident(String name) {
        for (Resident resident:residents) {
            if (resident.name.equals(name)) {
                residents.remove(resident);
                System.out.println("Mieszkaniec '" + name + "' został wymedlowany.");
                return;
            }
        }
        System.out.println("Nie znaleziono mieszkańca '" + name + "'!");
    }

    public List<Furniture> getRoomFurniture (String roomName) {
        List<Furniture> roomFurniture = new ArrayList<>();
        for (Room room:rooms) {
            if (room.name.equals(roomName)) {
                roomFurniture = room.getFurniture();
            }
        }
        return roomFurniture;
    }

    public void addRoomFurniture(String roomName, String newFurnitureName, String newFurniturematerial) {
        for (Room room:rooms) {
            if (room.name.equals(roomName)) {
                room.addFurniture(newFurnitureName, newFurniturematerial);
                System.out.println("Nowy mebel (" + newFurnitureName + ") został dodany do pokoju '" + roomName + "'.");
                System.out.println("Obecnie w pokoju '" + roomName + "' znajduje się " + room.getFurnitureCount() +
                        " mebli.");
                return;
            }
        }
        System.out.println("Nie znaleziono pokoju '" + roomName + "'.");
    }

    public void removeRoomFurniture(String roomName, String furnitureName) {
        for (Room room:rooms) {
            if (room.name.equals(roomName)) {
                room.removeFurniture(furnitureName);
                System.out.println("Mebel '" + furnitureName + "' został usunięty z pokoju '" + roomName + "'.");
                System.out.println("Obecnie w pokoju '" + roomName + "' znajduje się " + room.getFurnitureCount() +
                        " mebli.");
                return;
            }
        }
        System.out.println("Nie znaleziono pokoju '" + roomName + "'.");
    }

    public List<Furniture> getApartmentFurniture() {
        furniture = new ArrayList<>();
        for (Room room:rooms) {
            furniture.addAll(room.getFurniture());
        }
        return furniture;
    }

    public static void printApartmentFurniture(List<Furniture> allFurniture) {
        System.out.println("Lista mebli w mieszkaniu (" + allFurniture.size() + " mebli):");
        for (Furniture item : allFurniture) {
            System.out.println("- " + item.name + " (materiał: " + item.material + ")");
        }
    }

    public static void printRoomFurniture(String roomName, List<Furniture> roomFurniture) {
        System.out.println("Lista mebli w pokoju '" + roomName + "' (" + roomFurniture.size() + " mebli):");
        for (Furniture item : roomFurniture) {
            System.out.println("- " + item.name + " (materiał: " + item.material + ")");
        }
    }
}