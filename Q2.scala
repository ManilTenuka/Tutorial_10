object WordProcessor extends App {

  def calculateTotalLetterCount(words: List[String]): Int = {
    val wordLengths = words.map(word => word.length)
    val totalLetterCount = wordLengths.reduce(_+_)
    totalLetterCount
  }

  val wordList = List("apple", "banana", "cherry", "date")
  val totalCount = calculateTotalLetterCount(wordList)

  println(s"Total count of letters: $totalCount")
}