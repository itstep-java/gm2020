package org.itstep.msk.lesson9;

public class PersonalComputer {
    public interface ComputerItem {
        String toString();
    }

    public static class Motherboard implements ComputerItem {
        public static class RAM {
        }

        @Override
        public String toString() {
            return "Материнская плата";
        }
    }

    public static class Processor implements ComputerItem {
        @Override
        public String toString() {
            return "Процессор";
        }
    }

    public Motherboard getMotherboard() {
        return new Motherboard();
    }

    public Processor getProcessor() {
        return new Processor();
    }
}
