package HomeworkJava3;
//Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class Task4Hanoi {

    static void move(char point1, char point2){
        System.out.println("из стержня " + point1 + " в стержень " + point2);
    }
    static void moveTower (int amount, char point1, char point2, char temp){

        if (amount ==0) return;

        moveTower(amount-1, point1, temp, point2);// Переместить amount-1 дисков со стержня point1 на вспомогательный стержень temp, используя вспомогательный стержень point2 вспомогательного стержня temp)
        move(point1,point2);// само перемещения с одного стержня на другой
        moveTower(amount-1,temp,point2,point1);// переместить упомянутые выше amount-1 дисков со вспомогательного стержня temp на стержень point2,используя стержень point1
         }

    public static void main(String[] args) {
        moveTower(4,'A','B','C');// переместить amount дисков из стержня А в стержень В исползуя вспомогательгый стержень С
    }

}
