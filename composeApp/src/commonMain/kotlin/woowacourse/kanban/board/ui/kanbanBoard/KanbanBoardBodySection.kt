package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import woowacourse.kanban.board.model.Status
import woowacourse.kanban.board.model.TaskCard
import woowacourse.kanban.board.ui.sample.TaskCardPreviewData

@Preview(showBackground = true)
@Composable
private fun KanbanBoardBodySectionPreview() {
    val taskCards = TaskCardPreviewData().values.toList()
    MaterialTheme {
        KanbanBoardBodySection(taskCards = taskCards)
    }
}

@Composable
fun KanbanBoardBodySection(taskCards: List<TaskCard>) {
    Row{
        for (status in Status.entries) {
            val taskByStatus = taskCards.filter { it.status == status }
            KanbanColumnSection(status, taskByStatus)
        }
    }
}
