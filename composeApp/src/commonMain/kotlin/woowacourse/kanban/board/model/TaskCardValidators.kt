package woowacourse.kanban.board.model

import woowacourse.kanban.board.util.ErrorMessage
import woowacourse.kanban.board.util.Text

object TaskCardValidators {
    fun validateTitle(text: String): Result<String> {
        return if (text.isNotBlank()) {
            Result.success(text)
        } else {
            Result.failure(IllegalArgumentException(ErrorMessage.TITLE_EMPTY))
        }
    }

    fun validateAssignee(name: String): Result<Assignee> {
        return if (name.isNotBlank()) {
            Result.success(Assignee(name))
        } else {
            Result.failure(IllegalArgumentException(ErrorMessage.ASSIGNEE_EMPTY))
        }
    }

    fun validateTag(text: String): Result<String> {
        return when {
            text.isBlank() -> Result.failure(IllegalArgumentException(ErrorMessage.TAG_EMPTY))
            text.length > Tag.MAXIMUM_TAG_LENGTH -> Result.failure(
                IllegalArgumentException(ErrorMessage.tagTooLong(Tag.MAXIMUM_TAG_LENGTH)),
            )
            else -> Result.success(text)
        }
    }

    fun validateTagGroup(tags: List<String>): Result<Tag> {
        return runCatching { Tag(tags) }
    }
}
