package Courses;

public class GeomtricalFigures {
    private String name;
    private String fillColor;
    private String borderColor;

    public GeomtricalFigures() {
    }

    public GeomtricalFigures(String name, String fillColor, String borderColor) {
        this.name = name;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setFill—olor(String fillColor) {
        this.fillColor = fillColor;
    }

    public void setSide(String side) {
        this.name = name;
    }

    public String getSide() {
        return name;
    }

    public String getFill—olor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void info() {
        System.out.println(name + " | fill color: " + fillColor + " | border color: " + borderColor);
    }

}
