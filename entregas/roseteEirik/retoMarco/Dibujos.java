package roseteEirik.retoMarco;
import java.util.Scanner;

class Dibujos {
    public static void main(String[] args) {
        
        final String CLOUD_DIARY = """
           ____
         .(____),
        (____)___)
        """;
        final String STRONG_RAIN = """
         \\ \\ \\ \\ \\
        """;
        final String NORMAL_RAIN = """
         ` \\ ` ` \\ 
          ` ` ` \\ `
        """;
        final String BIG_CLOUD = """
              ,- -.- -.-, -.-.       .- -.-. -,- -.
             (     .   ;  .    )   (    :    ;   . )
           ,- -.- -.-, -.-,- -.- -.-,-,- -,-. -.-. -,- -.
          (     .   ;  .  (    :.    :   ;  . ) :    ;  . )    
         (  '_    _' '_ ;(  '_  '_    '_    ;  )  '_     ;  ) 
          '- - ( _ . _ .  : .  . ; ._ '  :  ;  . _ '_ ) - -'
                '- -~- -~-'' -~-'- -~- -'- -~-~ -'- -' 
        """;
        final String MONKEY_HAIR = " _,,,,,_";
        String monkeyMood;
        final String MONKEY_BODY = """
         (d .   . b)
           ( (Y) )
            |   |
         \\_(")_(")
        """;
        //3,1,3,4,1
        final String MARCO_HAIR = " CCCCCCO";
        String marcoMood;
        final String MARCO_BODY = """
         ( ^ c ^ )
          /||:||\\
         ° | _ | °
           || ||
          (_)(_)
        """;
        final String SHINY_SUN = """
                ;   :   ;
             .   \\_,!,_/   ,
              `.,'     `.,'
               /         \\
          ~ -- :         : -- ~
               \\         /
              ,'`._   _.'`.
             '   / `!` \\   `
                ;   :   ;         
        """;

        final String NORMAL_MONKEY = " (d .   . b)";
        final String TIRED_MONKEY = " (d ~   ~ b)";
        final String NAUGHTY_MONKEY = " (d >   < b)";
        final String FINAL_MONKEY = " (d ^   ^ b)";
        final String ANGRY_MARCO = " ( °`c´°')";
        final String NORMAL_MARCO = " ( ° c ° )";
        //2,1,2,1,3,2

        final String MOUNTAINS = """
                               .-.                 _ 
                              /   \\              _/ \\
                 _        .--'\\/\\_ \\            /    \\      ___
                / \\_    _/ ^      \\/\\'__       /\\/\\  /\\  __/   \\
               /    \\  /    .'   _/  /  \\     /    \\/  \\/ .`'\\_/\\
              /\\/\\  /\\/ :' __  ^/  ^/    `--./.'  ^  `-.\\ _    _:\\ _
             /    \\/  \\  _/  \\-' __/.' ^ _   \\_   .'\\   _/ \\ .  __/ \\
           /\\  .-   `. \\/     \\ / -.   _/ \\ -. `_/   \\ /    `._/  ^  \\
          /  `-.__ ^   / .-'.--'    . /    `--./ .-'  `-.  `-. `.  -  `.
         /        `.  / /      `-.   /  .-'   / .   .'   \\    \\  \\  .-  \\
         """;
        final String KILOMETERS = """
                    _______________
                    ..........1.........2.........3.........4.........5
                    012345678901234567890123456789012345678901234567890
                    000000000000000000000000000000000000000000000000000
        """;
        final String MOM_CARRIAGE = """
                                    ,--.----.----.
            ''.                   o'    '    '    '
            /´) '.___.-._.        /||    |    |    |
            '°~)-~-~-~-~)\\-~-~-~´<-_'._,_'._,_'.__,'
                ( .__.( /( \\'   \\   ,-.      ,-.   /
                /'\\_. /´ '> '    '-( o )----( o )-'
               /     /   ´          `-'      `-'  
        """;

        final String MINI_MOM_CARRIAGE = """
         ´?__,~~~.-,
         <!`´!  o'-o
        """;

        final String MINI_MARCO_AND_MONKEY = """
          ,,,,
          |^^|  @(")@   
         <[:']>   H~
        """;
/*
              ,- -.- -.-, -.-.       .- -.-. -,- -.
             (     .   ;  .    )   (    :    ;   . )
           ,- -.- -.-, -.-,- -.- -.-,-,- -,-. -.-. -,- -.
          (     .   ;  .  (    :.    :   ;  . ) :    ;  . )    
         (  '_    _' '_ ;(  '_  '_    '_    ;  )  '_     ;  ) 
          '- - ( _ . _ .  : .  . ; ._ '  :  ;  . _ '_ ) - -'
                '- -~- -~-'' -~-'- -~- -'- -~-~ -'- -' 
     
                             ;   :   ;
                          .   \_,!,_/   ,
                           `.,'     `.,'
                            /         \
                       ~ -- :         : -- ~
                            \         /
                           ,'`._   _.'`.
                          '   / `!` \   `
                             ;   :   ; 
                
                
           ` ` ` ` ` ` ` ` ` ` ` ` ` ` ` ` ` ` ` ` ` ` ` `     

                
                           CCCCCCO
           _,,,,,_        ( ^ c ^ )
         (d .   . b)       /||:||\\
           ( (Y) )        ° | _ | °
            |   |           || ||
         \\_(")_(")        (_)(_)

          _,,,,,_
        (d .   . b)
          ( (Y) ) 
          CCCCCCO
         ( ^ c ^ )
          /||:||\\
         ° | _ | °
           || ||
          (_)(_)
        """;
 */


        final String SUN = """   
            \\ | /
          '-.,-..-'
         -==(   )==-
          .-´`-'`-.
            / | \\
        """;

        final String HAPPY_ENDING = """
              _____ ___ _   _    _    _          _____ _____ _     ___ _____  _ 
             |  ___|_ _| \\ | |  / \\  | |        |  ___| ____| |   |_ _|__  / | |
             | |_   | ||  \\| | / _ \\ | |        | |_  |  _| | |    | |  / /  | |
             |  _|  | || |\\  |/ ___ \\| |___     |  _| | |___| |___ | | / /_  |_|
             |_|   |___|_| \\_/_/   \\_\\_____|    |_|   |_____|_____|___/____| (_) 

        """;


//SE PUEDEN USAR EL SIMBOLO DE GRADOS Y SI LOS IMPRIME
        System.out.print(CLOUD_DIARY);
        System.out.print(STRONG_RAIN);
        System.out.print(BIG_CLOUD);
        System.out.print(CLOUD_DIARY);
        System.out.print(NORMAL_RAIN);
        System.out.print("");
        System.out.print(MOM_CARRIAGE);
        System.out.print(SUN);
        System.out.print(HAPPY_ENDING);
        System.out.print(MINI_MOM_CARRIAGE);
        System.out.print(MINI_MARCO_AND_MONKEY);
        System.out.print(MOUNTAINS);
        System.out.print(SHINY_SUN);
    }
}
