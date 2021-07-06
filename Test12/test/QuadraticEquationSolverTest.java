import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationSolverTest {

    @Test
    void quadraticEqPos() {
        QuadraticEquationSolver Quad = new QuadraticEquationSolver();

        Quad.quadraticEq(1,3,-4);


        assertEquals(Quad.getX1(),1);
        assertEquals(Quad.getX2(),-4);
    }

    @Test
    void quadraticEqNull() {
        QuadraticEquationSolver Quad = new QuadraticEquationSolver();

        Quad.quadraticEq(1,-4,4);

        assertEquals(Quad.getX1(),2);
    }

    @Test
    void quadraticEqNeg(){
        QuadraticEquationSolver Quad = new QuadraticEquationSolver();

        int negative = Quad.quadraticEq(1,-5,9);

        assertEquals(negative,0);
    }

}