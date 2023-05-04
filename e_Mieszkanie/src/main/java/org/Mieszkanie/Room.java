package org.Mieszkanie;

import java.util.List;

public class Room {
    String name;
    private final int area;
    private final int windows;
    private List<Furniture> furniture;

    public Room(String name, int area, int windows, List<Furniture> furniture) {
        this.name = name;
        this.area = area;
        this.windows = windows;
        this.furniture = furniture;
    }

    public int getArea() {
        return area;
    }

    public int getWindows() {
        return windows;
    }

    public int getFurnitureCount() {
        return furniture.size();
    }

    public List<Furniture> getFurniture() {
        return furniture;
    }

    public void addFurniture(String name, String material) {
        furniture.add(new Furniture(name, material));
    }

    public void removeFurniture(String name) {
        for (Furniture furnitureItem:furniture) {
            if (furnitureItem.name.equals(name)) {
                furniture.remove(furnitureItem);
                return;
            }
        }
    }
}