package woowacourse.kanban.board.model

data class TaskCard(
    val title: String,
    val description: String = "",
    val status: Status,
    val tags: TagGroup = TagGroup(emptyList()),
    val assignee: String,
)
