case class TvShow(title: String, start: Int, end: Int) {

// 並べ変え
  def sortShows(shows: List[TvShow]): List[TvShow] = {
    shows.sortBy(tvShow => tvShow.end - tvShow.start).reverse
  }

// Listの解析
  def parseShows(rawShows: List[String]): List[TvShow] = {
    rawShows.map(parseShow)
  }

// 個別の解析
  def parseShow(rawShow: String): TvShow = {
    val bracketOpen = rawShow.indexOf('(')
    val bracketClose = rawShow.indexOf(')')
    val dash = rawShow.indexOf('-')

    val name = rawShow.substring(0, bracketOpen).trim()
    val yearStart = Integer.parseInt(rawShow.substring(bracketOpen + 1, dash))
    val yearEnd = Integer.parseInt(rawShow.substring(dash + 1, bracketClose))

    TvShow(name, yearStart, yearEnd)
  }

  val rawShows: List[String] = List(
    "Breaking Bad (2008-2013)",
    "The Wire (2002-2008)",
    "Mad Men (2007-2015)"
  )

  parseShows(rawShows)

  // 6.10
  val invalidRawShow = "Breaking Bad, 2008-2013"
  parseShow(invalidRawShow)

}
