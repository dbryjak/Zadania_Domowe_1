public class Hero {

        private String name;
        private String role;
        private int strength;
        private int manaPoints;
        private boolean isNew;

        Hero(String name, String role, int strength, int manaPoints, boolean isNew) {
            this.name = name;
            this.role = role;
            this.strength = strength;
            this.manaPoints = manaPoints;
            this.isNew = isNew;
        }

        Hero(String name, String role, boolean isNew) {
            this.name = name;
            this.role = role;
            this.isNew = isNew;
        }

        public String showName() {
            return name;
        }

        public void changeName(String name) {
            this.name = name;
        }

        public String showRole() {
            return role;
        }

        public void changeRole(String role) {
            this.role = role;
        }

        public int showStrength() {
            return strength;
        }

        public void changeStrength(int strength) {
            this.strength = strength;
        }

        public int showManaPoints() {
            return manaPoints;
        }

        public void changeManaPoints(int manaPoints) {
            this.manaPoints = manaPoints;
        }

        public boolean showIsNew() {
            return isNew;
        }

        public void changeIsNew(boolean isNew) {
            this.isNew = isNew;
        }

        public double power(int strength, int manaPoints) {
            return (strength * manaPoints) / 2;
        }
}
