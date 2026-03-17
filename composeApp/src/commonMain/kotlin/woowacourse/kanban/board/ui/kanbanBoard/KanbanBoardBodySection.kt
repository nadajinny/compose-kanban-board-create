package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import woowacourse.kanban.board.model.TaskCard
import woowacourse.kanban.board.ui.sample.TaskCardPreviewData
import woowacourse.kanban.board.ui.taskCard.TaskCardSection


@Preview(showBackground = true)
@Composable
fun TaskCardPreview(@PreviewParameter(TaskCardPreviewData::class) taskCard: TaskCard) {
    MaterialTheme {
        TaskCardSection(taskCard = taskCard)
    }
}

@Composable
fun KanbanBoardBodySection() {
    Row {
    }
}
