/**************************************************************************

 * @By: Jacob Russ

 * @Lab: 17

 * @CSE 1001 Fund Software, Fall 2024

 * @Date: October 29, 2024

 * @Description: Draws a flower field

 * **************************************************************************/
import java.awt.Color;

class FlowerFieldDrawing {
    static final int CANVAS_SIZE = 500;
    static final int SCALE = 100;
    static final double ROAD_WIDTH = 20.0;
    static final int FLOWER_COUNT = 5;
    static final double MIN_DISTANCE = 5.0;

    public static void main(String[] args) {
        StdDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
        StdDraw.setScale(0, SCALE);
        StdDraw.clear(new Color(34, 139, 34));  // Green background

        // Draw road with dashed line
        StdDraw.setPenColor(Color.GRAY);
        StdDraw.filledRectangle(SCALE / 2.0, SCALE / 2.0, ROAD_WIDTH / 2.0, SCALE / 2.0);
        StdDraw.setPenColor(Color.WHITE);
        for (double y = 5; y < SCALE; y += 15) {
            StdDraw.filledRectangle(SCALE / 2.0, y, 0.5, 2.5);
        }

        // Draw flowers on both sides of the road without overlap
        for (int i = 0; i < FLOWER_COUNT; i++) {
            drawUniqueFlower(i, true);  // Left side
            drawUniqueFlower(i, false); // Right side
        }
    }

    // Method to draw a flower at a unique position
    static void drawUniqueFlower(int index, boolean isLeft) {
        double x, y;
        boolean isOverlap;

        do {
            x = isLeft
                ? Math.random() * (SCALE / 2.0 - ROAD_WIDTH / 2.0)  // Left side
                : Math.random() * (SCALE / 2.0 - ROAD_WIDTH / 2.0) + (SCALE / 2.0 + ROAD_WIDTH / 2.0);  // Right side
            y = Math.random() * 90 + 5;

            // Check for overlap with previously drawn flowers
            isOverlap = false;
            for (int j = 0; j < index; j++) {
                double previousX = isLeft
                    ? Math.random() * (SCALE / 2.0 - ROAD_WIDTH / 2.0)
                    : Math.random() * (SCALE / 2.0 - ROAD_WIDTH / 2.0) + (SCALE / 2.0 + ROAD_WIDTH / 2.0);
                double previousY = Math.random() * 90 + 5;

                if (Math.hypot(previousX - x, previousY - y) < MIN_DISTANCE) {
                    isOverlap = true;
                    break;
                }
            }
        } while (isOverlap);

        drawFlower(x, y);
    }

    // Draws a flower with petals and a center
    static void drawFlower(double x, double y) {
        StdDraw.setPenColor(Color.YELLOW);
        for (int j = 0; j < 8; j++) {  // Draw 8 petals
            double angle = j * 45;
            StdDraw.filledCircle(x + Math.cos(Math.toRadians(angle)) * 2.0, y + Math.sin(Math.toRadians(angle)) * 2.0, 1.5);
        }
        StdDraw.setPenColor(Color.ORANGE);
        StdDraw.filledCircle(x, y, 1.2);  // Center
    }
}
