package woowacourse.kanban.board.model

object TaskCardValidators {
    fun validateTitle(text: String): Result<Title> {
        return if (text.isNotBlank()) {
            Result.success(Title(text))
        } else {
            Result.failure(IllegalArgumentException("[ERROR] 제목은 빈 값일 수 없습니다."))
        }
    }

    fun validateAssignee(name: String): Result<Assignee> {
        return if (name.isNotBlank()) {
            Result.success(Assignee(name))
        } else {
            Result.failure(IllegalArgumentException("[ERROR] 담당자는 빈 값일 수 없습니다."))
        }
    }

    fun validateTag(text: String): Result<Tag> {
        return when {
            text.isBlank() -> Result.failure(IllegalArgumentException("[ERROR] 태그 텍스트는 빈 값일 수 없습니다."))
            text.length > Tag.MAXIMUM_TAG_LENGTH -> Result.failure(
                IllegalArgumentException("[ERROR] 태그 텍스트는 ${Tag.MAXIMUM_TAG_LENGTH}글자 이하여야 합니다."),
            )
            else -> Result.success(Tag(text))
        }
    }

    fun validateTagGroup(tags: List<Tag>): Result<TagGroup> {
        return if (tags.size <= TagGroup.MAXIMUM_TAG_COUNT) {
            Result.success(TagGroup(tags))
        } else {
            Result.failure(IllegalArgumentException("[ERROR] 태그 개수는 ${TagGroup.MAXIMUM_TAG_COUNT}개 이하여야합니다."))
        }
    }
}
