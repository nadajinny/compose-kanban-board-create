package woowacourse.kanban.board

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import woowacourse.kanban.board.model.Condition
import woowacourse.kanban.board.model.Tag
import woowacourse.kanban.board.model.TaskCard
import woowacourse.kanban.board.ui.sample.TaskCardPreviewData
import woowacourse.kanban.board.ui.taskCard.TaskCardSection
import woowacourse.kanban.board.ui.taskForm.TaskCreateSection


@Preview(showBackground = true)
@Composable
fun TaskCardPreview(@PreviewParameter(TaskCardPreviewData::class) taskCard: TaskCard) {
    MaterialTheme {
        TaskCardSection(taskCard = taskCard)
    }
}

@Preview(showBackground = true)
@Composable
fun App() {
//    FlowRow(
//        horizontalArrangement = Arrangement.spacedBy(15.dp),
//        verticalArrangement = Arrangement.spacedBy(15.dp),
//        modifier = Modifier.padding(20.dp),
//    ) {
//        TaskCardProvider().values.forEach { taskCard ->
//            TaskCardSection(taskCard = taskCard)
//        }
//    }

    MaterialTheme {
        TaskCreateSection()
    }
}
