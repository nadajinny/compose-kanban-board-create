package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import woowacourse.kanban.board.model.Status
import woowacourse.kanban.board.model.TaskCard
import woowacourse.kanban.board.ui.sample.TaskCardPreviewData
import woowacourse.kanban.board.ui.taskForm.TaskCreateSection

@Preview(showBackground = true, widthDp = 1000, heightDp = 900)
@Composable
private fun KanbanBoardSectionPreview() {
    val taskCards = TaskCardPreviewData().values.toList()
    MaterialTheme {
        KanbanBoardSection(taskCards = taskCards)
    }
}

@Composable
fun KanbanBoardSection(taskCards: List<TaskCard>) {
    var showDialog by remember { mutableStateOf(false) }
    val snackBarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()

    val totalCount = taskCards.size
    val doneCount = taskCards.count { it.status == Status.DONE }

    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        androidx.compose.foundation.layout.Column(
            modifier = Modifier.fillMaxWidth(),
        ) {
            KanbanBoardHeaderSection(
                totalCount = totalCount,
                doneCount = doneCount,
                onCreateClick = { showDialog = true },
            )
            HorizontalDivider()
            KanbanBoardBodySection(taskCards)
        }

        if (showDialog) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.4f))
                    .clickable { showDialog = false },
            )

            Surface(
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxWidth(0.7f),
                shape = MaterialTheme.shapes.large,
                tonalElevation = 8.dp,
                shadowElevation = 12.dp,
            ) {
                TaskCreateSection(
                    onDismiss = { showDialog = false },
                    onCreate = {
                        showDialog = false
                        coroutineScope.launch {
                            snackBarHostState.showSnackbar(
                                message = "새 테스크가 생성되었습니다.",
                                duration = SnackbarDuration.Short,
                            )
                        }
                    },
                )
            }
        }

        SnackbarHost(
            hostState = snackBarHostState,
            modifier = Modifier
                .align(Alignment.BottomCenter),
        )
    }
}
