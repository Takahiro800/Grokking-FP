case class TvShow(title: String, start: Int, end: Int) {

// 並べ変え
  def sortShows(shows: List[TvShow]): List[TvShow] = {
    shows.sortBy(tvShow => tvShow.end - tvShow.start).reverse
  }

// 6.13 Optionを返す関数を実装する
  def parseShow(rawShow: String): Option[TvShow] = {
    for {
      name <- extractName(rawShow)
      yearStart <- extractYearStart(rawShow)
      yearEnd <- extractYearEnd(rawShow)
    } yield TvShow(name, yearStart, yearEnd)
  }

  def extractName(rawShow: String): Option[String] = {
    ???
  }

  def extractYearStart(rawShow: String): Option[Int] = {
    ???
  }

  def extractYearEnd(rawShow: String): Option[Int] = {
    ???
  }
}
