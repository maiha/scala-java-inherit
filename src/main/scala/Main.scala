import org.apache.commons.mail.{ Email => JavaEmail }

/* (aka. JavaEmail)
public abstract class Email
{
  protected List<InternetAddress> toList = new ArrayList<InternetAddress>();
}
 */

abstract class ScalaEmail {
  protected val toList = List[String]()
}

trait ScalaTrait { this: ScalaEmail =>
  def getList = toList
}
trait JavaTrait { this: JavaEmail =>
  def getList = toList
}

class ScalaChild extends ScalaEmail with ScalaTrait
class JavaChild  extends JavaEmail  with JavaTrait {
  def setMsg(body: String) = ???
}

object Main {
  def main(args: Array[String]) {
    println((new ScalaChild).getList)
    println((new JavaChild).getList)
  }
}
