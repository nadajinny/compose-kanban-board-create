package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import woowacourse.kanban.board.model.Status
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
        for(status in Status.entries) {
            KanbanColumnSection(status)
        }
    }
}
