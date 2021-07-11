package neural_network.activation;

public class RectifiedLinearFunction implements ActivationFunction {
    @Override
    public double fun(double x) {
        return x < 0 ? 0 : x;
    }

    @Override
    public double slope(double x) {
        return x < 0 ? 0 : 1;
    }
}
