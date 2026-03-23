package woowacourse.kanban.board.fixture

import woowacourse.kanban.board.model.Assignee
import woowacourse.kanban.board.model.Status
import woowacourse.kanban.board.model.Tag
import woowacourse.kanban.board.model.TaskCard

object TaskCardFixture {
    fun create() : TaskCard {
        return TaskCard(
            title = "제목입니다",
            description = "설명입니다",
            status = Status.TODO,
            tags = Tag(listOf("태그1", "태그2")),
            assignee = Assignee("다이노"),
        )
    }
}
