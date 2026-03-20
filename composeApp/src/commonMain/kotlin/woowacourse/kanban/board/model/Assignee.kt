package woowacourse.kanban.board.model

import woowacourse.kanban.board.util.Text

data class Assignee(val name: String) {
    init {
        require(name.isNotBlank()) { Text.ERROR_ASSIGNEE_EMPTY }
    }
}
