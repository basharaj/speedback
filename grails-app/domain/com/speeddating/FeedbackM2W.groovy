package com.speeddating

class FeedbackM2W {

  User provider
  static belongsTo = [recipient: User, event: Event]
  static hasMany = [firstImpression: FirstImpression, stoodOut: StoodOut, style: Style, howISpoke: HowISpoke, vibe: Vibe]

  static constraints = {
    recipient validator: {
      if (!it.gender.equals(User.Gender.FEMALE)) return 'girl'
    }
    provider validator: {
      if (!it.gender.equals(User.Gender.MALE)) return 'boy'
    }
    event()

    firstImpression()
    firstImpressionSpecifics blank:true, nullable: true, widget: 'textarea'

    stoodOut()
    stoodOutSpecifics blank:true, nullable: true, widget: 'textarea'

    style()
    styleSpecifics blank:true, nullable: true,  widget: 'textarea'

    positiveFirstImpression()
    firstImpressionChange()

    howISpoke()
    howISpokeSpecifics blank: true, nullable: true,  widget: 'textarea'

    vibe()
    vibeSpecifics blank:true, nullable: true,  widget: 'textarea'

    whatIntriguedYouAboutMe blank: true, nullable: true, widget: 'textarea'

    raiseAnyFlags()
    raiseAnyFlagsSpecifics blank: true, nullable: true, widget: 'textarea'

    wannaGoOutAgain()
    contact()
  }

  String toString() {
    return id.toString()
  }

  private Set<FirstImpression> firstImpression;
  private String firstImpressionSpecifics;

  private Set<StoodOut> stoodOut;
  private String stoodOutSpecifics;

  private Set<Style> style;
  private String styleSpecifics;

  private boolean positiveFirstImpression;

  private FirstImpressionChange firstImpressionChange;

  private Set<HowISpoke> howISpoke;
  private String howISpokeSpecifics

  private Set<Vibe> vibe;
  private String vibeSpecifics;

  private String whatIntriguedYouAboutMe;
  private boolean raiseAnyFlags;
  private String raiseAnyFlagsSpecifics;

  private boolean wannaGoOutAgain;

  private Contact contact;

  Set<FirstImpression> getFirstImpression() {
    return firstImpression
  }

  void setFirstImpression(Set<FirstImpression> firstImpression) {
    this.firstImpression = firstImpression
  }

  String getFirstImpressionSpecifics() {
    return firstImpressionSpecifics
  }

  void setFirstImpressionSpecifics(String firstImpressionSpecifics) {
    this.firstImpressionSpecifics = firstImpressionSpecifics
  }

  Set<StoodOut> getStoodOut() {
    return stoodOut
  }

  void setStoodOut(Set<StoodOut> stoodOut) {
    this.stoodOut = stoodOut
  }

  String getStoodOutSpecifics() {
    return stoodOutSpecifics
  }

  void setStoodOutSpecifics(String stoodOutSpecifics) {
    this.stoodOutSpecifics = stoodOutSpecifics
  }

  Set<Style> getStyle() {
    return style
  }

  void setStyle(Set<Style> style) {
    this.style = style
  }

  String getStyleSpecifics() {
    return styleSpecifics
  }

  void setStyleSpecifics(String styleSpecifics) {
    this.styleSpecifics = styleSpecifics
  }

  boolean getPositiveFirstImpression() {
    return positiveFirstImpression
  }

  void setPositiveFirstImpression(boolean positiveFirstImpression) {
    this.positiveFirstImpression = positiveFirstImpression
  }

  FirstImpressionChange getFirstImpressionChange() {
    return firstImpressionChange
  }

  void setFirstImpressionChange(FirstImpressionChange firstImpressionChange) {
    this.firstImpressionChange = firstImpressionChange
  }

  Set<HowISpoke> getHowISpoke() {
    return howISpoke
  }

  void setHowISpoke(Set<HowISpoke> howISpoke) {
    this.howISpoke = howISpoke
  }

  String getHowISpokeSpecifics() {
    return howISpokeSpecifics
  }

  void setHowISpokeSpecifics(String howISpokeSpecifics) {
    this.howISpokeSpecifics = howISpokeSpecifics
  }

  Set<Vibe> getVibe() {
    return vibe
  }

  void setVibe(Set<Vibe> vibe) {
    this.vibe = vibe
  }

  String getVibeSpecifics() {
    return vibeSpecifics
  }

  void setVibeSpecifics(String vibeSpecifics) {
    this.vibeSpecifics = vibeSpecifics
  }

  String getWhatIntriguedYouAboutMe() {
    return whatIntriguedYouAboutMe
  }

  void setWhatIntriguedYouAboutMe(String whatIntriguedYouAboutMe) {
    this.whatIntriguedYouAboutMe = whatIntriguedYouAboutMe
  }

  boolean getRaiseAnyFlags() {
    return raiseAnyFlags
  }

  void setRaiseAnyFlags(boolean raiseAnyFlags) {
    this.raiseAnyFlags = raiseAnyFlags
  }

  String getRaiseAnyFlagsSpecifics() {
    return raiseAnyFlagsSpecifics
  }

  void setRaiseAnyFlagsSpecifics(String raiseAnyFlagsSpecifics) {
    this.raiseAnyFlagsSpecifics = raiseAnyFlagsSpecifics
  }

  boolean getWannaGoOutAgain() {
    return wannaGoOutAgain
  }

  void setWannaGoOutAgain(boolean wannaGoOutAgain) {
    this.wannaGoOutAgain = wannaGoOutAgain
  }

  Contact getContact() {
    return contact
  }

  void setContact(Contact contact) {
    this.contact = contact
  }

  public enum FirstImpression {
    ONE("Hey Good Looking"),
    TWO("Love your beautiful smile"),
    THREE("I am in love with the shape of you"),
    FOUR("Nice but who put together your outfit"),
    FIVE("Not dressed appropriately for the venue"),
    SIX("I am not sure I can afford you "),
    SEVEN("F, for Effort! Do you even want to do this?"),

    private final String value;

    FirstImpression(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    public String toString() {
      return value;
    }

    public String getKey() { name() }
  }

  public enum StoodOut {
    ONE("You smell intoxicating"),
    TWO("So warm and friendly, gave me the fuzzies"),
    THREE("Relax, let your guard down"),
    FOUR("Am I already in the friend zone?"),
    FIVE("Did you forget the deodorant or did you shower in perfume"),

    private final String value;

    StoodOut(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    public String toString() {
      return value;
    }

    public String getKey() { name() }

  }

  public enum Style {
    ONE("Classy and Confident"),
    TWO("Conservative"),
    THREE("High Maintenance"),
    FOUR("Party Girl"),
    FIVE("Hippie Chick"),
    SIX("Fitness Junkie"),

    private final String value;

    Style(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    public String toString() {
      return value;
    }

    public String getKey() { name() }

  }

  public enum FirstImpressionChange {
    ONE("Yes"),
    TWO("No"),
    THREE("For better"),
    FOUR("For worse"),

    private final String value;

    FirstImpressionChange(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    public String toString() {
      return value;
    }
  }

  public enum HowISpoke {
    ONE("You made me laugh"),
    TWO("You are intelligent and confident"),
    THREE("It was easy to talk to you"),
    FOUR("I wished I got the chance to speak too"),
    FIVE("You didn’t tell me much about you"),
    SIX("Too much info, too soon!!"),
    SEVEN("Debbie, Mr. Downer went that way"),
    EIGHT("You don’t talk, money does"),

    private final String value;

    HowISpoke(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    public String toString() {
      return value;
    }

    public String getKey() { name() }

  }

  public enum Vibe {
    ONE("Your confidence adds to your appeal"),
    TWO("Warm, fun, and playful!"),
    THREE("Wonderful eye contact"),
    FOUR("Stop fidgeting, you are fine! :)"),
    FIVE("Slouching makes you small"),
    SIX("All eyes everywhere but on me"),
    SEVEN("You seem stiff, relax"),
    EIGHT("You looked bored to death"),

    private final String value;

    Vibe(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    public String toString() {
      return value;
    }

    public String getKey() { name() }

  }

  public enum Contact {
    ONE("Email"),
    TWO("Phone Number"),
    THREE("Email and Phone Number")

    private final String value;

    Contact(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    public String toString() {
      return value;
    }
  }
}
