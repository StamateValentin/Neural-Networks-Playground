package neural_network.weights;

import neural_network.math.Matrix;
import static neural_network.util.Util.generateRandom;

public class RandomWeightsInit extends WeightsInit {

    public RandomWeightsInit() {
        super(WeightsFunctions.RANDOM_WEIGHTS_INIT);
    }

    @Override
    public double[][] create(int n, int m) {
        return Matrix.map(Matrix.create(n, m), (x) -> generateRandom(-0.99, 0.99));
    }
}
