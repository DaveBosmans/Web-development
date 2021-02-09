package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //--------------ANTWOORDEN OPDRACHT 1
//        Opdracht 1 - Basic Syntax
//
//        Voordat je Java kan gebruiken moet je de syntax kunnen begrijpen. Doe onderzoek naar de
//        volgende termen en leg uit wat ze (voor Java) betekenen:

//         Object: An object is a software bundle of variables and related methods. You can
//        represent real-world objects using software objects.

//        Class: A Class is like an object constructor, or a "blueprint" for creating objects.
//
//        Package: A package is a namespace that organizes a set of related classes and
//        interfaces.

//        Constructor: A constructor in Java is a special method that is used to initialize
//        objects. The constructor is called when an object of a class is created. It can be used
//        to set initial values for object attributes.

//        Instance: An object and an instance are the same thing.

//        Method: A method is a block of code which only runs when it is called.
//        You can pass data, known as parameters, into a method.
//        Methods are used to perform certain actions, and they are also known as functions.
//        Why use methods? To reuse code: define the code once, and use it many times.<br>
//                Class > Class Constructor > Method > Initialized

        //----------------EINDE OPDRACHT 1

//------------------ START OPDRACHT 2

//        Opdracht 2 - Variables
//
//        Ook variables werken in Java net iets anders dan je hiervoor misschien gewend bent. Java maakt onderscheid tussen 3 soorten variables:
//        Local variables
//        Instance variables
//        Class variables (ook wel Static variables genoemd)
//
//        Wat voor soort variabele je gebruikt hangt onder andere af van de plek waar je hem declareert .
//       a) Waar wordt een local variable gedeclareerd?
//        Local variables are declared in methods, constructors, or blocks.
//
//       Class/Static variables en Instance variables worden op dezelfde plek gedeclareerd, en houden ook allebei de gegevens van een Object bij.
//       b) Wat voor soort informatie sla je op in een instance variable?
//       Instance variables are declared in a class, but outside a method, constructor or any block.
//       Instance variables hold values that must be referenced by more than one method, constructor or block,
//       or essential parts of an object's state that must be present throughout the class.

//       c) Wat voor soort informatie sla je op in een class variable?
//        Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.
//        There would only be one copy of each class variable per class, regardless of how many objects are created from it.
//        These variables are mostly final and are non changing.
//
//       De waarde van een class variable kan je in principe ook opslaan in een instance variable.
//       d) Wat is het voordeel van het gebruiken van een class variable?
//       There's only one copy of that variable that is shared with all instances of that class.
//       If changes are made to that variable, all other instances will see the effect of the changes.
//
//        ---------------------EINDE OPDRACHT 2

// ------------ BEGIN OPDRACHT 3

//        Opdracht 3 - Access Control Modifiers
//        Java gebruikt zogenaamde modifiers om bepaalde eigenschappen van stukjes code te
//        veranderen. Deze zijn te verdelen in Access Control Modifiers en Non-Access Modifiers
//        De Access Control Modifiers zijn heel belangrijk om te begrijpen - die geven namelijk aan
//        welke onderdelen van je applicatie van het betreffende stukje code gebruik mogen maken.

//        Noem de vier verschillende Access Control Modifiers en geef bij elke een korte beschrijving.

//        Default Access Modifier : Any method or variable with default access modifier can be accessed from any class in a package.
//
//        Public Access Modifier : A public method or variable can be accessed in any class, even the class that belongs to a different package.
//                                 If a class belongs to a different package, we can import it using inheritance.
//
//        Protected Access Modifier : In a Protected Access Modifier, the keyword protected is used before a variable, method, and constructor.
//                No class can have protected access modifier.
//                Any variable, method, or constructor with a protected access modifier is only accessible within child classes or subclasses of superclasses in which it is declared.
//
//        Private Access Modifier : In a Private Access Modifier, the keyword private is used before variable, method, and constructor.
//                A class and interface cannot be private. A class can have private access modifier only if it is an inner class, i.e. a class is a member of another class.
//                Private provides the most restricted level of access. To access any variable or field outside of the class in which it is declared, setter and getter methods are used.
//                Getter methods are used to access the variable outside class, and setter methods are used to set values for these private fields in a class where these are declared.


//      ------------------------------------------EINDE OPDRACHT 3


// ------------ BEGIN OPDRACHT 4

//        Opdracht 4 - Non-Access Modifiers
//        Zoals bij de vorige opdracht vermeld stond, zijn er ook enkele Non-Access Modifiers. Het
//        grootste deel hiervan hoef je nog niet te kennen, maar de volgende twee wel:
//              ● Static
//              ● Final
//        Static ben je eerder al tegengekomen. Kan je ook uitleggen waar je Final voor zou gebruiken?
//        Once a final variable is initialized, you cannot change its value again.
//        Preventing the class from being subclassed could be particularly useful if you write APIs or libraries and want to avoid being extended to alter base behaviour.
//
//
//      ------------------------------------------EINDE OPDRACHT 4
//
//
//
// ------------ BEGIN OPDRACHT 5

//        Opdracht 5 - Strictly Typed
//        Er wordt in IT onderscheid gemaakt tussen programmeertalen die Strictly/Strongly Typed
//        zijn, en talen die Loosely/Weakly Typed zijn. Java is Strictly Typed - dit betekent dat je bij
//        elke variabele in Java een datatype moet declareren. Bij Loosely Typed programmeertalen
//        zoals JavaScript hoeft dit niet.

//                a) Wat is een voordeel van Strict Typing?
//        The advantage of strongly typed languages is that the compiler can detect when an object is being sent a message to which it does not respond.
//        This can prevent run-time errors. The other advantages of strong typing are: earlier detection of errors speeds development.

//                b) Wat is een voordeel van Weak Typing?
//        The advantage claimed of weak typing is that it requires less effort on the part of the programmer than strong typing,
//        because the compiler or interpreter implicitly performs certain kinds of conversions.
//

//      ------------------------------------------EINDE OPDRACHT 5

// ------------ BEGIN OPDRACHT 6

//        Opdracht 6 - main & Arrays
//        De main method van een Java class is de functie die wordt uitgevoerd als je een programma
//        draait. Dit zal er altijd zo uit zien:
//        Public & static heb je hiervoor gehad; die geven aan dat je main method toegankelijk is voor
//        iedereen, en dat deze voor elke Object van je class precies hetzelfde is.
//        void geeft aan dat er geen return value wordt verwacht. Bij de main method is dit verplicht!
//        Tenslotte nog Dit slaat op de naam en parameters.
//        Met String[] args geef je dus aan dat de parameters van de main method in een array zitten.
//        Dit array heet args (kort voor arguments) en bestaat enkel uit strings.

//        a) Kan je een reden bedenken waarom deze parameter verplicht is?
//        It's a String because the command line is expressed in text.
//        If you want to convert that text into integers or booleans,
//        you have to do that yourself - how would the operating system or Java bootstrapper know exactly how you wanted everything to be parsed?

//        System.out.println() wordt gebruikt om tekst weer te geven in de console. Voor debugging
//        doeleinden kan je dit net zo gebruiken als de console.log() command van JavaScript.
//        Arrays declareer je zo:

//        b) Kan je elementen van een Java Array veranderen?
//          Yes you can.
//        c) Kan je elementen aan een Java Array toevoegen?
//           No you can't,

//        Net als bij JavaScript worden Arrays vaak gebruikt in combinatie met Loops. In de volgende
//        opdracht gaan we hier verder op in.
//
        //      ------------------------------------------EINDE OPDRACHT 6


// ------------ BEGIN OPDRACHT 7

//        Theorie - Arrays in Arrays & ArrayLists
//        Met Java kan je gebruik maken van arrays in arrays. Java noemt deze 2-Dimensional Arrays.
//        Dit ziet er als volgt uit:
//        Bij de vorige opdracht heb je geleerd dat je de grootte van een Java Array niet aan kan
//        passen. Als je dit wel wil doen, moet je gebruik maken van een ArrayList.
//        Belangrijk! Voordat je een ArrayList kan gebruiken, moet je dat eerst in je eigen code
//        aangeven. Dit doe je door de ArrayList code te importeren.
//        Voorbeeld van een ArrayList:
//        Je importeert de code van een ArrayList dus uit de java.util package.
//
//
//      ------------------------------------------EINDE OPDRACHT 7
//
//
// ------------ BEGIN OPDRACHT 8

//        Opdracht 8 - Loops & Conditions
//        Loops werken in Java net zoals je dat in JavaScript gewend bent. Ook conditions zijn heel
//        erg vergelijkbaar. Er zijn hier en daar enkele kleine verschillen in de syntax, maar in gebruik
//        zijn ze vrijwel identiek.

//        Gegeven de volgende code:

//        a) Maak gebruik van een for loop om de eerste drie items uit het cars Array te printen.

//        b) Maak gebruik van een for-each loop om alle items uit het cars Array te printen.

//        Zoals je ziet is de ArrayList westcars nog leeg - nu gaan we die vullen.

//        c) Loop door het cars array en vergelijk deze met de items in het eastcars array. Als je
//        item niet in het eastcars array voor komt, voeg je hem toe aan het westcars array.
//
//        Vervolgens willen we onze Arrays en ArrayList mooi alfabetisch sorteren. Net als ArrayLists
//        is hier een class voor die je moet importeren uit de java.util package.
//        ● Als je een Array wil sorteren, moet je de Arrays class importeren
//        ● Als je een ArrayList wil sorteren, moet je de Collections class importeren.
//        d) Pas dit nu toe op de Arrays en ArrayLists die je hebt gemaakt



        String[] eastcars = {"Kia", "Honda"};
        String[] cars = {"Kia", "Volkswagen", "Renault", "Honda", "BMW"};
        ArrayList<String> westcars = new ArrayList<>();


        //      --------------  8a. -----------
//        for (var i = 0; i < 3; i++) {
//            System.out.println(cars[i]);
//        }

        //      --------------  8b. -----------

//        for (String car: cars) {
//            System.out.println(car);
//        }

//      --------------  8c. -----------

        
    }
}
