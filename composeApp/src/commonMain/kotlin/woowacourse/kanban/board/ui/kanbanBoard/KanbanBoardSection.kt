package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import woowacourse.kanban.board.model.Status
import woowacourse.kanban.board.model.TaskCard
import woowacourse.kanban.board.ui.sample.TaskCardPreviewData

@Preview(showBackground = true)
@Composable
private fun KanbanBoardSectionPreview() {
    val taskCards = TaskCardPreviewData().values.toList()
    MaterialTheme {
        KanbanBoardSection(taskCards = taskCards)
    }
}

@Composable
fun KanbanBoardSection(taskCards: List<TaskCard>) {
    val totalCount = taskCards.size
    val doneCount = taskCards.count { it.status == Status.DONE }
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        KanbanBoardHeaderSection(totalCount,doneCount)
        HorizontalDivider()
        KanbanBoardBodySection(taskCards)
    }
}
