package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import woowacourse.kanban.board.model.TaskCard
import woowacourse.kanban.board.ui.sample.TaskCardPreviewData

@Preview(showBackground = true)
@Composable
private fun KanbanBoardSectionPreview(@PreviewParameter(TaskCardPreviewData::class) taskCard: TaskCard) {
    MaterialTheme{
        KanbanBoardSection(taskCard = taskCard)
    }
}

@Composable
fun KanbanBoardSection(taskCard: TaskCard) {
    Column {
        KanbanBoardHeaderSection()
        HorizontalDivider()
        KanbanBoardBodySection()
    }
}
