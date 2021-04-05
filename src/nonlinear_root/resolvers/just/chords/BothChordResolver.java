package nonlinear_root.resolvers.just.chords;

import nonlinear_root.initial_approximation_providers.chords.BothChordInitialApproximationProvider;
import nonlinear_root.refiners.just.chords.BothChordRefiner;

import java.util.function.Function;

public class BothChordResolver extends ChordResolver {
    public BothChordResolver(double a, double b, double eps, Function<Double, Double> fun, Function<Double, Double> dfun, Function<Double, Double> ddfun) {
        super(a, b, eps, fun, dfun, ddfun);
        INIT = new BothChordInitialApproximationProvider();
        REFINER = new BothChordRefiner( a, b, fun );
    }
}
