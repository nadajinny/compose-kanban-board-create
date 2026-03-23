package woowacourse.kanban.board.model

import woowacourse.kanban.board.util.ErrorMessage
import woowacourse.kanban.board.util.Text

data class Assignee(val name: String) {
    init {
        require(name.isNotBlank()) { ErrorMessage.ASSIGNEE_EMPTY }
    }
}
