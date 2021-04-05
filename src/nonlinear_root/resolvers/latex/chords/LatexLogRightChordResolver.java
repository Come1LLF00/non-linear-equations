package nonlinear_root.resolvers.latex.chords;

import nonlinear_root.convergencers.sufficient.log.LogChordSufficientConvergenceChecker;
import nonlinear_root.refiners.latex.chords.LatexLogRightChordRefiner;
import nonlinear_root.refiners.LogRefiner;
import nonlinear_root.resolvers.just.chords.RightChordResolver;
import nonlinear_root.resolvers.latex.LogResolver;

import java.util.function.Function;

public class LatexLogRightChordResolver extends RightChordResolver implements LogResolver {
    public LatexLogRightChordResolver(double a, double b, double eps, Function<Double, Double> fun, Function<Double, Double> dfun, Function<Double, Double> ddfun) {
        super(a, b, eps, fun, dfun, ddfun);
        CHECKER = new LogChordSufficientConvergenceChecker( a, b, fun, dfun, ddfun );
        REFINER = new LatexLogRightChordRefiner( a, b, fun );
    }

    @Override
    public String getLog() {
        return ( ( LogRefiner ) REFINER ).getRefineLog();
    }
}
