package org.example.Lesson34.Builder;

public interface Product {
    String part1 = null;
    String part2 = null;

    public void setPart1(String part1);

    public void setPart2(String part2);

    public void show();
}

interface Builder {
    void buildPart1();
    void buildPart2();
    Product getResult();
}

class ConcreteBuilder implements Builder {
    private Product product = new Product() {
        @Override
        public void setPart1(String part1) {

        }

        @Override
        public void setPart2(String part2) {

        }

        @Override
        public void show() {

        }
    };

    public void buildPart1() {
        product.setPart1("Part 1");
    }

    public void buildPart2() {
        product.setPart2("Part 2");
    }

    public Product getResult() {
        return product;
    }
}

class Director {
    public Product construct(Builder builder) {
        builder.buildPart1();
        builder.buildPart2();
        return builder.getResult();
    }
}

