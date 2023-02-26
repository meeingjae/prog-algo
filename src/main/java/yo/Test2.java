package yo;

public class Test2 {

    private static final char MOVEABLE    = '.';
    private static final int  START_INDEX = 0;
    private static final int  COUNT_ZERO  = 0;

    public static int solution(String[] r) {

        int row = r.length;
        int col = r[0].length();
        boolean[][] space = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (r[i].charAt(j) == MOVEABLE) {
                    space[i][j] = true;
                } else {
                    space[i][j] = false;
                }
            }
        }
        boolean[][] movedSpace = new boolean[row][col];
        //오른쪽, 아래, 왼쪽, 위
        moveRight(space, movedSpace, START_INDEX, START_INDEX, COUNT_ZERO, row * col);
        int totalCnt = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (movedSpace[i][j]) {
                    totalCnt++;
                }
            }

        }
        return totalCnt;
    }

    private static void moveRight(boolean[][] space, boolean[][] movedSpace, int row, int col, int cnt, int maxCnt) {

        movedSpace[row][col] = true;

        if (cnt == maxCnt) {
            return;
        }

        if (space[START_INDEX].length > col + 1 && space[row][col + 1]) { // 오른쪽
            moveRight(space, movedSpace, row, ++col, ++cnt, maxCnt);
        } else if (space.length > row + 1 && space[row + 1][col]) { // 아래
            moveDown(space, movedSpace, ++row, col, ++cnt, maxCnt);
        }
    }

    private static void moveDown(boolean[][] space, boolean[][] movedSpace, int row, int col, int cnt, int maxCnt) {

        movedSpace[row][col] = true;

        if (cnt == maxCnt) {
            return;
        }

        if (space.length > row + 1 && space[row + 1][col]) { // 아래
            moveDown(space, movedSpace, ++row, col, ++cnt, maxCnt);
        } else { // 왼쪽
            moveLeft(space, movedSpace, row, --col, ++cnt, maxCnt);
        }
    }

    private static void moveLeft(boolean[][] space, boolean[][] movedSpace, int row, int col, int cnt, int maxCnt) {

        movedSpace[row][col] = true;

        if (cnt == maxCnt) {
            return;
        }

        if (col - 1 >= 0 && space[row][col - 1]) { //왼쪽
            moveLeft(space, movedSpace, row, --col, ++cnt, maxCnt);
        } else if (row - 1 >= 0) { // 위
            moveUp(space, movedSpace, --row, col, ++cnt, maxCnt);
        }
    }

    private static void moveUp(boolean[][] space, boolean[][] movedSpace, int row, int col, int cnt, int maxCnt) {

        movedSpace[row][col] = true;

        if (cnt == maxCnt) {
            return;
        }

        if (row - 1 >= 0 && space[row - 1][col]) { // 위
            moveUp(space, movedSpace, --row, col, ++cnt, maxCnt);
        } else if (space[START_INDEX].length > col + 1 && space[row][col + 1]) { // 오른쪽
            moveRight(space, movedSpace, row, ++col, ++cnt, maxCnt);
        }
    }
}
