package com.uzhnu.training.samples.basics;

/**
 * <p> У цьому прикладі демонструється робота зі змінними і константами, різниця між примітивами і класами </p>
 *
 * @author Paul Danyliuk
 * @version $Id$
 */
public class VariablesApp {

    /*
    Будь-яка програма, що покликана виконувати якусь задачу, обов’язково працює із якимись даними, будь то числа
    (наприклад, програма для розв’язування рівнянь), текст (наприклад, програма для нотаток), чи щось взагалі
    значно складніше (наприклад, система керування фінансами великої корпорації).

    Дані, з якими програма може працювати «тут і зараз», знаходяться в оперативній пам’яті. Навіть якщо дані
    зберігаються на жорсткому диску або в Інтернеті, для операцій над ними вони принаймні частково завантажуються
    в оперативну пам’ять.

    Одиниці даних можуть мати різні типи: від простих (число, літера тощо) до трохи складніших (рядок [багато
    літер], правильний дріб [два числа] тощо), і до зовсім абстрактних і складних (людина, машина, компанія...).
    У програмуванні вони так і називаються - ТИПИ ДАНИХ.

    Найбільш атомарні, фундаментальні, неподільні типи даних - число, літера, логічне «так»/«ні» - називаються
    примітивними типами, або просто ПРИМІТИВАМИ. Складні типи даних, що складаються із примітивів і/або інших
    складних даних, зазвичай називаються СТРУКТУРАМИ.

    У Java роль структур відведена КЛАСАМ.

    Насправді, клас поняття набагато ШИРШЕ, ніж структура даних. Наприклад, у С++ класи і структури існують роздільно
    (хоча фактично різниця між ними незначна і скоріше семантична). Прийнято, що класи описують не тільки структуру
    даних, але і операції - МЕТОДИ - які можна здійснювати над ними...

    ...Але в деталях про класи і принципи об’єктно-орієнтованого програмування говоритимемо за кілька лекцій.

    ------------------------------------------------

    У переважній більшості мов ідентифікація одиниць даних здійснюється за допомогою ІМЕН (ідентифікаторів, символів).

    Основне завдання імен - полегшити роботу програміста. Коли програміст звертається до даних за одним і тим самим
    іменем (у даному контексті), він може бути певен, що звертається до одних і тих самих даних.

    У дуже низькорівневих мовах імен не було, і програмісту треба було пам’ятати номер комірки пам’яті або регістру
    процесора, де знаходяться необхідні дані. Погодьтеся, не круто.

    У загальному випадку, імена одиниць даних не несуть ніякого змісту для комп’ютера (компілятор заміняє їх на інші
    ідентифікатори, які забезпечать ефективніший доступ) і існують лише у коді програми. У окремих випадках вони мають
    значення (наприклад, для рефлексії, про що буде наша передостання лекція по Java).

    Гаразд, час писати приклади.
    */

    public static void main(String[] args) {

        // Java - типізована мова програмування. Це означає, що кожна одиниця даних або виділене під неї місце
        // має строго заданий тип даних, який не змінюється протягом часу їх життя.
        // У деяких мовах (напр., JavaScript, Ruby, PHP) такого обмеження немає - це мови із нестрогою типізацією.

        // -------------------------------------------------------------------------------------------------------------

        // Найбільш широко вживаним способом зберігання і доступу до даних є ЗМІННІ (variables), які оголошуються так:
        // <тип> <ім’я>
        int simpleInt;

        // Ми створили ЛОКАЛЬНУ змінну типу int (ціле 32-бітне число) із назвою simpleInt.
        // Локальна змінна - значить, що вона оголошена всередині блоку (в даному випадку - всередині метода main),
        // доступна всюди у цьому методі і у блоках всередині нього, живе доки не закінчиться main, і ми можемо
        // записувати у неї нові значення
        simpleInt = 10;
        System.out.println(simpleInt);        // 10

        simpleInt = 20;
        System.out.println(simpleInt);        // 20

        // Оголошення і присвоєння значення може здійснюватися одною інструкцією:
        int anotherSimpleInt = 2;

        // Або і кілька за раз (але так не рекомендується робити - код стає важче читати):
        int thirdInt = 3, fourthInt = 4;

        // Програма виконується рядок за рядком, а отже використовувати змінну можна ТІЛЬКИ ПІСЛЯ її оголошення:
//      badInt = 35;                 // тут буде помилка - Java ще не знає про існування int badInt...
//      int badInt;                  // ...а починаючи із цього рядка - знатиме

        // -------------------------------------------------------------------------------------------------------------

        // Коли ми знаємо, що значення змінюватися не буде, і хочемо, щоби програма лаялася, якщо ми випадково про це
        // забудемо і таки спробуємо його змінити, слід цю змінну зробити КОНСТАНТОЮ, себто сталою.
        // Щоб зробити змінну сталою, у Java необхідно приписати зліва від типу модифікатор final:
        final int constant;

        // Сталій можна призначити значення лише один раз:
        constant = 42;

        // Якщо ми спробуємо тепер змінити її значення:..
//      constant = 24;
        // ...то Java видасть нам помилку.

        // Слід мати на увазі, що Java ефективніше працює зі сталими, ніж зі змінними, але якщо забути зробити таку
        // змінну сталою, біди не буде - часто компілятор сам «побачить», що значення ніде не змінюється, і сприйматиме
        // змінну як final.

        // Ця стала теж є локальною для метода main.

        // -------------------------------------------------------------------------------------------------------------

        // У оголошених але ще не ініціалізованих ЛОКАЛЬНИХ змінних і константах немає значення, тож використати їх
        // не вийде:
        int emptyVarInt;
        final int emptyConstInt;

//      System.out.println(emptyVarInt);         // видасть помилку
//      System.out.println(emptyConstInt);       // видасть помилку

        // -------------------------------------------------------------------------------------------------------------

        // У Java всього 8 примітивних типів:
        //   byte, short, int, long - цілі числа (займають відповідно 8, 16, 32 і 64 біти незалежно від платформи)
        //   float, double - числа із плаваючою точкою (типу, дробні), 32- і 64-бітне відповідно
        //   boolean - має два значення - «так» і «ні» (true / false). Таким типом, наприклад, описується результат
        //             порівняння двох чисел: 5 > 2 поверне true, а -5 > -2 поверне false.
        //   char - один символ (напр. літера) Unicode, займає 16 біт. Сам по собі цей тип використовується дуже рідко,
        //          тому що програми зазвичай оперують одразу із рядками символів (не примітивний тип String)

        // Найчастіше із них використовуються int, double і bool
        int fingersOnHands = 10;
        double myAge = 23.1484375;      // мій вік у роках на день написання цього коду; зауважте, що
                                        // для відділення дробної частини від цілої використовується КРАПКА, а не кома.
        boolean amIAwesome = true;

        // Забігаючи наперед: Java старається здійснювати математичні операції в межах одного типу.
        // Тобто, якщо обидва операнди є int, результат операції теж буде int.
        // Якщо хоч один із них double, результат буде double:
        System.out.println(5 / 2);      // 2
                                        // 5 - ціле, і 2 - ціле, тому і результат буде не 2.5, а ціле
                                        // (все, що після крапки, ігнорується, а не округлюється)
        System.out.println(5 / 2.0);    // а ось так уже буде 2.5

        // Можна приводити змінні одного типу до іншого за допомогою ОПЕРАЦІЇ ПРИВЕДЕННЯ ТИПІВ (cast), яка записується:
        // (<бажаний тип>)(<вираз>)
        int myAgeInFullYears = (int) myAge;    // приведе double до int, відрізавши дробну частину
        System.out.println(myAgeInFullYears);  // 23

        System.out.println(2 / (fingersOnHands * 2));           // без приведення: 2 / 20 = 0:
                                                                // усі операнди - int, отже і результат буде int
        System.out.println(2 / (double)(fingersOnHands * 2));   // 2 / 20.0 = 0.1

        // НЕ ВСІ типи можна приводити між собою. Наприклад, із примітивів можна приводити тільки числа.

        // Детальніше про числові типи та їх мінімальні/максимальні можливі значення
        // - див. http://learnxinyminutes.com/docs/ru-ru/java-ru/

        // -------------------------------------------------------------------------------------------------------------

        // Змінні і константи НЕ примітивних типів оголошуються так само.
        // Просто назви таких типів (тобто назви класів) за правилами пишуться з великої літери і можуть бути майже
        // будь-які. У самій Java є чимало класів, але найкрутіше те, що Ви можете (і будете) створювати свої!

        // Мабуть, найчастіше вживаний не примітивний тип у Java - це рядок символів String
        String myName = "Павло";
        final String myFullName = "Данилюк Павло Сергійович";

        // Якщо у рядку потрібно використати подвійні лапки, або будь-який інший спецсимвол (наприклад, перенесення
        // рядка або відступ), його слід екранувати за допомогою оберненої косої риски:

        System.out.println("\tПавло \"Actine\" Данилюк\n\tFind your voice. Make a noise.");
        // Виведе у два рядки консолі:
        //     Павло "Actine" Данилюк
        //     Find your voice. Make a noise.

        // Трохи термінології:
        // Тип String є КЛАСОМ
        // Змінна myName і константа myFullName є ОБ’ЄКТАМИ КЛАСУ String (у деякій літературі - ЕКЗЕМПЛЯРАМИ класу)

        // Не варто плутати поняття «об’єкт (класу)» і власне сам клас Object, який є БАТЬКІВСЬКИМ для всіх інших класів
        System.out.println(myName instanceof String);    // true
        System.out.println(myName instanceof Object);    // true

        // ...але про це згодом. Просто якщо бачите, що якийсь метод приймає параметр Object, будьте спокійні, що туди
        // можна підставити об’єкт будь-якого класу

        // Приведення типів існує і у об’єктів, але призначене для іншого, і користуватися ним треба дуже обережно.
        // Деталі - через кілька лекцій.
        Object someObj = "Рядок як об’єкт";
        System.out.println(
                ((String) someObj).length()
        );                                               // 15

        // -------------------------------------------------------------------------------------------------------------

        // Можливо, ви вже здогадалися із коду, написаного вище, що Java сприймає числа, рядки і т.д. прямо з коду:
        System.out.println(myName);                // виведе рядок «Павло»
        System.out.println("Павло");               // теж виведе рядок «Павло»

        // Такі числа, рядки і т.д., які записані прямо в коді, називаються НЕІМЕНОВАНИМИ КОНСТАНТАМИ або ЛІТЕРАЛАМИ
        // (з англ. literal - буквальний).

        // Літерали використовуються прямо за місцем написання. Наприклад, їх можна передавати напряму у функції,
        // здійснювати над ними ті самі операції, що і над сталими такого ж типу,
        // і в т.ч. призначати їх ІМЕНОВАНИМ змінним чи константам, як показано вище.

        // Java сприймає такі типи літералів:
        System.out.println(10);                // int
        System.out.println(10L);               // long (літера l може бути малою, але її легше сплутати із 1)
        System.out.println(10.5);              // double - коли є точка
        System.out.println(10d);               //          або коли є суфікс d (D)
        System.out.println(10f);               // float - лише коли є суфікс f (F)
        System.out.println(10.5f);
        System.out.println(true);              // булеве true
        System.out.println(false);             // булеве false
        System.out.println('A');               // char (один символ у ОДИНАРНИХ лапках)
        System.out.println("Текст");           // String (текст у ПОДВІЙНИХ лапках)

        // Крім того, цілі числа (int і long) можна записувати у двійковій, вісімковій і шістнадцятковій системах:
        System.out.println(0b1000101);         // 69 - двійкові літерали починаються із 0b (або 0B, але плутається з 08)
        System.out.println(0567);              // 375 - вісімкові літерали починаються з нуля,
                                               // НЕ РЕКОМЕНДУЮТЬСЯ до вживання, тому що їх легко сплутати з десятковими
        System.out.println(0xDEADC0DE);        // -559038242 - шістнадцяткові починаються із 0x

        // Змінні, іменовані і неіменовані константи можна спокійно змішувати у виразах:
        System.out.println(simpleInt * constant - 25);

        // -------------------------------------------------------------------------------------------------------------

        // Як я вже казав, не примітивні типи у Java є класами, а отже у них можуть бути МЕТОДИ, через які можна
        // здійснювати різні операції з даними.

        // Наприклад, у рядка можна дістати довжину
        int nameLength = myName.length();            // 5

        // Або перевірити, що він не пустий
        boolean isNameEmpty = myName.isEmpty();      // false

        // Або замінити у повному імені слово Павло на Паша і перевірити, що довжина рядка стала меншою на 1
        System.out.println(
                myFullName.replace("Павло", "Паша").length() - myFullName.length()
        );                                                                                    // виведе -1

        // ВАЖЛИВО: метод replace НЕ ЗМІНЮЄ об’єкт myFullName, а створює новий.
        System.out.println(myFullName);      // досі виведе «...Павло Сергійович», а не «...Паша Сергійович»

        // До слова. Якщо хоч один метод здатен змінити стан об’єкта, такий об’єкт називається МУТАБЕЛЬНИМ.
        // Якщо ж усі методи повертають нові видозмінені об’єкти, то це немутабельні об’єкти.
        // У Java рядки немутабельні. У C++ мутабельні.
        // Але детальніше про це - потім.

        // Як ви уже здогадалися, методи об’єкта викликаються на ньому через крапку:
        // <ім’я об’єкта>.<ім’я метода>()
        // <ім’я об’єкта>.<ім’я метода>(<параметр1>, <параметр2>...)

        // А якщо спробувати викликати методи на неіменованих об’єктах?

        System.out.println("Слово".length());                      // 5

        // Працює!

        // -------------------------------------------------------------------------------------------------------------

        // У примітивів методів немає. На те вони і примітиви.

        // Зате у кожного примітивного типу є відповідний йому КЛАС-ОБГОРТКА:
        Integer intObject = 10;
        Double doubleObject = 2.5;
        Boolean boolObject = true;
        // а також Byte, Short, Long, Float, Character

        // і у обгортки є якісь методи:
        byte myByte = intObject.byteValue();                 // витягне із intObject значення 10 як byte

        // До Java 5 обгортати примітив у відповідний клас потрібно було так:..
        Integer anotherIntObject = new Integer(10);
        // ...а розгортати так:
        int unwrappedInt = anotherIntObject.intValue();

        // Починаючи із Java 5, обгортання (boxing) і розгортання (unboxing) робиться автоматично:
        Integer yetAnotherIntObject = 42;
        int unwrappedYetAnotherInt = yetAnotherIntObject;

        // ^ я щойно витратив впусту трохи електроенергії і дорогоцінного часу процесора.

        // Резюмуючи:
        // У Java трапляються методи і типи, які не працюють із примітивами, зате працюють із будь-якими об’єктами.
        // Там ці класи-обгортки і потрібні.
        // Проте зазвичай краще користуватися примітивами, тому що вони споживають ЗНАЧНО менше пам’яті, і вимагають
        // ЗНАЧНО менше операцій на процесорі.

        // -------------------------------------------------------------------------------------------------------------

        // Тепер ВКРАЙ ВАЖЛИВИЙ МОМЕНТ, який важко, але треба зрозуміти

        // У Java, усі змінні зберігаються і передаються ЗА ЗНАЧЕННЯМ
        // АЛЕ
        // у об’єктів це значення - ПОСИЛАННЯ НА НИХ У ПАМ’ЯТІ

        int a = 10;
        int b = a;              // у змінну b скопіювалося значення 10
        a = 15;                 // змінили значення a...
        System.out.println(b);  // ...b залишилося 10

        String s1 = "Hello";
        String s2 = s1;         // s1 і s2 вказують на ТУ САМУ АДРЕСУ В ПАМ’ЯТІ
                                // і якщо об’єкт зміниться, то і s1, і s2 теж зміняться
                                // (тому що вказуватимуть на той самий об’єкт)

        // Для ілюстрації використаємо мутабельний об’єкт, наприклад StringBuilder (дозволяє ліпити рядок із частин):
        StringBuilder builder1 = new StringBuilder();

        builder1.append("Привіт");
        StringBuilder builder2 = builder1;        // Присвоїмо змінній builder2 об’єкт builder1
        System.out.println(builder2);             // builder2 виведе слово «Привіт»

        builder1.append(", світе!");              // Допишемо слово у builder1...
        System.out.println(builder2);             // ...і builder2 виведе «Привіт, світе!»

        // Дивіться на це так:
        // Насправді s1, s2, builder1, builder2 - це числа, які вказують на комірку пам’яті.
        // Просто Java автоматично «ховає» присвоєне значення у цю комірку і витягає його при звертанні,
        // через що працювати із об’єктами у Java так же зручно, як і з примітивами.

        // Через це - ЩЕ ОДИН ВАЖЛИВИЙ МОМЕНТ:
        // Примітиви можна зрівнювати за допомогою операції порівняння ==
        System.out.println(b == 10);        // true

        // Об’єкти так зрівнювати НЕ МОЖНА, оскільки зрівнюватимуться їх АДРЕСИ У ПАМ’ЯТІ:
        System.out.println(s1 == "Hello");     // true...
                                               // а чому true? Я же сказав, що не можна? Начебто же спрацювало!
                                               // - а тому що компілятор побачив, що один і той самий рядковий літерал
                                               // використовується двічі, то нащо під нього двічі виділяти пам’ять?

        System.out.println(builder1.toString() == "Привіт, світе!");       // а ось це вже буде false

        // Для перевірки об’єктів на рівність між собою ВИКОРИСТОВУЙТЕ метод <об’єкт>.equals(<інший об’єкт>).
        // Метод equals() є у ВСІХ об’єктів. Для виклику слід вибирати той об’єкт, який завідомо не є null (ДИВ. НИЖЧЕ)

        System.out.println("Привіт, світе!".equals(builder1.toString()));  // «залізно» true

        // Довідка:
        // У С++ є поняття вказівників (pointers), і програміст сам має ховати і витягувати об’єкти із пам’яті,
        // а також слідкувати за тим, щоб не збивалася адресація і щоб не залізти у чужий об’єкт, адже там можна
        // працювати прямо із числами-адресами.

        // Коротше кажучи, пекло для студентів.

        // -------------------------------------------------------------------------------------------------------------

        // Так. Начебто порозуміли, що змінна чи константа для об’єкта - це посилання на нього у пам’яті.
        // Так от, це посилання може мати ПУСТЕ ЗНАЧЕННЯ. Вказувати в нікуди. Null:
        Object someNull = null;
        String nullString = null;
        Integer nullInteger = null;

        // null - вказівник у нікуди. Там немає об’єкта. І викликати у нього нічого не можна:

//      someNull.equals(null);      // програма вилетить із помилкою NullPointerException

        // Тільки перевірка на null здійснюється операціями порівняння == (дорівнює) і != (не дорівнює),
        // тому що порівнюються не об’єкти, а посилання (чи обидвоє вони не null):
        if (someNull == null) {
            // Якщо змінна пуста - виконати цей блок
            System.out.println("Змінна someNull є пустою");
        } else {
            // Якщо змінна ЗНЕНАЦЬКА не пуста - вивести її значення
            System.out.println(someNull.toString());
        }

        // Вітаю, ми розібрали те, що Вам необхідно знати про змінні!
    }

}