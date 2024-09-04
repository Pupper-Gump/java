public class ConsoleColors {

    public static final String TEXT_RESET  = "\u001B[0m";
  
    public static final String TEXT_BLACK  = "\u001B[30m";
    public static final String TEXT_RED    = "\u001B[31m";
    public static final String TEXT_GREEN  = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE   = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN   = "\u001B[36m";
    public static final String TEXT_WHITE  = "\u001B[37m";
  
    public static final String TEXT_BRIGHT_BLACK  = "\u001B[90m";
    public static final String TEXT_BRIGHT_RED    = "\u001B[91m";
    public static final String TEXT_BRIGHT_GREEN  = "\u001B[92m";
    public static final String TEXT_BRIGHT_YELLOW = "\u001B[93m";
    public static final String TEXT_BRIGHT_BLUE   = "\u001B[94m";
    public static final String TEXT_BRIGHT_PURPLE = "\u001B[95m";
    public static final String TEXT_BRIGHT_CYAN   = "\u001B[96m";
    public static final String TEXT_BRIGHT_WHITE  = "\u001B[97m";
  
    public static final String TEXT_BG_BLACK  = "\u001B[40m";
    public static final String TEXT_BG_RED    = "\u001B[41m";
    public static final String TEXT_BG_GREEN  = "\u001B[42m";
    public static final String TEXT_BG_YELLOW = "\u001B[43m";
    public static final String TEXT_BG_BLUE   = "\u001B[44m";
    public static final String TEXT_BG_PURPLE = "\u001B[45m";
    public static final String TEXT_BG_CYAN   = "\u001B[46m";
    public static final String TEXT_BG_WHITE  = "\u001B[47m";
  
    public static final String TEXT_BRIGHT_BG_BLACK  = "\u001B[100m";
    public static final String TEXT_BRIGHT_BG_RED    = "\u001B[101m";
    public static final String TEXT_BRIGHT_BG_GREEN  = "\u001B[102m";
    public static final String TEXT_BRIGHT_BG_YELLOW = "\u001B[103m";
    public static final String TEXT_BRIGHT_BG_BLUE   = "\u001B[104m";
    public static final String TEXT_BRIGHT_BG_PURPLE = "\u001B[105m";
    public static final String TEXT_BRIGHT_BG_CYAN   = "\u001B[106m";
    public static final String TEXT_BRIGHT_BG_WHITE  = "\u001B[107m";
    
    public static final String[] ALL_COLORS = {TEXT_RESET, TEXT_BLACK, TEXT_RED, TEXT_GREEN, TEXT_YELLOW, TEXT_BLUE, TEXT_PURPLE, TEXT_CYAN, TEXT_WHITE, TEXT_BRIGHT_BLACK, TEXT_BRIGHT_RED, TEXT_BRIGHT_GREEN, TEXT_BRIGHT_YELLOW, TEXT_BRIGHT_BLUE, TEXT_BRIGHT_PURPLE, TEXT_BRIGHT_CYAN, TEXT_BRIGHT_WHITE, TEXT_BG_BLACK, TEXT_BG_RED, TEXT_BG_GREEN, TEXT_BG_YELLOW, TEXT_BG_BLUE, TEXT_BG_PURPLE, TEXT_BG_CYAN, TEXT_BG_WHITE, TEXT_BRIGHT_BG_BLACK, TEXT_BRIGHT_BG_RED, TEXT_BRIGHT_BG_GREEN, TEXT_BRIGHT_BG_YELLOW, TEXT_BRIGHT_BG_BLUE, TEXT_BRIGHT_BG_PURPLE, TEXT_BRIGHT_BG_CYAN, TEXT_BRIGHT_BG_WHITE};  

    public static boolean isValidColor(String color){
      for (String checker : ALL_COLORS) {
          if (color.equals(checker)) return true;
      }
      return false;
  }

  public void printColoredLine(String bgColor, String textColor, String toPrint) {
      System.out.println(buildColoredString(bgColor, textColor, toPrint));
  }

  public static String buildColoredString(String bgColor, String textColor, String str){
      String toReturn = "";
      if (bgColor != null && isValidColor(bgColor)) toReturn += bgColor;
      if (textColor != null && isValidColor(textColor)) toReturn += textColor;
      return toReturn + str + TEXT_RESET;
  }
  }