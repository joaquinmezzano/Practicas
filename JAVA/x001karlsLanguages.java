package JAVA;
import java.util.ArrayList;
import java.util.List;

/*Karl wants to keep track of a list of languages to learn on Exercism's website. 
Karl needs to be able to add new languages, remove old ones and check if certain languages are in the list. 
It would be very exciting if Karl wants to learn Java or Kotlin!*/

public class x001karlsLanguages {
    private final List<String> languages = new ArrayList<>();

    /*Karl needs to know if his list of languages ever becomes empty, so he can go find more to learn! 
    Define a method called isEmpty which returns true if there are no languages in the list.*/

    public boolean isEmpty() {
        return languages.size() == 0;
    }
    
    /*Karl is looking forward to learning Kotlin and Python! Help Karl get started by defining a method 
    called addLanguage which takes the language he wants to learn and adds it to the list.*/

    public void addLanguage(String language) {
        languages.add(language);
    }
    
    /*Karl decided he does not want to learn Scala right now. Help Karl remove it from the list by defining
     a method called removeLanguage which takes the language he is removing and removes it from the list.*/

    public void removeLanguage(String language) {
        languages.remove(language);
    }
    
    /*Karl wants to remember the first language he added to the list (that is still in the list). 
    Define a method called firstLanguage that returns the first language in the list.*/

    public String firstLanguage() {
        return languages.get(0);
    }
    
    /*Karl needs to know how many languages he is trying to learn. 
    Help Karl find the answer by defining a method called count which returns the number of languages in the list.*/

    public int count() {
        return languages.size();
    }
    
    /*Karl is trying to remember if he wanted to learn Python or Ruby. 
    Define a method called containsLanguage which takes the language he is asking about so Karl can find out!*/

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }
    
    /*If Karl wants to learn Java or Kotlin, that is very exciting! 
    Define a method called isExciting that returns true if Karl wants to learn Java or Kotlin.*/

    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}