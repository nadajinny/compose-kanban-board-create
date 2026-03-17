package woowacourse.kanban.board.ui.sample

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import woowacourse.kanban.board.model.Condition
import woowacourse.kanban.board.model.Tag
import woowacourse.kanban.board.model.TaskCard

class TaskCardPreviewData : PreviewParameterProvider<TaskCard> {
    override val values: Sequence<TaskCard> = sequenceOf(
        TaskCard(
            title = "LazyColumn 컴포넌트 구현",
            description = "세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다.",
            tags = listOf(Tag("컴포넌트"), Tag("성능")),
            assignee = "다이노",
            condition = Condition.TODO,
        ),
        TaskCard(
            title = "LazyColumn 컴포넌트 구현",
            tags = listOf(Tag("컴포넌트"), Tag("성능")),
            assignee = "다이노",
            condition = Condition.TODO,
        ),
        TaskCard(
            title = "LazyColumn 컴포넌트 구현",
            description = "세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다.",
            assignee = "다이노",
            condition = Condition.TODO,
        ),
        TaskCard(
            title = "LazyColumn 컴포넌트 구현",
            assignee = "다이노",
            condition = Condition.TODO,
        ),
        TaskCard(
            title = "너무너무 긴 제목은 한 줄이지만 노출되고 말줄임표로 처리합니다",
            description = "너무너무너무 긴 설명은 두 줄까지만 노출하고 말줄임표로 처리합니다 두 줄까지만 노출하고 말줄임표로 처리합니다",
            tags = listOf(Tag("너무너무"), Tag("긴 태그"), Tag("최대로"), Tag("5자까지"), Tag("5개제한임")),
            assignee = "너무너무너무 긴 담당자도 한 줄이지만 노출되고 말줄임표로 처리합니다",
            condition = Condition.TODO,
        ),
    )
}
