import java.awt.SystemColor.text

fun welcome() {
    println("Это было лето 2021. В том году мне посчастливилось выбить у своих родителей поездку в лагерь вместо типичного визита бабушки на все три месяца. До этого я никогда не ездил в лагеря, поэтому мне было немного боязно, но всё когда-то бывает в первый раз. Я собрался, и родители отвезли меня в лагерь «Лесок». n\\" +
            "В выборе места я участия не принимал, просто я не знал никаких критериев и полностью доверился родителям. n\\" +
            "Дорога была долгая, и я сильно устал. Приехав туда, я увидел много моих сверстников, внутри всё сжалось. В голове мелькнула мысль: «Зачем я напросился сюда?!» Но я уже был здесь… n\\" +
            "По фасадам зданий стало ясно: этому месту много лет. Но несмотря на обваливающуюся облицовку и ржавеющие качели, всё вокруг было таким ярким и красочным, лица детей светились от счастья.")
}

var COUNTOFYOURCHOICES = 0
fun startGame() {
    val zeroChoice = Choice("Я попращался с родителями и подошёл к столу регистрации, чтобы узнать, где находиться моя комната, и познакомиться с вожатыми. n\\" +
            "Ими оказались молодые ребята Регина и Вадик. Рядом со столом кто-то громко смеялся, я обернулся и увидел девочку с чёрными волосами и такими же тёмными глазами, справа от неё стоял мальчик, он был выше милой девочки на пол головы, волосы были ярко рыжими и всё лицо покрывали веснушки. n\\" +
            "Мальчик так громко заливался хохотом, что на него обратили внимание даже вожатые, которые прежде выглядели абсолютно безразличными. Рядом с шумной компанией одиноко стоял мальчик с пепельно-белыми волосами и такой же белой кожей, он стоял совсем один и ни с кем не разговаривал. Я заколебался… ")
    zeroChoice.print()
    val firstChoice = Choice("1. Познакомиться с одиноким мальчиком n\\" +
            "2. Познакомиться с хохочущей компанией n\\" +
            "3. Ни с кем не знакомиться")
    firstChoice.print()
    firstChoice.chooseYourWay("- Привет! Ты тоже здесь впервый раз?\n" +
            "- Привет. Да.\n" +
            "- Меня зовут Август, а тебя?\n" +
            "- Эдуард.\n" +
            "- Твои родители тоже любители оригинальных имён?)\n" +
            "- Ахах, типо того)\n", "- Привет, ребят…\n" +
            "- О! Ты новенький! Меня, кстати, Марта зовут, а это Хазиль)\n" +
            "- уфхахфхах, да это я. А тебя как?\n" +
            "- Меня… меня зовут Август\n" +
            "- То есть Густя)\n" +
            "- Хазиль, успокойся! Очень красивое имя, Август, не обращай на него внимание, он всегда в диком угаре)\n" +
            "- Ага, вам, кстати, для полной компании не хватает ещё 10-ых, там Майи и других)\n" +
            "- Очень смешно…\n", "На секунду я уже был готов идти знакомиться с людьми, но что-то надломилось во мне. Я встал поотдаль от того одинокого мальчика и ждал… не знаю чего, просто ждал." )
    firstCandleAndHorrorStory()
    if (COUNTOFYOURCHOICES > 0) {
        val bluecandle = Candlechoice(
            "1.Знакомство с Хазилем и Мартой",
            "2.Ни с кем не разговаривать",
            "– Пр… Привет, меня зовут Август! \n" +
                    "– Привет, меня зовут Марта, а этот рыжий – Хазиль.\n" +
                    "– Рад познакомиться, Август! Ты в «Леске» впервые?\n" +
                    "– Да, на самом деле, я никогда до этого в лагеря не ездил.\n" +
                    "– Ну ничего втянешься)\n" +
                    "– Кстати, Август, ты знаешь про ночной квест?\n" +
                    "– Квест?\n" +
                    "– Ну да, каждую смену на вторую ночь вожатые готовят ночной квест в лесу, обычно это страшные квесты, но чем чаще ездишь, тем тяжелее напугаться.\n" +
                    "– Спасибо, Марта, что предупредила, а то я не очень их люблю…\n" +
                    "– Да ты чего, тебе понравится, обещаю)\n",
            "Я подошёл к Эдуарду, я хотел поговорить с ним, но он не горел желанием даже смотреть на меня, поэтому я просто пошёл спать."
        )
        bluecandle.print()
        bluecandle.chooseVariant()
        val blueBranch = DayFirstBlueAndGreenChoice("В голове тут же возникла делема: 1. стоит ли мне идти искать Эдуарда \n" +
                "2. или лучше остаться?", "Узнав о пропаже Эдуарда, я быстро собрал необходимые вещи (фонарик, нож, верёвку, дымовая шашка и бинты) и ускользнул в лес. Сердце сильно колотилось, я бы никогда не поступил бы так опраметчиво, пойдя в одиночку, но тогда думать было некогда.\n" +
                "Я погрузился в свои мысли и переживания, когда услышал хруст веток, внутри всё сжалось. «Я умру… сейчас» - пронеслось у меня в голове, я хотел кричать, но не мог, я боялся…\n" +
                "ТРУС ТРУС ТРУС ТРУС ТРУС \n" +
                "Я собрался, обернулся… там был Вадик… Вадик? Что он там забыл, наверное, ищет Эдуарда, он же вожатый. Я хотел к нему подойти, но не стал, в конце концов я пропускаю завтрак. Доверя поиски Эдуарда Вадику, я отправился в корпус.", "Идти искать Эдуарда? \n" +
                "Нет, это была бредовая идея. Я один ничего не смог бы сделать, поэтому поиски я доверил вожатым, в конце концов, вдруг это всё были слухи. Я умылся и пошёл на завтрак.")
        blueBranch.blueBranch()
    } else if (COUNTOFYOURCHOICES == 0){
        val greencandle = Candlechoice(
            "1.Подойти к Марте и Хазилю",
            "2.Познакомиться с Эдуардом",
            "– Ну что, Август, как тебе первый день?\n" +
                    "– Такое, он был неособо насыщенный.\n" +
                    "– Подожди, завтра ещё ночной квест в лесу?\n" +
                    "– Чегоооо!?\n" +
                    "– Ну да, будет весело обещаю)\n",
            "– Привет, я Август, а ты?\n" +
                    "– А я не хочу знакомиться.\n" +
                    "– Да ладно, чего ты такой кислый?\n" +
                    "– Меня зовут Эдуард, и у меня нет настроения говорить.\n" +
                    "– Ну как хочешь.\n"
        )
        greencandle.print()
        greencandle.chooseVariant()
        println("Стоп… Эдуарда нигде не было… Но мы с Мартой и Хазилем не особо были этим обеспокоины, мы были уверены, что это часть предстоящего квеста. Сначала мы тоже переживали, но глядя на безразличных вожатых мы успокоились.")
        val greenBranch = DayFirstBlueAndGreenChoice("0","0","0")
        greenBranch.greenBranch()
    } else {
        redBranch()
    }
}


class Choice(text: String) {
    fun print(){
        println(text)
    }

    fun chooseYourWay(print1: String, print2: String, print3: String ) {
        val userInput = readLine()
        if (userInput != null) {
            if (userInput == "1") {
                println(print1)
                COUNTOFYOURCHOICES += 1
            } else if (userInput == "2") {
                println(print2)
                COUNTOFYOURCHOICES += 0
            } else if (userInput == "3") {
                println(print3)
                COUNTOFYOURCHOICES -= 1
            }
        }
    }

}



fun firstCandleAndHorrorStory() {
    println("Заезд был где-то около обеда, поэтому день не был насыщеным, но уже вечером мы собрались на первую свечку. Особо обсуждать было нечего поэтому мы всем 7 отрядом предложили вожатым рассказать страшную историю. Регина отнекивалась и говорила, что вообще не знает хороших страшных историй, тогда инициативу прехватил Вадик. И он поведал нам историю:\n" +
            "«Мальчику оставили небольшой пакетик вещей. Из-за холодного морского ветра он часто мёрз, тогда вожатые позвонили его маме и попросили привезти что-то потеплее. Когда женщина приехала, всех поразил её вид: казалось, шею искусал вампир, на уголках губ виднелись кровавые следы, в глазах мерцал красный блеск. Она всучила сыну розовые колготки и «как будто бы исчезла вмиг.\n" +
            "Перед отбоем мальчик надел их, и уже через час все проснулись от жуткого крика. Он жаловался на боль в ногах. Вожатые стянули колготки и увидели окровавленные кости. Говорят, продавшая душу вампиру мать незаметно выкрала колготки и подбросила их другому мальчику. По сей день силой гипноза она заставляет страдать детей, надевших страшный предмет одежды.»\n" +
            "Не то, чтобы история была очень страшной, но всех напряг тот факт, что у молчаливого Эдуарда на ногах виднелись розовые носки. Вожатые посмеялись с этого и отпраили всех спать.\n")
}

class Candlechoice(option1: String, option2: String, result1: String, result2: String) {
    val variant1 = option1
    val variant2 = option2
    val result1 = result1
    val result2 = result2

    fun print() {
        println(variant1)
        println(variant2)
    }

    fun chooseVariant() {
        val userInput = readLine()
        if (userInput != null) {
            if (userInput == "1") {
                println(result1)
            } else if (userInput == "2") {
                println(result2)
            }
        }
    }
}

class DayFirstBlueAndGreenChoice(option1: String, result1: String, result2: String) {
    val variant1 = option1
    val result1 = result1
    val result2 = result2

    init {
        println("Мы проснулись около 8 часов утра. За окном веяло свежестью, это не удивительно, ведь всю ночь шёл проливной дождь. Я медленно встал и побрёл по холодному коридору, все вокруг суетились, но тревожней всех были вожатые. Пока я стоял около умывальника мимо прошли ребята, они обсуждали пропажу Эдуарда.")
    }

    fun blueBranch() {
        println("Стоп… Что… Эдуард пропал?! В голове было столько мыслей, я не мог понять, как такое могло произойти, ведь он не их тех, кто любит доставлять неприятности. \n" +
                    "Я не был верующим, но в этот момент стал молиться всем богам, чтобы с Эдуардом всё было хорошо…\n")
        println(variant1)
        val userInput = readLine()
        if (userInput != null) {
            if (userInput == "1") {
                println(result1)
                println("На завтраке я познакомился с Мартой и Хазилем, они сами подсели ко мне, увидя, что я ем совсем один. Обычно я завтракал с Эдуардом… Они оказались забавными ребятами и сказали мне не преживать за Эдуарда, так как вероятного его забрали, как актёра квеста. Я немного успокоился.")
                val boringBranch = DayFirstBlueAndGreenChoice("0", "0", "0")
                boringBranch.yellowBranch()
            } else if (userInput == "2") {
                println(result2)
                println("На завтраке я познакомился с Мартой и Хазилем, они сами подсели ко мне, увидя, что я ем совсем один. Обычно я завтракал с Эдуардом… Они оказались забавными ребятами и сказали мне не преживать за Эдуарда, так как вероятного его забрали, как актёра квеста. Я немного успокоился.")
                greenBranch()
            }
        }
    }

    fun greenBranch() {
        println(
            "День был полон мероприятий и конкурсов, поэтому все утомились и уснули, только добравшись до кроватей. Но уже в 2 часа ночи мы стояли одетые на улице, усталость как рукой сняло, ведь нам предстояло пройти страшный квест в лесу, мы были в предкушении. \n" +
                    "Наш отряд вела Регина (Вадик скорее всего был где-то в лесу и готовился пугать нас), но как только за густыми деревьями скрылся главный корпус нашего лагеря, откуда-то сверху на нас спрыгнуло нечто горбатое в белой одежде, лица этого не было видно. \n" +
                    "Оно кричало и визжало, ужас охватил нас, у них получилось напугать нас, но это было только начало… Через мгновение это же горбатое существо прыгнуло на Регину и, закинув её на плечо, скрылось в лесу. Все были очень напуганы, но понимали, что это часть квеста, поэтому наш отряд быстро организовались и пошли на поиски Регины.\n" +
                    " Я шёл рядом с Хазилем и Мартой, когда заметил на ветке розовую паутинку.\n" +
                    "– Ребята, смотрите! Розовые нитки…\n" +
                    "– Эээээ, Август, это ты молодец!\n" +
                    "– Чшшшш, Хазиль, чего ты так орёшь!?\n" +
                    "– Прости, Марта. Я просто невероятно рад, ведь мы можем втроём найти Регину и стать героями отряда.\n" +
                    "– Хазиль, ты уверен, что это хорошая идея? Может лучше всем остальным расскажем?\n" +
                    "– Август, ты чё зассал?\n" +
                    "– Я не думала, что когда-нибудь соглашусь с Хазилем, но мы в любом случаи уже отстали от них, поэтому не вижу смысла спорить… \n" +
                    "И я пошёл с Мартой и Хазилем\n"
        )
        println(
            "Оказалось, что розовая нитка была растянута по всему лесу, это точно была подсказка, которую упустил весь отряд, кроме нас. Шли мы по ниточке долго, но она привела нас к цели. Мы услышали шорохи и пошли на цыпочках, какое же это было верное решение. Тихонько выглянув из кустов мы увидели то, к чему жизнь нас явно не готовила…\n" +
                    "На дереве на розовых колготках висела Регина… Она была вся синяя и не подавала даже малейших признаков жизни. Под деревом бродил горбатый, он потирал руки и жутко, даже как-то истерично посмеивался. Хазиль не выдержал и закричал, горбатый тут же обратил на нас внимание и вырвал из дерева окровавленный топор.\n" +
                    "Секунда… Взмах топора… но мы уже бежали, так быстро, что я даже не чувствовал земли под ногами. Но не пробежав и 20 метров, мы втроём повалились.\n" +
                    "– ААААААА\n" +
                    "– Что это было \n" +
                    "– МММММММ\n" +
                    "– Это Эдуард!!!!\n" +
                    "Под нами в одной куче лежал связанный Эдуард.\n"
        )
        println("1. Развязать")
        println("2. Убежать")
        val userInput = readLine()
        if (userInput != null) {
            if (userInput == "1") {
                println("Марта выхватыватила нож из кармана юбки, мы начинали распутывать Эдуарда. Но потратили на это слишком много времени, горбатый маньяк подбежал и со спины схватил Марту, нож выпал из её хрупких рук, на её лице читался только испуг, ни капли надежды на спасение. Ни я, ни Хазиль не могли пошевелиться, нас охватил ужас. \n" +
                        "Но тут Эдуард резким движением хватает нож с замли и бросается на горбатого, в этот же момент Марта кусает маньяка за руку, он выпускает её и тут же получает ножом в область живота.\n" +
                        "Хазиль хватает Марту за руку и убегает… Горбатый хватает за руку Эдуарда и ударяет по ней топором… руки как не бывало… я убежал…")
            } else if (userInput == "2") {
                println("Марта выхватила нож, но Хазиль схватил нас за руки и тут же побежал, а я… я даже не успел одуматься. Мы бежали быстро, но долго, на глазах наворачивались слёзы, мы слышали душераздирающий крик Эдуарда почти всё то время, что бежали… но мы даже не оглянулись…")
            }
        println("Утром мы ничего не обсуждали… просто собирали вещи, я слышал, как рыдали родители Эдуарда, как полицейские в поисках улик бродили по лесу, а я просто собирал вещи…")
        }
    }

    fun yellowBranch() {
    println("Мне не давала покоя мысль о Вадике в лесу. Я не знал стоит ли мне рассказывать об этом Марте и Хазилю.")
    println("1. Рассказать")
    println("2. Не рассказывать")
    val userInput = readLine()
    if (userInput != null) {
        if (userInput == "1") {
            println("– Ээээ, ребят, я всё не могу перестать думать о Эдуарде, ещё я видел в лесу кое-кого\n" +
                    "– Кого?\n" +
                    "– Вадика…\n" +
                    "– Ахах, ты действительно думаешь, что он в этом замешан… Я думаю, что в ходе квеста мы всё поймём.\n")
            println("Я не стал ничего говорить, но не был уверен идти ли мне на квест, не рассказав Регине")
            println("1. Рассказать Регине\n " +
                    "2. Не рассказывать")
            val userInput = readLine()
            if (userInput != null) {
                if (userInput == "1") {
                    println("– Я вот ещё подумал, может рассказать об этом Регине…\n" +
                            "– Август, ты серьёзно?\n" +
                            "– Стой, Хазиль, если его это действительно беспокоит, стоит прислушаться. Если тебе будет так спокойней расскажи…\n" +
                            "– Спасибо за поддержку, Марта, а то я правда себе места найти не могу)\n")
                    println("Я всё рассказал Регине, с её лица резко спала улыбка, я уточнил, всё ли хорошо, и она, уверив меня, что всё в порядке, пошла за телефоном. Уже к обеду в «Лесок» приехала полиция, они и нашли Эдуарда. Он был весь бледный (если быть ещё бледнее него вообще возможно) и ни с кем не разговаривал… \n" +
                            "А вечером за мной и другими ребятами приехали родители, они тоже ничего не сказали. По лагерю ходили слухи, что в лесу был маньяк, но я до сих пор не особо верю в эти слухи.")
                } else if (userInput == "2") {
                    println("Я не стал ничего говорить Регине...")
                    val yellowBranch1 = DayFirstBlueAndGreenChoice("0", "0", "0")
                    yellowBranch1.greenBranch()
                }
            }
        } else if(userInput == "2"){
            println("Я не стал ничего говорить, но не был уверен идти ли мне на квест")
            println("1. Идти на квест\n " +
                    "2. Не идти")
            val userInput = readLine()
            if (userInput != null) {
                if (userInput == "1") {
                    val yellowBranch = DayFirstBlueAndGreenChoice("0", "0", "0")
                    yellowBranch.greenBranch()
                }
            } else if (userInput == "2"){
                println("Я не пошёл на квест и не стал ничего никому говорить, у Регины я отпросился под предлогом того, что у меня ужасно болит живот. Я остался в корпусе и уснул. На утро я узнал, что Эдуард мёртв, его зарезали, как и Марту с Хазилем. Я хотел узнать, что произошло у Регины, но её нигде не было, позже я услышал, что её нашли… в лесу… подвешенной на дереве…")
            }
            println("Утром мы ничего не обсуждали… просто собирали вещи, я слышал, как рыдали родители Эдуарда, как полицейские в поисках улик бродили по лесу, а я просто собирал вещи…")
        }
    }
    }
}

fun redBranch() {
    println("На секунду я уже был готов идти знакомиться с людьми, но что-то надломилось во мне. Я встал поотдаль от того одинокого мальчика и ждал… не знаю чего, просто ждал.")
    firstCandleAndHorrorStory()
    val redcandle = Candlechoice("1.Познакомиться с Вадиком", "2.Остаться одному", "– Привет, ты ведь Август?)\n" +
            "– Д…да\n" +
            "– Ты же знаешь про ночной квест, мне нужна твоя помощь…\n" +
            "– Ночной квест? Я не слышал…\n" +
            "– Пойдём прогуляемся в лесу, я тебе всё подробнее расскажу.\n" +
            "– Но сейчас же отбой, я боюсь могут возникнуть проблемы)\n" +
            "– Не переживай, я же вожатый)\n", "Меня кланило в сон, я ни с кем не хотел разговаривать. Ещё тогда я заметил странный взгляд Вадика, мне стало не по себе, и я быстро ушёл к себе в комнату. Голова ужасно раскалывалась.")
    redcandle.print()
    redcandle.chooseVariant()
    val secondChoice = Choice("Я долго не мог уснуть, но только около 2 часов ночи я начал проваливаться в сон, дверь в комнату приоткрылась, я услышал тихие шаги в свою сторону. Это был Вадик, он потряс меня за плечо и сказал: «Пошли, мне нужна твоя помощь». Я быстро собрался, хотя и не хотел куда-либо идти.\n" +
            "Мы вышли из корпуса и молча пошли в сторону леса. Я пытался узнать, куда и зачем мы идём, но Вадик не был разговорчив, поэтому уже на 3 попытке я сдался. \n" +
            "В лесу было так тихо и темно, лишь редкие лучи полной луны освещали тропинки… В какой-то момент я понял, моя голова просто раскалывается от боли, ноги были ватными, я не был уверен, что смогу продолжить идти. Но стоило ли об этом говорить Вадику…\n" +
            "1. Сказать\n" + "2. Промолчать")
    secondChoice.print()
    secondChoice.chooseYourWay("Вадик повернулся ко мне, на его лице была странная тревожная улыбка: «Ничего страшного, у меня есть таблетки от головы… С одной стороны он мой вожатый, но с другой стороны его кривая улыбка вызывала недоверие. Я не был уверен, стоит ли мне брать таблетку.", " ",
        "Чем дальше мы заходили в лес, тем странее становилось поведенье Вадика. Он обкурился? Его предёргивало, он истерично посмеявился, потирал руки, постоянно облизывался… Я решил: надо бежать… но это не имело никакого смысла, ведь через мгновение он повалил меня на землю и сел сверху, левой рукой он схватил меня за руки, а правой запихивал мне в рот таблетку.\n" +
                "Я пытался выплюнуть и закричать, но он закрыл мне рот рукой и начал смеяться. \n" +
                "Дальше я помню только обрывками… топор в руках, крики детей, розовые нитки, боль в спине… Я очнулся привязанным к дереву с кляпом во рту, всё тело ломило, как будто я пробежал кросс, я попробовал пошевелиться, ничего не вышло, руки скользили, они все были в какой-то склизской жидкости… это была кровь.\n" +
                "Рядом сидел Вадик, он курил Chapman и продолжал мерзко улыбаться: «Спасибо, Август за помощь… Но ты тоже заставил меня попотеть ахах… \n" +
                "Извини, конечно, но мне придётся попращаться и с тобой». Он достал топор и резко ударил чуть выше ключиц… А я… я и не пытался сопративляться, я уже не хотел жить… ")
    if (COUNTOFYOURCHOICES > 0) {
        val thirdChoice = Choice("1. Взять \n" +
                "2. Не брать")
        thirdChoice.print()
        thirdChoice.chooseYourWay("Вадик протянул мне красную полупрозрачную таблетку, чем-то похожую на Нурофен, я успокоился и глотнул. Мы пошли дальше, но мне становилось только хуже, в глазах двоилось, шагать становилось тяжелее, я не мог даже звука… Дальше я помню только обрывками… топор в руках, крики детей, розовые нитки, боль в спине…", "",
        "Я отказался, но это не имело никакого смысла, ведь через мгновение он повалил меня на землю и сел сверху, левой рукой он схватил меня за руки, а правой запихивал мне в рот таблетку. Я пытался выплюнуть и закричать, но он закрыл мне рот рукой и начал смеяться. Дальше я помню только обрывками… топор в руках, крики детей, розовые нитки, боль в спине…\n")
        println("Я очнулся привязанным к дереву с кляпом во рту, всё тело ломило, как будто я пробежал кросс, я попробовал пошевелиться, ничего не вышло, руки скользили, они все были в какой-то склизской жидкости… это была кровь. Рядом сидел Вадик, он курил Chapman и продолжал мерзко улыбаться: «Спасибо, Август за помощь… Но ты тоже заставил меня попотеть ахах… \n" +
                "Извини, конечно, но мне придётся попращаться и с тобой». Он достал топор и резко ударил чуть выше ключиц… А я… я и не пытался сопративляться, я уже не хотел жить… \n")
    }
}