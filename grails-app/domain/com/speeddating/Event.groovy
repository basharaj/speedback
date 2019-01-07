package com.speeddating

class Event {

  String name

  Date eventDate

  String toString() {
    if (eventDate != null) {
      return name + " " + eventDate.format("MM/dd/yyyy")
    }
  }
}
