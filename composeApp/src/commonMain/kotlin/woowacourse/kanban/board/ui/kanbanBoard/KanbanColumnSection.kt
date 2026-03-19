package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.model.Status
import woowacourse.kanban.board.ui.sample.TaskCardPreviewData

@Composable
fun KanbanColumnSection(status: Status) {
    Column {
        KanbanColumHeaderSection(status.text, 3)
    }
}


@Composable
fun KanbanColumHeaderSection(text: String, count: Int) {
    Box {
        Row(
            modifier = Modifier.width(150.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text)
            Text(count.toString())
        }
    }
}
