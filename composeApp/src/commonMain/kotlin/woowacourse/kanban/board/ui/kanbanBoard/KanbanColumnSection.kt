package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import woowacourse.kanban.board.model.Status

@Composable
fun KanbanColumnSection(status : Status) {
    Column {
        Row {
            Text(status.text)
            Text("3")
        }
    }
}
