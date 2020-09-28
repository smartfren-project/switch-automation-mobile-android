package operation;

import constants.ObjectElement;
import org.openqa.selenium.By;

public class BaseQuest {

    public By imgAvatar = By.id(ObjectElement.QuestPagesObject.imgAvatar);

    public By txtPlayerName = By.id(ObjectElement.QuestPagesObject.txtPlayerName);

    public By btnMission = By.id(ObjectElement.QuestPagesObject.btnMission);

    public By btnProgress = By.id(ObjectElement.QuestPagesObject.btnProgress);

    public By btnGames = By.id(ObjectElement.QuestPagesObject.btnGames);

    public By btnRank = By.id(ObjectElement.QuestPagesObject.btnRank);

    public By btnCheckLoginQuest = By.id(ObjectElement.QuestPagesObject.btnCheckLoginQuest);

    public By btnSeeAll = By.id(ObjectElement.QuestPagesObject.btnSeeAllBigMission);

    public By btnLetsStartQuestWorld = By.id(ObjectElement.QuestPagesObject.btnLetsStartQuestWorld);

    public By btnCancelStartQuestWorld = By.id(ObjectElement.QuestPagesObject.btnCancelQuestWorld);
}
