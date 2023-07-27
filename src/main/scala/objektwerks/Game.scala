package objektwerks

import indigo.*

import scala.scalajs.js.annotation.JSExportTopLevel

@JSExportTopLevel("Game")
object Game extends IndigoSandbox[Unit, Unit]:
  val config: GameConfig = GameConfig.default

  val animations: Set[Animation] = Set()

  val assetName = AssetName("dots")

  val assets: Set[indigo.AssetType] = Set(
    AssetType.Image(assetName, AssetPath("assets/dots.png"))
  )

  val fonts: Set[FontInfo] = Set()

  val shaders: Set[Shader] = Set()

  def setup(assetCollection: AssetCollection, dice: Dice): Outcome[Startup[Unit]] = Outcome(Startup.Success(()))

  def initialModel(startupData: Unit): Outcome[Unit] = Outcome(())

  def updateModel(context: FrameContext[Unit], model: Unit): GlobalEvent => Outcome[Unit] = _ => Outcome(())

  def present(context: FrameContext[Unit], model: Unit): Outcome[SceneUpdateFragment] =
    Outcome(
      SceneUpdateFragment.empty
    )