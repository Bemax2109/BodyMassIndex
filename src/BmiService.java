public class BmiService {
    public float calculate(int mass, float height) {
        float HeightMeter = height / 100;
        float bmi = mass / (HeightMeter * HeightMeter);
        return bmi;
    }
}
