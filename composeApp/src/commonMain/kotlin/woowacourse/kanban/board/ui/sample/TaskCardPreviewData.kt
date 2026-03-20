package woowacourse.kanban.board.ui.sample

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import woowacourse.kanban.board.model.Assignee
import woowacourse.kanban.board.model.Description
import woowacourse.kanban.board.model.Status
import woowacourse.kanban.board.model.Tag
import woowacourse.kanban.board.model.TagGroup
import woowacourse.kanban.board.model.TaskCard
import woowacourse.kanban.board.model.Title

class TaskCardPreviewData : PreviewParameterProvider<TaskCard> {
    override val values: Sequence<TaskCard> = sequenceOf(
        TaskCard(
            title = Title("LazyColumn 컴포넌트 구현"),
            description = Description("세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다."),
            tags = TagGroup(listOf(Tag("컴포넌트"), Tag("성능"))),
            assignee = Assignee("다이노"),
            status = Status.TODO,
        ),
        TaskCard(
            title = Title("Side-effect API 학습"),
            description = Description("LaunchedEffect, DisposableEffect 등의 API를 학습하고 적절한 사용 예제를 작성합니다."),
            tags = TagGroup(listOf(Tag("학습"), Tag("API"))),
            assignee = Assignee("페임스"),
            status = Status.TODO,
        ),
        TaskCard(
            title = Title("상태 관리 리팩토링"),
            description = Description("복잡한 상태를 효율적으로 관리하기 위한 구조를 설계합니다."),
            tags = TagGroup(listOf(Tag("리팩토링"), Tag("상태관리"))),
            assignee = Assignee("다이노"),
            status = Status.INPROGRESS,
        ),
        TaskCard(
            title = Title("리컴포지션 최적화"),
            description = Description("derivedStateOf와 key를 활용하여 불필요한 리컴포지션을 방지합니다."),
            tags = TagGroup(listOf(Tag("최적화"), Tag("성능"))),
            assignee = Assignee("다이노"),
            status = Status.DONE,
        ),
        TaskCard(
            title = Title("Mock API 설정"),
            description = Description("JSON 파일 또는 Mock API를 통해 초기 데이터를 로드하는 로직을 구현합니다."),
            tags = TagGroup(listOf(Tag("API"), Tag("비동기"))),
            assignee = Assignee("페임스"),
            status = Status.DONE,
        ),
        TaskCard(
            title = Title("Drag & Drop 기능 구현"),
            description = Description("카드를 드래그하여 다른 컬럼으로 이동할 수 있는 기능을 구현합니다."),
            tags = TagGroup(listOf(Tag("기능"), Tag("UX"))),
            assignee = Assignee("다이노"),
            status = Status.DONE,
        ),
    )
}
