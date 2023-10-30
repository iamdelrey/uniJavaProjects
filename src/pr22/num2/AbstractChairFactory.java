package pr22.num2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicanChair();
    FunctionalChair createFunctionalChair();
}