package robot;

public class Robot {
    private final Leg leftLeg;
    private final Leg rightLeg;

    private volatile boolean legSwitcher = true;

    public Robot() {
        leftLeg = new Leg("left", false);
        rightLeg = new Leg("right", true);
    }

    public void go() {
        new Thread(leftLeg).start();
        new Thread(rightLeg).start();
    }

    class Leg implements Runnable {
        private final String name;
        private final boolean isCurrentLeg;

        public Leg(String name, boolean isCurrentLeg) {
            this.name = name;
            this.isCurrentLeg = isCurrentLeg;
        }

        @Override
        public void run() {
            while (true) {
                if (isCurrentLeg == legSwitcher) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    doStep();
                    legSwitcher = !legSwitcher;
                }
            }
        }

        private void doStep() {
            System.out.println("Step " + name);
        }
    }
}
