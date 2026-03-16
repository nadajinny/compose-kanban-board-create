package woowacourse.kanban.board.model

enum class Condition(val text: String = "To Do") {
    TODO("To Do"),
    INPROGRESS("In Progress"),
    DONE("Done"),
}
