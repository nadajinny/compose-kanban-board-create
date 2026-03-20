package woowacourse.kanban.board.ui.taskCard

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test
import woowacourse.kanban.board.model.Tag

@OptIn(ExperimentalTestApi::class)
class TagGroupSectionTest {
    @Test
    fun `태그 그룹 뷰는 비어있는 태그 그룹을 처리할 수 있다`() = runComposeUiTest {
        val tags = Tag(emptyList())

        setContent {
            TagGroupSection(tags = tags)
        }
    }

    @Test
    fun `태그 그룹 뷰는 하나 이상의 태그를 표시한다`() = runComposeUiTest {
        val tags = Tag(listOf("Front"))

        setContent {
            TagGroupSection(tags = tags)
        }

        onNodeWithText("Front").assertIsDisplayed()
    }

    @Test
    fun `태그 그룹 뷰는 5개 이하의 태그를 표시한다`() = runComposeUiTest {
        val tags = Tag(
            listOf(
                "1",
                "2",
                "3",
                "4",
                "5",
            ),
        )

        setContent {
            TagGroupSection(tags = tags)
        }

        onNodeWithText("1").assertIsDisplayed()
        onNodeWithText("2").assertIsDisplayed()
        onNodeWithText("3").assertIsDisplayed()
        onNodeWithText("4").assertIsDisplayed()
        onNodeWithText("5").assertIsDisplayed()
    }
}
