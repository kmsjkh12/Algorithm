class Solution {
    public boolean solution(int[][] key, int[][] lock) {
        int keyLen = key.length;
        int lockLen = lock.length;
        int mapSize = lockLen + 2 * (keyLen - 1);

        // 4번 회전하면서 체크
        for (int rotation = 0; rotation < 4; rotation++) {
            // 회전된 키 생성
            int[][] rotatedKey = rotateKey(key, rotation);

            // 모든 위치에서 이동시키며 검사
            for (int row = 0; row <= mapSize - keyLen; row++) {
                for (int col = 0; col <= mapSize - keyLen; col++) {
                    if (canUnlock(rotatedKey, lock, row, col, keyLen, lockLen)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // 키 회전 메서드
    private int[][] rotateKey(int[][] key, int rotation) {
        int len = key.length;
        int[][] rotated = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (rotation == 0) { // 0도 회전
                    rotated[i][j] = key[i][j];
                } else if (rotation == 1) { // 90도 회전
                    rotated[i][j] = key[len - j - 1][i];
                } else if (rotation == 2) { // 180도 회전
                    rotated[i][j] = key[len - i - 1][len - j - 1];
                } else if (rotation == 3) { // 270도 회전
                    rotated[i][j] = key[j][len - i - 1];
                }
            }
        }
        return rotated;
    }

    // 자물쇠 풀 수 있는지 확인
    private boolean canUnlock(int[][] key, int[][] lock, int row, int col, int keyLen, int lockLen) {
        int[][] map = new int[lockLen + 2 * (keyLen - 1)][lockLen + 2 * (keyLen - 1)];

        // 자물쇠 복사
        for (int i = 0; i < lockLen; i++) {
            for (int j = 0; j < lockLen; j++) {
                map[keyLen - 1 + i][keyLen - 1 + j] = lock[i][j];
            }
        }

        // 키 추가
        for (int i = 0; i < keyLen; i++) {
            for (int j = 0; j < keyLen; j++) {
                map[row + i][col + j] += key[i][j];
            }
        }

        // 자물쇠 영역 확인
        for (int i = 0; i < lockLen; i++) {
            for (int j = 0; j < lockLen; j++) {
                if (map[keyLen - 1 + i][keyLen - 1 + j] != 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
