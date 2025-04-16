package org.example;

import java.util.*;

public class PyramidRubik {
    char[][] faces;
    public PyramidRubik() {
        faces = new char[][]{
                {'R'}, {'R', 'R', 'R'}, {'R', 'R', 'R', 'R', 'R'},
                {'G'}, {'G', 'G', 'G'}, {'G', 'G', 'G', 'G', 'G'},
                {'B'}, {'B', 'B', 'B'}, {'B', 'B', 'B', 'B', 'B'},
                {'Y'}, {'Y', 'Y', 'Y'}, {'Y', 'Y', 'Y', 'Y', 'Y'}
        };
    }

    // Clockwise right shift
    public void rotateRightClockwise(int faceIndex) {
        switch(faceIndex) {
            case 0:
                rotateFace0RightClockwise(faceIndex);
                break;
            case 1:
                rotateFace1RightClockwise(faceIndex);
                break;
            case 2:
                rotateFace2RightClockwise(faceIndex);
                break;
            case 3:
                rotateFace3RightClockwise(faceIndex);
                break;
            default:
                break;
        }
    }

    public void rotateFace0RightClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3+1][2]; // tile 4
        char temp2 = faces[faceIndex*3+2][2]; // tile 6
        char temp3 = faces[faceIndex*3+2][3]; // tile 7
        char temp4 = faces[faceIndex*3+2][4]; // tile 8
        // Face 0
        faces[1][2] = faces[10][2];
        faces[2][2] = faces[11][2];
        faces[2][3] = faces[11][3];
        faces[2][4] = faces[11][4];
        // Face 3
        faces[10][2] = faces[5][2];
        faces[11][2] = faces[4][0];
        faces[11][3] = faces[5][1];
        faces[11][4] = faces[5][0];
        // Face 1
        faces[5][2] = temp1;
        faces[4][0] = temp2;
        faces[5][1] = temp3;
        faces[5][0] = temp4;
    }

    public void rotateFace1RightClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3+1][2]; // tile 3
        char temp2 = faces[faceIndex*3+2][2]; // tile 6
        char temp3 = faces[faceIndex*3+2][3]; // tile 7
        char temp4 = faces[faceIndex*3+2][4]; // tile 8
        // Face 1
        faces[4][2] = faces[11][2];
        faces[5][2] = faces[10][0];
        faces[5][3] = faces[11][1];
        faces[5][4] = faces[11][0];
        // Face 3
        faces[10][0] = faces[7][0];
        faces[11][0] = faces[8][0];
        faces[11][1] = faces[8][1];
        faces[11][2] = faces[8][2];
        // Face 2
        faces[8][2] = temp1;
        faces[7][0] = temp2;
        faces[8][1] = temp3;
        faces[8][0] = temp4;
    }

    public void rotateFace2RightClockwise(int faceIndex){
        char temp1 = faces[faceIndex*3+1][2]; // tile 3
        char temp2 = faces[faceIndex*3+2][2]; // tile 6
        char temp3 = faces[faceIndex*3+2][3]; // tile 7
        char temp4 = faces[faceIndex*3+2][4]; // tile 8
        // Face 2
        faces[7][2] = faces[10][0];
        faces[8][2] = faces[10][2];
        faces[8][3] = faces[10][1];
        faces[8][4] = faces[9][0];
        //Face 3
        faces[9][0] = faces[2][0];
        faces[10][0] = faces[2][2];
        faces[10][1] = faces[2][1];
        faces[10][2] = faces[1][0];
        // Face 0
        faces[1][0] = temp1;
        faces[2][0] = temp2;
        faces[2][1] = temp3;
        faces[2][2] = temp4;
    }

    public void rotateFace3RightClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3+1][2]; // tile 3
        char temp2 = faces[faceIndex*3+2][2]; // tile 6
        char temp3 = faces[faceIndex*3+2][3]; // tile 7
        char temp4 = faces[faceIndex*3+2][4]; // tile 8
        // Face 3
        faces[10][2] = faces[5][2];
        faces[11][2] = faces[4][0];
        faces[11][3] = faces[5][1];
        faces[11][4] = faces[5][0];
        //Face 1
        faces[4][0] = faces[2][2];
        faces[5][0] = faces[2][4];
        faces[5][1] = faces[2][3];
        faces[5][2] = faces[1][0];
        // Face 0
        faces[1][2] = temp1;
        faces[2][2] = temp2;
        faces[2][3] = temp3;
        faces[2][4] = temp4;
    }

    // Clockwise left shift
    public void rotateLeftClockwise(int faceIndex) {
        switch(faceIndex) {
            case 0:
                rotateFace0LeftClockwise(faceIndex);
                break;
            case 1:
                rotateFace1LeftClockwise(faceIndex);
                break;
            case 2:
                rotateFace2LeftClockwise(faceIndex);
                break;
            case 3:
                rotateFace3LeftClockwise(faceIndex);
                break;
            default:
                break;
        }
    }

    public void rotateFace0LeftClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3+1][0]; // tile 1
        char temp2 = faces[faceIndex*3+2][0]; // tile 4
        char temp3 = faces[faceIndex*3+2][1]; // tile 5
        char temp4 = faces[faceIndex*3+2][2]; // tile 6
        // Face 0
        faces[1][0] = faces[10][2];
        faces[2][0] = faces[9][0];
        faces[2][1] = faces[10][1];
        faces[2][2] = faces[10][2];
        // Face 3
        faces[9][0] = faces[8][4];
        faces[10][0] = faces[8][2];
        faces[10][1] = faces[8][3];
        faces[10][2] = faces[8][4];
        // Face 2
        faces[8][2] = temp1;
        faces[8][4] = temp2;
        faces[8][3] = temp3;
        faces[7][2] = temp4;
    }

    public void rotateFace1LeftClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3+1][0]; // tile 1
        char temp2 = faces[faceIndex*3+2][0]; // tile 4
        char temp3 = faces[faceIndex*3+2][1]; // tile 5
        char temp4 = faces[faceIndex*3+2][2]; // tile 6
        // Face 1
        faces[4][0] = faces[11][2];
        faces[5][0] = faces[11][4];
        faces[5][1] = faces[11][3];
        faces[5][2] = faces[10][2];
        // Face 3
        faces[10][2] = faces[1][2];
        faces[11][2] = faces[2][2];
        faces[11][3] = faces[2][3];
        faces[11][4] = faces[2][4];
        // Face 4
        faces[2][2] = temp1;
        faces[2][4] = temp2;
        faces[2][3] = temp3;
        faces[1][2] = temp4;
    }

    public void rotateFace2LeftClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3+1][0]; // tile 1
        char temp2 = faces[faceIndex*3+2][0]; // tile 4
        char temp3 = faces[faceIndex*3+2][1]; // tile 5
        char temp4 = faces[faceIndex*3+2][2]; // tile 6
        // Face 2
        faces[7][0] = faces[10][0];
        faces[8][0] = faces[11][0];
        faces[8][1] = faces[11][1];
        faces[8][2] = faces[11][2];
        // Face 3
        faces[10][0] = faces[5][2];
        faces[11][0] = faces[5][4];
        faces[11][1] = faces[5][3];
        faces[11][2] = faces[4][2];
        // Face 1
        faces[5][2] = temp1;
        faces[5][4] = temp2;
        faces[5][3] = temp3;
        faces[4][2] = temp4;
    }

    public void rotateFace3LeftClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3+1][0]; // tile 1
        char temp2 = faces[faceIndex*3+2][0]; // tile 4
        char temp3 = faces[faceIndex*3+2][1]; // tile 5
        char temp4 = faces[faceIndex*3+2][2]; // tile 6
        // Face 3
        faces[10][0] = faces[5][2];
        faces[11][0] = faces[5][4];
        faces[11][1] = faces[5][3];
        faces[11][2] = faces[4][2];
        // Face 1
        faces[4][2] = faces[8][2];
        faces[5][2] = faces[7][0];
        faces[5][3] = faces[8][1];
        faces[5][4] = faces[8][0];
        // Face 2
        faces[7][0] = temp1;
        faces[8][0] = temp2;
        faces[8][1] = temp3;
        faces[8][2] = temp4;
    }

    public void rotateRightCounterClockwise(int faceIndex) {
        switch(faceIndex) {
            case 0:
                rotateFace0RightCounterClockwise(faceIndex);
                break;
            case 1:
                rotateFace1RightCounterClockwise(faceIndex);
                break;
            case 2:
                rotateFace2RightCounterClockwise(faceIndex);
                break;
            case 3:
                rotateFace3RightCounterClockwise(faceIndex);
            default:
                break;
        }
    }

    public void rotateFace0RightCounterClockwise(int faceIndex) {
        char temp1 = faces[5][2]; // Face 1, tile 3
        char temp2 = faces[4][0]; // Face 1, tile 6
        char temp3 = faces[5][1]; // Face 1, tile 7
        char temp4 = faces[5][0]; // Face 1, tile 8
        // Face 1
        faces[5][2] = faces[10][2];
        faces[4][0] = faces[11][2];
        faces[5][1] = faces[11][3];
        faces[5][0] = faces[11][4];
        // Face 3
        faces[10][2] = faces[1][2];
        faces[11][2] = faces[2][2];
        faces[11][3] = faces[2][3];
        faces[11][4] = faces[2][4];
        // Face 0
        faces[1][2] = temp1;
        faces[2][2] = temp2;
        faces[2][3] = temp3;
        faces[2][4] = temp4;
    }

    public void rotateFace1RightCounterClockwise(int faceIndex) {
        char temp1 = faces[8][2]; // Face 2, tile 4
        char temp2 = faces[7][0]; // Face 2, tile 6
        char temp3 = faces[8][1]; // Face 2, tile 7
        char temp4 = faces[8][0]; // Face 2, tile 8
        // Face 2
        faces[8][2] = faces[11][2];
        faces[7][0] = faces[10][0];
        faces[8][1] = faces[11][1];
        faces[8][0] = faces[11][0];
        // Face 3
        faces[11][2] = faces[4][2];
        faces[10][0] = faces[5][2];
        faces[11][1] = faces[5][3];
        faces[11][0] = faces[5][4];
        // Face 1
        faces[4][2] = temp1;
        faces[5][2] = temp2;
        faces[5][3] = temp3;
        faces[5][4] = temp4;
    }

    public void rotateFace2RightCounterClockwise(int faceIndex) {
        char temp1 = faces[2][2]; // Face 0, tile 4
        char temp2 = faces[2][0]; // Face 0, tile 6
        char temp3 = faces[2][1]; // Face 0, tile 7
        char temp4 = faces[1][0]; // Face 0, tile 8
        // Face 0
        faces[2][2] = faces[10][0];
        faces[2][0] = faces[9][0];
        faces[2][1] = faces[10][1];
        faces[1][0] = faces[10][2];
        // Face 3
        faces[10][0] = faces[7][2];
        faces[9][0] = faces[8][4];
        faces[10][1] = faces[8][3];
        faces[10][2] = faces[8][2];
        // Face 2
        faces[7][2] = temp1;
        faces[8][4] = temp2;
        faces[8][3] = temp3;
        faces[8][2] = temp4;
    }

    public void rotateFace3RightCounterClockwise(int faceIndex) {
        char temp1 = faces[1][2];
        char temp2 = faces[2][2];
        char temp3 = faces[2][3];
        char temp4 = faces[2][4];
        // Face 0
        faces[1][2] = faces[5][2];
        faces[2][2] = faces[4][0];
        faces[2][3] = faces[5][1];
        faces[2][4] = faces[5][0];
        // Face 1
        faces[4][0] = faces[10][2];
        faces[5][0] = faces[11][4];
        faces[5][1] = faces[11][3];
        faces[5][2] = faces[11][2];
        // Face 3
        faces[10][2] = temp2;
        faces[11][2] = temp1;
        faces[11][3] = temp3;
        faces[11][4] = temp4;
    }

    public void rotateLeftCounterClockwise(int faceIndex) {
        switch(faceIndex) {
            case 0:
                rotateFace0LeftCounterClockwise(faceIndex);
                break;
            case 1:
                rotateFace1LeftCounterClockwise(faceIndex);
                break;
            case 2:
                rotateFace2LeftCounterClockwise(faceIndex);
                break;
            case 3:
                rotateFace3LeftCounterClockwise(faceIndex);
                break;
            default:
                break;
        }
    }

    public void rotateFace0LeftCounterClockwise(int faceIndex) {
        char temp1 = faces[8][2];
        char temp2 = faces[8][4];
        char temp3 = faces[8][3];
        char temp4 = faces[7][2];
        // Face 2
        faces[8][2] = faces[10][0];
        faces[8][4] = faces[9][0];
        faces[8][3] = faces[10][1];
        faces[7][2] = faces[10][2];
        // Face 3
        faces[9][0] = faces[2][0];
        faces[10][0] = faces[1][0];
        faces[10][1] = faces[2][1];
        faces[10][2] = faces[2][2];
        // Face 0
        faces[1][0] = temp1;
        faces[2][0] = temp2;
        faces[2][1] = temp3;
        faces[2][2] = temp4;
    }

    public void rotateFace1LeftCounterClockwise(int faceIndex) {
        char temp1 = faces[2][2]; // tile 4
        char temp2 = faces[2][4]; // tile 6
        char temp3 = faces[2][3]; // tile 5
        char temp4 = faces[1][2]; // tile 1
        // Face 0
        faces[2][2] = faces[10][2];
        faces[2][4] = faces[11][4];
        faces[2][3] = faces[11][3];
        faces[1][2] = faces[10][2];
        // Face 3
        faces[10][2] = faces[4][0];
        faces[11][2] = faces[5][0];
        faces[11][3] = faces[5][1];
        faces[11][4] = faces[5][2];
        // Face 1
        faces[4][0] = temp1;
        faces[5][0] = temp2;
        faces[5][1] = temp3;
        faces[5][2] = temp4;
    }

    public void rotateFace2LeftCounterClockwise(int faceIndex) {
        char temp1 = faces[5][2]; // tile 4
        char temp2 = faces[5][4]; // tile 6
        char temp3 = faces[5][3]; // tile 5
        char temp4 = faces[4][2]; // tile 1
        // Face 1
        faces[5][2] = faces[10][0];
        faces[5][4] = faces[11][0];
        faces[5][3] = faces[11][1];
        faces[4][2] = faces[11][2];
        // Face 3
        faces[10][0] = faces[7][0];
        faces[11][0] = faces[8][0];
        faces[11][1] = faces[8][1];
        faces[11][2] = faces[8][2];
        // Face 2
        faces[7][0] = temp1;
        faces[8][0] = temp2;
        faces[8][1] = temp3;
        faces[8][2] = temp4;
    }

    public void rotateFace3LeftCounterClockwise(int faceIndex) {
        char temp1 = faces[7][0]; // tile 4
        char temp2 = faces[8][0]; // tile 6
        char temp3 = faces[8][1]; // tile 5
        char temp4 = faces[8][2]; // tile 1
        // Face 2
        faces[7][0] = faces[5][2];
        faces[8][0] = faces[5][4];
        faces[8][1] = faces[5][3];
        faces[8][2] = faces[4][2];
        // Face 1
        faces[5][2] = faces[10][0];
        faces[5][4] = faces[11][0];
        faces[5][3] = faces[11][1];
        faces[4][2] = faces[11][2];
        // Face 3
        faces[10][0] = temp1;
        faces[11][0] = temp2;
        faces[11][1] = temp3;
        faces[11][2] = temp4;
    }

    public void rotateTopClockwise(int faceIndex) {
        switch(faceIndex) {
            case 0:
                rotateFace0TopClockwise(faceIndex);
                break;
            case 1:
                rotateFace1TopClockwise(faceIndex);
                break;
            case 2:
                rotateFace2TopClockwise(faceIndex);
                break;
            case 3:
                rotateFace3TopClockwise(faceIndex);
                break;
            default:
                break;
        }
    }

    public void rotateFace0TopClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3][0]; // tile 0
        char temp2 = faces[faceIndex*3+1][0]; // tile 1
        char temp3 = faces[faceIndex*3+1][1]; // tile 2
        char temp4 = faces[faceIndex*3+1][2]; // tile 3
        // Face 0
        faces[0][0] = faces[3][0];
        faces[1][0] = faces[4][0];
        faces[1][1] = faces[4][1];
        faces[1][2] = faces[4][2];
        // Face 1
        faces[3][0] = faces[6][0];
        faces[4][0] = faces[7][0];
        faces[4][1] = faces[7][1];
        faces[4][2] = faces[7][2];
        // Face 2
        faces[6][0] = temp1;
        faces[7][0] = temp2;
        faces[7][1] = temp3;
        faces[7][2] = temp4;
    }
    public void rotateFace1TopClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3][0]; // tile 0
        char temp2 = faces[faceIndex*3+1][0]; // tile 1
        char temp3 = faces[faceIndex*3+1][1]; // tile 2
        char temp4 = faces[faceIndex*3+1][2]; // tile 3
        // Face 1
        faces[3][0] = faces[6][0];
        faces[4][0] = faces[7][0];
        faces[4][1] = faces[7][1];
        faces[4][2] = faces[7][2];
        // Face 2
        faces[6][0] = faces[0][0];
        faces[7][0] = faces[1][0];
        faces[7][1] = faces[1][1];
        faces[7][2] = faces[1][2];
        // Face 0
        faces[0][0] = temp1;
        faces[1][0] = temp2;
        faces[1][1] = temp3;
        faces[1][2] = temp4;
    }

    public void rotateFace2TopClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3][0]; // tile 0
        char temp2 = faces[faceIndex*3+1][0]; // tile 1
        char temp3 = faces[faceIndex*3+1][1]; // tile 2
        char temp4 = faces[faceIndex*3+1][2]; // tile 3
        // Face 2
        faces[6][0] = faces[0][0];
        faces[7][0] = faces[1][0];
        faces[7][1] = faces[1][1];
        faces[7][2] = faces[1][2];
        // Face 0
        faces[0][0] = faces[3][0];
        faces[1][0] = faces[4][0];
        faces[1][1] = faces[4][1];
        faces[1][2] = faces[4][2];
        // Face 1
        faces[3][0] = temp1;
        faces[4][0] = temp2;
        faces[4][1] = temp3;
        faces[4][2] = temp4;
    }

    public void rotateFace3TopClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3][0]; // tile 0
        char temp2 = faces[faceIndex*3+1][0]; // tile 1
        char temp3 = faces[faceIndex*3+1][1]; // tile 2
        char temp4 = faces[faceIndex*3+1][2]; // tile 3
        // Face 3
        faces[9][0] = faces[2][0];
        faces[10][0] = faces[2][2];
        faces[10][1] = faces[2][1];
        faces[10][2] = faces[1][0];
        // Face 0
        faces[1][0] = faces[8][2];
        faces[2][0] = faces[8][4];
        faces[2][1] = faces[8][3];
        faces[2][2] = faces[7][2];
        // Face 2
        faces[8][4] = temp1;
        faces[7][2] = temp2;
        faces[8][3] = temp3;
        faces[8][2] = temp4;
    }

    public void rotateTopCounterClockwise(int faceIndex) {
        switch(faceIndex) {
            case 0:
                rotateFace0TopCounterClockwise(faceIndex);
                break;
            case 1:
                rotateFace1TopCounterClockwise(faceIndex);
                break;
            case 2:
                rotateFace2TopCounterClockwise(faceIndex);
                break;
            case 3:
                rotateFace3TopCounterClockwise(faceIndex);
                break;
            default:
                break;
        }
    }

    public void rotateFace0TopCounterClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3][0]; // tile 0
        char temp2 = faces[faceIndex*3+1][0]; // tile 1
        char temp3 = faces[faceIndex*3+1][1]; // tile 2
        char temp4 = faces[faceIndex*3+1][2]; // tile 3
        // Face 0
        faces[0][0] = faces[6][0];
        faces[1][0] = faces[7][0];
        faces[1][1] = faces[7][1];
        faces[1][2] = faces[7][2];
        // Face 1
        faces[6][0] = faces[3][0];
        faces[7][0] = faces[4][0];
        faces[7][1] = faces[4][1];
        faces[7][2] = faces[4][2];
        // Face 2
        faces[3][0] = temp1;
        faces[4][0] = temp2;
        faces[4][1] = temp3;
        faces[4][2] = temp4;
    }

    public void rotateFace1TopCounterClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3][0]; // tile 0
        char temp2 = faces[faceIndex*3+1][0]; // tile 1
        char temp3 = faces[faceIndex*3+1][1]; // tile 2
        char temp4 = faces[faceIndex*3+1][2]; // tile 3
        // Face 1
        faces[3][0] = faces[0][0];
        faces[4][0] = faces[1][0];
        faces[4][1] = faces[1][1];
        faces[4][2] = faces[1][2];
        // Face 2
        faces[0][0] = faces[6][0];
        faces[1][0] = faces[7][0];
        faces[1][1] = faces[7][1];
        faces[1][2] = faces[7][2];
        // Face 0
        faces[6][0] = temp1;
        faces[7][0] = temp2;
        faces[7][1] = temp3;
        faces[7][2] = temp4;
    }

    public void rotateFace2TopCounterClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3][0]; // tile 0
        char temp2 = faces[faceIndex*3+1][0]; // tile 1
        char temp3 = faces[faceIndex*3+1][1]; // tile 2
        char temp4 = faces[faceIndex*3+1][2]; // tile 3
        // Face 2
        faces[6][0] = faces[3][0];
        faces[7][0] = faces[4][0];
        faces[7][1] = faces[4][1];
        faces[7][2] = faces[4][2];
        // Face 0
        faces[3][0] = faces[0][0];
        faces[4][0] = faces[1][0];
        faces[4][1] = faces[1][1];
        faces[4][2] = faces[1][2];
        // Face 1
        faces[0][0] = temp1;
        faces[1][0] = temp2;
        faces[1][1] = temp3;
        faces[1][2] = temp4;
    }

    public void rotateFace3TopCounterClockwise(int faceIndex) {
        char temp1 = faces[faceIndex*3][0]; // tile 0
        char temp2 = faces[faceIndex*3+1][0]; // tile 1
        char temp3 = faces[faceIndex*3+1][1]; // tile 2
        char temp4 = faces[faceIndex*3+1][2]; // tile 3
        // Face 3
        faces[9][0] = faces[8][4];
        faces[10][0] = faces[7][2];
        faces[10][1] = faces[8][3];
        faces[10][2] = faces[8][2];
        // Face 0
        faces[8][4] = faces[2][0];
        faces[7][2] = faces[2][2];
        faces[8][3] = faces[2][1];
        faces[8][2] = faces[1][0];
        // Face 2
        faces[2][0] = temp1;
        faces[2][2] = temp2;
        faces[2][1] = temp3;
        faces[1][0] = temp4;
    }

    // Rotate just the tip (visual only)
    public void rotateTip(int faceIndex) {
        if (faceIndex < 0 || faceIndex >= 4) {
            System.out.println("Invalid tip index.");
            return;
        }
        System.out.println("Tip of face " + faceIndex + " rotated (visual only).");
        // In visual simulation, you could animate or mark it
    }

    // Scramble using 10 random face rotations
    public void scramble() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            // random face
            int face = rand.nextInt(4);
            // random top, left, or right
            int area = rand.nextInt(3);
            // random clockwise or counter-clockwise
            int direction = rand.nextInt(2);
            switch (direction) {
                // Clockwise
                case 0:
                    switch(area) {
                        // Top
                        case 0:
                            rotateTopClockwise(face);
                            break;
                        // Right
                        case 1:
                            rotateRightClockwise(face);
                            break;
                        //Left
                        case 2:
                            rotateLeftClockwise(face);
                            break;
                        default:
                            break;
                    }
                // Counter-clockwise
                case 1:
                    switch(area) {
                        // Top
                        case 0:
                            rotateTopCounterClockwise(face);
                            break;
                        // Right
                        case 1:
                            rotateRightCounterClockwise(face);
                            break;
                        //Left
                        case 2:
                            rotateLeftCounterClockwise(face);
                            break;
                        default:
                            break;
                    }
                default:
                    break;
            }
        }
        System.out.println("Cube scrambled.");
    }

    // Display cube's state
    public void display() {
        System.out.println("\nPyramid Rubik's Cube State:");
        for (int i = 0; i < faces.length; i += 3) {
            int faceNum = i / 3;
            System.out.println("Face " + faceNum + ":");
            System.out.println("      " + Arrays.toString(faces[i]));     // Top layer
            System.out.println("   " + Arrays.toString(faces[i + 1]));   // Middle layer
            System.out.println(Arrays.toString(faces[i + 2]));           // Bottom layer
            System.out.println();
        }
    }

    // For Unit Testing (I have not gotten this to work yet)
    public List<List<List<String>>> getFaces() {
        List<List<List<String>>> faceList = new ArrayList<>();
        // Iterate over groups of 3 rows to form a face
        for (int i = 0; i < faces.length; i += 3) {
            List<List<String>> currentFace = new ArrayList<>();
            // Convert rows into proper List<String>
            currentFace.add(Arrays.asList(Arrays.toString(faces[i]))); // Row 0
            if (i + 1 < faces.length) {
                currentFace.add(Arrays.asList(Arrays.toString(faces[i + 1]))); // Row 1
            }
            if (i + 2 < faces.length) {
                currentFace.add(Arrays.asList(Arrays.toString(faces[i + 2]))); // Row 2
            }
            faceList.add(currentFace);
        }
        return faceList;
    }
}
