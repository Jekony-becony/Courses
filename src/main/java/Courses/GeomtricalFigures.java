package Courses;

public class GeomtricalFigures {
    private String name;
    private String fill—olor;
    private String borderColor;

    public GeomtricalFigures() {
    }

    public GeomtricalFigures(String name, String fill—olor, String borderColor) {
        this.name = name;
        this.fill—olor = fill—olor;
        this.borderColor = borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setFill—olor(String fill—olor) {
        this.fill—olor = fill—olor;
    }

    public void setSide(String side) {
        this.name = name;
    }

    public String getSide() {
        return name;
    }

    public String getFill—olor() {
        return fill—olor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void info() {
        System.out.println(name + " fill color: " + fill—olor + " border color: " + borderColor);
    }

}
