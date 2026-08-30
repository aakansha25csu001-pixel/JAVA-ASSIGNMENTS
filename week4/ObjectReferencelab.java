package week4;

public class ObjectReferencelab {

    static class ScoreBox {
        private int score;

        public ScoreBox(int score) {
            if (score < 0) {
                throw new IllegalArgumentException("Score cannot be negative");
            }
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            if (score < 0) {
                throw new IllegalArgumentException("Score cannot be negative");
            }
            this.score = score;
        }

        @Override
        public String toString() {
            return "ScoreBox{score=" + score + "}";
        }
    }

    static void addBonus(ScoreBox box, int bonus) {
        if (bonus < 0) {
            throw new IllegalArgumentException("Bonus cannot be negative");
        }

        box.setScore(box.getScore() + bonus);
    }

    static void replaceLocally(ScoreBox box) {
        box = new ScoreBox(999);
        System.out.println("Inside replaceLocally: " + box.getScore());
    }

    static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }

    public static void main(String[] args) {

        ScoreBox b1 = new ScoreBox(50);
        ScoreBox alias = b1;  
        ScoreBox b2 = new ScoreBox(80);

        System.out.println("box1: " + b1);
        System.out.println("alias: " + alias);
        System.out.println("box2: " + b2);
        System.out.println("box1 == alias: " + (b1 == alias));
        System.out.println("box1 == box2: " + (b1 == b2));
        alias.setScore(70);

        System.out.println("After changing alias:");
        System.out.println("box1: " + b1);
        System.out.println("alias: " + alias);
   addBonus(b1, 10);

        System.out.println("After addBonus:");
        System.out.println("box1: " + b1);

     replaceLocally(b1);

        System.out.println("After replaceLocally:");
        System.out.println("box1: " + b1);

        ScoreBox b3 = createScoreBox(100);

        System.out.println("New object box3: " + b3);
        System.out.println("box1 == box3: " + (b1 == b3));
        System.out.println("box2 == box3: " + (b2 == b3));
    }
}