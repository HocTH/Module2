public class Quadratic {
    static class QuadraticEquation {
        private float a;
        private float b;
        private float c;

        public QuadraticEquation() {
        }

        public QuadraticEquation(float a, float b, float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void setA(float a) {
            this.a = a;
        }

        public float getA() {
            return a;
        }

        public void setB(float b) {
            this.b = b;
        }

        public float getB() {
            return b;
        }

        public void setC(float c) {
            this.c = c;
        }

        public float getC() {
            return c;
        }

        float getDiscriminant() {
            float delta = b * b - 4 * a * c;
            return delta;
        }

        double getRoot1() {
            double r1 = ((-b) + Math.sqrt(getDiscriminant())) / (2 * a);
            return r1;
        }

        double getRoot2() {
            double r2 = ((-b) - Math.sqrt(getDiscriminant())) / (2 * a);
            return r2;
        }

        void result() {
            if (getDiscriminant() > 0) {
                System.out.println("the root 1 is: " + getRoot1());
                System.out.println("the root 2 is: " + getRoot2());
            } else if (getDiscriminant() == 0) {
                System.out.println("The equation has one root " + getRoot1());
            } else {
                System.out.println("The equation has no roots");
            }
        }
    }
}
