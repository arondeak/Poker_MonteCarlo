package arond.poker

import arond.poker.model.Model

object SimulationApp extends App {

  for (card <- Model.deck) println(s"$card")

  println(s"There are ${Model.deck.size} cards in the deck")
}