import java.io.Console

fun main() {
    println("Рады вас видеть в моей консольной игре Камень, Ножницы, Бумага!!! \n Что бы закончить игру напишете Stop \n Что бы начать игру напишите Start")
    var game = readln()
    if(game == "Start")
    {
        while(true)
        {
            println("И так, пора начинать \n Первый игрок размышляет какой знак ему бы выбрать \n Камень\n Ножницы\n Бумага")
            var theFirstPlayer = readln()

            println("Очередь Второго игрока выбирать знак \n" + "Камень \n" + "Ножницы \n" + "Бумага")
            var theSecondPlayer = readln()

            while(true)
            {
                if (theFirstPlayer == "Камень" || theFirstPlayer == "Ножницы" || theFirstPlayer == "Бумага" ||
                    theSecondPlayer == "Камень" || theSecondPlayer == "Ножницы" || theSecondPlayer == "Бумага")
                {
                    if(theFirstPlayer == "Камень" && theSecondPlayer == "Ножницы")
                    {
                        println("Победитель первый игрок")
                        break
                    }
                    else if(theFirstPlayer == "Ножницы" && theSecondPlayer == "Камень")
                    {
                        print("Победитель второй игрок")
                        break
                    }
                    else if(theFirstPlayer == "Ножницы" && theSecondPlayer == "Бумага")
                    {
                        println("Победитель первый игрок")
                        break
                    }
                    else if(theFirstPlayer == "Бумага" && theSecondPlayer == "Ножницы")
                    {
                        print("Победитель второй игрок")
                        break
                    }
                    else if(theFirstPlayer == "Камень" && theSecondPlayer == "Бумага")
                    {
                        print("Победитель второй игрок")
                        break
                    }
                    else if(theFirstPlayer == "Бумага" && theSecondPlayer == "Камень")
                    {
                        println("Победитель первый игрок")
                        break
                    }
                    else
                    {
                        println("Ничья, попробуйте ещё раз")
                        break
                    }

                }
                else
                {
                    println("Некорректно введены данные, попробуйте ещё раз")
                    break
                }
            }
        }

    }
    else if (game == "Stop")
    {
     println("Ждём вас снова :)")
    }
}
