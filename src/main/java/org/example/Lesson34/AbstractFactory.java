package org.example.Lesson34;

interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}

    interface AbstractProductA {
        void operationA();
    }

    interface AbstractProductB {
        void operationB();
    }

    class ConcreteFactory1 implements AbstractFactory {
        public AbstractProductA createProductA() {
            return new ConcreteProductA1();
        }

        public AbstractProductB createProductB() {
            return new ConcreteProductB1();
        }
    }

    class ConcreteProductA1 implements AbstractProductA {
        public void operationA() {
            System.out.println("Operation A in Product A1");
        }
    }

    class ConcreteProductB1 implements AbstractProductB {
        public void operationB() {
            System.out.println("Operation B in Product B1");
        }
    }

    class Client {
        private AbstractProductA productA;
        private AbstractProductB productB;

        public Client(AbstractFactory factory) {
            productA = factory.createProductA();
            productB = factory.createProductB();
        }

        public void execute() {
            productA.operationA();
            productB.operationB();
        }
}
