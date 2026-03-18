package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.model.TaskCard
import woowacourse.kanban.board.ui.sample.TaskCardPreviewData

@Preview(showBackground = true)
@Composable
private fun KanbanBoardSectionPreview() {
    val taskCards = TaskCardPreviewData().values.toList()
    MaterialTheme{
        KanbanBoardSection(taskCards = taskCards)
    }
}

@Composable
fun KanbanBoardSection(taskCards: List<TaskCard>) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        KanbanBoardHeaderSection()
        HorizontalDivider()
        KanbanBoardBodySection()
    }
}
