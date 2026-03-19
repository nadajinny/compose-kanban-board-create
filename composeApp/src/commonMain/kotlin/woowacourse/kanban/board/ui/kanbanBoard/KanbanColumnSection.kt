package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.model.Status
import woowacourse.kanban.board.model.TaskCard
import woowacourse.kanban.board.ui.taskCard.TaskCardSection

@Composable
fun KanbanColumnSection(status: Status, tasks: List<TaskCard>) {
    Column {
        KanbanColumHeaderSection(status,tasks)
        KanbanColumnBodySection(tasks)
    }
}

@Composable
fun KanbanColumnBodySection(tasks: List<TaskCard>) {
    Column {
        tasks.forEach {
            TaskCardSection(it)
        }
    }
}


@Composable
fun KanbanColumHeaderSection(status: Status, tasks: List<TaskCard>) {
    Box {
        Row(
            modifier = Modifier.width(150.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(status.text)
            Text(tasks.size.toString())
        }
    }
}
