class Line {
    private double slope;
    private double intercept;
    private int pointCount;

    public Line(double slope, double intercept) {
        this.slope = slope;
        this.intercept = intercept;
        this.pointCount = 2; // Прямая проходит через две точки: начальную и конечную
    }

    public void incrementPointCount() {
        pointCount++;
    }

    public int getPointCount() {
        return pointCount;
    }

    @Override
    public String toString() {
        return "Прямая с угловым коэффициентом " + slope + ", свободным членом " + intercept +
                " и проходит через " + pointCount + " точек.";
    }
}
