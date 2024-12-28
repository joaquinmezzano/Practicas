public class x021twoFer {
    public String twofer(String name) {
        return name == null ? "One for you, one for me." : "One for "+name+", one for me.";
    }
}

/*
Your task is to determine what you will say as you give away the extra cookie.

If you know the person's name (e.g. if they're named Do-yun), then you will say:

One for Do-yun, one for me.

If you don't know the person's name, you will say you instead.

One for you, one for me.

Here are some examples:
Name 	Dialogue
Alice 	One for Alice, one for me.
Bohdan 	One for Bohdan, one for me.
	One for you, one for me.
Zaphod 	One for Zaphod, one for me.
 */