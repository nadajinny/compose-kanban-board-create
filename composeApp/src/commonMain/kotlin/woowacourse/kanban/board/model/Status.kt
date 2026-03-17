package woowacourse.kanban.board.model

import woowacourse.kanban.board.util.Text

enum class Status(val text: String) {
    TODO(Text.STATUS_TODO),
    INPROGRESS(Text.STATUS_IN_PROGRESS),
    DONE(Text.STATUS_DONE),
}
