package woowacourse.kanban.board.ui.kanbanBoard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.util.ColorPalette
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

@Preview(showBackground = true)
@Composable
fun KanbanBoardHeaderSectionPreview() {
    val totalCount = 5
    val doneCount = 2
    MaterialTheme {
        KanbanBoardHeaderSection(
            totalCount = totalCount,
            doneCount = doneCount,
            onCreateClick = {},
        )
    }
}

@Composable
fun KanbanBoardHeaderSection(
    totalCount: Int,
    doneCount: Int,
    onCreateClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column {
                Text(
                    text = "Compose Desktop 칸반 보드",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                )
                Text(
                    text = if (totalCount == 0) {
                        "완료율 : 0% (0/0)"
                    } else {
                        "완료율 : ${(doneCount.toFloat() / totalCount * 100).toInt()}% ($doneCount/$totalCount)"
                    },
                )
            }

            Button(
                onClick = onCreateClick,
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ColorPalette.ActiveButton,
                ),
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "새 테스크 생성",
                    modifier = Modifier.size(20.dp),
                )
                Text("새 테스크 생성")
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        CustomLinearProgress(
            progress = if (totalCount == 0) 0f else doneCount.toFloat() / totalCount,
        )
    }
}

@Composable
fun CustomLinearProgress(
    progress: Float,
    modifier: Modifier = Modifier,
    progressColor: Color = ColorPalette.StatusBarPoint,
    trackColor: Color = ColorPalette.StatusBarBackground,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(8.dp)
            .clip(RoundedCornerShape(999.dp))
            .background(trackColor),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(progress.coerceIn(0f, 1f))
                .fillMaxHeight()
                .background(progressColor),
        )
    }
}
