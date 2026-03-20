package woowacourse.kanban.board.model

data class TaskCard(
    val title: Title,
    val description: Description,
    val status: Status,
    val tags: TagGroup = TagGroup(emptyList()),
    val assignee: Assignee,
)
