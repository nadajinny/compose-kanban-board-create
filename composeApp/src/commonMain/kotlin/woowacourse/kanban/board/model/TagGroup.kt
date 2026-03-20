package woowacourse.kanban.board.model

data class TagGroup(val tags: TagGroup) {
    fun isEmpty(): Boolean {
        return tags.isEmpty()
    }

    companion object {
        const val MAXIMUM_TAG_COUNT = 5
    }
}
