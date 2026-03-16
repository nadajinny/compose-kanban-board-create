package woowacourse.kanban.board.model

import woowacourse.kanban.board.util.Strings

enum class Condition(val text: String) {
    TODO(Strings.CONDITION_TODO),
    INPROGRESS(Strings.CONDITION_IN_PROGRESS),
    DONE(Strings.CONDITION_DONE),
}
