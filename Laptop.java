package GB_java_homwork6;

import java.util.Objects;

public class Laptop {
    private String ram;
    private String railwayVolume;
    private String operatingSystem;
    private String color;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "GB_java_homwork6.Laptop{" +
                "ram=" + ram +
                ", railwayVolume=" + railwayVolume +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getRailwayVolume() {
        return railwayVolume;
    }

    public void setRailwayVolume(String railwayVolume) {
        this.railwayVolume = railwayVolume;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return ram == laptop.ram && railwayVolume == laptop.railwayVolume && Objects.equals(operatingSystem, laptop.operatingSystem) && Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, railwayVolume, operatingSystem, color);
    }
}

