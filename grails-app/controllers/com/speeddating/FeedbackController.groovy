package com.speeddating

class FeedbackController {

  def generate() {

  }

  def generateReport() {
    User user = User.get(params.users)
    Event event = Event.get(params.events)
    if (user.gender.equals(User.Gender.FEMALE)) {
      List<FeedbackM2W> feedback = FeedbackM2W.findAllWhere(recipient: user, event: event)
      String htmlContent = new File('/Users/bashar/Desktop/speed_dating/speed_dating/grails-app/views/feedback/girl_report.html').text
      htmlContent = replace(htmlContent, "t m0 x0 ha y19 ff6 fsa fc6 sc0 ls2 ws2", user.name.split(/\s/)[0] + ",")
      htmlContent = replace(htmlContent, "t m0 x6 h6 ya ff3 fs6 fc3 sc0 ls0 ws0", feedback.findAll{it.wannaGoOutAgain}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x7 h6 yb ff3 fs6 fc3 sc0 ls0 ws0", feedback.findAll{it.wannaGoOutAgain}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x9 h6 ye ff3 fs6 fc3 sc0 ls0 ws0", feedback.findAll{it.positiveFirstImpression}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x9 h6 y15 ff3 fs6 fc3 sc0 ls0 ws0", feedback.findAll{it.firstImpressionChange == com.speeddating.FeedbackM2W.FirstImpressionChange.THREE}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x9 h6 y16 ff3 fs6 fc3 sc0 ls0 ws0", feedback.findAll{it.firstImpressionChange == com.speeddating.FeedbackM2W.FirstImpressionChange.FOUR}.size().toString())

      htmlContent = replace(htmlContent, "t m0 x0 hd y65 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackM2W.FirstImpression.ONE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y68 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackM2W.FirstImpression.TWO)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y6b ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackM2W.FirstImpression.THREE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y6e ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackM2W.FirstImpression.FOUR)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y72 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackM2W.FirstImpression.FIVE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y76 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackM2W.FirstImpression.SIX)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y79 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackM2W.FirstImpression.SEVEN)}.size().toString())

      htmlContent = replace(htmlContent, "t m0 x0 h10 y99 ff9 fs5 fc0 sc0 ls0 ws0", feedback.findAll {it.firstImpressionSpecifics}.collect{it.firstImpressionSpecifics}.join("\n\n"), 3)

      htmlContent = replace(htmlContent, "t m0 x0 hd y38 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.stoodOut.contains(FeedbackM2W.StoodOut.ONE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y3b ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.stoodOut.contains(FeedbackM2W.StoodOut.TWO)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y3e ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.stoodOut.contains(FeedbackM2W.StoodOut.THREE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y41 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.stoodOut.contains(FeedbackM2W.StoodOut.FOUR)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y44 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.stoodOut.contains(FeedbackM2W.StoodOut.FIVE)}.size().toString())

      htmlContent = replace(htmlContent, "t m0 x0 h10 y9e ff9 fs5 fc0 sc0 ls0 ws0", feedback.findAll {it.stoodOutSpecifics}.collect{it.stoodOutSpecifics}.join("\n\n"), 3)

      htmlContent = replace(htmlContent, "t m0 x0 hd y7e ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.style.contains(FeedbackM2W.Style.ONE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y81 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.style.contains(FeedbackM2W.Style.TWO)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y84 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.style.contains(FeedbackM2W.Style.THREE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y87 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.style.contains(FeedbackM2W.Style.FOUR)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y8a ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.style.contains(FeedbackM2W.Style.FIVE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y8a ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.style.contains(FeedbackM2W.Style.SIX)}.size().toString())

      htmlContent = replace(htmlContent, "t m0 xc hd y4c ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackM2W.HowISpoke.ONE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y4f ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackM2W.HowISpoke.TWO)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y52 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackM2W.HowISpoke.THREE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y55 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackM2W.HowISpoke.FOUR)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y58 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackM2W.HowISpoke.FIVE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y5b ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackM2W.HowISpoke.SIX)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y5e ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackM2W.HowISpoke.SEVEN)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y61 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackM2W.HowISpoke.EIGHT)}.size().toString())

      htmlContent = replace(htmlContent, "t m0 xc h10 ya3 ff9 fs5 fc0 sc0 ls0 ws0", feedback.findAll {it.howISpokeSpecifics}.collect{it.howISpokeSpecifics}.join("\n\n"), 3)

      htmlContent = replace(htmlContent, "t m0 xc hd y20 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackM2W.Vibe.ONE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y23 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackM2W.Vibe.TWO)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y26 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackM2W.Vibe.THREE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y29 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackM2W.Vibe.FOUR)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y2c ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackM2W.Vibe.FIVE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y2f ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackM2W.Vibe.SIX)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y32 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackM2W.Vibe.SEVEN)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xc hd y35 ff2 fsc fc2 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackM2W.Vibe.EIGHT)}.size().toString())

      htmlContent = replace(htmlContent, "t m0 xc h10 y48 ff9 fs5 fc0 sc0 ls0 ws0", feedback.findAll {it.vibeSpecifics}.collect{it.vibeSpecifics}.join("\n\n"), 3)

      htmlContent = replace(htmlContent, "t m0 x13 h17 ya7 ff4 fs13 fc0 sc0 ls0 ws0", "Stuff they found intriguing <span class=\"ffb\">about y<span class=\"_ _0\"></span>ou!:<span class=\"ff1 fc0\"><br /><br />${feedback.findAll{it.whatIntriguedYouAboutMe}.join("<br />")}</span></span>")
      htmlContent = replace(htmlContent, "t m0 x13 h18 ya8 ff4 fs13 fc0 sc0 ls0 ws0", "Stuff that raised <span class=\"ffc fc4\">red Flags</span> <span class=\"ffb\">for them: <br /><br /></span><span>${feedback.findAll({it.raiseAnyFlagsSpecifics}).join("<br />")}</span>")

      render text: htmlContent, contentType:"text/html", encoding:"UTF-8"
    } else {
      List<FeedbackW2M> feedback = FeedbackW2M.findAllWhere(recipient: user, event: event)
      String htmlContent = new File('/Users/bashar/Desktop/speed_dating/speed_dating/grails-app/views/feedback/boy_report_new.html').text
      htmlContent = replace(htmlContent, "t m0 x0 ha y1c ff7 fs9 fc2 sc0 ls8 ws5", user.name.split(/\s/)[0] + ",")
      htmlContent = replace(htmlContent, "t m0 x8 h7 yf ff3 fs6 fc2 sc0 ls0 ws0", feedback.findAll{it.wannaGoOutAgain}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x9 h7 y10 ff3 fs6 fc2 sc0 ls0 ws0", feedback.findAll{it.wannaGoOutAgain}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xb h7 y13 ff3 fs6 fc2 sc0 ls0 ws0", feedback.findAll{it.positiveFirstImpression}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xb h7 y1a ff3 fs6 fc2 sc0 ls0 ws0", feedback.findAll{it.firstImpressionChange == com.speeddating.FeedbackW2M.FirstImpressionChange.THREE}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xb h7 y1b ff3 fs6 fc2 sc0 ls0 ws0", feedback.findAll{it.firstImpressionChange == com.speeddating.FeedbackW2M.FirstImpressionChange.FOUR}.size().toString())

      htmlContent = replace(htmlContent, "t m0 x0 hd y6b ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackW2M.FirstImpression.ONE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y6e ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackW2M.FirstImpression.TWO)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y71 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackW2M.FirstImpression.THREE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y74 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackW2M.FirstImpression.FOUR)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y77 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackW2M.FirstImpression.FIVE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y7b ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackW2M.FirstImpression.SIX)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y7e ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.firstImpression.contains(FeedbackW2M.FirstImpression.SEVEN)}.size().toString())

      htmlContent = replace(htmlContent, "t m0 x0 h16 ya3 ffa fs5 fc1 sc0 ls0 ws0", feedback.findAll {it.firstImpressionSpecifics}.collect{it.firstImpressionSpecifics}.join("\n\n"), 3)

      htmlContent = replace(htmlContent, "t m0 x0 hd y20 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.stoodOut.contains(FeedbackW2M.StoodOut.ONE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y23 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.stoodOut.contains(FeedbackW2M.StoodOut.TWO)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y26 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.stoodOut.contains(FeedbackW2M.StoodOut.THREE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y29 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.stoodOut.contains(FeedbackW2M.StoodOut.FOUR)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y2c ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.stoodOut.contains(FeedbackW2M.StoodOut.FIVE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y30 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.stoodOut.contains(FeedbackW2M.StoodOut.SIX)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y33 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.stoodOut.contains(FeedbackW2M.StoodOut.SEVEN)}.size().toString())

      htmlContent = replace(htmlContent, "t m0 x0 h16 ya7 ffa fs5 fc1 sc0 ls0 ws0", feedback.findAll {it.stoodOutSpecifics}.collect{it.stoodOutSpecifics}.join("\n\n"), 3)

      htmlContent = replace(htmlContent, "t m0 x0 hd y84 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.style.contains(FeedbackW2M.Style.ONE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y87 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.style.contains(FeedbackW2M.Style.TWO)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y8a ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.style.contains(FeedbackW2M.Style.THREE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y8d ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.style.contains(FeedbackW2M.Style.FOUR)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y90 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.style.contains(FeedbackW2M.Style.FIVE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 x0 hd y93 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.style.contains(FeedbackW2M.Style.SIX)}.size().toString())

      htmlContent = replace(htmlContent, "t m0 xe hd y50 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackW2M.HowISpoke.ONE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y53 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackW2M.HowISpoke.TWO)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y56 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackW2M.HowISpoke.THREE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y59 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackW2M.HowISpoke.FOUR)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y5c ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackW2M.HowISpoke.FIVE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y60 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackW2M.HowISpoke.SIX)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y64 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackW2M.HowISpoke.SEVEN)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y67 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.howISpoke.contains(FeedbackW2M.HowISpoke.EIGHT)}.size().toString())

      htmlContent = replace(htmlContent, "t m0 xe h16 yad ffa fs5 fc1 sc0 ls0 ws0", feedback.findAll {it.howISpokeSpecifics}.collect{it.howISpokeSpecifics}.join("\n\n"), 3)

      htmlContent = replace(htmlContent, "t m0 xe hd y36 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackW2M.Vibe.ONE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y3a ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackW2M.Vibe.TWO)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y3d ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackW2M.Vibe.THREE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y40 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackW2M.Vibe.FOUR)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y44 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackW2M.Vibe.FIVE)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y47 ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackW2M.Vibe.SIX)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y4a ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackW2M.Vibe.SEVEN)}.size().toString())
      htmlContent = replace(htmlContent, "t m0 xe hd y4d ff6 fsc fc6 sc0 ls0 ws0", feedback.findAll {it.vibe.contains(FeedbackW2M.Vibe.EIGHT)}.size().toString())

      htmlContent = replace(htmlContent, "t m0 xe h16 yb1 ffa fs5 fc1 sc0 ls0 ws0", feedback.findAll {it.vibeSpecifics}.collect{it.vibeSpecifics}.join("\n\n"), 3)

      htmlContent = replace(htmlContent, "t m0 x14 h17 yaa ff4 fs13 fc1 sc0 ls0 ws0", "Stuff they found intriguing <span class=\"ffb\">about y<span class=\"_ _0\"></span>ou!:<span class=\"ff1 fc0\"><br /><br />${feedback.findAll{it.whatIntriguedYouAboutMe}.join("<br />")}</span></span>")
      htmlContent = replace(htmlContent, "t m0 x14 h18 yab ff4 fs13 fc1 sc0 ls0 ws0", "Stuff that raised <span class=\"ffc fc4\">red Flags</span> <span class=\"ffb\">for them: <br /><br /></span><span>${feedback.findAll({it.raiseAnyFlagsSpecifics}).join("<br />")}</span>")

      render text: htmlContent, contentType:"text/html", encoding:"UTF-8"
    }
  }

  private static String replace(String text, String id, String replacement, int stop = 1) {
    String greedyStop = "";
    for (int i = 0; i < stop; i++) {
      greedyStop += ".+?(?=</div>)"
    }
    return text.replaceAll("""(?<="${id}">)${greedyStop}""", replacement)
  }
}
