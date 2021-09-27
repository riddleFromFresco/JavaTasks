package tasks.task3;

public class Human {
    private class Head {
        private String hairColor;
        private String eyeColor;

        private boolean areEyesOpen = true;

        public void setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
        }

        public void setHairColor(String hairColor) {
            this.hairColor = hairColor;
        }

        void closeEyes() {
            areEyesOpen = false;
        }
    }
    private class Hand {
        final int fingersNum = 5;

        void raise(){
            System.out.println("Hi");
        }
    }
    private class Leg {
        double lengthInCm;

        public void setLengthInCm(double lengthInCm) {
            this.lengthInCm = lengthInCm;
        }

        void bend(){
            System.out.println("Leg bended");
        }
    }

    private final Head head;
    private final Hand leftHand;
    private final Hand rightHand;
    private final Leg leftLeg;
    private final Leg rightLeg;

    public Human() {
        head = new Head();
        leftHand = new Hand();
        rightHand = new Hand();
        leftLeg = new Leg();
        rightLeg = new Leg();
    }

    public void setBlackHairColor() {
        head.setEyeColor("Black");
    }

    public void setStandartLegsLen() {
        leftLeg.setLengthInCm(90);
        rightLeg.setLengthInCm(90);
    }

    public void sayHello(){
        rightHand.raise();
    }
}

class TestHuman{
    public static void main(String[] args) {
        Human person = new Human();
        person.setBlackHairColor();
        person.sayHello();
    }
}