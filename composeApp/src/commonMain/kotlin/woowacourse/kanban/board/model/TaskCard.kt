package woowacourse.kanban.board.model

import woowacourse.kanban.board.util.ErrorMessage
import woowacourse.kanban.board.util.Text

data class TaskCard(
    val title: String,
    val description: String,
    val status: Status,
    val tags: Tag = Tag(emptyList()),
    val assignee: Assignee,
) {
    init {
        require(title.isNotBlank()) { ErrorMessage.TITLE_EMPTY }
    }
}
